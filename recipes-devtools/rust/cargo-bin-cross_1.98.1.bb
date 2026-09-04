
# Recipe for cargo 20260903
# This corresponds to rust release 1.98.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0b41d9e4af3530ed6bffa46a94245d3f",
        "arm-unknown-linux-gnueabi": "d56aaa425242965cefef5b6b4afe1f5c",
        "arm-unknown-linux-gnueabihf": "e6bcd746fded39aa6d218536e7d55099",
        "armv7-unknown-linux-gnueabihf": "64471a2fe79d153ed8568a493af0928b",
        "i686-unknown-linux-gnu": "85f25d04cfa6dbdcfb6519e7ef0f4405",
        "x86_64-unknown-linux-gnu": "753f47507375edef55853b9ee32739bc",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a464c555c6f3146ee6854d0c1f4da85f514519e70813de6df277ced0e188c471",
        "arm-unknown-linux-gnueabi": "c59e740087d20de1805c185b1444f24bafdcb2ec33f5e8f00b7ee5b8272477ff",
        "arm-unknown-linux-gnueabihf": "f624d94f30eaea2c5190220e0f59e066f979b23a15c867fca1359253e771471d",
        "armv7-unknown-linux-gnueabihf": "f5e3c08431708dc41f2664419eeedd7a11f37a718c5c35bfae8e5d44d628a2a4",
        "i686-unknown-linux-gnu": "e0fabd74ca817340d5570a9b5f76254d8af04dcc86d109914d4b3482f497bf48",
        "x86_64-unknown-linux-gnu": "3f1215b2a3b88c7aaa008b561bd4f39d6c6672fa7821e562ab6ba1a6d6f37f61",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-09-03/cargo-1.98.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.98.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
