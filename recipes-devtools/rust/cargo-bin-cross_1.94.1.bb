
# Recipe for cargo 20260326
# This corresponds to rust release 1.94.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "632fae29cbdeecd3cc76dd02c84f84fb",
        "arm-unknown-linux-gnueabi": "f829f5088061f1df5c3a57bc4aaa6238",
        "arm-unknown-linux-gnueabihf": "2e7e441f4be82b953d94cc03061743b1",
        "armv7-unknown-linux-gnueabihf": "058d835ea6283ae0736a8ad0671b03af",
        "i686-unknown-linux-gnu": "441a84b70a84d56071e90e94436701d7",
        "x86_64-unknown-linux-gnu": "fb4495fe461d82c8a4facb4efee3da2d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8609c82822354c137bdb3249b209e7beef7b1883bf71702109f1b938e806712d",
        "arm-unknown-linux-gnueabi": "101e9b9a015e3c3d1603d1b3030db5c9c2a38d2d24ad66d2be04244666a5e982",
        "arm-unknown-linux-gnueabihf": "ee2c24f1ea4f1c8066f08780f0f4b10ef2a1f8aa85e001a6d410ca8280e90ca6",
        "armv7-unknown-linux-gnueabihf": "b089c8c7ab067963ea6322a504c474af39f4dcaad39ea5c3f97ffe3f96c5d0ad",
        "i686-unknown-linux-gnu": "205c227ff7e4100387f2bd9041a05d8c885ce52af4d6689302a2bcd07d67ffe8",
        "x86_64-unknown-linux-gnu": "3b1f3826b8fea15edde20efcb987206279ce374b7a294278973de5be9e701539",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-26/cargo-1.94.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.94.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
