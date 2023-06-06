
# Recipe for cargo 20230601
# This corresponds to rust release 1.70.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "37c1fddcd3767327705a770320bf1d45",
        "arm-unknown-linux-gnueabi": "8677c112a3f1928e05c02a543d915244",
        "arm-unknown-linux-gnueabihf": "89c9355b85e10bd310d5ee12d004f7fb",
        "armv7-unknown-linux-gnueabihf": "dda0f0c088bd92e5b2a170ac79d1a872",
        "i686-unknown-linux-gnu": "eca8850bb7034c2cf1ff70102886880b",
        "x86_64-unknown-linux-gnu": "cdec5782eb3a19fd14b8e5583fb93855",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b711859b9cc39c8c0aa5aa50559a2905d20fc229cfd5bbf9a7fdf02477d18e2b",
        "arm-unknown-linux-gnueabi": "186fed2acd8bf9424c9d76cb22350d058ceff7c3d606c901005779c2bd92aeeb",
        "arm-unknown-linux-gnueabihf": "9fc820a9391388207500e507eb317d48be396f2b244cc6ee6ca4677a6be8d609",
        "armv7-unknown-linux-gnueabihf": "ce4de253a3fb1376701da5d2be4d1c338721695a9da027ac1d710f5d0a084ff0",
        "i686-unknown-linux-gnu": "c8a53cfd0537e33585c8b9cd65fd73db9991453cfda421c28832338cd4af87fb",
        "x86_64-unknown-linux-gnu": "74e049e657f544d146013746e53ecf427f47f0d5f1185bef1b28c2c8ace43253",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-06-01/cargo-1.70.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.70.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
