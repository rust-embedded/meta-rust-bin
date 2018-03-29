
# Recipe for cargo 20180215
# This corresponds to rust release 1.24.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "67427ede960742d0580855eee55f1f40",
        "arm-unknown-linux-gnueabi": "86701e7bf219b7ea7647ea35ec5104c7",
        "arm-unknown-linux-gnueabihf": "074fec007be040a42c56d4b512be0a72",
        "armv7-unknown-linux-gnueabihf": "15dfee37b832d69c912e19da5df0b606",
        "i686-unknown-linux-gnu": "b5aff8de6cf43993d6486d7ccc42bf8e",
        "x86_64-unknown-linux-gnu": "3563bdec9bc620fcd0bd046424eb78af",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "085fee1d520ca851dc14d8750ee843ebea81eec75c58a789396884171975e599",
        "arm-unknown-linux-gnueabi": "9750ddd6f68d3ad35299232663916a0206c47527dd993e65c6de586c0f126f0f",
        "arm-unknown-linux-gnueabihf": "86384bdfd3ad756eac1d5b15c91d10bec33bd6dbe4b5d84d2eeab1b79b3a838d",
        "armv7-unknown-linux-gnueabihf": "1ee57372eb94388684a1faf1424f80ffa6c5745676cd793f7eae3931f02c009f",
        "i686-unknown-linux-gnu": "51169e84c0b660bbfb89e73752463c41820b3eb411b9d82546f08e2a1b20d7a7",
        "x86_64-unknown-linux-gnu": "1cbb2cb1be2838fd34d6e5becfcbcf0f14bdf1c917c2f9e0acb16eb3fc1e2e8a",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-02-15/cargo-0.25.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.24.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
