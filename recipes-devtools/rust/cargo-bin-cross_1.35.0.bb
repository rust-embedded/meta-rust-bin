
# Recipe for cargo 20190523
# This corresponds to rust release 1.35.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ce56c5d1969cbdc331b4a11049c9253d",
        "arm-unknown-linux-gnueabi": "3071830ad012ed7735a7d0a53831c418",
        "arm-unknown-linux-gnueabihf": "b64e715c4baa91c8cfab16a0c4c81eeb",
        "armv7-unknown-linux-gnueabihf": "94f0e3e71736d5093f8d8d4c2c091f73",
        "i686-unknown-linux-gnu": "6f4e447b0b4a842dcf92a8838dc63b50",
        "x86_64-unknown-linux-gnu": "79aae88fdbee04d5d89eec76fef67c10",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f118e65111623cdee6648dc16d04daae8eb77dcbbfc8847d95e36e8316aa7736",
        "arm-unknown-linux-gnueabi": "a0f91639223246bccc81ea6544dc74c17a1b6b5b8d9a0d034d317bbfa9140670",
        "arm-unknown-linux-gnueabihf": "f4ee2b5392bdb9956df455083c3c28dfa57e36a22abef30846dce5325741d313",
        "armv7-unknown-linux-gnueabihf": "54d9cbc72c2953ed0e22a34e46d697276b903b5329e9aa6c407f79864aca94f7",
        "i686-unknown-linux-gnu": "6ef32560bfa7c85dee6ef932a5e35994457f3e05e2cf8979c19971b8a5b805e4",
        "x86_64-unknown-linux-gnu": "77586f2fb5b6f6caef0cb6d3cc32a18559d4fcd6a6db4e75f4b3fb7adb050437",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-05-23/cargo-0.36.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.35.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
