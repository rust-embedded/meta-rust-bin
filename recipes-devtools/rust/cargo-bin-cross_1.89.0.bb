
# Recipe for cargo 20250807
# This corresponds to rust release 1.89.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c5598618f5230adc55fc0cb8d6037681",
        "arm-unknown-linux-gnueabi": "19895c4f7825e1526ff6354302247d85",
        "arm-unknown-linux-gnueabihf": "37cdcdadf4ddeef8641982528f02e405",
        "armv7-unknown-linux-gnueabihf": "8ed97298cdf5932404953d876798e522",
        "i686-unknown-linux-gnu": "f60e27f83e40427ce61ed4d9c0346e37",
        "x86_64-unknown-linux-gnu": "20db57f95352a6fa848e355aca4759d9",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "13b3f088c2113c7cc2ea37a5fbd4614d4ac70161bc5a3daa2998d706ae74cfcc",
        "arm-unknown-linux-gnueabi": "54270df12d17a28224aa03b5037d620ada8e36850518476c23aca680281ce2e5",
        "arm-unknown-linux-gnueabihf": "ba3d1d0003771801dcf9b63adab67e5c4c68efce1192945f3a28205fab524124",
        "armv7-unknown-linux-gnueabihf": "3344488c967981964bd58b18dfd4593cb0a41b52e6a7fda492d7fd6d7ffe2814",
        "i686-unknown-linux-gnu": "71fe47f521c4479e23f8e755b70fd71b5131eb4ad4d8d3180ef99910ea62b959",
        "x86_64-unknown-linux-gnu": "3e1cff13e26498cd2975fb18ddfb442ff9c7cfe301bb9c310570a4597c0331e2",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-08-07/cargo-1.89.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.89.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
