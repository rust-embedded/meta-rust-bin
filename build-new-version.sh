#!/bin/sh
#
# This script can be run to add a new version of rust to those supported
# in the project.  It automates away some of the tedium of working
# through checksum failures one-by-one.

set -e

ROOT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

TARGET_VERSION="$1"
if [ -z "$TARGET_VERSION" ]; then
    >&2 echo "Must specify a target version as first argument"
    exit 1
fi

CHANNEL_FILE="channel-rust-${TARGET_VERSION}.toml"

TMPDIR=`mktemp -p $PWD -d`
cd "$TMPDIR"

TARGET_TRIPLES="\
aarch64-unknown-linux-gnu
arm-unknown-linux-gnueabi
arm-unknown-linux-gnueabihf
armv7-unknown-linux-gnueabihf
i686-unknown-linux-gnu
mips-unknown-linux-gnu
mipsel-unknown-linux-gnu
powerpc-unknown-linux-gnu
x86_64-unknown-linux-gnu"

RUSTC_TRIPLES="\
aarch64-unknown-linux-gnu
arm-unknown-linux-gnueabi
arm-unknown-linux-gnueabihf
armv7-unknown-linux-gnueabihf
i686-unknown-linux-gnu
x86_64-unknown-linux-gnu"

download() {
    echo "download $@"
    curl -# -O $@
}

dlfile() {
    component="$1"
    triple="$2"
    download https://static.rust-lang.org/dist/${component}-${TARGET_VERSION}-${triple}.tar.gz
}

get_md5sum() {
    md5sum $1 | cut -d ' ' -f1
}

get_sha256sum() {
    sha256sum $1 | cut -d ' ' -f1
}

get_rust_md5sum() {
    component="$1"
    triple="$2"
    get_md5sum ${component}-${TARGET_VERSION}-${triple}.tar.gz
}

get_rust_sha256sum() {
    component="$1"
    triple="$2"
    get_sha256sum ${component}-${TARGET_VERSION}-${triple}.tar.gz
}

cargo_url() {
    local triple="$1"
    grep -A 3 "^\[pkg.cargo.target.${triple}\]" ${CHANNEL_FILE} | \
        grep '^url =' | \
        cut -d '=' -f2 | \
        tr -d '[" ]'
}

cargo_version() {
    cargo_url x86_64-unknown-linux-gnu | rev | cut -d'/' -f2 | rev | tr -d '-'
}

cargo_filename() {
    local triple="$1"
    cargo_url $triple | rev | cut -d'/' -f1 | rev
}

download_files() {
    download https://static.rust-lang.org/dist/${CHANNEL_FILE}

    # cargo for each supported host triple
    for triple in $RUSTC_TRIPLES; do
        download $(cargo_url $triple)
    done

    # rustc
    for triple in $RUSTC_TRIPLES; do
        dlfile rustc ${triple}
    done

    # rust-std
    for triple in $TARGET_TRIPLES; do
        dlfile rust-std ${triple}
    done
}

cargo_apache_expected="1836efb2eb779966696f473ee8540542"
cargo_mit_expected="b377b220f43d747efdec40d69fcaa69d"

check_cargo_license() {
    for triple in $RUSTC_TRIPLES; do
        cargofile=$(cargo_filename $triple)
        cargodir=$(basename $cargofile .tar.gz)

        tar -zxf $cargofile ${cargodir}/LICENSE-APACHE
        apache_md5sum="$( md5sum ${cargodir}/LICENSE-APACHE | cut -d ' ' -f1 )"

        tar -zxf $cargofile ${cargodir}/LICENSE-MIT
        mit_md5sum="$( md5sum ${cargodir}/LICENSE-MIT | cut -d ' ' -f1 )"

        if [ "$apache_md5sum" != "$cargo_apache_expected" ]; then
            echo "ERROR: Apache license file hash has changed for $cargofile"
            echo "  Actual: $apache_md5sum"
            echo "  Expected: $cargo_apache_expected"
            exit 1
        elif [ "$mit_md5sum" != "$cargo_mit_expected" ]; then
            echo "ERROR: MIT license file hash has changed for $cargofile"
            echo "  Actual: $mit_md5sum"
            echo "  Expected: $cargo_mit_expected"
            exit 1
        fi
    done
}

write_get_by_triple() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


EOF
}

write_std_md5() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def rust_std_md5(triple):
    HASHES = {
EOF
    for triple in $TARGET_TRIPLES; do
        echo >>${RUST_BIN_RECIPE} "        \"$triple\": \"$(get_rust_md5sum rust-std $triple)\","
    done
    cat <<EOF >>${RUST_BIN_RECIPE}
    }
    return get_by_triple(HASHES, triple)

EOF
}

write_std_sha256() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def rust_std_sha256(triple):
    HASHES = {
EOF
    for triple in $TARGET_TRIPLES; do
        echo >>${RUST_BIN_RECIPE} "        \"$triple\": \"$(get_rust_sha256sum rust-std $triple)\","
    done

    cat <<EOF >>${RUST_BIN_RECIPE}
    }
    return get_by_triple(HASHES, triple)

EOF
}

write_rustc_md5() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def rustc_md5(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${RUST_BIN_RECIPE} "        \"$triple\": \"$(get_rust_md5sum rustc $triple)\","
    done
    cat <<EOF >>${RUST_BIN_RECIPE}
    }
    return get_by_triple(HASHES, triple)

EOF
}

write_rustc_sha256() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def rustc_sha256(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${RUST_BIN_RECIPE} "        \"$triple\": \"$(get_rust_sha256sum rustc $triple)\","
    done
    cat >>${RUST_BIN_RECIPE} <<EOF
    }
    return get_by_triple(HASHES, triple)

EOF
}

copyright_md5sum=NULL
get_copyright_md5sum() {
    for triple in $RUSTC_TRIPLES; do
        echo $triple
        rustcfile=rustc-${TARGET_VERSION}-${triple}
        tar -zxvf $rustcfile.tar.gz ${rustcfile}/COPYRIGHT
        copyright_md5sum="$( md5sum ${rustcfile}/COPYRIGHT | cut -d ' ' -f1 )"
        echo $copyright_md5sum
        break
    done
}

write_final_contents() {
    cat <<EOF >>${RUST_BIN_RECIPE}
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=${copyright_md5sum}"

require rust-bin-cross.inc
EOF
}

write_cargo_recipe() {
    cat <<EOF >>${CARGO_BIN_RECIPE}
# Recipe for cargo $(cargo_version)
# This corresponds to rust release ${TARGET_VERSION}

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${CARGO_BIN_RECIPE} "        \"$triple\": \"$(get_md5sum $(cargo_filename $triple))\","
    done
    cat <<EOF >>${CARGO_BIN_RECIPE}
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${CARGO_BIN_RECIPE} "        \"$triple\": \"$(get_sha256sum $(cargo_filename $triple))\","
    done

    cat <<EOF >>${CARGO_BIN_RECIPE}
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${CARGO_BIN_RECIPE} "        \"$triple\": \"$(cargo_url $triple)\","
    done

    cat <<EOF >>${CARGO_BIN_RECIPE}
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-\${TARGET_ARCH} (= ${TARGET_VERSION})"
LIC_FILES_CHKSUM = "\\
    file://LICENSE-APACHE;md5=${cargo_apache_expected} \\
    file://LICENSE-MIT;md5=${cargo_mit_expected} \\
"

require cargo-bin-cross.inc
EOF
}

download_files

# validate extracted cargo license
check_cargo_license

RUST_BIN_RECIPE="${ROOT_DIR}/recipes-devtools/rust/rust-bin-cross_${TARGET_VERSION}.bb"
CARGO_BIN_RECIPE="${ROOT_DIR}/recipes-devtools/rust/cargo-bin-cross_${TARGET_VERSION}.bb"

# create/clear files
echo "" >${RUST_BIN_RECIPE}
echo "" >${CARGO_BIN_RECIPE}

# write the rust recipe
write_get_by_triple
write_std_md5
write_std_sha256
write_rustc_md5
write_rustc_sha256
get_copyright_md5sum
write_final_contents

# write the cargo recipe
write_cargo_recipe

cd -
rm -rf ${TMPDIR}
