
# Recipe for cargo 20261001
# This corresponds to rust release 1.99.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dde64e68cfb3831ed7773bdcbbc56567",
        "arm-unknown-linux-gnueabi": "95f288268cdd5ced37db1cec26180f91",
        "arm-unknown-linux-gnueabihf": "e4d7cd2127055aa000a49b27b2dcec53",
        "armv7-unknown-linux-gnueabihf": "063642af6c78bc3c5e6d3a32f17f57ff",
        "i686-unknown-linux-gnu": "8a42ec22e5fc7e008aa8a5b969df80bb",
        "x86_64-unknown-linux-gnu": "c457eb18484058927b29532436eba40c",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f8b85e84b0514b69e17e3bad1c2dec7526f4a40cec565d233bbdcb66484dd9e0",
        "arm-unknown-linux-gnueabi": "5656e5c318dca71dbea2c3c904ede1f05dfebcc1307836b5ac24e3233d5f2032",
        "arm-unknown-linux-gnueabihf": "f33ba89048586b0a26f8a2876aa38531872e0bb4c176b69661fcdf16ebcfa701",
        "armv7-unknown-linux-gnueabihf": "81aa27bce787f30d85f677c013bbf9e7af1ba9ea7aa1c350c321ffbf1e4673ec",
        "i686-unknown-linux-gnu": "5790f714534de733550cbf2da2e556f9e2b331ea107fecea8b53495ac3ad649c",
        "x86_64-unknown-linux-gnu": "c2b8ba1f59e7a230aa5522684f3f7aa620b98e5ad37683a5e5cf9b41f534fa1e",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-10-01/cargo-1.99.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.99.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
