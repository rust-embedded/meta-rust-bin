
# Recipe for cargo 20200227
# This corresponds to rust release 1.41.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c2c48f2e0095409adb6d5683be1819fd",
        "arm-unknown-linux-gnueabi": "ad69a6f97431087c4245bd0c501af197",
        "arm-unknown-linux-gnueabihf": "f9b2b51d0d09ec80fcf0970c78e5c8f4",
        "armv7-unknown-linux-gnueabihf": "293576d3ab5de5d9b37259979d1444af",
        "i686-unknown-linux-gnu": "3f2c44ad32f75e4089e16b9a32fff212",
        "x86_64-unknown-linux-gnu": "d433711070280e0685404a63eec540ca",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ef15f2ada9495a7f8654cac5ba88602b896e9c584879e9a549db9d557b1e4341",
        "arm-unknown-linux-gnueabi": "c0d3fb7a0a207c40f7722dc7412512adc1622067e0a80ba292eec0fde9e8bee1",
        "arm-unknown-linux-gnueabihf": "dee356dedbfec7bd46e74a455e675393447d6459216e5e5f210145ddba788a90",
        "armv7-unknown-linux-gnueabihf": "acc18a515e23eb6731f05598d9b5762a36e540d18cb9a052fe365b09e79c4af1",
        "i686-unknown-linux-gnu": "2f205413115af1e2138952c4646a6988cd94243dc050b0ba8c6503790990e5f6",
        "x86_64-unknown-linux-gnu": "3d36590adfe3a62bac02dd114f7262fcd4114b9755ef97cf9ce492cdb6c9d0f6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-02-27/cargo-0.42.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.41.1)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
