
# Recipe for cargo 20230110
# This corresponds to rust release 1.66.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5d16e84f27e443a77fdd97702fb5b4ed",
        "arm-unknown-linux-gnueabi": "8135311bc9e21f2afc3a00c7430497f2",
        "arm-unknown-linux-gnueabihf": "ca1d7f643f36ba8c52868d94320b8886",
        "armv7-unknown-linux-gnueabihf": "1757d17b7c50206b2fda5935e5422924",
        "i686-unknown-linux-gnu": "e588ac60ce136e332516b1a7f13bf9ea",
        "x86_64-unknown-linux-gnu": "cc8b3642f14832f5b0c81ec9d42d2020",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "96a44a8ca403f66573d5a8a56610456ac8c0a075f32a6680f8ec4cfff27aa244",
        "arm-unknown-linux-gnueabi": "267ef161d2248a4f37d168ec59b5e07168ed54f0d3c70f65315b85f4103adda7",
        "arm-unknown-linux-gnueabihf": "8f96fe00ed1d795888530570b12d82feec2d1d01a764ce8815218c46970e436c",
        "armv7-unknown-linux-gnueabihf": "4c8eb18c404e1d675822b8e6571b0965be91d33adbe682a171da6f5e3bf4de34",
        "i686-unknown-linux-gnu": "432d9fcd0748fabe71ae69a6ccb4ec7a4659bb388e0160c55abbe9af83c77193",
        "x86_64-unknown-linux-gnu": "7752e7c5cd12204fe852bcb2a67d7fa9ab037f26dd34ccc3b25253b4c223df19",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-10/cargo-1.66.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.66.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
