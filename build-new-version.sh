#!/bin/sh
#
# This script can be run to add a new version of rust to those supported
# in the project.  It automates away some of the tedium of working
# through checksum failures one-by-one.

set -e

TARGET_VERSION="$1"
if [ -z "$TARGET_VERSION" ]; then
    >&2 echo "Must specify a target version as first argument"
    exit 1
fi

OUT="$2"
if [ -z "$OUT" ]; then
    >&2 echo "Must specify an output file as the second argument"
    exit 1
else
    OUT=$(realpath "$OUT")
fi

echo "">${OUT}

TMPDIR=`mktemp -d`
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
powerpc64-unknown-linux-gnu
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
    component="$1"
    triple="$2"
    md5sum ${component}-${TARGET_VERSION}-${triple}.tar.gz | cut -d' ' -f1
}

get_sha256() {
    component="$1"
    triple="$2"
    sha256sum ${component}-${TARGET_VERSION}-${triple}.tar.gz | cut -d' ' -f1
}

download_files() {
    for triple in $RUSTC_TRIPLES; do
        dlfile rustc ${triple}
    done

    for triple in $TARGET_TRIPLES; do
        dlfile rust-std ${triple}
    done
}

write_get_hash() {
    cat <<EOF >>${OUT}
def get_hash(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


EOF
}

write_std_md5() {
    cat <<EOF >>${OUT}
def rust_std_md5(triple):
    HASHES = {
EOF
    for triple in $TARGET_TRIPLES; do
        echo >>${OUT} "        \"$triple\": \"$(get_md5sum rust-std $triple)\","
    done
    cat <<EOF >>${OUT}
    }
    return get_hash(HASHES, triple)

EOF
}


write_std_sha256() {
    cat <<EOF >>${OUT}
def rust_std_sha256(triple):
    HASHES = {
EOF
    for triple in $TARGET_TRIPLES; do
        echo >>${OUT} "        \"$triple\": \"$(get_sha256 rust-std $triple)\","
    done

    cat <<EOF >>${OUT}
    }
    return get_hash(HASHES, triple)

EOF
}

write_rustc_md5() {
    cat <<EOF >>${OUT}
def rustc_md5(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${OUT} "        \"$triple\": \"$(get_md5sum rustc $triple)\","
    done
    cat <<EOF >>${OUT}
    }
    return get_hash(HASHES, triple)

EOF
}

write_rustc_sha256() {
    cat <<EOF >>${OUT}
def rustc_sha256(triple):
    HASHES = {
EOF
    for triple in $RUSTC_TRIPLES; do
        echo >>${OUT} "        \"$triple\": \"$(get_sha256 rustc $triple)\","
    done
    cat >>${OUT} <<EOF
    }
    return get_hash(HASHES, triple)

EOF
}

write_final_contents() {
    cat <<EOF >>${OUT}
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
EOF
}

download_files
write_get_hash
write_std_md5
write_std_sha256
write_rustc_md5
write_rustc_sha256
write_final_contents

cd -
rm -rf ${TMPDIR}
