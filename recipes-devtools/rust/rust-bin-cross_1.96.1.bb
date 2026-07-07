
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f086ed059bff9b5c897c8f77da1a86ae",
        "aarch64-unknown-linux-musl": "623581c22e8741464423babab62e2c9c",
        "arm-unknown-linux-gnueabi": "5cdcab16052c45fd26524547c93211d3",
        "arm-unknown-linux-gnueabihf": "bf0444bf835235f3f75881b652db2012",
        "armv5te-unknown-linux-gnueabi": "2712c02ea5d254439e4401573c18c72c",
        "armv5te-unknown-linux-musleabi": "4ba26cb282897eeb8b7521973f760542",
        "armv7-unknown-linux-gnueabihf": "1bd95ed47247889099b27c9141c0e790",
        "armv7-unknown-linux-musleabihf": "fcd0668d86715deca173999963a59098",
        "i686-unknown-linux-gnu": "8ea3097a26dc8b7d57d73b6bb9c3c3ce",
        "powerpc-unknown-linux-gnu": "a99a0f69dc6760f556dc73354e423c97",
        "x86_64-unknown-linux-gnu": "adb75786d59bd61e127bdb28f2a86340",
        "riscv64gc-unknown-linux-gnu": "8eb6481863c28d14a1d8ef9e45367e03",
        "thumbv7neon-unknown-linux-gnueabihf": "3011c52e6d2af25fadf24a06e268bef9",
        "wasm32-unknown-unknown": "4127e8db5707585b7aabef4de4569d90",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4483cf06490373192bbc3fb9b483e14b6dc1bcdf99badae18b45931325284e1a",
        "aarch64-unknown-linux-musl": "a0456b82cff16b624c3d46dfc15eb0004aaf54e9b8d9cc3a317d487ec45992fc",
        "arm-unknown-linux-gnueabi": "fd3bbc6b9c9a22c9ca62b1779b8a052f6e602c6ab21ca5d6afabbfc0002468fb",
        "arm-unknown-linux-gnueabihf": "0455658f21417782e02e9f81090891f31baa1804c63547c9fcd820b21d773c70",
        "armv5te-unknown-linux-gnueabi": "254b107ff7650a0925732ec4763918e43460c83b16aa548621794f3e774eb5cc",
        "armv5te-unknown-linux-musleabi": "9d410743a5e6a3a060eda8908bf5b5208b18382ccd371f5186d9202738b2eb6f",
        "armv7-unknown-linux-gnueabihf": "2a7dc3c11841271913c9bb433f68a24eb568b1d2e8a75498e31e39b694f82a55",
        "armv7-unknown-linux-musleabihf": "f2f593f4b991ea217371fe6b7d09ddfd80e2a68b535007c83d5e544685fcfb96",
        "i686-unknown-linux-gnu": "f2d876e2fba3649b433ddcf94c9aafd9759a5babdedc6253fc5b1d862c65b32a",
        "powerpc-unknown-linux-gnu": "99d446bf9ae6d84c17cfbab2462e42dd71b4c540e5d8b3df413b53c093faeed4",
        "x86_64-unknown-linux-gnu": "aca04b57a389c215c21a8a71b6a44d8d083f8707888103682769d16155692ec4",
        "riscv64gc-unknown-linux-gnu": "8b1e009fc40701dad6fd9b322fbae9610b0679a8a529f897072d69da2062e662",
        "thumbv7neon-unknown-linux-gnueabihf": "bc8ad178fce0fba7a643ab2ca470d67eabe1db4e081ec42ada48fa007f87d3e5",
        "wasm32-unknown-unknown": "0236bda53460600bcda186dc090430199e849db9c07d0f8a112dc46dbc461a1b",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3917b03f050999140364bc14e9e610d9",
        "arm-unknown-linux-gnueabi": "07cd32dcb590a04e651345720fabcdb6",
        "arm-unknown-linux-gnueabihf": "a27d1dace499c15fd78397d1c5d928ae",
        "armv7-unknown-linux-gnueabihf": "40cbc62bb980e040efb729ea7c286f0d",
        "i686-unknown-linux-gnu": "8bbfcada76a1f0cfe9b90d900179dd4e",
        "x86_64-unknown-linux-gnu": "9e32a64749ea66d2864a7f9ef245e7b8",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4694256eccc212e8339f31d58c287b6ec89fcddf2ab9920c9e07091f5dc79cfe",
        "arm-unknown-linux-gnueabi": "a120d9507af6919fe9326a9042bd06cd3a56ddbb50f073e47f073c6acd0aa077",
        "arm-unknown-linux-gnueabihf": "551a25e8fa64d9a3e0180fc3561b98cfe7ac10afd79fbc67697214ac58684958",
        "armv7-unknown-linux-gnueabihf": "ab29ad5dec64fe07e837d0d0d2eb9b3230706bfe954f49a4928bb6d0aaaaf042",
        "i686-unknown-linux-gnu": "3283de82e06958f096dc5ff79ae8a7284c6ea2b1f0402556a9497d7d85bca3bc",
        "x86_64-unknown-linux-gnu": "4979b9ce46281de67d02ea0383400b00f9b83ec7d505b26b3c3646e12d98fee4",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
