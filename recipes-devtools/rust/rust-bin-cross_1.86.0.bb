
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ca4045accf8fcea8ac2c9c2ff3abf381",
        "aarch64-unknown-linux-musl": "461b52d633ac25c86b4d9574f38b56a5",
        "arm-unknown-linux-gnueabi": "65a2fab9d893b77f41f1847769744e00",
        "arm-unknown-linux-gnueabihf": "e8d1eafc848e7c4bcd7b765c154bf3e6",
        "armv5te-unknown-linux-gnueabi": "e72973cc2aa06df169a553a0ef661526",
        "armv5te-unknown-linux-musleabi": "8376dd4d346f190443174fce3bc9ca83",
        "armv7-unknown-linux-gnueabihf": "f80579139e0d36a47834bb01a156e332",
        "armv7-unknown-linux-musleabihf": "1b5a6882ce05689ec2054768db6c33fd",
        "i686-unknown-linux-gnu": "149a500fed8f9a8fa33b0fab364fb124",
        "powerpc-unknown-linux-gnu": "78aebb3d73d33d1a57f5e1b15196a4d2",
        "x86_64-unknown-linux-gnu": "b77fcb8fa51e256ad3d525bc7d1452e1",
        "x86_64-unknown-linux-musl": "f44340332c15e93e7b83736a30f8b358",
        "riscv64gc-unknown-linux-gnu": "359aa00a38ea897e652a8a984f48019e",
        "thumbv7neon-unknown-linux-gnueabihf": "2ec2eaa3c3c57ced4971b7e67ac345c5",
        "wasm32-unknown-unknown": "db65e8f4eef084f9f723e2265b344ba2",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6ac6adf6889cd5a59f22576c55f4bc5bb77fb53de0b3c5e2894c30f2317637ce",
        "aarch64-unknown-linux-musl": "66b5eee481215ba6a86291bc8c537f3d7a9d24e1f82420c27b88011eda20ce32",
        "arm-unknown-linux-gnueabi": "adbc817ec1dace7a314c2dc9838657cfcfcd8d410c0b63f38c5d181938b07a9e",
        "arm-unknown-linux-gnueabihf": "5965145880b7503e795b4718acb68c70dfb74be0aecd61c2a2bee5440b02b3d6",
        "armv5te-unknown-linux-gnueabi": "1dd023371bbea5b6a7156935a4fa840beea6b5d4bbe37fa9da839bda476be33b",
        "armv5te-unknown-linux-musleabi": "089c951f6659f40fe67563dc4a7d485eff9c9456b8a024ec753fb6c0c3e5565f",
        "armv7-unknown-linux-gnueabihf": "4f9a9fdd72324ae383274dfe5e03f7284ef1f4709628f4155c088ec5f0eb29ff",
        "armv7-unknown-linux-musleabihf": "d6d1cf3078502de057ec679968bab50c05677e5f4b90820e011fc1384f2543dd",
        "i686-unknown-linux-gnu": "990833b4455531ab508c8e82c55e91c315f04279c08ad15deba17f5f34fc8c68",
        "powerpc-unknown-linux-gnu": "7f610a19b98e0cc37e2c200970535ae6634df376f1c9ab75b1891e18e08d9106",
        "x86_64-unknown-linux-gnu": "8be751af80851b9f8dd547f46e1b99e4d1bbdb226d46a796a0146cf9d354df4b",
        "x86_64-unknown-linux-musl": "7e9c3c5c843a26259b2b866ae577bdf206304ed6774ee12710ad5c1cad460368",
        "riscv64gc-unknown-linux-gnu": "390db5dda189a129fc2f303aae18ff75ca441500566d4f4b516aadd6ecfc65b0",
        "thumbv7neon-unknown-linux-gnueabihf": "6a8a5ed73adbfd83ebba0d47efdc34c6bfe1344f24c84248e32bed33d89f2f29",
        "wasm32-unknown-unknown": "51ff2cbeba9db7cda419b777e2c6cc4de96aa7ecd6d0d54a27c0f1861891d3ab",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "76f4950884d5c610a9756a3cc7e8ce3e",
        "arm-unknown-linux-gnueabi": "f7548a57356fff54e99abc4e1568d948",
        "arm-unknown-linux-gnueabihf": "1e42df2f356692f4e59005e485362bc4",
        "armv7-unknown-linux-gnueabihf": "ea1361d206ee65439f076657773942f3",
        "i686-unknown-linux-gnu": "7ebe91f2793236af69ddd9d59e992120",
        "x86_64-unknown-linux-gnu": "c294d87c14c555104eaf3e6976210ad1",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "821367644057d7ad504d6fa3a21b7e009969332f55a8b88535904ebefa2cccee",
        "arm-unknown-linux-gnueabi": "fe58de15e31b8439f6b446217b8b4f0c0c6bb91c371f05923cfe8589f5745b1f",
        "arm-unknown-linux-gnueabihf": "a0c355e4272adf7a3fbb083919a1525fc35ee2ff4294bf5f78e823c2a93c9935",
        "armv7-unknown-linux-gnueabihf": "82f696607c485b068cbb6b4369ae6d798f3b5c571d8a3832d44d957ec73ebac0",
        "i686-unknown-linux-gnu": "6051b5e0d4be7cc7fa368b25753ded25c9968373c77dea4b982c9f1c9c187cb7",
        "x86_64-unknown-linux-gnu": "1c14325ccafbf18b008f0fa5205e84d80370096f9ee72be78d2619c083ba40ee",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
