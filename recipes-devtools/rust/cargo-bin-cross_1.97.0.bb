
# Recipe for cargo 20260709
# This corresponds to rust release 1.97.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d155ff05e18a87c0137434fbec66cfc9",
        "arm-unknown-linux-gnueabi": "1bdfab34d36187d97f3a01878f594d4f",
        "arm-unknown-linux-gnueabihf": "4171fcdb2aeff249692a5c53322e135d",
        "armv7-unknown-linux-gnueabihf": "f2ca42d5d7a232b6b7436f9171a4fe04",
        "i686-unknown-linux-gnu": "98019d4b7a698eaec978a42f18552cbc",
        "x86_64-unknown-linux-gnu": "49de9e10324f9a50f3055df729b63f0d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "655cc1c9f1e7cb65cd5fa82de31e1adf2d8ba2011a8b5e28ca3e9529898e64bb",
        "arm-unknown-linux-gnueabi": "9fff76a00b1994d2220f7f665c8c28e74998e42d4589ad02b13b911bbb06882e",
        "arm-unknown-linux-gnueabihf": "3465ff08a10abc5513579ac2e5ed4c20f5cf4c175861ca585399fea8e6d5d044",
        "armv7-unknown-linux-gnueabihf": "2e1f3e6d173864998ac3ee533582321a58e4bf66483c70fb7c8b0a5a3fdb1b0e",
        "i686-unknown-linux-gnu": "24636ecc7089693534a8d40fa2ca896096bf72c86b7bd7f122159b8a9fde5e66",
        "x86_64-unknown-linux-gnu": "0214406b145a134463149b0dcc8cdd7a0882e181d2ad2cf893723bbd576d4a44",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-09/cargo-1.97.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.97.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
