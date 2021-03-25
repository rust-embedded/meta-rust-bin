
# Recipe for cargo 20210325
# This corresponds to rust release 1.51.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e4b05fb204387a2daca8b1e1891f8f04",
        "arm-unknown-linux-gnueabi": "86e0a3524ef5f8de0ba370a30307f204",
        "arm-unknown-linux-gnueabihf": "cc401163ae1274fbbf214e3419c565d8",
        "armv7-unknown-linux-gnueabihf": "b80b693b82e92e581837309ebc537bf5",
        "i686-unknown-linux-gnu": "17f8b6f0d1809afa42e11b675b4b1283",
        "x86_64-unknown-linux-gnu": "7e6be57e8dc6dafb84433a1558d0f74e",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eeeee860ec47ebe1c45f497ff99cfee9c869a592db573cd547a67681db695616",
        "arm-unknown-linux-gnueabi": "88a01241bfa21af79d6a77c90488f715a37820891ed00f5f0e47fc563ac4be67",
        "arm-unknown-linux-gnueabihf": "00888838c634e95d1c9aeb151c8c4f2dc713e221247580bff181946893d32f15",
        "armv7-unknown-linux-gnueabihf": "89f8eef5bf1c1f7eaf8fc7f8c1559497e7e193cc2a6e8552379eaf87230c435c",
        "i686-unknown-linux-gnu": "5f9c5cf7cfbfcc48186a4a2611f733ad1712c4ef3b19173f589616dda2349dd9",
        "x86_64-unknown-linux-gnu": "fe8abe2c2b467ac5f5021ff8020eda70de9e9f8f45b4a2e834afbd3b78323a31",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-03-25/cargo-1.51.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.51.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
