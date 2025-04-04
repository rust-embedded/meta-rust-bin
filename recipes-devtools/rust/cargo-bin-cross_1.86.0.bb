
# Recipe for cargo 20250403
# This corresponds to rust release 1.86.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "df640a6d2a970d2c36b7b05f2533ee6f",
        "arm-unknown-linux-gnueabi": "c2e00e2e7694720a201ca5bc78ac6f03",
        "arm-unknown-linux-gnueabihf": "97267e5e00d10a8834110a6fc062554f",
        "armv7-unknown-linux-gnueabihf": "0eb6f0d2423af3a872d2feb3f1c9042b",
        "i686-unknown-linux-gnu": "6b2129fcc60048f54e58c93b3b318d25",
        "x86_64-unknown-linux-gnu": "14841685ae8cbb7e5bb5a60187e1a281",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "93313a618b45c142261f0a2174dae539034ad0dbce636ae19131f83b941bf35c",
        "arm-unknown-linux-gnueabi": "91518100623aae17bfdbcd7bbb6a4a10e8bc01a6eb75f9ef5218de2390a07cba",
        "arm-unknown-linux-gnueabihf": "5a9f2a95de00ed7c4665462ef8c4ec09b064ec98e76019a8ec4f10f6679a1344",
        "armv7-unknown-linux-gnueabihf": "e4b9272e7e26343acc7a22887a01bacb74c95f177524eb2a9661abc44ec99ec6",
        "i686-unknown-linux-gnu": "546b0dcfc7e51a91726b4421d7c9d9b0df8f050417231f8998fc682916b48842",
        "x86_64-unknown-linux-gnu": "0349bacaeeedf47a4366635205f41b0b54693ee76cf847896228425059024216",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-04-03/cargo-1.86.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.86.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
