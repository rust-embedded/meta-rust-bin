
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "00f59d22a1465e07fb9055a14c9a6191",
        "aarch64-unknown-linux-musl": "586dafe3d61e6265a1aa905a464d7db9",
        "arm-unknown-linux-gnueabi": "58af83cc2ad688c101094df1fabaa724",
        "arm-unknown-linux-gnueabihf": "98edb1819fb23996131add5555e0ded6",
        "armv5te-unknown-linux-gnueabi": "4b90cf0bc730c108f2ca9f39864a62e1",
        "armv5te-unknown-linux-musleabi": "ed22553fa0961755e20d7e31131bbb55",
        "armv7-unknown-linux-gnueabihf": "7300db3a0e8816e32958ab05b685af5f",
        "armv7-unknown-linux-musleabihf": "94e850d2f200a64554ea143d68c54fb3",
        "i686-unknown-linux-gnu": "ff3bc7f9ab4642f5fdc23bd4b46dfa93",
        "powerpc-unknown-linux-gnu": "0fa13301cf0cf440dbdf8bd57c67da79",
        "x86_64-unknown-linux-gnu": "81fd26e8d408547d858fb28c85e105af",
        "riscv64gc-unknown-linux-gnu": "c8c3ae553d93810d283aa5789cb90ff7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9ef30225a7c466758a1b3ba011cbd702f5038c875816cb1733d633002642e2f3",
        "aarch64-unknown-linux-musl": "ba54eb65852ab11a3a17edef73a053ea18af532cd5e4b14b2783d883d069c3f6",
        "arm-unknown-linux-gnueabi": "69c6c7e42a2cddc72ba7f0232e7aa68d149067570538d634a3961fc24690d92b",
        "arm-unknown-linux-gnueabihf": "913b279929083adaa7bc7875cf04bf1814e3f927c55db0267904b2d23199669a",
        "armv5te-unknown-linux-gnueabi": "364478e3a9baf6562fa48bab99243eb504fc016ff43f864c05d10c890b78c735",
        "armv5te-unknown-linux-musleabi": "5ce1a12c2989ee2b2a0b2ef3d8c2e3e88fe8bca73b0fe1c7b351f1ace2ba0730",
        "armv7-unknown-linux-gnueabihf": "7d1064165953830d8d32b43088437bac6d1175b195005a5175ca85c55c8988dd",
        "armv7-unknown-linux-musleabihf": "d6e24f3a599c98388c82bded5a5d38c4602ab3d22405b766a79d3e2cd75909c8",
        "i686-unknown-linux-gnu": "9a531fbd3011c92ce7951fcb0d3a82df9e3a3a0918ba690c1a5cc4f9f9de4bae",
        "powerpc-unknown-linux-gnu": "761b208e700fcb0088ec451a646b408020a776ab079a2ba76c816a973516c0bf",
        "x86_64-unknown-linux-gnu": "0048c9b4b0e1de3cebff9e159fe47b7a366f5c1823e71f0c984fbcacd7453a7d",
        "riscv64gc-unknown-linux-gnu": "b01c429e44f34ad44b6f280764d794f4c1e0dd316e45089d02c0ee79c62c2c47",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7bb5476fd66687cb97eba50f54799425",
        "arm-unknown-linux-gnueabi": "299d77b8743a56490b3babc2c69a0f78",
        "arm-unknown-linux-gnueabihf": "56d9399ffa7bf7cbadb82a8c0afb79ee",
        "armv7-unknown-linux-gnueabihf": "895ec5a43051171f654edbcf62d76eda",
        "i686-unknown-linux-gnu": "89e0a7e2b7a446728aaa02f9fa91750d",
        "x86_64-unknown-linux-gnu": "6d451a592f9cad6352db42f71e3c5af5",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2a89435ab32d0fe619762af2b388f74b6ee5b0733778f360764fa67a962162dd",
        "arm-unknown-linux-gnueabi": "2ad4707641530a1cf32d35aebff4171cd834c6becb5523515dfd1239096e95d6",
        "arm-unknown-linux-gnueabihf": "fb82db8ead837ed6c71dd9354da62423a68d04fec16db5a42be0c1c289e332a2",
        "armv7-unknown-linux-gnueabihf": "f21b927640d196dcbf94c268603d5317f00b2a7659a5dd78b4d01f221759f226",
        "i686-unknown-linux-gnu": "538ea3ecb77916923cca63e87d52597d8c5d4aff4c4b17f7657add1042fdff70",
        "x86_64-unknown-linux-gnu": "3a084749af08a16f317989467701361c8ba2862efa976f3f53e464a242546f4b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
