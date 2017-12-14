
# Recipe for cargo 20171012
# This corresponds to rust release 1.21.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "082fad37a09b824be4265aa9982f1e44",
        "arm-unknown-linux-gnueabi": "b481b8d8cc29d5ceeda6be2acad1cce5",
        "arm-unknown-linux-gnueabihf": "a7f9c40d88e8a849c68b946eabd44fb2",
        "armv7-unknown-linux-gnueabihf": "cb6fca7b274fec7388a1f90d88ddd375",
        "i686-unknown-linux-gnu": "5d9f7b60e2e2b7c1aa29d84ea7ebb64d",
        "x86_64-unknown-linux-gnu": "b870d85feb8958727dbdad476007d65c",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "440b6f3b9f7be895f2bffe5e314c98af41421c2b9cb1cfd19760e896b18eef87",
        "arm-unknown-linux-gnueabi": "32e90fdedb99f32f502d54aefe68040e19ce7771a3ef6648a5d115af7b704bda",
        "arm-unknown-linux-gnueabihf": "79b5c64d05c9fb0a1dd89d75e3b68726e25c52222ba901528d75f6ef50edbefc",
        "armv7-unknown-linux-gnueabihf": "54f09a39a74905ab9bb89dae898479713360dfb2ee126cb592dff517ea06b7f3",
        "i686-unknown-linux-gnu": "158ea19c2c72a168de2a71a2b2fda7435080d238439f4460a7bb4a082f109443",
        "x86_64-unknown-linux-gnu": "eca53c055006f3a77871317368d4bd585ffb04ddbf0ecd2aa79aaf5cc4c84280",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-10-12/cargo-0.22.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.21.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
