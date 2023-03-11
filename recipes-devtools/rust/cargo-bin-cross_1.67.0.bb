
# Recipe for cargo 20230126
# This corresponds to rust release 1.67.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "052d51d30067f9a9e50dbea7f605ea49",
        "arm-unknown-linux-gnueabi": "81dc2a0d2c0304c1a94ef5cd41891132",
        "arm-unknown-linux-gnueabihf": "5838391451d2c6f54de85c2a2b38b63c",
        "armv7-unknown-linux-gnueabihf": "c35915033b1ab05e6fb6408a3cf5394c",
        "i686-unknown-linux-gnu": "928427ba5ad99b9e7f9d234769713812",
        "x86_64-unknown-linux-gnu": "1dedb4ce0c60fcf2700156181d81639c",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b7ee9078f9543fbd93702e17e01b42b2a494d5501125fb3104200a8bb5fcfa43",
        "arm-unknown-linux-gnueabi": "14efa5bfa5989e6062081b55f1ef2aed4894cad87a13928b4e2da98011a292ba",
        "arm-unknown-linux-gnueabihf": "f3a7242d639c95129de21993c01261fb291be33a8245d2a62905868e124a22ee",
        "armv7-unknown-linux-gnueabihf": "0640fb8f2a2e0fdca0b6517ad7310b4d2361fc529e330d78aae3480c5a8d4d6d",
        "i686-unknown-linux-gnu": "d8055c407229127cbda09298f150b964424761ad1c3eca04e49f3e84f0ede832",
        "x86_64-unknown-linux-gnu": "7c70e350b139fa51ece48cc19cc7c61bc4d9ba5d15733a4179d27a51f58bcdc4",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-01-26/cargo-1.67.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.67.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
