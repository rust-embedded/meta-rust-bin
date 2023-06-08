
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d0406889849c5bd8514c3dd44bd5b9b0",
        "aarch64-unknown-linux-musl": "3d57f7a6c1683e70c745b8debf7b0438",
        "arm-unknown-linux-gnueabi": "eefe9d61069ccf58080639fc9a906a20",
        "arm-unknown-linux-gnueabihf": "11387d73303e267d76222d088929ba13",
        "armv5te-unknown-linux-gnueabi": "2153afd3ada3f7fa70e585b7045c9457",
        "armv5te-unknown-linux-musleabi": "69dde4aa40b8418150cd486cc4a247db",
        "armv7-unknown-linux-gnueabihf": "69d5570003311cd9b3f9493d2da9d311",
        "armv7-unknown-linux-musleabihf": "dce04c579aa064f9ebf943863ea0a7b3",
        "i686-unknown-linux-gnu": "32095a189ab66b0d8fbfd3d20a7907f3",
        "mips-unknown-linux-gnu": "f375cd20c5d1334521a279983c1cb235",
        "mipsel-unknown-linux-gnu": "7e18d1d9cef2f7d72b61f9ddf429e918",
        "powerpc-unknown-linux-gnu": "1661a71982ffbf30f0127e85f02665cb",
        "x86_64-unknown-linux-gnu": "f94d293a8a3f8fbdedf5220c3f2676a9",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "78e8ce250a7ba30b7b9e55406915d42d160074c3a0e10540f13a69144c85a981",
        "aarch64-unknown-linux-musl": "5a33fe20263781a6821d52d2b2712e5322d8c2e29311b70a9fb0d5d7449c2033",
        "arm-unknown-linux-gnueabi": "0bd625326fa48ddba9a6d0de8a5a24eb9a415e599004875fec8edaea869aa468",
        "arm-unknown-linux-gnueabihf": "ebe12136f46269365a291f742e69986eea6736718e3493e80444f4df5986e9a4",
        "armv5te-unknown-linux-gnueabi": "2ec260dfaeec9d14e15e48735ddc257431b35c89a0e5bfc5050483b1f2d2ad0a",
        "armv5te-unknown-linux-musleabi": "8c34946c2e11e8755999374bb8dbb35f7279c3f6b55277328c029cdbc2485343",
        "armv7-unknown-linux-gnueabihf": "3e3687fa87ce6549cc1f508d4888508531d70482fce210c19dad24b29b8e4e1e",
        "armv7-unknown-linux-musleabihf": "57d075caeac0ffdaa0c47accf7fdf6458f5b73fbd8cbe3c42937d348d422f056",
        "i686-unknown-linux-gnu": "6cf40f9cd6efcf225fbd3a1da62fc589c4b946c6c3e25ab4fadaa4c948e10016",
        "mips-unknown-linux-gnu": "c1bc7f7b963da3288bf5fa624c0e0511d1da8983bbf5cac6c3e305688a83d3cf",
        "mipsel-unknown-linux-gnu": "248bf2b1e24d712cc20675d62ae5bc5564f1ac5825790cd95e2fa203da46b85d",
        "powerpc-unknown-linux-gnu": "27c10ad6ec6fea23980a5b28d51bcdf9e4b7206636e1570bc994c0581f950907",
        "x86_64-unknown-linux-gnu": "d921afdcf5218bfe144b74bd16b4c18d824bb6194e6ff92451f0ed749ca025f3",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4a1c89e77e075c981ea4f018cc0a8734",
        "arm-unknown-linux-gnueabi": "0a694703e358eda7ec753e8f48c4ae9b",
        "arm-unknown-linux-gnueabihf": "797ce2c3d53074b17e61dd3350f58f84",
        "armv7-unknown-linux-gnueabihf": "517ea50d5872f2236ec38671563360bf",
        "i686-unknown-linux-gnu": "e92d5c197958f050f9a437ca2f735160",
        "x86_64-unknown-linux-gnu": "c448b26d0a2db781c1ff17fb656c1823",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4ede6cb7dd09415b7a75145397fe49023aec759e9f2435f8254b4d7aabc704bd",
        "arm-unknown-linux-gnueabi": "5ca537ea37ae6789e740cf1ef5587d743b09a5d1ea1bea5f5256f9cf625f59b9",
        "arm-unknown-linux-gnueabihf": "d2ef2939d6fe1bc6c8941653285fb21ef3780b3b3126f8ac7cdd1cdce5661177",
        "armv7-unknown-linux-gnueabihf": "003c8cefb3d1c3abe087a7068b0cd4889d81784132697ccab24e81aa733a9935",
        "i686-unknown-linux-gnu": "d35087bbebed15f8573b7882e44982979ba4ced828ab0ff00e3b415b232c5fe3",
        "x86_64-unknown-linux-gnu": "532e773484a6df30996b3809bc2a000f1fbe3e5b966a09d3ec0133c57c25c0fa",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
