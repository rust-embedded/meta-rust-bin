
# Recipe for cargo 20250130
# This corresponds to rust release 1.84.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "afcbb1229b752ec9f6886837a24148ca",
        "arm-unknown-linux-gnueabi": "64d0bea6a71c6178e72dad3da0d78df2",
        "arm-unknown-linux-gnueabihf": "99294f28b6323efa54a45e1bd5f1127d",
        "armv7-unknown-linux-gnueabihf": "8c96719e1d372826ed9f30cc3d78c7ba",
        "i686-unknown-linux-gnu": "37a2378bc22627f6a211b50bddcdd35a",
        "x86_64-unknown-linux-gnu": "560cc83523280e17df01180cc9c5736b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "85fe9c58e2a79ef3427e724735b891707c12cc6c9fe4772f4ada820aaa28a139",
        "arm-unknown-linux-gnueabi": "27a48cc9499e8d7d806e88a514ad65dfe3ca9aef742a0cd5f485b823147e77d9",
        "arm-unknown-linux-gnueabihf": "da0c32605e6334fdcece09aa497f8f6c55601d23dfd77540b41fa752cb91835e",
        "armv7-unknown-linux-gnueabihf": "2dda6cd62055e5d56a622477f0bca8b4b2f94a316bb05a8d8cd1e06e2d5c9bd3",
        "i686-unknown-linux-gnu": "39ce55204927fff1d55507ce2f4167855e2f86d847efa16806f9b1b46de9b8df",
        "x86_64-unknown-linux-gnu": "9c083cfe7fb290cc9ad45daebcfc1438e2f80c64b9b383fdc86c9b0c787dfcaa",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-01-30/cargo-1.84.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.84.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
