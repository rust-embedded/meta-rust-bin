
# Recipe for cargo 20221215
# This corresponds to rust release 1.66.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "425feddfc90dffbfc08bd4c1e8b07eab",
        "arm-unknown-linux-gnueabi": "9ee8847d5d9e4adea7a235202b1279ab",
        "arm-unknown-linux-gnueabihf": "64036aef4171e39f2b294bad7fddcb3b",
        "armv7-unknown-linux-gnueabihf": "072ddbb48b3dcf272cf27ce05079f388",
        "i686-unknown-linux-gnu": "9a18be86d1b165dc0d2dfc414b849136",
        "x86_64-unknown-linux-gnu": "7c00fe0f5670065e6ad1635c5e265852",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "87c32a5281a96abd04dda530e12f03c845a2057e072f14a4f6f90aa4425f337c",
        "arm-unknown-linux-gnueabi": "2ddea83b2f00153532ef1f857159c227cd3f4267b7eeb4fdcb93e1fa9791561d",
        "arm-unknown-linux-gnueabihf": "5f22f95c032d15cd1ffc953774a6ca0d0ab9eb30acb3bea81331bf81bd7ecec2",
        "armv7-unknown-linux-gnueabihf": "aafe273079e3d5b35eafaa59dca1d566075f7c011fd114230ce612d30c63ed05",
        "i686-unknown-linux-gnu": "52cfd43096ed88101752dab0d63d7651903fd0e10fb6db02a0f9a096dde9fe6b",
        "x86_64-unknown-linux-gnu": "587080f377f7e259ab97fbf78cb0a5ef9094f3f333af25368d8d3346c192f13d",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-12-15/cargo-1.66.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.66.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
