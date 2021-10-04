
# Recipe for cargo 20210909
# This corresponds to rust release 1.55.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "67e2a03f10862e735babace23939158b",
        "arm-unknown-linux-gnueabi": "2ee424111b088f29a1b3ff4012551bc9",
        "arm-unknown-linux-gnueabihf": "2e0da69eae92ed32e1ac415e7f802ebf",
        "armv7-unknown-linux-gnueabihf": "5c909c6c6f22d8e0ddd884301517eb18",
        "i686-unknown-linux-gnu": "4b7b9ea23b2949b1c61b8cff9822ce3e",
        "x86_64-unknown-linux-gnu": "d3e2e27216824814e60971226a3ef330",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "48bc8751f548b08643fbdea7756ccda35f0762492e95ea41ca41137290f56513",
        "arm-unknown-linux-gnueabi": "b8e3ddb09bd9cf6a9b641ecac4a8835a4c33c4c3ebe0eaf79a261dd0b22204e5",
        "arm-unknown-linux-gnueabihf": "d783dfe292682b32877cad15e502eef0f50619fa5f6db469499aa4feea8fb66a",
        "armv7-unknown-linux-gnueabihf": "c4b0015a2cf48f034aa7ac5939f061631ff83af76af6e9734be9e97720ee3cf5",
        "i686-unknown-linux-gnu": "a9cd5eb1610ae0778562742bc575216bb0a2c4cde355cd5a31ffaca2fd1e63a5",
        "x86_64-unknown-linux-gnu": "bb18c74aea07fa29c7169ce78756dfd08c07da08c584874e09fa6929c8267ec1",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-09-09/cargo-1.55.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.55.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
