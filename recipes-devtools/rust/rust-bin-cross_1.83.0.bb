
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f07e039071ed99e05a67625e573dedd0",
        "aarch64-unknown-linux-musl": "d11dec3a9ec61bbfba8ed30336849f98",
        "arm-unknown-linux-gnueabi": "ab3bf78fd8bf53e34e9975007aae3c4a",
        "arm-unknown-linux-gnueabihf": "9e13226d6e9503a2c2debac66a0ee810",
        "armv5te-unknown-linux-gnueabi": "4a82d75c4ab1392ef7f8b4200a86f7b9",
        "armv5te-unknown-linux-musleabi": "65b8b3df7b78dc74a057ec5fe80e3a84",
        "armv7-unknown-linux-gnueabihf": "c6ecb0edba417183f641857aa487591f",
        "armv7-unknown-linux-musleabihf": "b799017a927443b3f9c98d66b5be9b23",
        "i686-unknown-linux-gnu": "9652ab6d71b75a9305352ac24281e0dc",
        "powerpc-unknown-linux-gnu": "e030015ba71e05ccd38d23882a347e25",
        "x86_64-unknown-linux-gnu": "9077cbeb36789a6673d500e06b9ab225",
        "riscv64gc-unknown-linux-gnu": "411b42f5750d920408afd93f2eec895c",
        "thumbv7neon-unknown-linux-gnueabihf": "5fdca995b661c440c33d2b7b8ebd0639",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "27dac4df613a12743b26c73d04fcc70f70a05134886f7755423457a1fe7fae7c",
        "aarch64-unknown-linux-musl": "bb10f2db36538990ec43170c40b33995aed4f2fcfd9e1ff8014336644c3cb339",
        "arm-unknown-linux-gnueabi": "28e041f11d529baeebe3c34651ae28ffdac3448efd290dcf73a82d2f28737a36",
        "arm-unknown-linux-gnueabihf": "f980e52abb182884335fd1b2171fb96bc39924575f47ec178b6d906be764243c",
        "armv5te-unknown-linux-gnueabi": "733e1c559e119b97af03d1fb5a605bd023d5af26593653dc198cd7aedce94361",
        "armv5te-unknown-linux-musleabi": "adca6e5c2f42a04228db2683afdb444dd380564928c09bac329e88489423e472",
        "armv7-unknown-linux-gnueabihf": "06188f9eba03989f1c908a00920903fead49a361436c408119212f8fde6d8686",
        "armv7-unknown-linux-musleabihf": "5293c360e0c621a44a94885e69f4d28f0276f2acad17911d445bb5552f69a685",
        "i686-unknown-linux-gnu": "9d105ba70e63ef813cc15558b11e8f25168ed9d8be195eac3773bf58556c3ab9",
        "powerpc-unknown-linux-gnu": "544ea3cbd984158c1d1d7b65a9780d07817ad29cb68534f50ea139e239e262a1",
        "x86_64-unknown-linux-gnu": "5cca3330f713fa7279db5384890c266535d079a85cdfd1a52e69c55f291db9c4",
        "riscv64gc-unknown-linux-gnu": "40f87b810dfacb9d4661eab3380163e1f09cad33a3e466268ac1801d330eb2be",
        "thumbv7neon-unknown-linux-gnueabihf": "472ad2c9d3a1b20d7f4e9ec319324d473793908c71dd2dca9fe32bdb35d2c8d8",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d55d0e42c74363fbef91c3928e11ce15",
        "arm-unknown-linux-gnueabi": "073b9d87d2f1955486e00a844c268743",
        "arm-unknown-linux-gnueabihf": "6317d2fc3c6825ac97d4e86273832d78",
        "armv7-unknown-linux-gnueabihf": "ddf0f637d8eb2b8263dfdda452b9dda1",
        "i686-unknown-linux-gnu": "29dd7459917ac875cf365263ee26875c",
        "x86_64-unknown-linux-gnu": "0002651dd842a7d813a575a9b3c9a012",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3c92efadb04a955c4fc8f184b3ff9d0cc384cc088b41b9681562a021c0ab7f1d",
        "arm-unknown-linux-gnueabi": "840388c235c145c3fdec4e98121d84e08b9b2b190176e00249dc914ca4edc26e",
        "arm-unknown-linux-gnueabihf": "bcb9cfff13f7b37b648e9fa568741738713bf41f50bb54c6058a1fbd3666e131",
        "armv7-unknown-linux-gnueabihf": "2498191c609c892bd4a03df367157cc8e012d8a9d406f6e6a2a177074670eb1a",
        "i686-unknown-linux-gnu": "1f2a6fb3ce345e547a94f982e71506ba72b202e10022b8191a7f244812e036f7",
        "x86_64-unknown-linux-gnu": "574eb335677bffa88e5b235139c7784cf1234648bbcf8b0f93c7124013868911",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
