
# Recipe for cargo 20250220
# This corresponds to rust release 1.85.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "72c6bcd1c2f450794446a76a778af79e",
        "arm-unknown-linux-gnueabi": "129560103766c1d5e1cf884f85dabb3b",
        "arm-unknown-linux-gnueabihf": "92bc1edd70d17fa8a36bd43e66791c01",
        "armv7-unknown-linux-gnueabihf": "b6399b12da8ddc196523bcdf89758c61",
        "i686-unknown-linux-gnu": "effae7fde1caa91bc98583fa132667f3",
        "x86_64-unknown-linux-gnu": "a074f59712333ce282b810cf58468a80",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "08fd45dd98dc1f60084e1156c0982e5f3d564a6da0d738f4a4a528c8f8dc8299",
        "arm-unknown-linux-gnueabi": "f33b98b7435916469637cab5acd1a1b63842837ffed2a3becabf11b1eedf1e85",
        "arm-unknown-linux-gnueabihf": "785a4ec767c32bede6c30d8db46f43d1174a06a405965c8766af6a5bd5905f22",
        "armv7-unknown-linux-gnueabihf": "d24807bd44e1259b37bbe05d62147883e136cded309ba5142983845b036d31e1",
        "i686-unknown-linux-gnu": "c6f9247e7f0029f516441048b188846506544962bd40f904de2b818666abcdee",
        "x86_64-unknown-linux-gnu": "e27ffcafa0c7a8eee305085155530974ba62edf5278548ba6de4e0674f55c372",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-02-20/cargo-1.85.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.85.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
