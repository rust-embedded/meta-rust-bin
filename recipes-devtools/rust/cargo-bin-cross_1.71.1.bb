
# Recipe for cargo 20230803
# This corresponds to rust release 1.71.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "afb5409c344657c2b062999c6b195704",
        "arm-unknown-linux-gnueabi": "968ba43eff5a824dcdeecc9d703fe281",
        "arm-unknown-linux-gnueabihf": "34c624ee97a95205642c8520f38d97be",
        "armv7-unknown-linux-gnueabihf": "156f9b47ac705a7f447c5216086f7ec9",
        "i686-unknown-linux-gnu": "63adaf5790373cf120e9cd1787326daa",
        "x86_64-unknown-linux-gnu": "7cfe9643d2a458912f18a389cdc13fa6",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a98d1bc375f87385c8b8113c7c1f5c56f66ce4464f8899ff92b2634acaa83aea",
        "arm-unknown-linux-gnueabi": "849d89e3d5495e9b8e2ad824796c11d1db26888c75b1ea75c9b998a045f03416",
        "arm-unknown-linux-gnueabihf": "30d2426de77d770c310f055263835180835c1701c6c8f023ab799fbeaeee74cd",
        "armv7-unknown-linux-gnueabihf": "186e94d28463de82c1f037b153f7fe54fe8b62a8e38da93032e65dcd365c8690",
        "i686-unknown-linux-gnu": "5c1e2d87cde0bb02e2d0daf05990c4c6df11a099765555bd1d1e44c9642c21c8",
        "x86_64-unknown-linux-gnu": "7fc7963d663c888ea862fe1546a4a2e174dbf0d017ed3c8c5260fc5573d279b6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-03/cargo-1.71.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.71.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
