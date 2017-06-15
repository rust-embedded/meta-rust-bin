
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f87decfd7c6535dfdacdd056519021b5",
        "arm-unknown-linux-gnueabi": "2fa3a2e99c4d18adbb0a7b672b33ff0c",
        "arm-unknown-linux-gnueabihf": "327de788c5da2e6eff0e5ac1af718f4e",
        "armv7-unknown-linux-gnueabihf": "6269e283f52d66656f82aed40c6abb29",
        "i686-unknown-linux-gnu": "8fd5a71eeae300b7e321e5fd6ac9f4ff",
        "mips-unknown-linux-gnu": "4b3eb1d806ba94c81ed244137029d752",
        "mipsel-unknown-linux-gnu": "91f4bcdf1942beb71ebc84e9267c051b",
        "powerpc-unknown-linux-gnu": "8511c6569401f4c60309065eb4aa69c6",
        "x86_64-unknown-linux-gnu": "5c484d5c1ddd633c4473f1edc607266b",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "59d3de61544d7400a261a88ca243394eb0c29dd7c1c68eeee392b9d5913ca465",
        "arm-unknown-linux-gnueabi": "2b7dc5b69985b5fdb7fd4c8366b087c9fde18fcbba0fcde4a33f522895861bb1",
        "arm-unknown-linux-gnueabihf": "0de6c59ae460123ceeab5b941185fbc4ccde60afc698647428950a17a16c6456",
        "armv7-unknown-linux-gnueabihf": "21710f52ebc6d801b47e31826454d20aa99288b10eb68fcab9fc5b3808e38c1f",
        "i686-unknown-linux-gnu": "3dbaa44a07b14e5af05633c5f1a7d6b0538c6f8fa404ee6d3f85714d4f2bf39b",
        "mips-unknown-linux-gnu": "84362074bd85c34ab5fa29e2684a79c63b81f122d3822e66657db87f8f668af4",
        "mipsel-unknown-linux-gnu": "04247eba8a5489cc4847ad552dc82be1d931b293e98b4176b0556c744028a361",
        "powerpc-unknown-linux-gnu": "56d9d6e68653089b0933ef87ddb4332d16d4fcd3a25e0a3a891bbd773f4a6126",
        "x86_64-unknown-linux-gnu": "2902bb0da78208f441f1d983aeafcad01ea653d2e062a8192892868e2b41130d",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "54baaf3e69aedef421df49ed8b712082",
        "arm-unknown-linux-gnueabi": "4da298c7e7adc2ff3c89d62aa4ec7564",
        "arm-unknown-linux-gnueabihf": "8f0fadd7d6c4a05c53018f8a533aaec5",
        "armv7-unknown-linux-gnueabihf": "086f2bd1b7e59ac834af49ca799733cb",
        "i686-unknown-linux-gnu": "8f5e5efd5026cf8f037b1292aa7adff5",
        "x86_64-unknown-linux-gnu": "894b45835cf28d6ddb3f04addc937dcc",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9fc2c46fa5e5d2c6b3651b2f10fa259b5f863c204625ee981b0896139b24d045",
        "arm-unknown-linux-gnueabi": "900da55d125741aaa477f8bf5c44f85865747465d2f42c84c9fce215e65cf1eb",
        "arm-unknown-linux-gnueabihf": "1bf230db5c5714a8884c7386aa0c0633e2eda0f0b6d908aab11f654eb033edb8",
        "armv7-unknown-linux-gnueabihf": "eff4202833abc93de896cc3c0f0c0646c85bbddcde1b61a2954992a6ad8a6508",
        "i686-unknown-linux-gnu": "9d3e3ff343f22b5288676b40d6749ebeabea863fa9e6009fbc5a018ede83c57c",
        "x86_64-unknown-linux-gnu": "3eebd92512040baf3c0974c3ce61859646d8cf422cc515d724d857577da0dbd5",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
