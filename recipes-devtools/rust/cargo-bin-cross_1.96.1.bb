
# Recipe for cargo 20260630
# This corresponds to rust release 1.96.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ef00a78638c24558fb90461aeba7984f",
        "arm-unknown-linux-gnueabi": "b8882444ab81ac5d21ac604d83eb45d1",
        "arm-unknown-linux-gnueabihf": "f30c69ea0207b6eddd82b526a55e9e6d",
        "armv7-unknown-linux-gnueabihf": "21c88b18ead9c3b1064e43b2674c6482",
        "i686-unknown-linux-gnu": "d88ee691a4bca871c90b8e3a0faf3c34",
        "x86_64-unknown-linux-gnu": "b9ebb30f578e6d5830c5894fd08064b9",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "70bd8065b3964f921d3afaafff4284e182ba8ee668c05bb69bd056e700be66b5",
        "arm-unknown-linux-gnueabi": "d5d9706bdc813884738b457edda64a4778910f4d7dc7c5f77b01d275c7a47c46",
        "arm-unknown-linux-gnueabihf": "d1469fade44bbc236570054457bf367ba990eb572dd58c6890e2ccd2daa931be",
        "armv7-unknown-linux-gnueabihf": "01ad5c067c3a23bb092a314772135ab4d0bb5a4d4ebe8682c8bb89c5f1bd9462",
        "i686-unknown-linux-gnu": "8d9e017d0425f24d14a668d12c29dd02ed32fe5eaebb2bbfcb8194a9b04c45a0",
        "x86_64-unknown-linux-gnu": "c656b46ffd1beec8c5396fa6bc275e552ebf22ccf12f1a14e6eefe2688ec977c",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-06-30/cargo-1.96.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.96.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
