
# Recipe for cargo 20210729
# This corresponds to rust release 1.54.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "17497e670cd6ae9c7b1faa230520fd96",
        "arm-unknown-linux-gnueabi": "8186181f9c484a727b9c580f30a1bb0e",
        "arm-unknown-linux-gnueabihf": "7cfbf7afbc6e570e1ba65249ea144d16",
        "armv7-unknown-linux-gnueabihf": "9c83302dda598742be34f82d54ad3bb2",
        "i686-unknown-linux-gnu": "b6eaab7a3dd8346f90d7f8bdaea7a058",
        "x86_64-unknown-linux-gnu": "62e7bfcdfd24ed9b5c2ab1edefbd8036",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d54d0bde0014e73a9c6943665bd236e5596c86d58869bc758aa6c24a9ad53061",
        "arm-unknown-linux-gnueabi": "5d832cc1688021d236086a67dde6485af5c0790cad641ad992c75f95f07cc3f1",
        "arm-unknown-linux-gnueabihf": "73c6d9448e6515f45921ec0f0aacf92c0f3d68b2445d1eca4ca1cfefc05dbf13",
        "armv7-unknown-linux-gnueabihf": "57bf3e6c10ecbcdb97b5ee913eae8537ad4ff9fc476a303d0da9e350d1495c97",
        "i686-unknown-linux-gnu": "ae8414d0d3c740a9c42967e22452e5f8f6677e7c94b91c33afee468f91d978f4",
        "x86_64-unknown-linux-gnu": "8c4f404e6fd3e26a535230d1d47d162d0e4a51a0ff82025ae526b5121bdbf6ad",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-07-29/cargo-1.54.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.54.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
