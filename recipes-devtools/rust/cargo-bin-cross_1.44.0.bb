
# Recipe for cargo 20200604
# This corresponds to rust release 1.44.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ebd6662773d6e2e2e9714a81b2daed8d",
        "arm-unknown-linux-gnueabi": "a5178ba95d524c3dfc9bcb07df70f072",
        "arm-unknown-linux-gnueabihf": "3535cb7fbe97343eb51a9d826d777c5b",
        "armv7-unknown-linux-gnueabihf": "f9f9c64dbd75e950ab2209705cf0c398",
        "i686-unknown-linux-gnu": "6541bfef1c0914f056a7adff7993801f",
        "x86_64-unknown-linux-gnu": "bfb07c01a09384cc9ed5da3bf27cebae",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "95306908dbfc2ecd4f9b869b09842b66c00d7005568587963ceda2b9b2f9bead",
        "arm-unknown-linux-gnueabi": "d5eabfd792d2f6c1d05bc989a632a2d25d582c7986f1acea876b96f1ec4d605b",
        "arm-unknown-linux-gnueabihf": "60c53f781246bff0780c169d1ebd4c41dc4fae336fc02e36e0b313b9e4487095",
        "armv7-unknown-linux-gnueabihf": "b6095d23c1df1759a2a103ec30e793ba4931cc5bb511d3d0017d60380fb8296b",
        "i686-unknown-linux-gnu": "a288025aaca5b3db3f82d7fdf3245cbebd15f715cc1623dc12baa83ce258bcff",
        "x86_64-unknown-linux-gnu": "f9dec7c4f5af57e400cc90bb791e7dcf4dd8d11c65336ffe27a6e2516c6f371f",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-06-04/cargo-0.45.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.44.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
