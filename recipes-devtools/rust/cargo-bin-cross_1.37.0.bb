
# Recipe for cargo 20190815
# This corresponds to rust release 1.37.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "65ae2dca1e494e1d77261f9411b8b89c",
        "arm-unknown-linux-gnueabi": "cf3f065aeceb4a19875b179959ff2f35",
        "arm-unknown-linux-gnueabihf": "5272fee7eacc51ecef7130502376424a",
        "armv7-unknown-linux-gnueabihf": "2b5f04479ba5dc98465dcffe5fc122fc",
        "i686-unknown-linux-gnu": "daa8fed6280a295e26a2509fb5bf2458",
        "x86_64-unknown-linux-gnu": "4e9b773b0b6ee21213b39cbc23f7e99b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "836854182c91a0a0ab5db992f99f68d435c67e6ed9171780ec395103a9f2f676",
        "arm-unknown-linux-gnueabi": "4359f3fd51618531b2f13679f834588407bfd2e96e539bccbaf008ad8a51263e",
        "arm-unknown-linux-gnueabihf": "241f1e00ed7b399d4d8976eb08dff4e3cef7ca368429c71f41875af2411b5921",
        "armv7-unknown-linux-gnueabihf": "469c23382fb6ec00175029ac21da4feea71fe8c37159fc7b3bc2a6255bf0a984",
        "i686-unknown-linux-gnu": "f3003b189f4a972d131c54b3cd3fb56a9a02312229882ab79855a38b2b58471c",
        "x86_64-unknown-linux-gnu": "70f694f49a60a0c13e8b07d36b5c8b4e1000a25282c4d8496e8747e9df36fa7f",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-08-15/cargo-0.38.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.37.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
