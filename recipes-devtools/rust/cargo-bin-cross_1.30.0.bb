
# Recipe for cargo 20181025
# This corresponds to rust release 1.30.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3a26d37bf613be7d205ee6e7c7b1b052",
        "arm-unknown-linux-gnueabi": "b9959cc5517674adfb96d250dabcabf7",
        "arm-unknown-linux-gnueabihf": "457bee2c89bbe3b51d5791a1e35748f8",
        "armv7-unknown-linux-gnueabihf": "422d706e2cadef32e5e281258af9f690",
        "i686-unknown-linux-gnu": "dee6ecd9e5d97f209ffc2fd58719c2bb",
        "x86_64-unknown-linux-gnu": "b3229879d93765ebbd0520f309ad26eb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cf3ac3beffb70e19124e33f9b543d00b0a7ad0dd9f9e18185dbec0e7df69c004",
        "arm-unknown-linux-gnueabi": "dfe2eea42659c7323fb1684a9b6c383da966bd8e7bdc592729e0898a56ee1f7e",
        "arm-unknown-linux-gnueabihf": "1fabf25d8b61e5b567edf9906e9e59af7cd794253270c50be28b250ca2666266",
        "armv7-unknown-linux-gnueabihf": "da9d87e7c4fd338252b133f7775909fce2ce70933e5249849d6c1a8dc7efa549",
        "i686-unknown-linux-gnu": "7d26d58148a03d0eb3858cc6cc635cf9cd092de9324e58b7f91ed8f22a4f5b41",
        "x86_64-unknown-linux-gnu": "fe03acbd158d680bbdd8009b242b5ee49a7deab129345ce9c539d7c523c22db0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-10-25/cargo-0.31.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.30.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
