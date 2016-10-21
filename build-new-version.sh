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

dlfile() {
    component="$1"
    triple="$2"
    echo "Downloading $component for triple $triple..."
    wget https://static.rust-lang.org/dist/${component}-${TARGET_VERSION}-${triple}.tar.gz
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

download_files() {
    # channel file
    local channel_file="channel-rust-${TARGET_VERSION}.toml"
    wget https://static.rust-lang.org/dist/${channel_file}

    # cargo for each supported host triple
    for triple in $RUSTC_TRIPLES; do
        url=$(grep -A 3 "pkg.cargo.target.${triple}" ${channel_file} | \
                     grep '^url =' | \
                     cut -d '=' -f2 | \
                     tr -d '"')
        wget ${url}
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

cargo_version() {
    grep -A 3 "pkg.cargo.target.x86_64-unknown-linux-gnu" "channel-rust-${TARGET_VERSION}.toml" | \
        grep '^url =' | \
        cut -d'=' -f2 | \
        tr -d '"' | \
        rev | \
        cut -d'/' -f2 | \
        rev | \
        tr -d '-'
}

cargo_filename() {
    triple="$1"
    echo "cargo-nightly-${triple}.tar.gz"
}

write_get_hash() {
    cat <<EOF >>${RUST_BIN_RECIPE}
def get_hash(hashes, triple):
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
    return get_hash(HASHES, triple)

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
    return get_hash(HASHES, triple)

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
    return get_hash(HASHES, triple)

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
    return get_hash(HASHES, triple)

EOF
}

write_final_contents() {
    cat <<EOF >>${RUST_BIN_RECIPE}
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
EOF
}

write_cargo_recipe() {
    cat <<EOF >>${CARGO_BIN_RECIPE}
def get_hash(hashes, triple):
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
    return get_hash(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${CARGO_BIN_RECIPE} "        \"$triple\": \"$(get_sha256sum $(cargo_filename $triple))\","
    done

    cat <<EOF >>${CARGO_BIN_RECIPE}
    }
    return get_hash(HASHES, triple)

DEPENDS += "rust-bin (= ${TARGET_VERSION})"
LIC_FILES_CHKSUM = "\\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \\
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \\
"

include cargo-bin.inc
EOF
}

download_files

RUST_BIN_RECIPE="${ROOT_DIR}/recipes-devtools/rust/rust-bin_${TARGET_VERSION}.bb"
CARGO_BIN_RECIPE="${ROOT_DIR}/recipes-devtools/rust/cargo-bin_$(cargo_version).bb"

# create/clear files
echo "" >${RUST_BIN_RECIPE}
echo "" >${CARGO_BIN_RECIPE}

# write the rust-bin recipe
write_get_hash
write_std_md5
write_std_sha256
write_rustc_md5
write_rustc_sha256
write_final_contents

# write the cargo recipe
write_cargo_recipe

cd -
rm -rf ${TMPDIR}
