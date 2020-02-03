
# Recipe for cargo 20190514
# This corresponds to rust release 1.34.2

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "65270b99e32c871a0ed862b9f1723620",
        "arm-unknown-linux-gnueabi": "659c37a45e688be9caa9ff21361d6025",
        "arm-unknown-linux-gnueabihf": "35d8af25042bc3f36ba80b38bb1c6371",
        "armv7-unknown-linux-gnueabihf": "b3275b71ad6f7bc13a49aa187531ddfe",
        "i686-unknown-linux-gnu": "4c23e2209dce37895d6de8b49d15a9bd",
        "x86_64-unknown-linux-gnu": "72d3ed1d5f17c1c42493d17b1f376aff",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cf9c88c17e1ad0daa09f690d808210fb08f310bac8ff73924905aef488daab82",
        "arm-unknown-linux-gnueabi": "4a1858935d30f2c261d815f9f60c0a35aa992a6287cc283497e313c081137475",
        "arm-unknown-linux-gnueabihf": "a2430ab1d234cb9b1afe8d240b8b98c613735a5e4c19d0a5b50b352227d533b5",
        "armv7-unknown-linux-gnueabihf": "1b60125aa42cacdd594691619799af5adeabd2533d90dca6c9e495ebb90d89ff",
        "i686-unknown-linux-gnu": "1345223bd6818e22228b38bcfac45fb5577ac825bf635fcab3c11d3a9f295ecf",
        "x86_64-unknown-linux-gnu": "1dc3cb681ee275433f3cf751e5736d097b54470e9208dfea18d8ce5505935795",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-14/cargo-0.35.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.34.2)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
