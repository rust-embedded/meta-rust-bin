
# Recipe for cargo 20211101
# This corresponds to rust release 1.56.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0571ec85e99cae554201d4b89e76c4f0",
        "arm-unknown-linux-gnueabi": "d783279405912345722a0f8f0abff2c0",
        "arm-unknown-linux-gnueabihf": "9540ccab4c8e40b3ff60841e7c075624",
        "armv7-unknown-linux-gnueabihf": "355d4b82ce56b3e455f79e4261df7b2f",
        "i686-unknown-linux-gnu": "e64eadf5284bb088a423d9d483bdadb5",
        "x86_64-unknown-linux-gnu": "779b8a618df59af38c6e5f4233766388",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9aa557436b0cf2a2f4f0d6c4aed5b95062c0637a4a94c000522402e59db1c93a",
        "arm-unknown-linux-gnueabi": "c6f4190231a062acc7371a14de52dab33dbf3a3a96be50069892cef6318e4b8e",
        "arm-unknown-linux-gnueabihf": "fe444ee7d5d3e8777507e3d671e252465295df8552367d69e4d163de6b1ef4b0",
        "armv7-unknown-linux-gnueabihf": "61b4686b778d1eb118e23d40d79b9da248dbff93a1edc0f64a920f8ba195be59",
        "i686-unknown-linux-gnu": "1142c1b8a29d17794d5d2682de93a6c0807d09047dd1462af4d613e0fe63269b",
        "x86_64-unknown-linux-gnu": "c896c033bb1f430c4e200ae8af0f74d792e4909a458086b9597f076e1dcc2ab2",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-11-01/cargo-1.56.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.56.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
