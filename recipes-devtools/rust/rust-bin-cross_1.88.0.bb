
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6150945bbf72ec2013f3593d7a6af050",
        "aarch64-unknown-linux-musl": "725cec15d1ea7f6a59ab1c290d919113",
        "arm-unknown-linux-gnueabi": "76ec039e18ea01d196c80db8fffcae77",
        "arm-unknown-linux-gnueabihf": "586e4d08e5bd3e71df83dc517d80dce9",
        "armv5te-unknown-linux-gnueabi": "6fbddd6cdd0ab936021e213df5334501",
        "armv5te-unknown-linux-musleabi": "485e9a941342b14dcf40ac81b725b47b",
        "armv7-unknown-linux-gnueabihf": "dd21f9d80c3ecee56fc3b8ab1a37f240",
        "armv7-unknown-linux-musleabihf": "db5c3fc2dbecaec90c95c43348612482",
        "i686-unknown-linux-gnu": "074d187c2eaf5b90d1cac9f2928983d9",
        "powerpc-unknown-linux-gnu": "47ca4c4835d5906abb5ececb0a3e9d1c",
        "x86_64-unknown-linux-gnu": "c2b38c2a8024a90f3247c9f2b521e355",
        "x86_64-unknown-linux-musl": "444874ec6e8ad563b6587c796fb06281",
        "riscv64gc-unknown-linux-gnu": "325f48046ae296e9d9674624f78fcf4d",
        "thumbv7neon-unknown-linux-gnueabihf": "73e65401ffcfd7df2d0188060a338827",
        "wasm32-unknown-unknown": "325de870623f0134de225c1daf003137",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "91f61c01a960c37ae1032c4450d329253112ab46f02d61fe0203b366d75527c0",
        "aarch64-unknown-linux-musl": "b49c15ec0e2a4d0315a39ef16be9018adbc2ac0ab246a2a930b0287fa3fe17b7",
        "arm-unknown-linux-gnueabi": "c76f40e18d4fafaede2ad552de853767d63596c43ee0470b6fc15f21fa5da6c2",
        "arm-unknown-linux-gnueabihf": "2e3dd0f691388f0013cb7446c839e2f6bfc3e1abefdde702cdb79b155e959438",
        "armv5te-unknown-linux-gnueabi": "f4aec1f8701ff8092cbb01f88d32dece209efe135d5558f1c6504b013fd14bc2",
        "armv5te-unknown-linux-musleabi": "bca5304e70432f4f30302fa09c3bf6d92a65e3f6fa3ae700c3cef5a088085e70",
        "armv7-unknown-linux-gnueabihf": "577b78afb22f90e14400fddc1b57042c4f8c30d18acd1cd193c44385c4e0f566",
        "armv7-unknown-linux-musleabihf": "fe0b2d4c4abb6ec8fab1205e5700e0c59b64c1687488c984c9a0730370dee9bc",
        "i686-unknown-linux-gnu": "e230cd5718e566cced569c98241c7fc681e58f423edbe6f533ed274ba620903e",
        "powerpc-unknown-linux-gnu": "b666a0a7813e21a737ee249f5c3623647725b6076f7daa73bf6a9dc6903c2b50",
        "x86_64-unknown-linux-gnu": "0d7967f18bbf29777843248091a4f06cdfec2500de33cbfe6b69c6af255f72b7",
        "x86_64-unknown-linux-musl": "6fe8b3106b14ea92eb33b3dc3cbe3cd367489e12b5c015f851d9713733438354",
        "riscv64gc-unknown-linux-gnu": "80e19f15104d13a3d03e6d53797a1317825046cf6de189621d45a5138eba082c",
        "thumbv7neon-unknown-linux-gnueabihf": "b6738024979d0a822237681dd731e73ab03d8642548d87269044e0bc18bca453",
        "wasm32-unknown-unknown": "67d5d0c4dc978fa2fbb7e14c2e9b71ee1a16f5616e05464cda6abad1daa67b57",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e0c9f38944eaa502757b8a84c6eb7d99",
        "arm-unknown-linux-gnueabi": "0c45c79bfe8a64bee70daff00ef37d17",
        "arm-unknown-linux-gnueabihf": "fffcaf3a5a5fc95d7f7d36dd60a12a2a",
        "armv7-unknown-linux-gnueabihf": "7fc307862def4670f5d4def855bbea9c",
        "i686-unknown-linux-gnu": "643145c278c3a564484151bfc3098a7d",
        "x86_64-unknown-linux-gnu": "9b08ae04cad74d75ba7c71972e64ca74",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bb5d597c484a095efc1c3fa52408f2190d5c31148107d39554692a7a6f15540e",
        "arm-unknown-linux-gnueabi": "cf66fbb407722deb5405f40b98ecfb4c7df0d3cba9d7490ceb9395be1832b5ee",
        "arm-unknown-linux-gnueabihf": "5e3cb4a5c5d7c5b23303534125e3fa4326ee562562688c59e69f044fe0e62249",
        "armv7-unknown-linux-gnueabihf": "66b135c66cc5181f1854dc3c95e17412bdc4207a960df5f16719fa6122598e96",
        "i686-unknown-linux-gnu": "5b604fc3b81b5ea72a78d08316c1d0b07a8ca7bb332c16eb779b638b17a8267b",
        "x86_64-unknown-linux-gnu": "270549d2520ce0fee736c07266fe154d47a5660774546bd2c3b1a2ad737a9e6d",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
