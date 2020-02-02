
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eaba79af7a595baa57a417c1f216f74f",
        "aarch64-unknown-linux-musl": "7feca93fee9004d64a93ada5eb9650d7",
        "arm-unknown-linux-gnueabi": "a5a6a98734b48223918b5a74e5a4912f",
        "arm-unknown-linux-gnueabihf": "fcf772289f097185ed661ba45c2795a2",
        "armv7-unknown-linux-gnueabihf": "0502601842e318bc1df7394a4eb00c46",
        "i686-unknown-linux-gnu": "d27b16ec092b9254c1a0f8e1d09eb69c",
        "mips-unknown-linux-gnu": "5c289e71722e43992d4a1a0a782cdf48",
        "mipsel-unknown-linux-gnu": "f1492e62dc20968f4276dd280af55f94",
        "powerpc-unknown-linux-gnu": "451aa8b90fd87e853756bcafefc4930a",
        "x86_64-unknown-linux-gnu": "6e9ec545527c15377134d2c68fc5876a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d175e91206aba9e2056a9c5af50f700502e70b2f8eb609854d660ac2f3bf1fff",
        "aarch64-unknown-linux-musl": "2b08cf5b0fdd2cd71e7aece36587fb4869e53faace966eaddb2e2c5fb908eb74",
        "arm-unknown-linux-gnueabi": "d04b676975be4798aaac8b36bde4f9fad62653504db23022995c796a29cafa4d",
        "arm-unknown-linux-gnueabihf": "b5ac48988463123a8b10520ce48ed6c4c359d21ee006812c091c656f10e9f49b",
        "armv7-unknown-linux-gnueabihf": "c74d6f1d93509ade62ffb4a1111e90c87fa16db5cd2a6b0792d523561386f6d1",
        "i686-unknown-linux-gnu": "41f88b8a4c12e2dac4f6ab83bd0247518470896dd4680d372b44952dc25323eb",
        "mips-unknown-linux-gnu": "cc9157e2ec91174b45622813622995333788fcb3a44b59847e5c9cce271fa16d",
        "mipsel-unknown-linux-gnu": "48e7ea0414c13fe86caa4a35bedd99ee11a04cdd97426ea71c3d7851fb6a3dab",
        "powerpc-unknown-linux-gnu": "caf89ee6658ef01d9157dce5b682ebc0c1ea84fb131e2f7543a4cbe341ec52b5",
        "x86_64-unknown-linux-gnu": "6565dbe18ee9fa972058b17744ec1129c4fcbf797443f2e16b999df3870d6281",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fe3ff265cda10dd910ed050172c1ec70",
        "arm-unknown-linux-gnueabi": "caaa34560395f445fb56a494fd877e35",
        "arm-unknown-linux-gnueabihf": "065d3d30feee685d633d23a5cee929f8",
        "armv7-unknown-linux-gnueabihf": "b9c12137a186cfbd5e5ca48f26b9835a",
        "i686-unknown-linux-gnu": "4d1b75d61be5ed17704ae4d1e919c510",
        "x86_64-unknown-linux-gnu": "cbacae0428743e01a60183f2b017e801",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "364328a40c7aa5749be80b13a14466149a559205e34aef3d8823dc2580f55921",
        "arm-unknown-linux-gnueabi": "42d36ff08e6f24040a28d557fefc6687db8741dadbed95e14f7e577deaca65d4",
        "arm-unknown-linux-gnueabihf": "26e3175e2ab9e359b3ae9afc7464f9a411a953c256876a4031c796a5977eb147",
        "armv7-unknown-linux-gnueabihf": "76893dc9a3ccf4498262b2a22fc1d8663ee16d812a49d0daa17340444dec284e",
        "i686-unknown-linux-gnu": "53c557187dbd7b3a0ee3aae3545952727ff9b1a085c03c7f9606e153cc83bbe6",
        "x86_64-unknown-linux-gnu": "5852e84dd30e4a552a7cd4d7c0172648d7ffb4d9ac7078871adbb902c183ffc2",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
