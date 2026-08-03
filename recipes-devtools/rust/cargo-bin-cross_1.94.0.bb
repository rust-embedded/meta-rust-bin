
# Recipe for cargo 20260305
# This corresponds to rust release 1.94.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9ed458b1c69944c2679bff3fab1b6a78",
        "arm-unknown-linux-gnueabi": "d4e25bc36aee8abae38dfbc087c5ec42",
        "arm-unknown-linux-gnueabihf": "2bfe9cda6406beaf95a60938e62b8d1a",
        "armv7-unknown-linux-gnueabihf": "34a39db253656af194d4307fd55761ee",
        "i686-unknown-linux-gnu": "54cf7b52cfd8a69f2fe467aa98f9dae3",
        "x86_64-unknown-linux-gnu": "102fef737c224838edf90a0f42efc20a",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bb205f17bbb1d9d914305ee33515c519e1d35eb693571691ec4da8401e5b4660",
        "arm-unknown-linux-gnueabi": "94df8d45573cd069c2be6e28bb34a1ce514c4ba5db74c29ac3df97ef686d257b",
        "arm-unknown-linux-gnueabihf": "dd44cbdff19de6b98bbad332579fc13b967db1ec62d1bab5327c6768346a9d35",
        "armv7-unknown-linux-gnueabihf": "c7eeb410da2d31bb99ef2bd141ed7451b07228d2e076b80536dfaf3d92152ebf",
        "i686-unknown-linux-gnu": "eeab287ef4b52ef7a4e8a979dccc02b7f73e09eaef15dc754e5a26ca14017bb2",
        "x86_64-unknown-linux-gnu": "6d77b3f9396cc23aa4f3ae2822b1349c4b2cf746dee4228212b5bed94200f421",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-03-05/cargo-1.94.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.94.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
