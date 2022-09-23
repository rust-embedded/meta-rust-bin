
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eefec18e0345b7b0b030d93701b83b42",
        "aarch64-unknown-linux-musl": "39169f5f3be2252421d983d10855990c",
        "arm-unknown-linux-gnueabi": "70047e18266bdbf70563f54fb9eceed8",
        "arm-unknown-linux-gnueabihf": "0762dd270d66ba1d1790bc800951ebc6",
        "armv5te-unknown-linux-gnueabi": "1e2e23b0eacbfb3c67b0721a43431cce",
        "armv5te-unknown-linux-musleabi": "bc9a7c6cc096c68e4ae18bbc355c6d60",
        "armv7-unknown-linux-gnueabihf": "a6239db0d95c7fc89aa99e6aa00b65ca",
        "armv7-unknown-linux-musleabihf": "54356eaf637527c0d1fcb5580c3a412d",
        "i686-unknown-linux-gnu": "ba473109bde4c7ca5491f8f8db692014",
        "mips-unknown-linux-gnu": "7155648af1938642e3ba87c1bc1125c9",
        "mipsel-unknown-linux-gnu": "81f6e3359d8a481aea14f6f41bfc7014",
        "powerpc-unknown-linux-gnu": "59deca4b85e6a391486de00ed33f9077",
        "x86_64-unknown-linux-gnu": "de4f3c1cb2f1949eefb4cb6d4752875c",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2b425658f84793d5bbf00ce545f410ec6454add202cce27a718d81e0233e7007",
        "aarch64-unknown-linux-musl": "fc74d1ddc8a12d7a58a40534b10297e249c972e39943a7cb514ac72032c5fcd8",
        "arm-unknown-linux-gnueabi": "f7ca0fc92aab9f1a8c44ec180c7e10018138ca7e9b507bec085d03d9fd3a73e9",
        "arm-unknown-linux-gnueabihf": "30ea300372033c2886d61ac59a7532f8d0e4665f548c6e90d8fd25a57f89ee9f",
        "armv5te-unknown-linux-gnueabi": "7bcea2b201ebc61748760e5004d4451944191391129d3cd47cdbc909aeb0c3be",
        "armv5te-unknown-linux-musleabi": "d38f38f2f31fb099c1360e5ef81fd3159b09ddf0bfd8b555cfb07acc08be5547",
        "armv7-unknown-linux-gnueabihf": "9cda1ef1d14372d7c5288cc69c9b5e9f211f5bebf7da22fae6d6ca8fc06ed687",
        "armv7-unknown-linux-musleabihf": "bb233eb7c5dd2f8ae50c4874aea1a8b2e9965f92d184c4e6574f6db45f3c0562",
        "i686-unknown-linux-gnu": "50b32b772e2eb993dea89011fd800c291889c05ce615e45d9a260ee568661069",
        "mips-unknown-linux-gnu": "1649e72798f14336c25019cf0d5e800016f9087e9e703749c456e1293178f01d",
        "mipsel-unknown-linux-gnu": "6f0e5498ab6505e3f4312249fc369eded48b9d4f33f910eee438936ad5d25758",
        "powerpc-unknown-linux-gnu": "61d228cb732ddb85802465781b69ed20719314adde5863805cdcac9c3cc1336f",
        "x86_64-unknown-linux-gnu": "4d4c2715f816bc8ae82c2a5904106fd4dfd668dbd9a98492c8cd388bff9b0b5c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "35a01668f3b317a1229c1cb1c958a62c",
        "arm-unknown-linux-gnueabi": "7aaa721b29d5bdc6e7404f94d20b10e4",
        "arm-unknown-linux-gnueabihf": "440f6809a0403cf4b7c79f82cf5b4682",
        "armv7-unknown-linux-gnueabihf": "4f2feb945fbe34f1dbdc4e51c636f7e0",
        "i686-unknown-linux-gnu": "ccf586f7e04e3a9717c7347b1460106c",
        "x86_64-unknown-linux-gnu": "30f1cf14c14d299a86f1abb7da3b09f0",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2347730846c1608619c100d41b8d292da002c050575eb8ab7885d478531baeaa",
        "arm-unknown-linux-gnueabi": "9674c7794817e764e1bf55cfcfd5991f0c285a609137b960a24b75cce3fd7a9b",
        "arm-unknown-linux-gnueabihf": "c0184fd0c9657b091809fa9de0ce6eaa923891f9cb7f39af7cb3606d0eb1fb90",
        "armv7-unknown-linux-gnueabihf": "81fdf1207dc5abb420d1e6c0f95f68ec717b183ee5c8dc25860f8e4432be7723",
        "i686-unknown-linux-gnu": "bd805a90ec93aa1fd3f7b1d1f9339ac336c1350a31cb39f0506ba4da793bd3ef",
        "x86_64-unknown-linux-gnu": "5923a063408f2db09a0035da4ec699ee1ee35eb62c09c473c882ad77c42da0d0",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
