
# Recipe for cargo 20250515
# This corresponds to rust release 1.87.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c9c0e7e0fd7a9c566ce8e69c5b4fcdc5",
        "arm-unknown-linux-gnueabi": "24d760c622c3485160c4844643209ad6",
        "arm-unknown-linux-gnueabihf": "cfaded091d033009582ac55d1848a016",
        "armv7-unknown-linux-gnueabihf": "4c05a81ecb6ddfc6014c55e7f9a97ecd",
        "i686-unknown-linux-gnu": "c0212493fc3205ab486361f80afba758",
        "x86_64-unknown-linux-gnu": "cc2843ffa1915fdd1efe8c6104c41811",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "27835250d38f78d14308ad1d68786e437392ce21304d8cdf9dbed800a1dca29a",
        "arm-unknown-linux-gnueabi": "ed4490c619ea522e5558792f12c8828a6e719b314c282e936463c53119d4b0a7",
        "arm-unknown-linux-gnueabihf": "3eeabb8945b02f15ace5fad38383bb4c3b112e31f570fa94af1767f41d9eef68",
        "armv7-unknown-linux-gnueabihf": "91767f6fb65c9b114b9a2fab49bb638a43c6db2b88d6d362c841cff64f319278",
        "i686-unknown-linux-gnu": "d217aecca37871c6a1de826acde48bf73445e2e9a9c4587596a93d6a4c957bd8",
        "x86_64-unknown-linux-gnu": "76902b7b786ab483de87e8191b9b329de100360175cd8e0a6e29443189e06368",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-05-15/cargo-1.87.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.87.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
