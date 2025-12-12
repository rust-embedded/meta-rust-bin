
# Recipe for cargo 20251211
# This corresponds to rust release 1.92.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c10e065616a81fc39ec95d8bb5961dca",
        "arm-unknown-linux-gnueabi": "5b21f920654b5ae55d483bca9c0d3717",
        "arm-unknown-linux-gnueabihf": "304f78a09ffa817bc2bef0574d695b35",
        "armv7-unknown-linux-gnueabihf": "5092de72e4b2b1f60474f101a58e6c08",
        "i686-unknown-linux-gnu": "00074d7b736e0cf52a611c51a6e359bc",
        "x86_64-unknown-linux-gnu": "9889e49e0b1d16bfcc36a1dfa39a5264",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f0bc99a9990f722c3c795bd778cae6aa7927a9907100698a1eed272beb4bef20",
        "arm-unknown-linux-gnueabi": "09dc930cf59637c3bd48ff5bc0b53200949e5194e39fbba374f139a7a03f69a8",
        "arm-unknown-linux-gnueabihf": "401b054bc35f33835e6234352b519858ca9fe009bd01b85766dbcacce986dc48",
        "armv7-unknown-linux-gnueabihf": "861561f65347eb9020cb93daa51eb43592f994dca7c392a3e8d9771ab797435a",
        "i686-unknown-linux-gnu": "f95a54f1aabc6b4611d80f2bd5dda8f27719266f7cd829c5b9c2edcbf190a42c",
        "x86_64-unknown-linux-gnu": "2aa2b1c1df189d346f3937b4887c901b737df2663a667de17beb8f1098442bb9",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-12-11/cargo-1.92.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.92.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
