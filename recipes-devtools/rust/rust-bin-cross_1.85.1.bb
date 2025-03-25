
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4549ed30212536ba9bb8c821d2e17476",
        "aarch64-unknown-linux-musl": "b3e5b1002947647a78d9fbfdbc2dc503",
        "arm-unknown-linux-gnueabi": "222e164d7ecf5d74dbb09fa63bf2a7c6",
        "arm-unknown-linux-gnueabihf": "210ea20ebfd99fb7a42dc377be64c29e",
        "armv5te-unknown-linux-gnueabi": "75278a83e148b87898df1f1eeb835d76",
        "armv5te-unknown-linux-musleabi": "ae31eb6f8c425402fbeb70fb67a04d6e",
        "armv7-unknown-linux-gnueabihf": "28bb6fe16355e781cca6cba58c77ca77",
        "armv7-unknown-linux-musleabihf": "8114f43d6e8e46da15394f2861c7016c",
        "i686-unknown-linux-gnu": "57a800c5cafd3862ed65c6144ddb00e6",
        "powerpc-unknown-linux-gnu": "fa5e5c5fe02d57a307c804ef9d9f5f8e",
        "x86_64-unknown-linux-gnu": "f92f11bb7106632dd7c61a25b768341c",
        "riscv64gc-unknown-linux-gnu": "6a3b2d3e29355158ead7166301fe6281",
        "thumbv7neon-unknown-linux-gnueabihf": "d0aaf616cb7977cb865d0a6327b32ea2",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "babd5809a0c108ad003b69f9e8e7e14c2806d9ddf8f14e93f5713a5340cf7006",
        "aarch64-unknown-linux-musl": "991cc2f78d3db8fa1131ee2bb5807497e93e1efb9f447e2a7def0c4032ba4c54",
        "arm-unknown-linux-gnueabi": "6883978a53e4c18612fd1ad119eefa47ec6cfbbbf1c64822857ecb6786bbb3af",
        "arm-unknown-linux-gnueabihf": "218cbf39ad41c1900632a7b7461c3c7497fae50f0902e2c76f20b094cdf36f86",
        "armv5te-unknown-linux-gnueabi": "000ee87d67ac2f837604b9a6fa59c16bd92904dbb4d3186fa4d60943301f2ab9",
        "armv5te-unknown-linux-musleabi": "4ed89485afe039319a6efa7ed85ce64f0bc912f5ec75016b4a8acf021dbc231d",
        "armv7-unknown-linux-gnueabihf": "877d8e8d3efd9a31112ef898918e8eb54a976855fce97b9ae9c6399a94e88b61",
        "armv7-unknown-linux-musleabihf": "fbdb48968dd7af3a862c29e4e3ff85bcf333d97d21d262f347106542cc08b96d",
        "i686-unknown-linux-gnu": "9d5bcda5fc08819735e47e77d636cb5c3c2f4f3f2f543519d75a9ca8e00db2ff",
        "powerpc-unknown-linux-gnu": "e690d68d212688218fc327834438815deef7a757d174d3537af38979d30118e6",
        "x86_64-unknown-linux-gnu": "3e14ec3f9f622f2b577817f71413259a401c0b233a527ef561342f3c10a777a6",
        "riscv64gc-unknown-linux-gnu": "1a24ec34fecc1330eb0dedf249ce54b06b52569c3b5e99737c509d16143dafe7",
        "thumbv7neon-unknown-linux-gnueabihf": "ac25297b3325e475fadc1d6478e78acd4d9e59f36a92c35d2bd56322a6a0b7ae",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "511ce6aef3544e0d82ad355538546c32",
        "arm-unknown-linux-gnueabi": "abc9b88b8c077fae8114f26ad893b2bc",
        "arm-unknown-linux-gnueabihf": "efcc55954b2d6320c1cd91da442a2211",
        "armv7-unknown-linux-gnueabihf": "3d52ec7d35db87ab65f4b4911ef455b4",
        "i686-unknown-linux-gnu": "156d6ae196fc0cab3396923ca3d05e03",
        "x86_64-unknown-linux-gnu": "92804a47672db508ed682aaa5ff70e19",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7287741332d481db0a653df014497bc645befa435b16f38fdc0bedd4efcd6b42",
        "arm-unknown-linux-gnueabi": "e841fb9f626b95a6dc4aa5afca5361b58cce0fe6ebb93758b5b379ec30ec9c17",
        "arm-unknown-linux-gnueabihf": "2e72868019d2ebc626bc924b320d6a2d1818cf84c159899193801ae6104a73a2",
        "armv7-unknown-linux-gnueabihf": "0fcad4afb4642c4c8cda2ec3e0a1c54cc19f2d018b30722876544ed298ab77b6",
        "i686-unknown-linux-gnu": "f921b944b1aaa112813a5652ab15bafa3b3a853d5f13a1101c1c07fdf5421e1b",
        "x86_64-unknown-linux-gnu": "2c7c89df662fc62bde0b75e60602ca2c64906edbecd79fd95745dfc635b05479",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=9c0fae516fe8aaea2fb601db4800daf7"

require rust-bin-cross.inc
