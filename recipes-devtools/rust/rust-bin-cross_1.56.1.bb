
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d118e31be55f3643c1ca5a55f379fdfb",
        "aarch64-unknown-linux-musl": "b84c967fd9289b87f763eab4d53a4124",
        "arm-unknown-linux-gnueabi": "167257c19d83a96a3b06d6715ba08e44",
        "arm-unknown-linux-gnueabihf": "14f9e85b44c9a2eea056e925b98d8c0c",
        "armv5te-unknown-linux-gnueabi": "fc4c8f813f1e202301a313ff89d7739a",
        "armv5te-unknown-linux-musleabi": "030d70a3f33df25b7d1beea0d7846838",
        "armv7-unknown-linux-gnueabihf": "a39faf96e8878b1660a7849180509ff2",
        "armv7-unknown-linux-musleabihf": "72880d61410b57bee996622e20347c6b",
        "i686-unknown-linux-gnu": "92b063eb1ad20ac1dfec6af0428f115a",
        "mips-unknown-linux-gnu": "54db0908fdf4cae71503a3eb7c1804f3",
        "mipsel-unknown-linux-gnu": "30b89761bf6f6d66892d8298072c747c",
        "powerpc-unknown-linux-gnu": "40027de4ef2f1bc4474cd5cc0a42c9d1",
        "x86_64-unknown-linux-gnu": "b3ddb47e6394eac6e3dc4f6593617d60",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d577c25879cf160ec1a04d5101971dd684f9b4f87b3cb463a7521b676dc3df89",
        "aarch64-unknown-linux-musl": "444d5cb43bb82322562afe54c249c3d85b5b1cf215fcd0cfdabd2e657fcda687",
        "arm-unknown-linux-gnueabi": "13a618ef5ee18e00b76d5891fcd1886f1fdb042ca81962dae30df6c535d42bef",
        "arm-unknown-linux-gnueabihf": "01963e591bfbe7e33e2b264984005320e0ac0c5849a23bb897613de38bef9abd",
        "armv5te-unknown-linux-gnueabi": "ce240263fee9de563727e4feb5c6ee038c837189b3fa93d2d2f5b4ec7077f42e",
        "armv5te-unknown-linux-musleabi": "e3aa96cd1ec07512575b6daf74677fefee766a18de678a0a77f44614f606c1a7",
        "armv7-unknown-linux-gnueabihf": "cedd08ec5f94e7b6348befde00e42a8e1e5981586762be8d264b34e1f7de9818",
        "armv7-unknown-linux-musleabihf": "21a6f072752c57c5692d36fce19e45cfd3704a22e263c4c31963587d085c7530",
        "i686-unknown-linux-gnu": "daff2db4e3d42916094a59b7c4eef169030b1fe0050c3cf882e7e293279298bd",
        "mips-unknown-linux-gnu": "3ed4c2c3975ac4296b016910df2bf129dfafca30d6a9fda68f6fa1a3f22a0a23",
        "mipsel-unknown-linux-gnu": "739bf07f42374a1e272cdd0639311c65897e230bed3336b217f616b7479ae905",
        "powerpc-unknown-linux-gnu": "11d753855c461d220222824a5d4bdb31424251ff447e38657a7ad348d95908f5",
        "x86_64-unknown-linux-gnu": "afd959b295e17640d1e94648278a944dc5f349ebdd9e59e2404729db0810c531",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1ebb38fe856e2de58da202d836283ee0",
        "arm-unknown-linux-gnueabi": "92f9a6da994a6f64b68daa4f65c79b0d",
        "arm-unknown-linux-gnueabihf": "d160c8d211611ef4f603e577fbfc9ac7",
        "armv7-unknown-linux-gnueabihf": "4212021274b0408031693f4339c531e2",
        "i686-unknown-linux-gnu": "0bfd867fcfd02b426338c0465db7aca0",
        "x86_64-unknown-linux-gnu": "798ba7d0dac9f2d37c657b32d9fa4b52",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9e7461908d0b3e6f4bbb158b71d85e536c186fe571c9960f8ef4300328b25a11",
        "arm-unknown-linux-gnueabi": "509796815de3cde667a1c253d9255e4fd9af13c835ffefaf11c853edc75b0c77",
        "arm-unknown-linux-gnueabihf": "3d542c8c14c5f103ba8a8a685a22a7658efdff1ca06adc99a6639b20fbda0abd",
        "armv7-unknown-linux-gnueabihf": "bbbe46c312c9355c1689d4dbce1c8291d9827a91ae69eea7754f789dcdccc37c",
        "i686-unknown-linux-gnu": "a6ce2439963fd848199347fb75b323f9d1b7e1a6fa5b1d02cd741322a582ad65",
        "x86_64-unknown-linux-gnu": "d09557a497a4f3b0726cae4c8e193843e403c80615f25f6ef740c79d7e4c122b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
