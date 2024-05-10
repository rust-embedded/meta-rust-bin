
# Recipe for cargo 20240502
# This corresponds to rust release 1.78.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4097f66c9ebbbdff370e3f8233152c44",
        "arm-unknown-linux-gnueabi": "cd5e8f4ed1080de6fd7ba5ace387087f",
        "arm-unknown-linux-gnueabihf": "e9eab2aadd913731a6db24eae184674b",
        "armv7-unknown-linux-gnueabihf": "70b57e0b37cea802f1701249aecfd0a4",
        "i686-unknown-linux-gnu": "1315c35a7b3c8d08f6b442bae66f99a6",
        "x86_64-unknown-linux-gnu": "d1872824eb16527674d62ea4c1da12ae",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "df47eaad1bc3ddf561cc78bc47504e882961cb8389e01ce62f85433bacd64e3f",
        "arm-unknown-linux-gnueabi": "6e4aacc9d1fcfeb6129c6c2c27dbb01e7e431d49e549dd47362d07d44f930f72",
        "arm-unknown-linux-gnueabihf": "8f9e0aa29f1b31befc9e11d51738f36bf3692557c70c18522309261143f5986b",
        "armv7-unknown-linux-gnueabihf": "4d36a30d188ac59f04e49cb35302981937581ad939174b72f5967ecc1ba4e49a",
        "i686-unknown-linux-gnu": "b897a1de3d20366c8c3b01620d80f1105d543463fdd27a3016c0b7c9cf3e736b",
        "x86_64-unknown-linux-gnu": "c92648f3e8af27a40136a6a2fc2487ed52f27c0b19c68e502cd905b19b50eda5",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-05-02/cargo-1.78.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.78.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
