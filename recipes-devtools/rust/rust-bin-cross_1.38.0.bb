
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5f529c926cebad570acb5fb9abe57849",
        "arm-unknown-linux-gnueabi": "87cb674dc93bea07b2d01d517ecec16a",
        "arm-unknown-linux-gnueabihf": "9981fcb151c5251b49b7021f1538767a",
        "armv7-unknown-linux-gnueabihf": "52a03fdacdf5d18dac5e5bff93fcf2a1",
        "armv7-unknown-linux-musleabihf": "ac43e6db99ee07f41d87f688b7db660d",
        "i686-unknown-linux-gnu": "8aa41481b788fae20947c9c1a79fb0c3",
        "mips-unknown-linux-gnu": "9c5e353b152d33276bc274faabd593d8",
        "mipsel-unknown-linux-gnu": "c8b6128afd392e31b3aad215b510b4ce",
        "powerpc-unknown-linux-gnu": "bc8a2d967d5b28c7ee28808022eb3542",
        "x86_64-unknown-linux-gnu": "840e839941c9db53d79a919a79c850ae",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0725ae9f55639c648fdaba06129de395ed839a7d1aab6aebfd21f26cbe1ce7ca",
        "arm-unknown-linux-gnueabi": "2e1446aa281f463736eb8a52555712c9be0740339f3921408beb7cdbb2f47aef",
        "arm-unknown-linux-gnueabihf": "19d572ee9319b24fcd4edbb90b3649d8dec2ccd7a183427fa5f62e6743d8e90d",
        "armv7-unknown-linux-gnueabihf": "28d1e31c1a7dda1c183d217ca0d6cddcd7ae936e8ba6d562846a33695f991d78",
        "armv7-unknown-linux-musleabihf": "d848c7fe6a6d45018fa26022877a3aaf75f943a3ffc25f1e4b14a303e3498e52",
        "i686-unknown-linux-gnu": "40d7b77b3452e8cf267648c72aca6d4a66e1e5b712c00e2a960db5b2b67cebc5",
        "mips-unknown-linux-gnu": "d120e9d4355921b82808ace8ce860a11b21e9220769cc817e5c2668a48383ee2",
        "mipsel-unknown-linux-gnu": "5769634b8d6d040e78e0ed667701e1c4bc517f1fb9679e22c338dff8524c7f94",
        "powerpc-unknown-linux-gnu": "3aab8340ea7ffc39b4c6de13111f7914e134a7ef37bc829ecb2adeb93439f7dc",
        "x86_64-unknown-linux-gnu": "cd50ec3384d79aae89ffdacf09715b68b1b5562657e993f26f67b9458e92dfdd",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "34e7ba43d29667ea7b59960a0866b116",
        "arm-unknown-linux-gnueabi": "06ad16d026689c933b60a916ba1485f0",
        "arm-unknown-linux-gnueabihf": "5fc0fffa379b73834e9753b8c2f4f882",
        "armv7-unknown-linux-gnueabihf": "4862dc8d04a398e7caf56fc029e4d3dc",
        "i686-unknown-linux-gnu": "ed2dffaf144d7472ec6bee8f81656c07",
        "x86_64-unknown-linux-gnu": "82a17e039ed208fbe4806fa30c25261f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0c787eaf01b5779b5a0c12bd0573901cf1b58e5e484ad44c3530b7ed51754d15",
        "arm-unknown-linux-gnueabi": "cc97ccd366095fa86881910da6ecefccf2252c307fe434f8c80fe62f190ce862",
        "arm-unknown-linux-gnueabihf": "3d8dd4d19cb821ea91da8e840743b06e11f6a66a95803a310974f81aab6d9fb5",
        "armv7-unknown-linux-gnueabihf": "ed3767d9680a2d0a80dab588a6e945a69d887a1df2d44b79802f6756fae8f260",
        "i686-unknown-linux-gnu": "b0bc3bed6508a35df0a7b9f8251c089720b8d9969eda8630625650dfa276482e",
        "x86_64-unknown-linux-gnu": "790a611695fabd12c3a141efa58b3dc5913d749947c1a95d3f5b6eb5476ee612",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
