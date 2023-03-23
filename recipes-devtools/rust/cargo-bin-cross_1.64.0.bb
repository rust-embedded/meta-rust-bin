
# Recipe for cargo 20220922
# This corresponds to rust release 1.64.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4a5e2c40cfe64069fd2a747d409359f1",
        "arm-unknown-linux-gnueabi": "cd2dc538ad740f8d53c624ce8d98a6ca",
        "arm-unknown-linux-gnueabihf": "e525d35108e0ff34499aac80f9211d25",
        "armv7-unknown-linux-gnueabihf": "20273928b7addf2fcadd5830390a0830",
        "i686-unknown-linux-gnu": "c02b90d1c8b90ac989c351eee3c3e96b",
        "x86_64-unknown-linux-gnu": "e868dfe75ec15240734b95d35863d0ea",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a2079bad79c054facecd149bafb645c321047fd9e4d2aa500607b2450654b209",
        "arm-unknown-linux-gnueabi": "f497f70e3154d78399487c75934734a13efdb64d5ba8fe7fcd4d28740cece688",
        "arm-unknown-linux-gnueabihf": "40e6d068d84a110c74c63dbd9bc457c8e9d8c520bb75c64b2b4f1a269378a003",
        "armv7-unknown-linux-gnueabihf": "a12455495aa39006f2cf83c9f86b7ecc4b188f98e683a99134c97eeb217b66bf",
        "i686-unknown-linux-gnu": "da713a9521c857d87bfebc1e2b1da01e9882d11fa6cb1c2ebbf38b1b0a15bbcc",
        "x86_64-unknown-linux-gnu": "12c2e61bf7de8b37c16d0323972a6085f9e01ee6d716549dd1ef4a92481b0610",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-09-22/cargo-1.64.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.64.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
