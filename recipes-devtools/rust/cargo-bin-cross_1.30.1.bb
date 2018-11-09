
# Recipe for cargo 20181108
# This corresponds to rust release 1.30.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5c94a07cbbb12e954f64ac978b4ee9a9",
        "arm-unknown-linux-gnueabi": "955dcc67ba92abe90c034a9267f30306",
        "arm-unknown-linux-gnueabihf": "197d75b8b1285cba11e7a0fa70bececc",
        "armv7-unknown-linux-gnueabihf": "1af72b4b98402d265433f80f4f74dfff",
        "i686-unknown-linux-gnu": "d02520fa58020e529d7a27ae93f87d57",
        "x86_64-unknown-linux-gnu": "bad665c07e73a3f3cfa7ec3b209737fc",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fc7b102942e6fdb32b9cb077513bb50186834bef4c947ff0b011c552cd639f8e",
        "arm-unknown-linux-gnueabi": "af6cc39eb8d95fdcf46717d787c3b8fd575f488ca7a8ca66e92f98f972b7a77f",
        "arm-unknown-linux-gnueabihf": "6601f5b8f4b45c4f8bec1f718ebbc30c7ac9d3accbe3d4fd0b502bf15199f679",
        "armv7-unknown-linux-gnueabihf": "55dd38a6ca4528e18f6e546d4c4cdd12d3af6d3413ac68233cb64272fe93724e",
        "i686-unknown-linux-gnu": "681caeb35516535896f555110923b5dbfd9d79b668a808d01c4cee88534c1ba4",
        "x86_64-unknown-linux-gnu": "bfbabba9a2c1717fe1ce68469ce2de7b4b94e44e6a165d50b77de7bf7515bdb6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-11-08/cargo-0.31.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.30.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
