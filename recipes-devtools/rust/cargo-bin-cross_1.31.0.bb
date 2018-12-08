
# Recipe for cargo 20181206
# This corresponds to rust release 1.31.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d7bf26012137d09cca3de2ae9a5f021c",
        "arm-unknown-linux-gnueabi": "fc7aad373fa4a2c2447dd26a42824a16",
        "arm-unknown-linux-gnueabihf": "de423f784d012aaf055d4b5242024a01",
        "armv7-unknown-linux-gnueabihf": "56845ba89d88e65bb0b3fa493324dd4e",
        "i686-unknown-linux-gnu": "8f898e924729e15c4cba29f92325c7b1",
        "x86_64-unknown-linux-gnu": "d2de0dc4d59daf5a178e8c1f3900960b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "27ca33ed1f59bdd7de4e741068cdc94ac41fa3bdef65582518ca1e355bf42b34",
        "arm-unknown-linux-gnueabi": "54634d4d72dd1c399b56e38a6a908f115ab047355d2e80be3da4fb940047539c",
        "arm-unknown-linux-gnueabihf": "69124fd83daa25e6d6fb34d2ef18ff80e85bee010940f1e6aaf10b25a2378cd2",
        "armv7-unknown-linux-gnueabihf": "1cbf1ba57651bf3e9886562177f3b0a792b4434be6d22a9d2a82665dd6bf737c",
        "i686-unknown-linux-gnu": "95f44961d57da328de67f996dc3fac8661812283eb9e57740cfdfec83cef50e8",
        "x86_64-unknown-linux-gnu": "c69aa6a7c5b6822e40c60852fee8656c4c335d3268234538adb8295fc4ff8ba6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-12-06/cargo-0.32.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.31.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
