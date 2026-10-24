
# Recipe for cargo 20261015
# This corresponds to rust release 1.99.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7c3eec04dde00c651b3919f3b16d62c9",
        "arm-unknown-linux-gnueabi": "287b5cb8f81eba8992c07cc674967e72",
        "arm-unknown-linux-gnueabihf": "62799792558fc67b5d20bf76397e9288",
        "armv7-unknown-linux-gnueabihf": "e87c2ae1d8368d7ceaee3caaaee8baa1",
        "i686-unknown-linux-gnu": "1c2fdd3d1069a269a7198bea8a3e8741",
        "x86_64-unknown-linux-gnu": "0e7453f74c7daa424d9002ced7a504cb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "201dbeac1795713b98aeae044e01695e70ae2ea3ded42683ebce5a8a1c90f8a6",
        "arm-unknown-linux-gnueabi": "113a5352032795cd32e3581068513eeb5462f440ff5d0c34d26c31d87fc3a333",
        "arm-unknown-linux-gnueabihf": "8dded72b70f8d81ff66949ba290826400fef2bc4003c33a8cffc17a365c08f92",
        "armv7-unknown-linux-gnueabihf": "cdaba1279ef4108b057917b7a57b7e6203db11cb0ebf5a978f3aedf6c8a2defc",
        "i686-unknown-linux-gnu": "a2e14e54b779d75824dd42ecb98a6ce6df4ed27a87936130a2e63bd2b55ef8ac",
        "x86_64-unknown-linux-gnu": "47babc028247e26577f8a1bf390b11f447ad9b7ab93f5c9a0dda078935fc149b",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-15/cargo-1.99.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.99.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
