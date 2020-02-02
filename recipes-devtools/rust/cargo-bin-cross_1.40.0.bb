
# Recipe for cargo 20191219
# This corresponds to rust release 1.40.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0a710ae7d39220cf9d3db3e0c52878a3",
        "arm-unknown-linux-gnueabi": "4beb092a5080e1f3efa6930e21388103",
        "arm-unknown-linux-gnueabihf": "11d516d6a9de37e58a76c14e723ae239",
        "armv7-unknown-linux-gnueabihf": "c4044359ff70e1860715fe719207d451",
        "i686-unknown-linux-gnu": "ac46f00f23cc3b10ab6be289bd3b6e58",
        "x86_64-unknown-linux-gnu": "93254b394863f5469c184ef1fa0351cc",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "145e3ba2bd06a1569cbed0999c9737697b9a95c709340a4222916fddc0d66259",
        "arm-unknown-linux-gnueabi": "5f5d30d54f96b098e802a783c4ca1918083ff872a6ebade63c3f788f06235567",
        "arm-unknown-linux-gnueabihf": "00e9448cd7d5f15214b21c2f10ffbd29204c8f5939ebb6920c573e8e97349139",
        "armv7-unknown-linux-gnueabihf": "000b39955eb2405f0188179f2d5b17612df5590507c2dd9a6b0c7f62071a82ad",
        "i686-unknown-linux-gnu": "59229e8f45f1714437c7f481011fab0c320d128735a7512c5aa0e8acbc9ddfc1",
        "x86_64-unknown-linux-gnu": "699d5ecc8589211b44858ae164613a1054c0ec000184d0514ea1a0348a483861",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-12-19/cargo-0.41.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.40.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
