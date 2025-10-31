
# Recipe for cargo 20251030
# This corresponds to rust release 1.91.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cd3d6533fc19b54b33325b3e29413a7c",
        "arm-unknown-linux-gnueabi": "83aef5451c4d6b3f6c4bf7613b02f6bc",
        "arm-unknown-linux-gnueabihf": "575117bb24a5566785331e33849371b2",
        "armv7-unknown-linux-gnueabihf": "f58345afd50bbf38a258c4b74311b685",
        "i686-unknown-linux-gnu": "adb27d7fb7792259ae6fa61e70f029d8",
        "x86_64-unknown-linux-gnu": "000b8db7ab8cbea8fadc64d510aa095b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c294a93085cecfb398a028c2f458e81a85a466191c2ecd95aea7bb07c394df12",
        "arm-unknown-linux-gnueabi": "504163baa3cf84e92e58c1bfef2f13f96b13cb903ef7145959d511d384198f74",
        "arm-unknown-linux-gnueabihf": "087833e99591c34ec67d6d1a0b797856b63f371296ca58017362716f40778460",
        "armv7-unknown-linux-gnueabihf": "5fccc2a5ce46c1121e7b73f6c6f1082d3e3e80b5615b4451bd8800b4596f9f0f",
        "i686-unknown-linux-gnu": "c89a574b2fc00c8aec061d0e2662bfd8c15ade4d3dd98ca98a4b4bf40b1489e0",
        "x86_64-unknown-linux-gnu": "8ab7b3aa030b7b6e4af5bb81e0939214d6a2380bf71ff5623e47a54bb01f1e4f",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-10-30/cargo-1.91.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.91.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
