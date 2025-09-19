
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a0804cccaf454977f3704beb7beb1bd7",
        "aarch64-unknown-linux-musl": "d0392685e951328d4a366c99dd69444a",
        "arm-unknown-linux-gnueabi": "7b9dce17f022732af0bc3b375162743a",
        "arm-unknown-linux-gnueabihf": "8cdcb7bf930888e8e32cc6c786cba154",
        "armv5te-unknown-linux-gnueabi": "f6ca4c3664bed3a329467b58f12761ff",
        "armv5te-unknown-linux-musleabi": "0b3942910ea71157ef1aaa033be09a5d",
        "armv7-unknown-linux-gnueabihf": "c840cf7fbef480169302375eb6b0e713",
        "armv7-unknown-linux-musleabihf": "c81eeabbbafc13d8880965c0300218a8",
        "i686-unknown-linux-gnu": "dc9a1ea30ef8c22583d975af34aa515a",
        "powerpc-unknown-linux-gnu": "cf9e9030209017c01978ce416fe9b2ca",
        "x86_64-unknown-linux-gnu": "12faaaa387f8f5f8591b1e9004773f82",
        "riscv64gc-unknown-linux-gnu": "aaa7c2b5e04f89fab46d9dd95492f0e5",
        "thumbv7neon-unknown-linux-gnueabihf": "271233c3c5bac4d9a30a2d706d74d49c",
        "wasm32-unknown-unknown": "b05eb4720099e834937647210ac2e706",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "609df2b364009d86c3b62f7c9d2225a31839d3bfd81c02e4ae5633b2432cef4d",
        "aarch64-unknown-linux-musl": "ef546dfa4e749c57d3dd42457319336f6b78b09af41443602b89b26314c482a8",
        "arm-unknown-linux-gnueabi": "8d28ae8940d27ee30d8465361ec6ade9777f177fbf98fe58071412db21110575",
        "arm-unknown-linux-gnueabihf": "9be34eae2283cd313fe55be005ea76c850ac37aa202f8e6fdc10bbf4f9eb5bfb",
        "armv5te-unknown-linux-gnueabi": "0fd9e7288a02a151c105709bc68f8781cdbfd0c518c4d7173922576d8493ce5b",
        "armv5te-unknown-linux-musleabi": "fa1c8e3ff6f8661806bf72a9b8124d9ee1d3baccf44325c924730aff375ce65c",
        "armv7-unknown-linux-gnueabihf": "dcce5a4dc892c58e7ba7662dccdcbed5a9e1a40b1108e5fb76a50a0a4d3e62ff",
        "armv7-unknown-linux-musleabihf": "199f4489cd33455a738022b7da0767c08a2b38316f2b58dfaa041dc18d92c0f3",
        "i686-unknown-linux-gnu": "8736064309c51aa957a4b6918f3650ab204ce24859dffed59611394b81fe58fb",
        "powerpc-unknown-linux-gnu": "7311b0bfe1169b8c8a82ee3cc04c690bfd6136db162787cc4509deb3ca1de6e9",
        "x86_64-unknown-linux-gnu": "81d7dad58adaf8a9904771d1aa1ea7e8dc732236fe0a1b148a068ceb502de7fb",
        "riscv64gc-unknown-linux-gnu": "1abdc9a7a36244185aac647bc2170e91656ecb53d420801a40ecfca45b1e069e",
        "thumbv7neon-unknown-linux-gnueabihf": "09eac0dd5f00785f08302e93405f6ac2f0ea7e5063f2fdc8697998f4085d37e4",
        "wasm32-unknown-unknown": "cbcd4ea55884e9c3d8d72e1497c70e9ed18c4a824d4d0f049006a245229d11af",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "493163c31fc8369ddb8c2e57b84acb47",
        "arm-unknown-linux-gnueabi": "392019e7acd7c77daec7ea61b49e57c1",
        "arm-unknown-linux-gnueabihf": "3043775bbf3ca7f4b1d433c3f6842db6",
        "armv7-unknown-linux-gnueabihf": "6c6d23b8e87765d5648f4ee88e65f761",
        "i686-unknown-linux-gnu": "d8fce61159910f84fce3e7173fd1443f",
        "x86_64-unknown-linux-gnu": "1a0aee7bf33be04d1bb0b8dcfa6091c5",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "648fa8d03b1e9e2689fc530dd564e23f5db69da6b82d551eccc4c0a7f16d28bf",
        "arm-unknown-linux-gnueabi": "1774694e35a1536eda0766bd2ea0c048ab24a9b13fa053e52469fdf293241c1d",
        "arm-unknown-linux-gnueabihf": "4b436393e515f0e9546d2fc5b97a51506a35bf1360f960a6014ae0ce4f7f5526",
        "armv7-unknown-linux-gnueabihf": "45feb2554086611d02ee13df6490abedc68402358549098d2adfe9267c520c63",
        "i686-unknown-linux-gnu": "65e9c41b6e6588c1d2d3964648ce63eec77290854383c487da8858c2b5d51ca3",
        "x86_64-unknown-linux-gnu": "b22d65fd75f50cc036c0cb514500628253aaa815bf2e18ec65620acb8a1ad244",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
