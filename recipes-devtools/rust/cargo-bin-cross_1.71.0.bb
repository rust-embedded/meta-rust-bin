
# Recipe for cargo 20230713
# This corresponds to rust release 1.71.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6271a598a2aac2b352e45a0ce0795f7e",
        "arm-unknown-linux-gnueabi": "90cbd16a5b7a270835c6de0905a7ce49",
        "arm-unknown-linux-gnueabihf": "660b8ec886188e6f8fc58b18a8513420",
        "armv7-unknown-linux-gnueabihf": "a83e52041624070377488ebedbb1cf73",
        "i686-unknown-linux-gnu": "5161c10d1d22c47aa60376bc751ddfb3",
        "x86_64-unknown-linux-gnu": "c1f55c7bd5bdb8aa380b31d131ab63cc",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1f1ee451681a46d25abb3389f7be37e99563ef41447a4019ea2310988672bf26",
        "arm-unknown-linux-gnueabi": "7077642353912a18d71ae29bbd09a92ce0831d003da9a8ce1d8f1647af197872",
        "arm-unknown-linux-gnueabihf": "623792420ab3b017a6fd43e0c790c18f9fb49458d1066767cac188c7042abd44",
        "armv7-unknown-linux-gnueabihf": "1e75657a4b60be61ec8b31a79bb3a75370a4314443319e9d0efcfe4a78a4dd90",
        "i686-unknown-linux-gnu": "111bf4536f0d689c9970fe36cf2e49bddfceb7b5bbe60b93f1406750e9a38cb8",
        "x86_64-unknown-linux-gnu": "2a5c39a6fb733c87f9b0f5d9e30ede3779d6be250cf87ac96766b3d1e80aaa0d",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-07-13/cargo-1.71.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.71.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
