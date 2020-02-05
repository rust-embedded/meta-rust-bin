
# Recipe for cargo 20200130
# This corresponds to rust release 1.41.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "269ff6456de630ac6bce33fb099ff3bd",
        "arm-unknown-linux-gnueabi": "2cae7ff1abde581c70e2d7048e2aa9c7",
        "arm-unknown-linux-gnueabihf": "6d29219e608974db00c867b11266ea96",
        "armv7-unknown-linux-gnueabihf": "d62fbf9c967d04f869948a519b73184d",
        "i686-unknown-linux-gnu": "0343faded5c7d072f689434e337a9f14",
        "x86_64-unknown-linux-gnu": "a7a23960dcc38d516e90a8861daf3ec5",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dc6dfe81108530ea9aff0a3e8b2ffcb94b8022308785a0675526d89cbc178031",
        "arm-unknown-linux-gnueabi": "07a943ffa9ff598eeff0f967611827f598f320a0e8a5a32924d80e8e377c321d",
        "arm-unknown-linux-gnueabihf": "356de268f76f95c907432a99dd037e8df6be51e6d132a54d61146aacf925f243",
        "armv7-unknown-linux-gnueabihf": "f8aa2518c41f56442fdb3459079d2a92616a69f0d75f952f8317351395c65117",
        "i686-unknown-linux-gnu": "c9034c566a9cf395d59473cd1f2c4f1d3aced80a7997b4cc62910c6bacd10f37",
        "x86_64-unknown-linux-gnu": "7afa1dcd7ceae75791a4282fc48dab8d32495990c15b4f35205ac1b9451b9737",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-01-30/cargo-0.42.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.41.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
