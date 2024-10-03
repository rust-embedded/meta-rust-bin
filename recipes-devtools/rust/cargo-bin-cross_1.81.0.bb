
# Recipe for cargo 20240905
# This corresponds to rust release 1.81.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "df294b72dd4edb3eea1d29aac9261c98",
        "arm-unknown-linux-gnueabi": "758de33d916c519160a9f6022f77f33f",
        "arm-unknown-linux-gnueabihf": "df65283b525d451c72c03af0bc22e039",
        "armv7-unknown-linux-gnueabihf": "72b5ccad7512af6c6d42ac49c8fe4d8e",
        "i686-unknown-linux-gnu": "33dc88f5d29398d9a45cf8562d4de5db",
        "x86_64-unknown-linux-gnu": "bc5fec57cfdf6b2aa8599622d9e830e7",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "00c5185b49a885df529832327d2584a9c26dd03df64f0a52b32a3f34bf3498c1",
        "arm-unknown-linux-gnueabi": "720b7ee96a9adc7ade3b75ebcac68d5eb815d3342b2afd8fab6079970cf28158",
        "arm-unknown-linux-gnueabihf": "94778c04f530cf3fa278343a8a6d5212a91687a0f716f7b51e088dcde62ad662",
        "armv7-unknown-linux-gnueabihf": "c35378a2ce56867a0067bd7d36b60e80976bddb9674f152eacb918f0cbdb3909",
        "i686-unknown-linux-gnu": "146539c6e3120a8d528ff4baa3825ad7bb62c66c25be41494b45bf53860cfaf8",
        "x86_64-unknown-linux-gnu": "e735432b85349aa78ed164ff03a31c43298f46a085fef047a33607adee80adc3",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-09-05/cargo-1.81.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.81.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
