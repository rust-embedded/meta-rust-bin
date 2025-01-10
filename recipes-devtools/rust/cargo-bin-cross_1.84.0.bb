
# Recipe for cargo 20250109
# This corresponds to rust release 1.84.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "91c3e0fb24e96e1a16874320cbe2fa3f",
        "arm-unknown-linux-gnueabi": "3a7b0fa6e625ea53059396beb1b67fa8",
        "arm-unknown-linux-gnueabihf": "931e56f9380512cfbb2189c509414a77",
        "armv7-unknown-linux-gnueabihf": "9e1d19c97d6fad2abe26d5dc66ff5eb2",
        "i686-unknown-linux-gnu": "c353af617aebbd2a1ed59ef1a1a5aa6f",
        "x86_64-unknown-linux-gnu": "df9330da9475adad884fd80bbb98201f",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8acd371fa7e0cb85b274acdf2281f461d67c25a95a11c78db6be83b9b71989e3",
        "arm-unknown-linux-gnueabi": "36996c95ce04d4e6c1374a6655ef5c3b4eeef161145b51d41d02be9aec10b384",
        "arm-unknown-linux-gnueabihf": "e33834d9bdcd358771c34c759e54d23c872dfb957d2514e982fc86e79824c449",
        "armv7-unknown-linux-gnueabihf": "2920f0fd23f1772a1d05697c43a14fa525fa9ed4359ba6af947967c5732af4c6",
        "i686-unknown-linux-gnu": "1f614bfbf3bef306c75dcf26607d8a52a104fe19f19a6216544558b7a8ed087d",
        "x86_64-unknown-linux-gnu": "0d63b2f736326127a387b5f9c62ee146eac661e54f4795a07b9f7ad09be16c23",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-09/cargo-1.84.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.84.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
