
# Recipe for cargo 20231116
# This corresponds to rust release 1.74.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1a8bfddc117af0695dcc7a43843b8282",
        "arm-unknown-linux-gnueabi": "cadd9937f6dcb7d7fde60455558031cf",
        "arm-unknown-linux-gnueabihf": "a7561044bb6f2b0746d3409db72f2c5b",
        "armv7-unknown-linux-gnueabihf": "b5a2cc100874ea5398d218d0aa380843",
        "i686-unknown-linux-gnu": "0f8c92d90b447941e808603c7203601d",
        "x86_64-unknown-linux-gnu": "e60053511d763f771783f00a1896f10f",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ab22b5aa6baa622a267f98ef2f1d06dd5a4a95b7ca6cadb0c431d31f1e018251",
        "arm-unknown-linux-gnueabi": "c4a1f294e4efb2c14f52424c7cb781a3855493718bc6fe6ef443951f0fb32da8",
        "arm-unknown-linux-gnueabihf": "498320f83a3f4426aadb55422f7546158d8008ba218633b630101d259830b60b",
        "armv7-unknown-linux-gnueabihf": "88127c7a75c931f6f2601a49693cddf76e3824ba41dc1a60039946cfdeda4702",
        "i686-unknown-linux-gnu": "cfb97ce4725c464621605d8b44753536032752843ff8cde52915a935e17a19ed",
        "x86_64-unknown-linux-gnu": "38451abcf728c8583cba29dbd74debf56ce585dcc829ac7b03ccf94a563b8ddf",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-11-16/cargo-1.74.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.74.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
