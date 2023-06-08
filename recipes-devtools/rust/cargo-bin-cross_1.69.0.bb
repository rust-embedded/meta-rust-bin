
# Recipe for cargo 20230420
# This corresponds to rust release 1.69.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "52e7207c3409a9db6c9e38f0257f77e2",
        "arm-unknown-linux-gnueabi": "451a3e9ec6228cfc4066732cc2d7a672",
        "arm-unknown-linux-gnueabihf": "8f4383b886ae7fb3782ba4daba0b0a7f",
        "armv7-unknown-linux-gnueabihf": "25c7ce4495a5a6fd2ad1e5dabc5ffd73",
        "i686-unknown-linux-gnu": "27db5dab5f94f8c81faeeadcaa8f5197",
        "x86_64-unknown-linux-gnu": "1fdaaf9b81ccee41ba54451f7951480f",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6ba6e4a9295b03d01b7dac94b7941d71c029343dc3abfd6cc4733a99fc3c7976",
        "arm-unknown-linux-gnueabi": "0d93ea24db4e3fc7739c68661a466fa4fbe8e158c1f10ef06e8d9cee1f7de73f",
        "arm-unknown-linux-gnueabihf": "dcc8d9dffc209bd665ad45586b271569a261795162426ffbab24336e04f7a3c6",
        "armv7-unknown-linux-gnueabihf": "8cd5ca78c7efebcd735b7264f8a926480f4bed334b9e031d68f75494e669ff60",
        "i686-unknown-linux-gnu": "45f966d2965e41e0598fa9dce780766163685935647c8de09610c73f5f85823f",
        "x86_64-unknown-linux-gnu": "7ee899206f592a86687478465970aa6b57772ccbe9a1f1b7695aa1237c2325a6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-04-20/cargo-1.69.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.69.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
