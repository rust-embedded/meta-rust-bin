
# Recipe for cargo 20220120
# This corresponds to rust release 1.58.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "25eff0a2f109fa5fe9cbbb0d2d13f9ce",
        "arm-unknown-linux-gnueabi": "bed416d0088034e0875bd7a3c767cb3d",
        "arm-unknown-linux-gnueabihf": "b6b49b28ac8e204ad1d777f509b1adea",
        "armv7-unknown-linux-gnueabihf": "fff8bdfa9ac0fafe09161e15272c5e38",
        "i686-unknown-linux-gnu": "8fb848a922b9ddf9af4ac841118bf42c",
        "x86_64-unknown-linux-gnu": "0cb67e8a6f8852d23fb98e44e397efab",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b4603fe8207c1ac2b5755a5f8da04c32a8a3d34ec1506df28de5dac9010350f1",
        "arm-unknown-linux-gnueabi": "1ef83fad91842e56cafee1d1ca9aa421f1a4de6243b05f48cfd19aea674e0f53",
        "arm-unknown-linux-gnueabihf": "5821753eed05295364fd967eb444d744d673ea751a009bde3bce557611c8a00b",
        "armv7-unknown-linux-gnueabihf": "6d0530bee0b8af005e705556231e5c864293cca8790c5638d6842415317760f1",
        "i686-unknown-linux-gnu": "fe5a7bfaa46904b985c3bfd84f173440ea68244024c3d641efcde2b360520a19",
        "x86_64-unknown-linux-gnu": "a6ca018e19eb25781b72e0ce9971be66c518adb6cebb0175ad88e6ff333f5118",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-01-20/cargo-1.58.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.58.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
