
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e62454d1fca8b52753214817073750d2",
        "aarch64-unknown-linux-musl": "e38211add4ba95eb79f77269de73489a",
        "arm-unknown-linux-gnueabi": "79938534edd1f1f7a0c7b3ef22f6831c",
        "arm-unknown-linux-gnueabihf": "3de0ae80671c49018c511510c1b76530",
        "armv5te-unknown-linux-gnueabi": "a16cf5259f165ab841b4b4bce8fff45d",
        "armv5te-unknown-linux-musleabi": "fbb1d18fab8771c01960bc561efa063a",
        "armv7-unknown-linux-gnueabihf": "eb64061544e1e63f79b8e675d0485896",
        "armv7-unknown-linux-musleabihf": "db7f8a0707c77d3bee53b534d82d1c7e",
        "i686-unknown-linux-gnu": "8f17c2fde256fe623baa052d3cc0e448",
        "powerpc-unknown-linux-gnu": "fc1b321441b88d1911547f4ade4099ce",
        "x86_64-unknown-linux-gnu": "59aea81c1f4634c766163deaa03b5bc6",
        "riscv64gc-unknown-linux-gnu": "f77c0375b3b33fef2c22841555fabd9b",
        "thumbv7neon-unknown-linux-gnueabihf": "7aacaae9c0905e8cbf1695db6bac51bd",
        "wasm32-unknown-unknown": "0fc6fe7055726db888ec7bb16903ed10",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "208bcd75dbb01ebb1e5a6a4bcb7ed2e3cf2b6ca7c50885e8430c2cc803d3561c",
        "aarch64-unknown-linux-musl": "32f7881cfde924a798cb226272f908811aa097da3ff360a12dd8979a13ba4dc3",
        "arm-unknown-linux-gnueabi": "7dc1848cd977964b7ccd80c0c0d5b3eccc57a4fee3dcbf5fa7aaf71d92b4a5b5",
        "arm-unknown-linux-gnueabihf": "cd79238fddcedab36e9c40ffa145657a855d81158a50ed18176e261724e82c66",
        "armv5te-unknown-linux-gnueabi": "946b6a6b954eb12ad4d07fd03a0d492567c274289c9b6b044aa53d7cbf3f065c",
        "armv5te-unknown-linux-musleabi": "afd99c810689b21d7d68542d5d4eec9a958b9a29e05f54adf6a782b78eb7355b",
        "armv7-unknown-linux-gnueabihf": "b799402e64aa63bc9c8f6ffa12c84050c305646e4f133822fb15660171a2747c",
        "armv7-unknown-linux-musleabihf": "eb6d0f4eb9e7e835a3718096234267b20912d24ca1719df3cbf58321f6c4aa72",
        "i686-unknown-linux-gnu": "cacd9733d594bd061c17baba0f7ec7c0456c10509441068b5a268e9648bb91c7",
        "powerpc-unknown-linux-gnu": "f2a83e6edeb9aeebdbf081ad1630ac12642bf880348c7620e456018690ff897c",
        "x86_64-unknown-linux-gnu": "c07c49819f14578b4a1d010ca77179305d2f2de484a11f18e12d1c3c6aeaf373",
        "riscv64gc-unknown-linux-gnu": "68396963ba07d2de5f0eaaaf959332c81609fca2eca85d1fd6273a588c38601f",
        "thumbv7neon-unknown-linux-gnueabihf": "3cf09a2fc53ba07de0e49b8e2c27d08be60a47521a2b5e3b119896eb66ef9158",
        "wasm32-unknown-unknown": "ef956630b775c48f371b6c82de8de71e6633970c5aadbc4b6f1a1accced382bb",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bc59b39f85b98d1d648779d334b608f1",
        "arm-unknown-linux-gnueabi": "2cb49eb04fcfe7a58cff47e6a4a5db3c",
        "arm-unknown-linux-gnueabihf": "7a87958a0fc6c3cff0f2cc03b3d96a82",
        "armv7-unknown-linux-gnueabihf": "cd29a73142bdf1e85f318c669b959a85",
        "i686-unknown-linux-gnu": "b15a9e32760884c1f1a210e2c702c487",
        "x86_64-unknown-linux-gnu": "9b700fce1104096e98e6f8e33c422793",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "523029e8b5a95fac52c5f1aa9cecd9fb480077e90396501d721bad86a470d866",
        "arm-unknown-linux-gnueabi": "2ef7e22a0180161603d993fed35fa9342853fd92c5f800ec91f5481aa27e9ec8",
        "arm-unknown-linux-gnueabihf": "d75c8b40d2dbd3b874e77b1978ce54b2e26390b5e0c740824b9f737e38893bf1",
        "armv7-unknown-linux-gnueabihf": "dd404a37a712b7c5ebc23aaa07082d53780e1db414db4bbbde407661641b38a0",
        "i686-unknown-linux-gnu": "8ce8b6cb387a0dd0f69073efdd47a40f8542f5ae7f67a73b72895852f5d2786e",
        "x86_64-unknown-linux-gnu": "b8c57ca524c86b2454502628a0d76f2de8cf1ae2c0a098dcdf1216ffaa4747e8",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
