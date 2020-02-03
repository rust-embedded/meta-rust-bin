
# Recipe for cargo 20190704
# This corresponds to rust release 1.36.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "286135b01da7bdc0d5ed6ac10ce64920",
        "arm-unknown-linux-gnueabi": "04dd76a19e44a83a5f2d8bda62cfddc5",
        "arm-unknown-linux-gnueabihf": "e18922cdb194d34796c819fccde5bd5f",
        "armv7-unknown-linux-gnueabihf": "15c9ea963179ac32291b3396a4444cab",
        "i686-unknown-linux-gnu": "b6a0d36c49fb6d1a8157fcb5f185c831",
        "x86_64-unknown-linux-gnu": "b42dcea3eb8000ae953b10140fbbc2c3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d43032b74a514a26c12405dcc61e47ff29f1636004c30c0f2294057ae8086d7e",
        "arm-unknown-linux-gnueabi": "e917b77d867268260b5e3e948747426c7a9ac5d93c037169166ace3a70e0f143",
        "arm-unknown-linux-gnueabihf": "f09e461936b91ddd1ed60f9471ca2b3fa44a74c8613a84cbf48c1bb5896e1ebf",
        "armv7-unknown-linux-gnueabihf": "72a26d927f7aaa3a4a0b2a894c96a099150f8d424c1d566fb59c254902e63336",
        "i686-unknown-linux-gnu": "b4d44ea68093f0e69287880c1350d391febe99944abd3898841a583cb76ecad7",
        "x86_64-unknown-linux-gnu": "6fbdecc0269b6f6a4ea7c819f84a87933e163387da3b433c2cdae12a589abfc0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-07-04/cargo-0.37.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.36.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
