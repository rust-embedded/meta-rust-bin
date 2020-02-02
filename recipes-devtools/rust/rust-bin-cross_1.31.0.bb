
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ccdde68be2a1c7a58fa5ae8199e51f41",
        "arm-unknown-linux-gnueabi": "f3a8b6d9b8991ad07e65e6052c6cef05",
        "arm-unknown-linux-gnueabihf": "595794e45cf1e06e78457fb33e85ec27",
        "armv7-unknown-linux-gnueabihf": "a4c30bd57ce9dd611a73ad74460ecb61",
        "i686-unknown-linux-gnu": "ce32d33b708d7e32e89ac3255bead39b",
        "mips-unknown-linux-gnu": "e23e73eb325b9e3a20807b0e947493c3",
        "mipsel-unknown-linux-gnu": "9652a85a2d7f391067531d1bb8f5bdd5",
        "powerpc-unknown-linux-gnu": "1c4134521f238f938aa4dc2785465194",
        "x86_64-unknown-linux-gnu": "bb35f7648b97b098eed13eb6b5aaf0d3",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "02e5b48d8fff293a95b591646e707a8c61399ab6c244508ed842f3d736ded641",
        "arm-unknown-linux-gnueabi": "fcffdf979ecbe9cf7352cb0795dfd073292506c7ff24da2bf0913fca29c0109f",
        "arm-unknown-linux-gnueabihf": "28395a84180ec528404c13b9958c6fd65bd02c68d7d10dfd760364104e4252f1",
        "armv7-unknown-linux-gnueabihf": "fea5b5f47b4b0f6464d3297f3d4425389f7aedea5ebbb64b2eb27275c1915126",
        "i686-unknown-linux-gnu": "14de38321f6f2c64496e77bac793ad5511d37696b9c33283bb6f395dc590c4d9",
        "mips-unknown-linux-gnu": "454ffa9bf08bfa4fd1b7f29b894a527a14344c652e721dc7099768bd3eb34b33",
        "mipsel-unknown-linux-gnu": "0fbf8a02c433ef94d081a9afd54e09b35998b0097d7894644c557c672e69352b",
        "powerpc-unknown-linux-gnu": "6e6cde585c80b7291b13c3a800ecce3fcf4436f2c43a60642d56174eb136768e",
        "x86_64-unknown-linux-gnu": "fe67a62c7a63acbf2458a36d7689ef41903187a472f0c28850f1fca7ea478da8",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "382542e8c183d1fc747cf1ef72752c6e",
        "arm-unknown-linux-gnueabi": "5aeddfd92ac657d67b07bba3fcbc3059",
        "arm-unknown-linux-gnueabihf": "73be3386538c617f18cb4084cace6b03",
        "armv7-unknown-linux-gnueabihf": "837784f79ae80bc2ceaab982cecb1ef8",
        "i686-unknown-linux-gnu": "083dce26d0c72618265e8d6141bf6543",
        "x86_64-unknown-linux-gnu": "34641885cbb775122d9d7d2926e3425d",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1e480d8cadceff39ad39d30fe874bfd485386c98842f16423310cb2ada1923c0",
        "arm-unknown-linux-gnueabi": "5019c4192fd79ccefd866a366be2d388d31b5670e0a7392fc209ab59dec01705",
        "arm-unknown-linux-gnueabihf": "0543618595391fe525020e64ed9e68aa7f4786ee7e704207d1c3ca65100128d2",
        "armv7-unknown-linux-gnueabihf": "37bb7b2c4afb79a3f12c2d4a4acf681811de1575b6cd21461ff8fcedf1458bc8",
        "i686-unknown-linux-gnu": "549116e23dce8687f69327f5ea2c717c93175d24d82d456fab37160f800f8ce8",
        "x86_64-unknown-linux-gnu": "5c4581f0fc05f0f5076db6231b0c1a4d27eb61c0b36bfb42d97243ad8f4e43a0",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=66ddc8ecd998476b7cd5732e8c3a6c1d"

require rust-bin-cross.inc
