
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3395445099e36fd0bc85de970ff8c47c",
        "aarch64-unknown-linux-musl": "87831c4e5af988bf25f383dee9a86a8d",
        "arm-unknown-linux-gnueabi": "cfa07895e45fcf2503156da4de6ea2ca",
        "arm-unknown-linux-gnueabihf": "4b4b8d83d11817dceb9ec1a1657180f0",
        "armv5te-unknown-linux-gnueabi": "912bbcc6d9c0105b82b49ec1f6402360",
        "armv5te-unknown-linux-musleabi": "30cc215c503e650fffa201ab1814d8c8",
        "armv7-unknown-linux-gnueabihf": "984aba1b6e77ca492660cf6a02bf5aab",
        "armv7-unknown-linux-musleabihf": "ff84febd5ec992238d287986e05b245f",
        "i686-unknown-linux-gnu": "d416abbc3c033c11212e14a5a4e4a045",
        "powerpc-unknown-linux-gnu": "4bead8ac368c0f338ddbc4c5fe67f762",
        "x86_64-unknown-linux-gnu": "4480c75763f0ff90f919fb2c33d63e8f",
        "riscv64gc-unknown-linux-gnu": "e3aff819eb6b503db4a46116c3d6322c",
        "thumbv7neon-unknown-linux-gnueabihf": "743a4c3c9c24adfa632e60aca289901f",
        "wasm32-unknown-unknown": "7b55396f911b1d64794b5bf66539572d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c7561c0cc7748d74977ba94f3fa85dddfae3bcb75e51f21ffe6e59f7fb992219",
        "aarch64-unknown-linux-musl": "684ea88e96e02dfe65556ed6ab5100550f114fb5cd30c3b744d611d890769cf8",
        "arm-unknown-linux-gnueabi": "d6229688a9fcb15a3fb377a2a80dee71ceb2311986235c7b2e639079235622dc",
        "arm-unknown-linux-gnueabihf": "b07d68b02c2974c98f39691484c0be3de380bc3f7a3de3ef63a823bfe2905b20",
        "armv5te-unknown-linux-gnueabi": "33fc42525625927930a628db08925147e52e66e9a88fa0a3793e768153962bfe",
        "armv5te-unknown-linux-musleabi": "2f4e590967d12652a552b72dc909536ae147a1aa3517c4dd3dbcb43e5d4caa91",
        "armv7-unknown-linux-gnueabihf": "e0340bd594dcce9cfa9aced2cdc97f3acb130c2018b9e6039838daca32ef708a",
        "armv7-unknown-linux-musleabihf": "7ebed3fc640c21ae33110a453d8e6313a81c5be0e5e30ab368c4bd5accd11ccc",
        "i686-unknown-linux-gnu": "a870d3aea3723087da96b13d48e3725f50c67aec12567eaaf48d5e322a328d3f",
        "powerpc-unknown-linux-gnu": "a46f5b669f4f8e456083f2a2ffba0dc90a4e1825f545ac1a10c477ce5ae64396",
        "x86_64-unknown-linux-gnu": "2d7ae16a5baa4df96a142547e7954f539190aeebe90ee524642bac51fdb32156",
        "riscv64gc-unknown-linux-gnu": "c9af3d9ad23f2b5fcf56b7c74402fa00bb65e2d893b40fe110c11cceb9c84998",
        "thumbv7neon-unknown-linux-gnueabihf": "191cd2641c8416e326cffba280f978172ae2c2da62ceb6b9eb215019bd1addf6",
        "wasm32-unknown-unknown": "c66bb9b7ed602694f8ab62e845da164616bd8100d7f529c86dd47a837927f005",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "613620aa7c9963974d1664a79134498d",
        "arm-unknown-linux-gnueabi": "8cc8ab1e683c7448caf2028df68977fe",
        "arm-unknown-linux-gnueabihf": "1fd78687ad1f5ca0c85d011e046950db",
        "armv7-unknown-linux-gnueabihf": "32b6921a12b11ffc133785c949786448",
        "i686-unknown-linux-gnu": "d50ae25efd89c61ef45cc27a7a8d38f9",
        "x86_64-unknown-linux-gnu": "64f3e98a3696a3b2c5c226028de09487",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ee6dce08af26d589402a7e5b9c764ae0a61743d912ed41312fccb6453097f3d9",
        "arm-unknown-linux-gnueabi": "b9e4fff46c02fc76c1923b927b2f3b991ef4e120b40cf855c075f0b9154f83f0",
        "arm-unknown-linux-gnueabihf": "21c0173ccc6e1b859a5f14ae52e9e1fc157490a665390995078a838dccfa8663",
        "armv7-unknown-linux-gnueabihf": "16c49c25233c26b8700081ea5bce8cffc3d334c04f48dea116cccaee229cdfc5",
        "i686-unknown-linux-gnu": "4735748dcefe5fbf76cb2a9c668fec5ecc33471a057de8b585e41f0a95795d70",
        "x86_64-unknown-linux-gnu": "41a3de7824a96107ca026377c8901a21a7f152e6bfc7a93cd64d77fdcc346ffa",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
