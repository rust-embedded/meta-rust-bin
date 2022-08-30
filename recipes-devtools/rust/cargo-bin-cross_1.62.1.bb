
# Recipe for cargo 20220719
# This corresponds to rust release 1.62.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "66218b44e945612d97d7235167050360",
        "arm-unknown-linux-gnueabi": "640290f6360e282f7cd0efc8de178385",
        "arm-unknown-linux-gnueabihf": "e974560e51d16eb81b0a424ef40da8ef",
        "armv7-unknown-linux-gnueabihf": "efc89902e484a92cc6f80a970d204963",
        "i686-unknown-linux-gnu": "319a5c36ad625adb2572c97f55c8855e",
        "x86_64-unknown-linux-gnu": "abacd6e115de01f104501f00224eae09",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5c14e1bdfe37cf004cc7abac1f4498c36c5c7675849125ef4c48e1589c6641f7",
        "arm-unknown-linux-gnueabi": "426fbb10ee8409cce45fe24a3b4b43b8fa56f9209440791901ece396879f6db8",
        "arm-unknown-linux-gnueabihf": "aece937cf4665c3277a7d444e07d4dca8a47cb5a7179a2b3e79b05914193c5e9",
        "armv7-unknown-linux-gnueabihf": "d41b71a66786fb2edb915230a2862a949b6bbbc7a84b08c74a9495fb8036a867",
        "i686-unknown-linux-gnu": "e6f337277526f9cb1243485883a388ed6e3b33ba6360fe159d0209bdf25e4562",
        "x86_64-unknown-linux-gnu": "7a471270fe18dfe231693178c169b279c0747ae179fd755729eefd8c6052f595",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-07-19/cargo-1.62.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.62.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
