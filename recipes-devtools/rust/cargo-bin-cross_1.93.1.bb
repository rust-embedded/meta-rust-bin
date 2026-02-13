
# Recipe for cargo 20260212
# This corresponds to rust release 1.93.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "21ba3e25d1ec69110d5d0d323a975742",
        "arm-unknown-linux-gnueabi": "7e68132762d206e5563cdace39cdf58a",
        "arm-unknown-linux-gnueabihf": "4238bb298f2c066725daba87e0f2025f",
        "armv7-unknown-linux-gnueabihf": "e4c5a6839cf0fe73bdfd1b3baec91367",
        "i686-unknown-linux-gnu": "2d2380a4fc7ffdca5405fe4c6ae19cdf",
        "x86_64-unknown-linux-gnu": "1e8be5d481918f925b9ed8d626a5af8b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a89113723cc00971044daf7c932cfa95a81e93e04fe8e02b120ff29ebd3fa0d9",
        "arm-unknown-linux-gnueabi": "4a5a48dc728f5881fbfea1d4470fc18b8038e61a586097b841089519b7d24901",
        "arm-unknown-linux-gnueabihf": "225092ee9a627983f0a9dd600d93ac3d5ff913a4d570152d2cc694cd68259391",
        "armv7-unknown-linux-gnueabihf": "397a0f2cc6ae812d2b79551cbb594ebcbd5ea38f7524eded6e6fcb361180e07a",
        "i686-unknown-linux-gnu": "91053d88a894e9ddca57fab735b1c92aa5490021b4de866c018936e115c192db",
        "x86_64-unknown-linux-gnu": "fa557d44676e9d662f50ce19d8619519413fd821fc809503538d53a002c5a765",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-02-12/cargo-1.93.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.93.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
