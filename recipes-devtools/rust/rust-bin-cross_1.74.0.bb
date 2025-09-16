
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4c248fdb43a2e721a621641b463cd343",
        "aarch64-unknown-linux-musl": "20ff3eda5d73a7447b92f5b870e3dee0",
        "arm-unknown-linux-gnueabi": "e36c72a4035f4f0d2bd8da294d4cf61c",
        "arm-unknown-linux-gnueabihf": "97be659009116e30a326fded339c8930",
        "armv5te-unknown-linux-gnueabi": "f09aeb68518741c29a5f3a41d123984f",
        "armv5te-unknown-linux-musleabi": "d0c9b258d82abc840b9c8fbf5522a199",
        "armv7-unknown-linux-gnueabihf": "31873569e00ad44d675ada7f0862d71f",
        "armv7-unknown-linux-musleabihf": "4a02139582cce914cc4a8e6808989f7f",
        "i686-unknown-linux-gnu": "1f8ceed59e36c71bad960ebcb33b4b30",
        "powerpc-unknown-linux-gnu": "3604a48ac4495d6053c56303cffbb54e",
        "x86_64-unknown-linux-gnu": "4895aa6fdd0e5e1e705374ba919b0934",
        "x86_64-unknown-linux-musl": "67b3160c8b89857fbcdb8966dc783d91",
        "riscv64gc-unknown-linux-gnu": "a27729fd04b97ac4535580ad188894f8",
        "thumbv7neon-unknown-linux-gnueabihf": "4988f01bbeab4e0a59e892c7dbcb0932",
        "wasm32-unknown-unknown": "4960c45018c0ac54b1767df6b044864f",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "56df7a51381bdf38ceba057c93581d00aab4619d78974bca9f47cbc49aa8497b",
        "aarch64-unknown-linux-musl": "b1007bfb4dd53f34b49d0c15a0c0d910edff0333c778ee69eb2ef9ce1d4d5972",
        "arm-unknown-linux-gnueabi": "7c0976345a96aaf4160007bc0c0d381968db3927d6c19b5a6e244aad1a870fa5",
        "arm-unknown-linux-gnueabihf": "cad78e22d6f0eb87f385776c53d1783bdd0702c08f52f2cdea106207e099dedc",
        "armv5te-unknown-linux-gnueabi": "2b3c675dcda15a87fd071f271d5acd9b01db6c449864986d44dd7a3b8491e2c1",
        "armv5te-unknown-linux-musleabi": "9802f3132727bfb8aa6371684ce355ff6dad0d8c7cbe2146a65d5b4dca616c01",
        "armv7-unknown-linux-gnueabihf": "381f63d4571b7e1326cd62e0d4f2bca177192235cbfb05df63df13d3ab630ca5",
        "armv7-unknown-linux-musleabihf": "b3bb8e7db622f39079721afb68db392d7995404afc2ed6ed3d8d32444d076d37",
        "i686-unknown-linux-gnu": "028e55ccab1b41c8ed54c3a3f63660efbb8cf7e9fd4d7d357fefd14f12ac700c",
        "powerpc-unknown-linux-gnu": "d8a9322fb6c1be2ac52bffff089cbeb72b7da5d4d7d274c8935fc8de520db7b3",
        "x86_64-unknown-linux-gnu": "798b3243d9236e4dc5d43f6b186333cd30c04926b2229568d1fc0f0eb432507f",
        "x86_64-unknown-linux-musl": "2bea9c2b70d99051ee01459ae3dd2ecc15447673da1ee9b1d7c9a244d1b0a454",
        "riscv64gc-unknown-linux-gnu": "67f23b2fd2981e9d83d26506a2222b7a6ea5f89d42786ad6fcabdde89c46c546",
        "thumbv7neon-unknown-linux-gnueabihf": "91617edb6ba928be3a3c58b0a039339ec7cafc6883ab76d8329b92fb740c2eb2",
        "wasm32-unknown-unknown": "638e818db424fcc66bacb24972da089af78a0ba75d77557b2869d8ef886cd8e1",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fda201c3364fe82017c5940c82e63459",
        "arm-unknown-linux-gnueabi": "1d775dbe75afe28e5904ff55d9b267b5",
        "arm-unknown-linux-gnueabihf": "53579dbf911cccfbdadfc492f1586159",
        "armv7-unknown-linux-gnueabihf": "0148d79b014fa67677ebec58cccf3139",
        "i686-unknown-linux-gnu": "50392acac8d9d265348408426d73ca23",
        "x86_64-unknown-linux-gnu": "552281c0e7c1af582a2292a88cc85c80",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8e84e8065f21ea01ede5982869dd61160b1999b17f9a79911979ee936aea0de9",
        "arm-unknown-linux-gnueabi": "a05ca6fc4d70499390a609ece2234dd1b9b1a7bde5c0d16384c5fe5cf0969d35",
        "arm-unknown-linux-gnueabihf": "41e6f864c2be2081ad01b8c8315f00f2b0cfd1f26242f1b6fa887b3f92b4f10d",
        "armv7-unknown-linux-gnueabihf": "f55672d155e04c4ecb8187144da3e5ed323629f6f5c766c6841d713565fd8a17",
        "i686-unknown-linux-gnu": "9746152dbd939f2a2e3a52090cd5a1c012c519ca5bd6bba4119250f3c0495efd",
        "x86_64-unknown-linux-gnu": "358422396f3ff2a073f6fce66ca5aad9ae0596452711f6728c87698846c74e2a",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
