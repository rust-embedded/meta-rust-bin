
# Recipe for cargo 20210510
# This corresponds to rust release 1.52.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "af8031f5fc1b1fa2066533ddbf2bbda6",
        "arm-unknown-linux-gnueabi": "17a1a5470055643e2eb34235516fc2ae",
        "arm-unknown-linux-gnueabihf": "3d51c26668314c1ee68ef6a937c5e14f",
        "armv7-unknown-linux-gnueabihf": "7686de7f303386cdcac17d62ab17ad6a",
        "i686-unknown-linux-gnu": "c6f0d625899eb16149e5c47950e20715",
        "x86_64-unknown-linux-gnu": "fb8cd6fc6780cfa827902639411d06ad",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d2e15beebe22b6f6380d233f48599fc1b9228b064f0915eea02b2376f0bde1e1",
        "arm-unknown-linux-gnueabi": "4566f41586babe7cd621502f5bd4fe2700ad128d9bcab1b6bbdcf6777e5f1f03",
        "arm-unknown-linux-gnueabihf": "b7fc3c51604c8977cbac7d4ef16200b327b58ef3f6f47dcd1231e2491f0b89cc",
        "armv7-unknown-linux-gnueabihf": "5c74adfd67eb5aec39acbe2faaffec04f26145c7bcb2c3d925e2c14693870a93",
        "i686-unknown-linux-gnu": "bf993c5b5443c74a12c1943db356a067389f344eac522e4b3e4d164efdeff97d",
        "x86_64-unknown-linux-gnu": "f3225c27ce16296400389285358b61e138811c2e0eb1388593817688145ab64d",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-05-10/cargo-1.52.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.52.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
