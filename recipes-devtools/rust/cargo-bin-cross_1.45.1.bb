
# Recipe for cargo 20200730
# This corresponds to rust release 1.45.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "df3dabab1ac187f7bf9d9c8380ac72f9",
        "arm-unknown-linux-gnueabi": "5576472a47cc3c6bf96f4fb9ec23d8cb",
        "arm-unknown-linux-gnueabihf": "efab10ab25cf0cbbbe9390904d67ed28",
        "armv7-unknown-linux-gnueabihf": "513ecd39fc39bc15427031fa24d352a2",
        "i686-unknown-linux-gnu": "27c8eb1323719aa84c84c85a034a8eb9",
        "x86_64-unknown-linux-gnu": "8d3081d768dabf107922b8e9fd496577",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7433a5d2d987b56aae90e83c9bcf81e1aeaa6f530a7409cf7686fee81582362c",
        "arm-unknown-linux-gnueabi": "e3fc54864f5df398be8a9aae44c3f0a95691f490910c0b6063db9bf61f431a47",
        "arm-unknown-linux-gnueabihf": "6f3bb918038062a17efa56085fecf0ef9c01a0205054fe5fb06172581107a1f1",
        "armv7-unknown-linux-gnueabihf": "5973815289931a514ee706a74e26624e6939c2f88d935f93ad5b78ddc22df7b2",
        "i686-unknown-linux-gnu": "b39fd76830cf504646084f845f1a6c75849cb551267b5c81ede8da9d8e54a794",
        "x86_64-unknown-linux-gnu": "601b7beb309f56b415c5fdbf2890b8d0aa466754acd080b594a788c22614a114",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-30/cargo-0.46.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.45.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
