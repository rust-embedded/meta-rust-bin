
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ef3b5caad66200710dd4c8689f1e8eab",
        "aarch64-unknown-linux-musl": "047e63c51ec16924227504b329b413ef",
        "arm-unknown-linux-gnueabi": "e8c1646642250372e61a7b59c2f04a05",
        "arm-unknown-linux-gnueabihf": "0662d61f9a10bf22de36a3289e891249",
        "armv7-unknown-linux-gnueabihf": "9246f2b0e21c5358c9ada5076eb20277",
        "armv7-unknown-linux-musleabihf": "77ede68360130450d14300872df2a9af",
        "i686-unknown-linux-gnu": "494c085fbd972202dd180ea767f29736",
        "mips-unknown-linux-gnu": "2ba0d63891f6dd2516c0bd642a48a474",
        "mipsel-unknown-linux-gnu": "c8d1fe9feec402c8895058b0bcf33247",
        "powerpc-unknown-linux-gnu": "2f2516ce87a6d220626fa9a0b1344bd9",
        "x86_64-unknown-linux-gnu": "8f31c0b84017cb87aa0363b482636711",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "22bfc32b5003c3d5259babb202f3f66be16fa6f3c75c20f429a16d7ef5eb1928",
        "aarch64-unknown-linux-musl": "42778ab5f87d2dbfc6849fcf0c6e0a3760b18e8c89385130da0a1953d5fed147",
        "arm-unknown-linux-gnueabi": "6322100c43960e598a8b6efceabe3a1851e00fac9fb8268769e351af23762d26",
        "arm-unknown-linux-gnueabihf": "a4253ddee2aa9cbf47ee64aeb87a34f22d8246d4e7985b782472e2aed0390f86",
        "armv7-unknown-linux-gnueabihf": "3519091d0d83a551c77d65b2187c0e0874b4c3aad962f144ad7dd5f7246fba84",
        "armv7-unknown-linux-musleabihf": "f4e09347772aee6ebb869e318d917ba70b308a3034c746264feb27f9b21c8919",
        "i686-unknown-linux-gnu": "c724f141dfb1f99f7b6e189f9dc8fe6c832594e4a3b43e95f433ba140b4c0017",
        "mips-unknown-linux-gnu": "bd7bcef084c8b8d95b8f4dd993dd432206a2fa777f8b3c7dc53f0217fb71550c",
        "mipsel-unknown-linux-gnu": "7bccc224feae403afb7c539c83b8821a627ae35fde706c5681e3403e0b286d9a",
        "powerpc-unknown-linux-gnu": "8232a48fdabe44eacf97553afe173cdb12fe76111c8cea9b6c32d1c187bffc97",
        "x86_64-unknown-linux-gnu": "f92425592c02d4681a5c5ae43ac3ad7ddcc218da50fc651ddc5c2240843a7f31",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6aa9e84dca51ec02636984eaef178380",
        "arm-unknown-linux-gnueabi": "12df2295861eb6e9526f35333c9f1e38",
        "arm-unknown-linux-gnueabihf": "f9a6b27e3685d7004025f80a63f84fde",
        "armv7-unknown-linux-gnueabihf": "85eb1a4a8a629c8f05f5238a6794126a",
        "i686-unknown-linux-gnu": "7bddd2d3feff8e9c6bb77bfc22fa6e2f",
        "x86_64-unknown-linux-gnu": "d54ba3383260cc26234a7190c9ac538c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "62e40e0677032ae0cd91a7f8b4450dbaaf5223050a05b28a9174802d09691da6",
        "arm-unknown-linux-gnueabi": "aa8bc980cc1e662e9c0c5363752e145345e54b0a5f124cb7d6e23bbdb124103e",
        "arm-unknown-linux-gnueabihf": "3ac15057d95cd37d51c6ab65130aebb9264addfcad4244ec7284e28843e985f7",
        "armv7-unknown-linux-gnueabihf": "884b8d99c9058d6c15bf8d7c4d9c56c93179eb4e74e62e349ee108d6a81a02f8",
        "i686-unknown-linux-gnu": "093400c4a54e92f7d2424820128a29ac4ad61c94f2c8df07da0600f9df795027",
        "x86_64-unknown-linux-gnu": "7c149fa1695b41e8e1edcb95dca199522889f119be99f922741084d50470a9e5",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
