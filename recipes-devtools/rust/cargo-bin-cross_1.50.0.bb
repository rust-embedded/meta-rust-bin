
# Recipe for cargo 20210211
# This corresponds to rust release 1.50.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f97cdfa41e8f7e0591af82f424f6aa4a",
        "arm-unknown-linux-gnueabi": "3d21b3b3623e73659fa6fde3602aedf6",
        "arm-unknown-linux-gnueabihf": "7efae1bb4b953f84bcdd9f178fdbf18b",
        "armv7-unknown-linux-gnueabihf": "c8552d22a4822e9ea56c5893e78654c2",
        "i686-unknown-linux-gnu": "e45c70af05106fdf6be6c604c9392f60",
        "x86_64-unknown-linux-gnu": "99930de3b06bb851c626ee7dfc6182b6",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9b6fbfec7f6d14013387433f3a907b1f474027d7f32f626dc1c5ca83faefe573",
        "arm-unknown-linux-gnueabi": "e71f86394a30e0f4b8cc23db07dc2bafe575c3854e410212ab81fd8e0d245683",
        "arm-unknown-linux-gnueabihf": "a407416e2d80bd8cd63793b995efb09948326d6373d4de99487de2a3da92551a",
        "armv7-unknown-linux-gnueabihf": "6488bfd87046b054b644742d97ebeb2f7e8c1b22b5b8660b74054813c71ebccb",
        "i686-unknown-linux-gnu": "cc720cef346c952711809770fe466fb4d6cbe41995ed22941867870344c2fe2b",
        "x86_64-unknown-linux-gnu": "3456cfd9be761907a4d3aae475bd79d93662b7aee4541f28df3d1f7c7d71a034",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-02-11/cargo-1.50.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.50.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
