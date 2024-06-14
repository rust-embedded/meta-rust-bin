
# Recipe for cargo 20240613
# This corresponds to rust release 1.79.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4fca6d303a8f78cf2fa5ac28ab3575a9",
        "arm-unknown-linux-gnueabi": "64ac3988c88ddeec8d8947615ccdccef",
        "arm-unknown-linux-gnueabihf": "631a29a37067cd309e955a396c5efc65",
        "armv7-unknown-linux-gnueabihf": "904c3115985b30bde8356c134185211f",
        "i686-unknown-linux-gnu": "08606705b7b64dde50f44df0ff46c7ab",
        "x86_64-unknown-linux-gnu": "4a89780dc045b3fe221b4507ed63bfd3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "225c07709630c3806ebb3f42995f47c78007cb42c088173ea24ea672a39265b7",
        "arm-unknown-linux-gnueabi": "fc6ac6983ba8980e3786a4b869c158194628b1602e7e7124351c0174e74d01c0",
        "arm-unknown-linux-gnueabihf": "12fd0996300ec60b69eae4dbf69c4d859252806d3662eeaf84c6c6aa4369376c",
        "armv7-unknown-linux-gnueabihf": "ad3378a37728401216130801e9e32c187ba91fda0385d99c5256b0c7f7485cb8",
        "i686-unknown-linux-gnu": "d6afdacd1c3022cdaa9dfb1cdfa5bb11a824459575aa27be5ba2f8c199789ff5",
        "x86_64-unknown-linux-gnu": "d394298cfd4a51eaf85607cceb33a1d83cbe723365687d7055f4b68e065a72fe",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-06-13/cargo-1.79.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.79.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
