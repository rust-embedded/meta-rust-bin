
# Recipe for cargo 20201119
# This corresponds to rust release 1.48.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a617e4d459ceb64387afbfa2f4026db4",
        "arm-unknown-linux-gnueabi": "94dc3a5c07e05632111ee6b6df8d074b",
        "arm-unknown-linux-gnueabihf": "0c2cf5ada48903f2f3f60223f8626002",
        "armv7-unknown-linux-gnueabihf": "e5b777dd4708f7f00e6dcbbcea694673",
        "i686-unknown-linux-gnu": "7c3bba8d47dcdb2f7660e094e0326425",
        "x86_64-unknown-linux-gnu": "8f37221a49aebf41e15e27c3133273dd",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "71347016f0da96d4250225f7b52701274df958870b1a65482badb87d661035f9",
        "arm-unknown-linux-gnueabi": "9e98f4d471c94b1c736a42674d73f516ea852617b6207777f682929e7e7f4a7b",
        "arm-unknown-linux-gnueabihf": "2f4ab9e5f4e7fd17a16bbc1aa102b65a264f832df9693caef78d6f7a56885fa6",
        "armv7-unknown-linux-gnueabihf": "da8d28d6a51edc5826e53d512c0bcb74ae1fdfef07b2a371c51b64072c960828",
        "i686-unknown-linux-gnu": "b67758a6be3c19654daf779937e8ff7c8d5fbf3d0e65ceed1f08f5cd753d8b8f",
        "x86_64-unknown-linux-gnu": "52bf632e337a5e7464cb961766638e30dfa28edb3036428296678d1aaf7d8ede",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-11-19/cargo-1.48.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.48.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
