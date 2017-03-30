
# Recipe for cargo 20160821
# This corresponds to rust release 1.12.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c146f696a277de6e9cc8599fa671564e",
        "arm-unknown-linux-gnueabi": "5f522ca2ba1a8c2bf7f5708823d19b2e",
        "arm-unknown-linux-gnueabihf": "1a62e360a6620643c88f43be09c530b5",
        "armv7-unknown-linux-gnueabihf": "2bf99a05a400a63ec5b7dea99dbb9442",
        "i686-unknown-linux-gnu": "6b1ecfcdf8f04c596a66e04b50319a92",
        "x86_64-unknown-linux-gnu": "db8f4a71394eb2d02d9b467821847f93",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f7bb5adc3c2c252d0cca2bf998f3f34867ea15aa49a23d77de2014ce2da49df8",
        "arm-unknown-linux-gnueabi": "4aed27a752d3023c85ea7cbb5d102239bc562a3a8e0635ba1eeed645f604c8f8",
        "arm-unknown-linux-gnueabihf": "2d27879622433e819cee8c3a68fdb34edcac9d5469bd338e00e97594b0132d04",
        "armv7-unknown-linux-gnueabihf": "abdf624436090239d27466ebd33c44245acf65337e510ed24c41567e02bace45",
        "i686-unknown-linux-gnu": "46f22e9333f64d2aeff34be0a180b3a49b5a68e9f4a9cae8fe2814590f5a30a5",
        "x86_64-unknown-linux-gnu": "bf91da07e7cf81c5ba2d0fc453cb21edbf0d26def4f1a28093bf10851cc017c0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/cargo-dist/2016-08-21/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin (= 1.12.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
