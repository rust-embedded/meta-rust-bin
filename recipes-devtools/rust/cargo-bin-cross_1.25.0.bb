
# Recipe for cargo 20180329
# This corresponds to rust release 1.25.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "129207f559c7f2a6de8828b5cab21e37",
        "arm-unknown-linux-gnueabi": "4fe96e55897f156fdbc80c96a0913516",
        "arm-unknown-linux-gnueabihf": "94b6dc43c81297a19bda5678e05a74dd",
        "armv7-unknown-linux-gnueabihf": "b944d472a1b32c7b9259a43b93f54f80",
        "i686-unknown-linux-gnu": "d49b79a5425ea14c0f54d8d4abe48cc7",
        "x86_64-unknown-linux-gnu": "b0de62d86f0ba71078471d09916873c6",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8d354b4ad21b943f95c96f607af3857c402960a19a2a1ebac6f9f1a6877e4138",
        "arm-unknown-linux-gnueabi": "885f53bc2190a1fb1012c04e588b0d569776b3d177f0b4d45ad92f3b1b6e1f8b",
        "arm-unknown-linux-gnueabihf": "f61e6570da4eb682a150aeca1e58c11a1bd0b0266806bd142ad16939adaea23a",
        "armv7-unknown-linux-gnueabihf": "de3fe475b3bcd8b899b2dfcca77887cd27ff9d9477d6adcf447fee8e458938bb",
        "i686-unknown-linux-gnu": "200c24872796d19e14ecc1a71febc28e7c08b4cde35712e5154ec0d79350f81e",
        "x86_64-unknown-linux-gnu": "9ba227f2364f618dc9415dacf3a5dce17458e1cb9f6d4fe860416cb68db894e4",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-03-29/cargo-0.26.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.25.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
