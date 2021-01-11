
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "78cde5ab9fded29e2d32f28aac30c451",
        "aarch64-unknown-linux-musl": "9825f3457eb5f264bbaa55f6094253c3",
        "arm-unknown-linux-gnueabi": "ba2f5dcad204f1274ba4cf8ca3a39704",
        "arm-unknown-linux-gnueabihf": "35c3be632766487e93ab22da5e6e905d",
        "armv5te-unknown-linux-gnueabi": "e983c7b7a8d3f04d5b3a3be0b3cd4748",
        "armv5te-unknown-linux-musleabi": "49248522ec55b317f38277a2247d4004",
        "armv7-unknown-linux-gnueabihf": "98e40088d5393b4ad8c2a341dc385e2c",
        "armv7-unknown-linux-musleabihf": "17b605546e9a3b1688956b6cbc39490a",
        "i686-unknown-linux-gnu": "8db4e38a2254ce5eb5dcb5b7de47ddad",
        "mips-unknown-linux-gnu": "22e2306df51e151b2dcfc7887923406d",
        "mipsel-unknown-linux-gnu": "4e6fdc2a119215ca1ba1750f839bc16f",
        "powerpc-unknown-linux-gnu": "618069bb5baaab595f6c0041b54cd5e2",
        "x86_64-unknown-linux-gnu": "b998b73cf7137b8c0deeeda0ae0ca876",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0019c302a0a02d8a9e40c3bcdd5a31b9b2704161563d72df3572521989182b0c",
        "aarch64-unknown-linux-musl": "69e27f17038a4eb99fe43781f0ca6432f64802bb24fd08fd4f2b90dc73987396",
        "arm-unknown-linux-gnueabi": "0091b20243bcd93bd71a0a40ada0dbb823fbc94ee89aba884aef65e8c1963175",
        "arm-unknown-linux-gnueabihf": "06f81e14b008e55fc3623cc165e45f3494585cf13d8bd0cb04934eb203e8b136",
        "armv5te-unknown-linux-gnueabi": "2e73be12c4b37cc0380c76be1a4f929ae98fe9251b3c7972e716c8831cf0f3b2",
        "armv5te-unknown-linux-musleabi": "29221665f68db676361a7856473577f62f59a9697b32bf912fb96a083be8ad3a",
        "armv7-unknown-linux-gnueabihf": "0d732f9035cc315102b589b1219b4ff3aabe7b254e92996d2b78e264ff500cd4",
        "armv7-unknown-linux-musleabihf": "904db62c505fed767d67434ec8cfb90fab7e30557014d312062292472a0887ff",
        "i686-unknown-linux-gnu": "2a5b8e26c3b61046ab9f420d905b680779cb5521a64b3d2a1846f5dab68c0ba7",
        "mips-unknown-linux-gnu": "7f0cb7552045e1dacd7b7a026d58e7cccf3ec997c19b2f6e571b3e954cb1d078",
        "mipsel-unknown-linux-gnu": "f79e4d1c84fe4551c3526fd67e686febf5b9defc48fbbd48c9455c2d033c55f2",
        "powerpc-unknown-linux-gnu": "bef6ba913c34230931cf2db1345d2626930a260bb19605e48de26aa8ffc7f7d3",
        "x86_64-unknown-linux-gnu": "17ecad27d96b331608e4a96dfa3cad05ccb2ccecb888894ed35054e0d1f5207f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c2dcb2437c1da3408c5caffafa0415e1",
        "arm-unknown-linux-gnueabi": "7b93c5fdc75e3b4a77cf928f160cdb82",
        "arm-unknown-linux-gnueabihf": "7342137408d0bf3fff77cabed6ee5d57",
        "armv7-unknown-linux-gnueabihf": "242340a64d1060f541fca50d57498f44",
        "i686-unknown-linux-gnu": "eef43be80d36de14e5fc19ff713c8cd7",
        "x86_64-unknown-linux-gnu": "a247f5c9aa4e0d278a110a853626a166",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2e143bfa59eca5c3f3e995c5997ae55c7defe824fb4dbe7e77896e132f42c24b",
        "arm-unknown-linux-gnueabi": "ae67d4eb065e397ea8ef4d00a70cfe72bc3097bcab0a8d4c0b5bd2377469c906",
        "arm-unknown-linux-gnueabihf": "e25cf5a8c91f829ac1230fbd854cee45a9befd8a459134da87fa072c4a145399",
        "armv7-unknown-linux-gnueabihf": "603b01f7481909f6b033a38e73da00dc9664b903bf2b0ba8d506b505e3b35500",
        "i686-unknown-linux-gnu": "8ae62e7d9ab28714d3dbf83c48319895fbda0fb069f6a9b94f3cddaa2b174aa7",
        "x86_64-unknown-linux-gnu": "d96be0ae1deada01f41372ab2c2f485a9f8625069aeaff33c5b513061e9706d4",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
