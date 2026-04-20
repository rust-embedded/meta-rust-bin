
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6873fcfcd21f5ba07d6aeba8922f2448",
        "aarch64-unknown-linux-musl": "261f1a8d815adfcab18bf9016d826997",
        "arm-unknown-linux-gnueabi": "085f110e07deec78250987c3f04014bd",
        "arm-unknown-linux-gnueabihf": "5d9913f5c32e127f81c957cda38bfcdc",
        "armv5te-unknown-linux-gnueabi": "936fba04b7468182bed453de726397b3",
        "armv5te-unknown-linux-musleabi": "324c6198320020e72cfd21893683b309",
        "armv7-unknown-linux-gnueabihf": "501d56db71a29290a0c31c26ed72cb27",
        "armv7-unknown-linux-musleabihf": "d09eed37a8137eb0122979de4c79e041",
        "i686-unknown-linux-gnu": "afd2b5202e887fa28e4ade2684526b56",
        "powerpc-unknown-linux-gnu": "a1299b530bfd3c0473d7206c951a30a2",
        "x86_64-unknown-linux-gnu": "0daacc6f2d5362ab8ead7ef352e7dc3d",
        "x86_64-unknown-linux-musl": "d62f0f0c0e89460b7aec1ea8cf24fd12",
        "riscv64gc-unknown-linux-gnu": "2e6a29cb27029d4c1de70e40f6813fa1",
        "thumbv7neon-unknown-linux-gnueabihf": "8f546c5e857ff408fc725fc3b5df8888",
        "wasm32-unknown-unknown": "c4a565435406998ed510ba7e3257d3cd",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6b41aecf38b49064b6a94d3230c516245e0f6f4976cf917c5a262d72ff743453",
        "aarch64-unknown-linux-musl": "9a3590b25cd888950c253b28abe20ea1afc9328b7136d3f40a67e296df2ccc6f",
        "arm-unknown-linux-gnueabi": "45f0265d370545df525165865ba9190ed35eb55f2b4ffac4595b08fb6bd04a25",
        "arm-unknown-linux-gnueabihf": "86ea79e128de469d3b2aafdba44963ed8361a51e284b4de3fa6939d1720f83f1",
        "armv5te-unknown-linux-gnueabi": "a46573769386a8e7a69a69b3e0bc88ed107a02fd10b8d2379db8aa5401b56a68",
        "armv5te-unknown-linux-musleabi": "9278afd66652bc8f1881e7bb586c127ffda06e03794071fc8c54809c0ca91e3f",
        "armv7-unknown-linux-gnueabihf": "6af093d0293e175cbe53978f7a995f68ff0539b73c88e6f06058bc69c04fb160",
        "armv7-unknown-linux-musleabihf": "e525fab9be4d524b3fd986da4f2c7c2c82d5dd1d936a9bcd19f1afa2d0f92851",
        "i686-unknown-linux-gnu": "b233ca999ebce7839a3c88e56693d82b522ef0d41e3f3d48bba8838bf3aa797c",
        "powerpc-unknown-linux-gnu": "8eccc2bf8dd958053465d3734a3bb9f7ad1e6f7721f51c6bc383625908c5e4e5",
        "x86_64-unknown-linux-gnu": "cdbe3b40cb0ef30e6768c3c8accad9c022e9b94ed75d2fb5caa8f4c7b4115d48",
        "x86_64-unknown-linux-musl": "0538810db44b742124418b657ac2671cc7e4b2363d511e40d9236788c223126e",
        "riscv64gc-unknown-linux-gnu": "d8fa0e2cd0663e158625b73b2a9a5f2271c5ccdfb18b9cae99766220a2bef5d9",
        "thumbv7neon-unknown-linux-gnueabihf": "1e29e4c201cee019f39d126df10bbd5a455d5b7a346174a07c149cac1611e5ad",
        "wasm32-unknown-unknown": "517e5a9955fcd932dd66a3f6669895d7fd3aa63b1e660bd7bfe996c9c55941b5",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eaef0105c30a12afdb7b6b59c72e49d3",
        "arm-unknown-linux-gnueabi": "757573c0a27fc66d63bdfb86d641a046",
        "arm-unknown-linux-gnueabihf": "b979ba43f36dd99959e8bd8310bf2021",
        "armv7-unknown-linux-gnueabihf": "ec5acd8292c6031fc3653b03d8a9bcd1",
        "i686-unknown-linux-gnu": "84ad7140f041688f0521a695b7f78de4",
        "x86_64-unknown-linux-gnu": "7fd626802a3fd0c1fceb87bbf3b691af",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c0a5f68ae0283c314798911c8a494a2029a5db29f7b80cd959fed0092ea7de99",
        "arm-unknown-linux-gnueabi": "470f79432c2a8f89c6bebdaeb5c00a0e623db4865851ec6aa78b438447fe25c5",
        "arm-unknown-linux-gnueabihf": "04274a3d537eaaa174c78f74c8044d1f425a0036c8070fcf023553f0f470ad7f",
        "armv7-unknown-linux-gnueabihf": "be85097345dd41c5fbff6abebcf162ca3b9904a71b0f9709b568eb8327e019c0",
        "i686-unknown-linux-gnu": "db0bbd55a12ac88d742c05b8bf944f0516c1e3b2ef3683a3d69c81e686d93567",
        "x86_64-unknown-linux-gnu": "a49b39e3fe8cc7bcb38feee3d56e0636820ecf658bde42ec70e3e0a2117c46bb",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
