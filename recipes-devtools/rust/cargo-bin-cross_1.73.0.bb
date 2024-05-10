
# Recipe for cargo 20231005
# This corresponds to rust release 1.73.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7c4283462f4057a20204680d72fa75a0",
        "arm-unknown-linux-gnueabi": "93f47810b6ce1deabbaebdc4ae02bcfa",
        "arm-unknown-linux-gnueabihf": "29bf1726db3aa7a2327a4c14697b4e75",
        "armv7-unknown-linux-gnueabihf": "fe64e5a640f8ba84cb7e38fd886c43f0",
        "i686-unknown-linux-gnu": "63b539d1b5f918f0719013393617216a",
        "x86_64-unknown-linux-gnu": "fddc2f90143ef477136a80b261e83ff6",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f0ef0b9e75613725357f526cd7ac259aac1da37927a8d919eff3eafb8f5087a7",
        "arm-unknown-linux-gnueabi": "9cfbd484b4ff759060f552d60c08cc3ac547d4369449cc14154474104a3b3b33",
        "arm-unknown-linux-gnueabihf": "ed5c1d55aff32a78583f641540eceddf98ee7f5a6f26f0fec49b97f25b03d2d7",
        "armv7-unknown-linux-gnueabihf": "3f4d3e00b72d35681c66158f5e2af85f07916c422dfce62c3d1bcd4c6245e8f1",
        "i686-unknown-linux-gnu": "df6126fa404c9cd604f48aebc27f6d286957de282c96d84a6edc1c8129e7fd78",
        "x86_64-unknown-linux-gnu": "78ad87102aebe101fb61d8fb6bb4b4da8674c57f0af810b3b3310f9f1a63d002",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-10-05/cargo-1.73.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.73.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
