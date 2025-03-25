
# Recipe for cargo 20250318
# This corresponds to rust release 1.85.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a707174706fc4fcb62edd0cf0b812f2b",
        "arm-unknown-linux-gnueabi": "fbf2b6cfe5a56edb32cf507a8e1ebfce",
        "arm-unknown-linux-gnueabihf": "1307a0d39c5805721243203597095cbd",
        "armv7-unknown-linux-gnueabihf": "af486a447db29d97b0ef4dbd1931b98b",
        "i686-unknown-linux-gnu": "5ae86352bc603ef8906773c328fc756c",
        "x86_64-unknown-linux-gnu": "ada10ebcdd4a8ac552745816c3fd9902",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b9323da8d07879e90dcb280b91772b53aa217e1598a2bd42126bda9daa048ff0",
        "arm-unknown-linux-gnueabi": "e96e0a1288023c81c3c8ae832cd1c5bb63558ebcad4be32a00df2a676eb1e9e1",
        "arm-unknown-linux-gnueabihf": "763db12813bcf99f6169fb057e8add5f554bc9cbd3bb43324b9f91f9073472f2",
        "armv7-unknown-linux-gnueabihf": "1f0f4a56e158033a087d66243d51f4e6f0ae2fb9c862ab9ab4748588422a5487",
        "i686-unknown-linux-gnu": "ee06269330b3b67434346dbaef6af6188ec56e2b20a7cc2b7ab5478ff0873042",
        "x86_64-unknown-linux-gnu": "1646065e914ff61d2073aa0a9da8fafe31544dc7234a378b60f7b5aa5aebb22b",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-03-18/cargo-1.85.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.85.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
