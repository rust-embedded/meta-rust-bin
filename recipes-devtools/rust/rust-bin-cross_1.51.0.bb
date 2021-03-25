
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9c8a651f4deee370e397e2baf6f52637",
        "aarch64-unknown-linux-musl": "6c22f7bb77ba224578f8681355151af4",
        "arm-unknown-linux-gnueabi": "6d38eca7c6b3d46d053f00c4a751bc97",
        "arm-unknown-linux-gnueabihf": "8c28b100abbba6db1d6db62104279409",
        "armv5te-unknown-linux-gnueabi": "1cfc920ccac4225964ccc620e527ba36",
        "armv5te-unknown-linux-musleabi": "ddca1f92b80f2f223d7687db2a371968",
        "armv7-unknown-linux-gnueabihf": "e87970c00458041eebe70991093827e8",
        "armv7-unknown-linux-musleabihf": "1f0a159e2dd7902d1c65b9f21fd8fc8a",
        "i686-unknown-linux-gnu": "9adec729b4bcfa3cb4ab27583dc750fc",
        "mips-unknown-linux-gnu": "4da9dad4d319ce44105958051e9ac348",
        "mipsel-unknown-linux-gnu": "91448053676cadddf0e52682fbb125a4",
        "powerpc-unknown-linux-gnu": "66a4cc9268342da7bac2211f178764e8",
        "x86_64-unknown-linux-gnu": "b924431a790d2e7b88a2d7d0d7b22e72",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a6ed4abe59dfaf2119e2803f67fd8aef757a622ae3ac9a040946af2b02f4c269",
        "aarch64-unknown-linux-musl": "9c0dcae82c10d52d202052fa0fa912cd7a21dd286de01717f70e24dfa20a5b03",
        "arm-unknown-linux-gnueabi": "75ff6c24f34f4c9679334dda84b44ee282d586127201c4bdcd258b8e3766ecef",
        "arm-unknown-linux-gnueabihf": "5b6b85c91954c8fcef8572568fb9931d7e48abf687895695f09d5bc1d82ddff0",
        "armv5te-unknown-linux-gnueabi": "52e121ff6549b6fdf06cd470aac9ffc8aaf4a2a868bd2a2af48be26264743898",
        "armv5te-unknown-linux-musleabi": "ff8514a82714b9350cf2ad196e9bd6e18fe5e869741b9801046cb15a890d62e4",
        "armv7-unknown-linux-gnueabihf": "0e6cfa747ff7b9e1c0cb0d4fded110caa0702b6b8a7c4fc0d432fe617e525b98",
        "armv7-unknown-linux-musleabihf": "8e04d0d6564d384058de0dd3de0942da2c410982d51e3973687be2587559efc2",
        "i686-unknown-linux-gnu": "715a242cb5936eca160733ce06de476fbf6c1413800c7fda4e54424319c79edb",
        "mips-unknown-linux-gnu": "017a1a1d5dd06b6d98a6cd718019cfa2c76c325e6ca92af79a3a061c08bd9f9b",
        "mipsel-unknown-linux-gnu": "54a5a33089e391583f3f92dda1875829befe08849150773e76d7e6d404eff656",
        "powerpc-unknown-linux-gnu": "8d83d66c658adfd88f9c579fa89178d8a36990f0822451c2084596ad17219265",
        "x86_64-unknown-linux-gnu": "5e7738090baf6dc12c3ed62fb02cf51f80af2403f6df85feae0ebf157e2d8d35",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2be02923f5cd8e5f5f40e890f0adb07d",
        "arm-unknown-linux-gnueabi": "44ad3b93cecbad291b190e70ce0770d1",
        "arm-unknown-linux-gnueabihf": "b49ebeffb5ae3b76d25c1c29c9165071",
        "armv7-unknown-linux-gnueabihf": "d4f1659ee2f5a9e3a84fd17a04a42a0b",
        "i686-unknown-linux-gnu": "f2f08b0ce499be064bb3af2216dc80cc",
        "x86_64-unknown-linux-gnu": "bda584124916493c3389b672bea2a5f7",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b63b21d56cab87133c9cd149f7c8ca3b3399a877cb16496a86f7a87d8b15c784",
        "arm-unknown-linux-gnueabi": "912d10a93054db0f4a1816dc6176919bc1796fd710fa5d2ff05735518c865d6b",
        "arm-unknown-linux-gnueabihf": "dd0c2c3dadbb4d83141f8de9899720d400d5faa4fcfe1720b9b20d7d1a7ff77e",
        "armv7-unknown-linux-gnueabihf": "e90dcc411f32f81bd86e973dd73c3c71d377f9181b736ce2b9a1c6c3e5ff5fa1",
        "i686-unknown-linux-gnu": "8c93794766ab13792f8f3161189b2e399b04f177aa8ea4f14b58dc3bebf4edeb",
        "x86_64-unknown-linux-gnu": "6b1298ef220302a33cad21fad7c8e1535264872b18e2ece733ac37ed31571dda",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
