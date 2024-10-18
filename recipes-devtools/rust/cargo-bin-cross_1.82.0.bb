
# Recipe for cargo 20241017
# This corresponds to rust release 1.82.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9d87b2c0e050704acf0182c660b802a3",
        "arm-unknown-linux-gnueabi": "5ea12bdb94025f4d0b4e4a0ddffa6847",
        "arm-unknown-linux-gnueabihf": "33d3c13fe8d0b99801d78cab4e1bf5cd",
        "armv7-unknown-linux-gnueabihf": "cc8b83abbb603f86d7873d7ba561917f",
        "i686-unknown-linux-gnu": "537bbcf1fe3cf8c172f2db7702debc05",
        "x86_64-unknown-linux-gnu": "18d0925071b0419c32abf25ccf12b2ca",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8bb600421fe7fa98bf1808332ced563c8d9e1f27d6cbe6240eed3e6eea9ac2e7",
        "arm-unknown-linux-gnueabi": "6fdd084d7cc52e8f2fb7922bbc14847431227514b9258f0759903f40c4a5acde",
        "arm-unknown-linux-gnueabihf": "9fb4c48e2e5c364a17f58fbc974924957c5bf784c4f835940f2e2d251149c4da",
        "armv7-unknown-linux-gnueabihf": "0f835d6e54624af1ffc23a4cc5492ee82873436b86ec3d0d52344c32dc9d14bd",
        "i686-unknown-linux-gnu": "5ebecd4a81f54ed9aaa3d287e01497dd86ce80bfbd4b9c81ba506ae249323b4e",
        "x86_64-unknown-linux-gnu": "45594e7c01a27c4d9c128852735b84c80439fe1a07cffb664944e8a1036fd9f0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-10-17/cargo-1.82.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.82.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
