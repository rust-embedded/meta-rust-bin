
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "aa5ad197dd505fe98f0b1e3e2e8a80c7",
        "aarch64-unknown-linux-musl": "41773b5054c9a2c8ed15f56cd12a2c94",
        "arm-unknown-linux-gnueabi": "52c8b4fb08cc4e09018caaefa414524c",
        "arm-unknown-linux-gnueabihf": "61c7c0396d24333c75680e6a563c03ea",
        "armv5te-unknown-linux-gnueabi": "376fffedb9a6ccfffa9ca1c78582c28c",
        "armv5te-unknown-linux-musleabi": "a1681ada8e688a2e8c2894d21a9269b5",
        "armv7-unknown-linux-gnueabihf": "22f4a98b1233676878a30c29c3228a0f",
        "armv7-unknown-linux-musleabihf": "0a61739ee81f4bf5171ff4fbfee0e421",
        "i686-unknown-linux-gnu": "3f0e4a580ee86118b6004e2ce2b19d93",
        "mips-unknown-linux-gnu": "1fe2c11cddfd244697e95e43477fb083",
        "mipsel-unknown-linux-gnu": "41d55c2ce1df4d68c1a63f694549a47d",
        "powerpc-unknown-linux-gnu": "09cba093b9e6ab726b4e80a4e70e740a",
        "x86_64-unknown-linux-gnu": "e69b1191bc7dcb89390f78f5135a92e4",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c58bd4f0738ff662f70e35c19bfa6b8eb12ad54b0fbdce32ee3e50186c04a969",
        "aarch64-unknown-linux-musl": "bc5501347598f48f55ba23011602a8fc1fe156c23c1c7b4d449c84eddd64d4ba",
        "arm-unknown-linux-gnueabi": "a199df5c842e2fcb140836a0e3457fd8a1fe4c9a6d0f61bfab3e185fba7f0374",
        "arm-unknown-linux-gnueabihf": "6d3449a346fa4c995bdd7281906fc754d01bd2937d4df0428127c74c75137c03",
        "armv5te-unknown-linux-gnueabi": "e3e26fbe9a059af61549c937cfbd2e0f856434e966d7388a7149926f4fa59f22",
        "armv5te-unknown-linux-musleabi": "5362a9def63b34f502ced91f776d3a353dd222cbc901c26c50994d3206487ad9",
        "armv7-unknown-linux-gnueabihf": "1e13e84e3d0f8dfea6189f912233a2bd8cf9b07fd58ab25780f5c4f9cb4a0341",
        "armv7-unknown-linux-musleabihf": "8a9ef1f5e7be994169df064d92384306794e2a0acbe8d22dd7a3dd3b476b398d",
        "i686-unknown-linux-gnu": "86676315c04751e5b8e2f3a92150fca56b32228b545a1a7977731b4b2c1424b7",
        "mips-unknown-linux-gnu": "334c00747588f509d53248f25f374d68bc722cbe4717245d884c7ee42dc1e32d",
        "mipsel-unknown-linux-gnu": "038bda5ad5847dc50ea02c095dacdb0df777063b7109c371725d0676f7c6bff2",
        "powerpc-unknown-linux-gnu": "352c7970e30acfdead43aee1659cb4e854adf7e2c9df11c4781cdd9edf1b8e79",
        "x86_64-unknown-linux-gnu": "f0d2c2d509c29ea9f7c24bb5a885321030281631e0bde0714e5cf881184d57e2",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "72f315016cae0919fb0cc6b60b7c621f",
        "arm-unknown-linux-gnueabi": "3297306a634d44affe79ae91373fa992",
        "arm-unknown-linux-gnueabihf": "47aa1e8dcf86dbcad05bbae9a8f0185d",
        "armv7-unknown-linux-gnueabihf": "f6c06bb84233524a8c00f059a5ace103",
        "i686-unknown-linux-gnu": "1c5dc457c6a1f79b6220ab49252e56a1",
        "x86_64-unknown-linux-gnu": "9e3e0fd2621bd6914eb885a7e8e94938",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b72699cdf74c03ccc0aabab937a69807f2ceb5861f3508593e1c222190c4efc7",
        "arm-unknown-linux-gnueabi": "d8d66a2fce6c326a002f1f27a8530e40904b5466ccceea3846518df3483b5fa6",
        "arm-unknown-linux-gnueabihf": "1513631089cef540bd11df0d6cea914748d6f9f6da3f2c090ea51f951ce0608a",
        "armv7-unknown-linux-gnueabihf": "7a8d0bb46599a254ddc1fcb05b56f63bf70f2a0687c5f770cd38a760fb091bd4",
        "i686-unknown-linux-gnu": "3730540a123d22c4b7c26b4247b5c4b1ff4258ec9dea7804a536ad0e6bf00cb7",
        "x86_64-unknown-linux-gnu": "42300556b987934e5e4677972c1dfc57eb07731dc62fa9f4f561935a1c84ed0e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
