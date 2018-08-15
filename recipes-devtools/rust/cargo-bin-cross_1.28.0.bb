
# Recipe for cargo 20180802
# This corresponds to rust release 1.28.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3e57cb759447d35541a9a6d7ea6fc57d",
        "arm-unknown-linux-gnueabi": "cd2473146cc34f74a5666334dd0cfe32",
        "arm-unknown-linux-gnueabihf": "984434c83dae4967ef3fa545ca1182cf",
        "armv7-unknown-linux-gnueabihf": "d3e4d7d05315f2523dac94f18cdfe29d",
        "i686-unknown-linux-gnu": "c277c428934a75d0d0e32b28ad25eb04",
        "x86_64-unknown-linux-gnu": "f9d283378b9b0d8457f737c2a6bfbc67",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "44c5bc30f742de7c621f4bbe5faee0ef2b0486d4272834b11ae2c17f3b2cc38f",
        "arm-unknown-linux-gnueabi": "2008545f80c75741f33c7d2199fff665d2a5bf037518c84a5061caa42e515bea",
        "arm-unknown-linux-gnueabihf": "f34c06db11b7d64ffc4d7b14e241c725d4aec5ae77edf23febf898fb0899297e",
        "armv7-unknown-linux-gnueabihf": "78ee952a4e5e7052d945efa190f55fc1a4303f21c9846807fdc8b0857cf4f211",
        "i686-unknown-linux-gnu": "ec9ba3aa064719222bb59de4cf8f2ad061bb31288e7dd4e98b80215203aa5876",
        "x86_64-unknown-linux-gnu": "a5e7749767c47669ed9b6e32c6fb8eda6b0fe1c63ac73a6d4666b5c1352bad24",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-08-02/cargo-0.29.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.28.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
