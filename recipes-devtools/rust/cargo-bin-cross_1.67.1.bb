
# Recipe for cargo 20230209
# This corresponds to rust release 1.67.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c679c21ab30494545c4c9914e71dc6ff",
        "arm-unknown-linux-gnueabi": "5500bd07b57f7f254543724c92a05971",
        "arm-unknown-linux-gnueabihf": "024ee9b53b3400189e8b7d16c337ce21",
        "armv7-unknown-linux-gnueabihf": "bbfbe273b8abf73f18cb6b9542e98508",
        "i686-unknown-linux-gnu": "590f077256744bce27e2297870c3e8ff",
        "x86_64-unknown-linux-gnu": "58ac3b83d186b5b42c2168e81eb439a1",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1ab1452572cb78fc7ec88bcadb2fd3e230c72b84d990fd6fc4ec57a24abdb2f",
        "arm-unknown-linux-gnueabi": "48e16568801f31e9299d38d15ec95aebe8f1b5b7d78bc98f06ccb912c9a10d41",
        "arm-unknown-linux-gnueabihf": "e3cb5ec5192f040124713c08c2cdf056c0f4be26c563a0b6e22a95c0a67e0d4a",
        "armv7-unknown-linux-gnueabihf": "8de3e98677f38a4498ade080dc3417a231fe63a88b6b0996fcd9161f9791d67a",
        "i686-unknown-linux-gnu": "3d0d7d1c02701babb65e276d6359847e91e8ebe5dfdb51fbcf90fe3e96f5487f",
        "x86_64-unknown-linux-gnu": "8d9310dc1e8d36ebd8d56ccaddb0c854daddb6b750c147c141be04f0ec6e89f0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-02-09/cargo-1.67.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.67.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
