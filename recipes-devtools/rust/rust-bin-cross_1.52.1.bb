
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a3c184ab0c26ebfa405f06f0381cc981",
        "aarch64-unknown-linux-musl": "832eb81e5a82d8f4e97cc86d87dd5eab",
        "arm-unknown-linux-gnueabi": "0f8359d4b0d7bb14540a8d254e480e58",
        "arm-unknown-linux-gnueabihf": "9ca131d402f44a7923617ec030fc32ca",
        "armv5te-unknown-linux-gnueabi": "5d5cf122ed868473fa0735174e84ffb9",
        "armv5te-unknown-linux-musleabi": "768aadc7481610cff7e250411dc54c07",
        "armv7-unknown-linux-gnueabihf": "061c32ff98389f470f9a8642f35b60c6",
        "armv7-unknown-linux-musleabihf": "dff7565b005da5cb3288751bea4c6daf",
        "i686-unknown-linux-gnu": "712ac595bcd14c105c831513b578099d",
        "mips-unknown-linux-gnu": "5064b4d4e3bc77224ae660e63d4a410f",
        "mipsel-unknown-linux-gnu": "a53fb64b3c17eea84342089690fa5437",
        "powerpc-unknown-linux-gnu": "3f6cf1f5cb8296ad4e3eecce5577ebbe",
        "x86_64-unknown-linux-gnu": "a07b544de5d0db22704a4c693c4dfc05",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b87ef86a241626cc86bf98fa0e70483f96d1bb9bbb4da7d9c589ac2094393a8d",
        "aarch64-unknown-linux-musl": "fe8091e71cde5e3a344d204a6627765ab79ccf19321348dbfa27768ac5f2abf9",
        "arm-unknown-linux-gnueabi": "a378354933af13674686fce2a860eccf4e3be6e29faf5948126973ccbc91c1e7",
        "arm-unknown-linux-gnueabihf": "005fbb42e55d608ad19ca45f7e5dad4d1d13363a14af771b7009edaf9312d46b",
        "armv5te-unknown-linux-gnueabi": "86ca3fdcaeb25258822c1cbee84a66fc878b6377b05a30beda704dcac6e0d6ea",
        "armv5te-unknown-linux-musleabi": "1744866b5abccd9f5298def039dd9b066d5ba374b0e50389248e5d50b8cee0d2",
        "armv7-unknown-linux-gnueabihf": "944765e1015b42398abe270ec70889a36d099ab8604fc964b509587161fd4365",
        "armv7-unknown-linux-musleabihf": "d1801dc54029e75ef5fa338359b6012e60610502f74dc01c32a1304d88d92dae",
        "i686-unknown-linux-gnu": "55110f21ce82642b7f6c7a879762b553b9769e697f7d50c64983e49e7c7a0e3a",
        "mips-unknown-linux-gnu": "46f5e30987c0d2330b5f75c5a545975f042815095bbb2b611f0c14b895d2c877",
        "mipsel-unknown-linux-gnu": "868f2bdebec6da7d4759cc7ad06f92347a08f61d0bf3891ad5c797820296c564",
        "powerpc-unknown-linux-gnu": "9aaa0b665f40af55a147c71fd9c40a5969acd45c6471e665925194c2dfb90b19",
        "x86_64-unknown-linux-gnu": "ba9cf6570d509b3e4c4d821db4caf304f2ffacf5377b7ca55dc1ef9788ae5b58",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7f2a2ab8a5033509a3e5e4130c2753f8",
        "arm-unknown-linux-gnueabi": "ce4b7f43b2f15a4d1aa2361f7bcf0158",
        "arm-unknown-linux-gnueabihf": "7391ed73bfc7338ca6b5764c4a05103e",
        "armv7-unknown-linux-gnueabihf": "ad4e4ed434f36d1115bc422e76ef657d",
        "i686-unknown-linux-gnu": "13ba5027a97aea8bbe9d3a62b9c19728",
        "x86_64-unknown-linux-gnu": "a74de55ccfaafe29d37c90ef2cb3d4a2",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5218780009126b391786280f76b98aea743fd7cead8d48befc03791c095f88d6",
        "arm-unknown-linux-gnueabi": "29d4d25a0ef3db8fc25ec0accdc347b38bcd761801dcc16d3531b343bf8b4cea",
        "arm-unknown-linux-gnueabihf": "2aee199bbad9195da6145676ff3011334b7629b9342ddb14749733d0f29daa80",
        "armv7-unknown-linux-gnueabihf": "81563ee31759f00c306d972e0da1e36dfb9aed87e03bd77b11f88bb5b7f77309",
        "i686-unknown-linux-gnu": "377c0b38358b4f5ca1277f9869d2b0edb7a0b2e02e58e30bcd82b8fccc70af88",
        "x86_64-unknown-linux-gnu": "52002b050485674e87fdd72c7b49dac8783dfa36575be7e6265a69b4e66f8570",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
