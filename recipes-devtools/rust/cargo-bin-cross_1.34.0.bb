
# Recipe for cargo 20190411
# This corresponds to rust release 1.34.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f060c163c6ecc3e64649b18e49b2a362",
        "arm-unknown-linux-gnueabi": "160f64b935499f5037fb7a826dda3a8f",
        "arm-unknown-linux-gnueabihf": "133911a796d6d50c67e35817441a0fc5",
        "armv7-unknown-linux-gnueabihf": "bf784e6eb04cd173fd0609eab029d212",
        "i686-unknown-linux-gnu": "4b7c1160b55b0e318a7686f035744849",
        "x86_64-unknown-linux-gnu": "fafff25f96f101898b77d1b04deab0dd",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "84839254d1ce15c63a374c85cde28c63aa4181aacfaccf71413bf8b469c0bb29",
        "arm-unknown-linux-gnueabi": "2e2947070d73fd263e5882b397c0f2ed5b2f3ba7ce7e9a6615031bd921c86c6a",
        "arm-unknown-linux-gnueabihf": "379250dddc73e2ba0add12019ab3527057aebbf2b4e68c6e74a73aee26363438",
        "armv7-unknown-linux-gnueabihf": "3bb2b306b1ad652f738fbf661eaa5a95c96fa95dfb70cdbd49fe334ae23423a0",
        "i686-unknown-linux-gnu": "ed68878ef0214e693419677d3e134d04f64dd9eb09efd68c4edd412195580f26",
        "x86_64-unknown-linux-gnu": "e013df3d7643baa19ed621fc1354938f98bb3064e2de17c8908ce6e0c5b778a4",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-04-11/cargo-0.35.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.34.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
