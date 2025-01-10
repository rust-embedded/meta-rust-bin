
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "278beceda7a1b33585ed8177376d6bef",
        "aarch64-unknown-linux-musl": "fda1570756235665a61d1b6c29f6766e",
        "arm-unknown-linux-gnueabi": "c7dac1509dfbce8a7377827b40657136",
        "arm-unknown-linux-gnueabihf": "b218127dfaed611234703bc9ed8378f5",
        "armv5te-unknown-linux-gnueabi": "9e1e5102b721c37fe9b54055478b544d",
        "armv5te-unknown-linux-musleabi": "e79eb6f56e7382f39001313f80a7fb2f",
        "armv7-unknown-linux-gnueabihf": "1a806ec56df9e790322efdc94261763f",
        "armv7-unknown-linux-musleabihf": "7e482c3548959b6b50cd7230de98a282",
        "i686-unknown-linux-gnu": "f52f05f671491a49a3a723bfd4fdcc55",
        "powerpc-unknown-linux-gnu": "b43e257e7b20e21419bbaa1634775f3a",
        "x86_64-unknown-linux-gnu": "fe23387f3c8b8b727b7102c527d17e38",
        "riscv64gc-unknown-linux-gnu": "336f16847cb94a30a90acd953d92526d",
        "thumbv7neon-unknown-linux-gnueabihf": "eb43476d9f3bdfb4c195e6fdb2584880",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "11a698df87efacfb472b32e91fc39df0261b9b7acda48ea01a7f296424cf5f5d",
        "aarch64-unknown-linux-musl": "31bbac8bbe4d733f72f96290630676cb3297035b11bd618616dfd64a93a13f2d",
        "arm-unknown-linux-gnueabi": "7cd501d1ee2f10fa048e0aa0825085251009eb0e546b19499987d5b17b6aea86",
        "arm-unknown-linux-gnueabihf": "02e88bfe926d25bfbba357fc017b2e6e03587d2863e5c1639b48c125f2903157",
        "armv5te-unknown-linux-gnueabi": "e2919a98419d7ea7763b198501378c1e4bcaeb7b8a7a41d5d46117f3adbc71b5",
        "armv5te-unknown-linux-musleabi": "54c588181d8a38f1ced59eaea076aaae8cb76a672c2538c186b879f26283da56",
        "armv7-unknown-linux-gnueabihf": "44a93e9c8ce63dc9cfe4417ae015b9de3aa6538689e37ef1b4a513957b09d536",
        "armv7-unknown-linux-musleabihf": "db1eb3bbb54438acc263faf40ac21ccdfef124683132c1842ab9f027a4677fad",
        "i686-unknown-linux-gnu": "81fb46f365f0dca15ef3ac7f8d18ed78a292e5e51c19de21a19294daf1c4f32b",
        "powerpc-unknown-linux-gnu": "3f91b82e8e78dbbbb3b61e39428c151afd887bdabc595344475563f43b1bf04e",
        "x86_64-unknown-linux-gnu": "b3050a3b63da621f27517bd1252e976fd69ca45adf24e307627d4ca8b3efd7d7",
        "riscv64gc-unknown-linux-gnu": "8bffde598c149881bb03883469a442f95ecc58e3a05e4b6dd2cdf973fb0a5f9e",
        "thumbv7neon-unknown-linux-gnueabihf": "b66f640db796302c28732d56a505dd6ae6effa27fb0d125ef28d254f189a3e5f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7bfbee4454f1ae4a183859afbc20bcb4",
        "arm-unknown-linux-gnueabi": "f5dcd688f95c13b0d6590ad0b38fe60e",
        "arm-unknown-linux-gnueabihf": "45e5faa957e97bc8abcaca69d07289a3",
        "armv7-unknown-linux-gnueabihf": "26ad99e5ebe73eafd641a544302c634b",
        "i686-unknown-linux-gnu": "f9fdbbb5d965a8c0472f3b2dd55fbbae",
        "x86_64-unknown-linux-gnu": "44205c24f47d95688e06e42fcd3446a8",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bef86eeb44effaf1a7b149a7df1c7a0c89b118c10948c74aa87e16ccbeba9b6c",
        "arm-unknown-linux-gnueabi": "23d5bc4ec00f3edc480d87f65eaba0938cd24cbeb0a783f1a4ef50ecdac9910b",
        "arm-unknown-linux-gnueabihf": "09c9b25221838cfad6ce9d18435267a9faa7ff4bea76eea8bb01d8c7775c02ea",
        "armv7-unknown-linux-gnueabihf": "05b24531b0c523c52223ce8d146d1f31ebd9501660c2d426ec25f2225d64d840",
        "i686-unknown-linux-gnu": "049590d403153414d032e479839faaf7bf8d9dad05b8e63a684f9965e4b464a8",
        "x86_64-unknown-linux-gnu": "e8349a7da9d63500431196fb3abdf79b0c8c76e0bfada815fb3f6669ecb5de3e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
