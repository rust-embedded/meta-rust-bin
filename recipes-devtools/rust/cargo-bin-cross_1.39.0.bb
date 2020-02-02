
# Recipe for cargo 20191107
# This corresponds to rust release 1.39.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0e3899938d94a43a72f64bd5bc43949b",
        "arm-unknown-linux-gnueabi": "5846cfaaa4b1869b24b9b36a1e0ae54e",
        "arm-unknown-linux-gnueabihf": "855ccbf62f4278295009328f6f3830ba",
        "armv7-unknown-linux-gnueabihf": "11bb15848fd57a6adbd784f6f71660f2",
        "i686-unknown-linux-gnu": "ac5ed5f6214b5ca7bf0c2610f2895acf",
        "x86_64-unknown-linux-gnu": "29ce82e9bc2d47d96738cfbefa5a197e",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "77c75e79193d887f042b8d19457146678f7ab1e755c4c13577adf16ac7ff81c5",
        "arm-unknown-linux-gnueabi": "5f8bde9f9730e453eaa2d7956825a90f212568a161940c52ad681287a4799053",
        "arm-unknown-linux-gnueabihf": "3d19205ff81344fef76c4abb6585ba35abb3f521fd8bc7850c175e1865f60b85",
        "armv7-unknown-linux-gnueabihf": "d4c6b8e017882918df05df1fafd9607ce5ac9d9ca75ed095283b58e1c4bf97f9",
        "i686-unknown-linux-gnu": "b24552fa887435666efd5a78174c4472d8da568a0fa51041e42c3e57516db3a9",
        "x86_64-unknown-linux-gnu": "07d82db4d348618a8d204460e3c4e97c7702eebfc0e77ca800c051971bbf5e51",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-11-07/cargo-0.40.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.39.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
