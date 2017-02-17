
def get_hash(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "504d03f5f5219628be2da6675ec3db7a",
        "arm-unknown-linux-gnueabi": "a3cb79d18a61e36b5e133f9b32e5b0c6",
        "arm-unknown-linux-gnueabihf": "282486a2a61f3b83f69130495185221f",
        "armv7-unknown-linux-gnueabihf": "ebfab4c070dd67eec7c85c0f0124b678",
        "i686-unknown-linux-gnu": "ee62d3b9e1c17d1e87c1bf0578eab3f9",
        "mips-unknown-linux-gnu": "657d556486093c377906c085f84b74bd",
        "mipsel-unknown-linux-gnu": "2dbe9df60766d6c6fd2ae23ce05a063b",
        "powerpc-unknown-linux-gnu": "372fe044ec52e79bb0b95418b719fa85",
        "x86_64-unknown-linux-gnu": "da2469eacf2a079563d6d7e6f5319efa",
    }
    return get_hash(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "da44693800f15f6c815aafe1f9b45e51855bc28bbc4fbf775eb0633279f9136e",
        "arm-unknown-linux-gnueabi": "dac67d923eb82add61fdc9f6249e8c7d28971b7f8f8d85fe03ce8949cf7f5be6",
        "arm-unknown-linux-gnueabihf": "de6ea8bc1fd78027ccc0b60d705947ef2bd7a756cd1dd3a3c71b354fc4cbbb64",
        "armv7-unknown-linux-gnueabihf": "ea072e1870adf96e2cf72b942e93eb79cf9aa2f196eae5128e8218937a044e86",
        "i686-unknown-linux-gnu": "eff452a54b208a83b35432f226cb7de046d27b5e43edfc31d71ff340af686db0",
        "mips-unknown-linux-gnu": "9453b82d20cf15a787b30ec5e2aa9edb6c579197f3630e45e7142953c0d4528f",
        "mipsel-unknown-linux-gnu": "090792c3da14bc9aa6bc18bf947df475be9ec8c8c4f081b2b7808413656e0984",
        "powerpc-unknown-linux-gnu": "399064c741871e0cbd56ca2feec09cc96f53610303761a6059b836d35151698c",
        "x86_64-unknown-linux-gnu": "69b251b478e284dfcaefc1153183f26f41d504ae213a81224f2101d8dbd52bb0",
    }
    return get_hash(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "80a12535d4fe3513de293b6ef1934fdb",
        "arm-unknown-linux-gnueabi": "bf9b57a3ef254bf9518ea6cb49145515",
        "arm-unknown-linux-gnueabihf": "b03cd13e654919c4dbefaf7838d98db5",
        "armv7-unknown-linux-gnueabihf": "7bdb1d5160089c504cd2923a83fc2cf3",
        "i686-unknown-linux-gnu": "523c90836120f3388d7c7a1eaa4df6ab",
        "x86_64-unknown-linux-gnu": "6d01f429917fa6b7053054e6b5cba138",
    }
    return get_hash(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "de4e4664ff25a2b5723771d97a0ccf537daa82acd87e185a951ab384961cfcd9",
        "arm-unknown-linux-gnueabi": "f4e823394d3e7d9d845eb12ed1158dcb424cf6a9bed7900401aeaa28fb861a70",
        "arm-unknown-linux-gnueabihf": "526709710451de0c62bc07ad363687de387ff915fccc2809f1c588cecf452723",
        "armv7-unknown-linux-gnueabihf": "bc4eaacd7daab68825a1cbf244b3bc794b4bc519b31ef5c6915e87570eebd15f",
        "i686-unknown-linux-gnu": "a833304f99071600c72ecd868c1c7bd5ce49d1102332637a8eb7adb942f349ab",
        "x86_64-unknown-linux-gnu": "33ff44672b731fc71145974ce84194a1a9bafe6da3a74fd1e7543f12467f8894",
    }
    return get_hash(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
