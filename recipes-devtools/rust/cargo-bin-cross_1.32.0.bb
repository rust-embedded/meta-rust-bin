
# Recipe for cargo 20190117
# This corresponds to rust release 1.32.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4b89e41261c8c17f7c776757a7027b03",
        "arm-unknown-linux-gnueabi": "e03b8ccf31cbc4f2039aa82eda60ee6c",
        "arm-unknown-linux-gnueabihf": "50db4b6b96144885006327712d8cd11d",
        "armv7-unknown-linux-gnueabihf": "1eefe876ca70b9f1a9d138100a519030",
        "i686-unknown-linux-gnu": "ab7e9b13dc2ceaf29511da982481b919",
        "x86_64-unknown-linux-gnu": "13fbd6575ff9e5d865127bf0bff3b51d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "92438fb49b4f4c434826fc3d07368c9df114bac2294daf2a3109c63d5e86038a",
        "arm-unknown-linux-gnueabi": "c01f502819a1a950101daf03165ebb33cef2beb528eccfc5af8774760ee52bea",
        "arm-unknown-linux-gnueabihf": "1098c60f604e4275ffe22b27453a514d625864d5dae87d8ba2c641f271b0e5e7",
        "armv7-unknown-linux-gnueabihf": "d3fd97909f0c649e4c7d63bcdf368f54838400ed4dbd46862e66aca7b39aa85a",
        "i686-unknown-linux-gnu": "163f46bd84ba6348dfe1ac3c10bc4730059f321791d2a7d4d4704fe8ddf8a755",
        "x86_64-unknown-linux-gnu": "9dd7f79a0ab882ed7c892731514a4aed6435f7bc8a20381a8346b471c8a14209",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-01-17/cargo-0.33.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.32.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
