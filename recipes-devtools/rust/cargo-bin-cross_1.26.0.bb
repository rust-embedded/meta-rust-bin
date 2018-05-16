
# Recipe for cargo 20180510
# This corresponds to rust release 1.26.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9fd81eba39f6c5dfbcccee2575a62c79",
        "arm-unknown-linux-gnueabi": "f62733feed24cbf59ebc2161c74d9207",
        "arm-unknown-linux-gnueabihf": "92bc055a3c7842c2e4b905ddb42cca36",
        "armv7-unknown-linux-gnueabihf": "d19015be573dfad391cd7cd8bc790324",
        "i686-unknown-linux-gnu": "109f6dc05eda54bb18a45e86a7eb2f0b",
        "x86_64-unknown-linux-gnu": "9dd47b2e02a639e0879c3293eb8c7fc0",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f4ea629da354cc5f5136c8d013ac36e2f342c522150b1dd9ced57b3c42c26e40",
        "arm-unknown-linux-gnueabi": "93daaf9045e8592f9e8feb0434dce4737664306fc1c4fa45b652ffb3cb6bf229",
        "arm-unknown-linux-gnueabihf": "877f140f58e362f3d47806d9671e3904b7c135c76075d00213efa87cbf6008d7",
        "armv7-unknown-linux-gnueabihf": "c95455fd5006667865b7b6c677102fea1378b3facaf3bf6a6d94e8233bae926e",
        "i686-unknown-linux-gnu": "503a7f8a5e9283df33e7d86aa401dca1744abeea67a0ccbb62b2724a63dcd5fc",
        "x86_64-unknown-linux-gnu": "f50b64a7610401f4c1afe21de238663f33c621b7fc42c51401090ebd48e69fec",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-05-10/cargo-0.27.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.26.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
