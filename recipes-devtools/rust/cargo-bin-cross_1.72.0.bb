
# Recipe for cargo 20230824
# This corresponds to rust release 1.72.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "672d941ceeffe8f838119cd06e438b0a",
        "arm-unknown-linux-gnueabi": "4b9c8e1870dd6a35abfe38e3c1c5b94b",
        "arm-unknown-linux-gnueabihf": "92af47d5d67015f37d7a878a33d5349e",
        "armv7-unknown-linux-gnueabihf": "804c224eaede5d86d85009c5330ceec5",
        "i686-unknown-linux-gnu": "d35031cd39a5c3d3d8c607c62ec218a3",
        "x86_64-unknown-linux-gnu": "827dddf4ac4258c52b97afd86992281d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ae2414ed0e30340fa2994e1c4b4e809c2bb1a3c054de395540f5ec1aa1b35072",
        "arm-unknown-linux-gnueabi": "9446f3dee453c5877e694879e4bcf506cdda5de61ea9400b75ec11e166a0ebd5",
        "arm-unknown-linux-gnueabihf": "23a6bf57c1fefad844a3d9c1a43a3160a657dd8d7ff25c287fa7924c83c4d835",
        "armv7-unknown-linux-gnueabihf": "b8b5ec8b1249982f80583f49b7035bcd666c11441600df5ee72b3b866712f8d7",
        "i686-unknown-linux-gnu": "0b0f5e94e91762be981e5e4b4bbc8381aab1481cf93e24124be17e445c33547e",
        "x86_64-unknown-linux-gnu": "bdd0589277041b7e6375e2782f9ce197f454f735642f118acb3a2d8e422770a4",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-08-24/cargo-1.72.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.72.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
