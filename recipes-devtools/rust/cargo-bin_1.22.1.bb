
# Recipe for cargo 20171123
# This corresponds to rust release 1.22.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "af328cde1db39032410d9bde3365dfc2",
        "arm-unknown-linux-gnueabi": "82711636d2a5d5dcf16ddf314aa578f9",
        "arm-unknown-linux-gnueabihf": "e97f30233dc2fa13fba2cfe9b5a82976",
        "armv7-unknown-linux-gnueabihf": "6da9017756c57c6bdf5221c1e370c9f6",
        "i686-unknown-linux-gnu": "e8cb4c8416987ddda8d29a4ab238fa98",
        "x86_64-unknown-linux-gnu": "043315ed81783e9fa021f41fe92ba23e",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "502a87264148e359218136c0c98a6f60107d15254d99a015ffbf876929e56031",
        "arm-unknown-linux-gnueabi": "14a22b7bbb82c16af638011ea958f8398c0fa46d8551729e20807e4e2ed02ffa",
        "arm-unknown-linux-gnueabihf": "14b5e6a4625e3a9fcf7805a4bab1f67b4816b56419f7cfaee94d84b2c82def72",
        "armv7-unknown-linux-gnueabihf": "883879cd5bb441d080bd2aa53b7d7edb19402509909d36c8421bc6ebc20884ea",
        "i686-unknown-linux-gnu": "7ebe231e5da2a06370f17050285ee694cf09ac2010d87dab334ae7eb7fb2d975",
        "x86_64-unknown-linux-gnu": "450bd9a2f457422e42d898ef8d970919c6b7d1bbedb4e92606a8cfeedc6ed5bd",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-11-23/cargo-0.23.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin (= 1.22.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

include cargo-bin.inc
