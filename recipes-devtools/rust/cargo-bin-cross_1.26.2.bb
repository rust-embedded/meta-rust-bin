
# Recipe for cargo 20180605
# This corresponds to rust release 1.26.2

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "52abfd65c29e086c262fbf29aeb684c8",
        "arm-unknown-linux-gnueabi": "fc0b385d395cdd26dfa53865910fbe2a",
        "arm-unknown-linux-gnueabihf": "5dfe54881e1a1aea1c2d7deadf4098a5",
        "armv7-unknown-linux-gnueabihf": "bcc5a6a162c267e12f736625f81f2408",
        "i686-unknown-linux-gnu": "3fe8e2e6957f9b1a2a5a1120b0481668",
        "x86_64-unknown-linux-gnu": "ca366ba1e97ffc02b72dc74859db35e2",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4ed8632964d4b5b3ba6f8add2b837a9c7c89e2f50ab2c95fbba18ee7b5f57023",
        "arm-unknown-linux-gnueabi": "ff4003fdacc38c53efad9ecd8a0c9fb2d77af8ec62c12ee61dd2ed83f8a3a1eb",
        "arm-unknown-linux-gnueabihf": "d81712f4f00310d3159332957787906eeb61daf74901db5ee922a990f2ca6519",
        "armv7-unknown-linux-gnueabihf": "bbbf9646195ba00bba163f46752c4e9e0ce5939df276e5848a42e152b45cbc84",
        "i686-unknown-linux-gnu": "67a5ca244df5fbcd81f985e572015fb1bf79b8deb4d79be9165ddff5dd01c4ad",
        "x86_64-unknown-linux-gnu": "8c17710252513d8130141f2c12b4efeef67f0def252b94b246fe326a9a75043b",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-06-05/cargo-0.27.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.26.2)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
