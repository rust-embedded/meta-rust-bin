
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "17c7c059703834c5d263a6296bad440e",
        "aarch64-unknown-linux-musl": "987947281a13ea184695bf3093014183",
        "arm-unknown-linux-gnueabi": "e1bbbbfc64bc92ca452e8208765d8e00",
        "arm-unknown-linux-gnueabihf": "60ed29d49254b2b33a3ed17461748f24",
        "armv5te-unknown-linux-gnueabi": "904d22e30c8e2e42907fade0f75f74d5",
        "armv5te-unknown-linux-musleabi": "d7914644b042563945f7b917a0977a93",
        "armv7-unknown-linux-gnueabihf": "9881e9922e892ae12ac59faaff85a93f",
        "armv7-unknown-linux-musleabihf": "0141ffc435f92e1c20d5cc61c3d3fbcb",
        "i686-unknown-linux-gnu": "c28ae6d82ddb8dd16e3de9bc3be034e7",
        "powerpc-unknown-linux-gnu": "a6c4424c28548571181790984c51d311",
        "x86_64-unknown-linux-gnu": "239bb20102f6bf44378e1f72bd7395ac",
        "riscv64gc-unknown-linux-gnu": "5a076400e147d3e8165a0e0668b95bfe",
        "thumbv7neon-unknown-linux-gnueabihf": "955392be97f1f460e636bb67c447035f",
        "wasm32-unknown-unknown": "096dfde3977c294133883dff08fc1abd",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9b3bec29960c353f28b60f4a918704846aa36fa80b8547f7c55480ab15caf1e5",
        "aarch64-unknown-linux-musl": "5e81b60ab9c015b0be0b2c8f944fdb5941b1feecf76611505afb16aba082010e",
        "arm-unknown-linux-gnueabi": "7b11720c8c4c8d44e8b6e1e5c8bb06428c97e02e3221ed7ce7d265b1605aed31",
        "arm-unknown-linux-gnueabihf": "89f1e04a4b5cb7b7ea9a981c6f9b8934d3c7a6cc69e000f5f3d26735931f74e6",
        "armv5te-unknown-linux-gnueabi": "97224b306f4f23121461a68da996e6b813409058ac525e749d005647767f83d5",
        "armv5te-unknown-linux-musleabi": "2cb46fdf0568bcd43e975d2b2c6edb250b7edeb06d4e57bb2ae47232e998b40e",
        "armv7-unknown-linux-gnueabihf": "fcfdd2ad454dacdf55597431e27074465e23fd41a02d1491ba0439d26ca65056",
        "armv7-unknown-linux-musleabihf": "764e095b913ec184fcf9e37805fbbdbc490d900e7ff6dd315f7d4721f33229e3",
        "i686-unknown-linux-gnu": "d1de30afbb72ddcd7e29106a2adf5777aa818dfc0cb644bea87782cb241669bd",
        "powerpc-unknown-linux-gnu": "1f5550e1a7c9e4f613119d7ab4b7dd92f728f0157f720d1484dcf62d4acee70e",
        "x86_64-unknown-linux-gnu": "ee1157c43c314a19d6057cbe08b698ba29c5744eee45381ff60319fd286c7f9e",
        "riscv64gc-unknown-linux-gnu": "bcc021d4792e10aecb94ce43b25a36f569e8dab42e7c48c209c4c5337ca16d8e",
        "thumbv7neon-unknown-linux-gnueabihf": "f8a35905d7a536b87cf631956133b9c9d55d099022869654febe6e9d1c2a8770",
        "wasm32-unknown-unknown": "a121200b96d62e10c143f6cebaac1f1621f8cd251601bd481a906defca37d37d",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3b41b03aaad17485cf29a1b5fec94d12",
        "arm-unknown-linux-gnueabi": "81ba18174a2c52d92ca69b633f62e668",
        "arm-unknown-linux-gnueabihf": "d202c90733c48634a2a0f8d4073d3400",
        "armv7-unknown-linux-gnueabihf": "d1b51d09cf3e92fc3dc96bad139f524f",
        "i686-unknown-linux-gnu": "a74fdfe372d95a6d33eed128738ba134",
        "x86_64-unknown-linux-gnu": "40dc27f86907f20b580c7b7b4c708926",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "67a0ca0a14f715c9563308ab366c9f006d1335f57fbd8bf24a870753d623984f",
        "arm-unknown-linux-gnueabi": "9dd1f60abb3ca40122ed688a67bc9a4d8b37bff658e802b445fa0176536bf1d9",
        "arm-unknown-linux-gnueabihf": "97cc2eebed0913f7a8f148ac7a2f56cabb4d67902f6777204c0390d0ec58c7c8",
        "armv7-unknown-linux-gnueabihf": "0bd1adbef398005ed7ba574705eb0e902336c99f435ea9917c9409fe45783069",
        "i686-unknown-linux-gnu": "ba1db7c74ebe224756de6a5d52bbcaa1f3ebd933e4574cd42eed1cac5c35ca91",
        "x86_64-unknown-linux-gnu": "254f4b50d991ddb1eb6f93e74b54f6d7be7c047b8931e50e3edb096a5ac7ef02",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
