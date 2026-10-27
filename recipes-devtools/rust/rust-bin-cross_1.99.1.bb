
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c42d7f2ed22e1b24debecda97c7ecf74",
        "aarch64-unknown-linux-musl": "5f1e14a491da4c7df44ab046fa42ac43",
        "arm-unknown-linux-gnueabi": "8172e461191e2c278d1c9e3feb9c71a8",
        "arm-unknown-linux-gnueabihf": "4ccdfffa4ec55891f4440c6c3a5a5f15",
        "armv5te-unknown-linux-gnueabi": "7c189421ca866400ed42b9f129b62c8a",
        "armv5te-unknown-linux-musleabi": "522d5fce877a9d0660bc3725770df8ec",
        "armv7-unknown-linux-gnueabihf": "d8dee9e5628a445451af1a3d96198c3f",
        "armv7-unknown-linux-musleabihf": "d3f9a3d275d794d85c0a69c72c36b4c7",
        "i686-unknown-linux-gnu": "c9c981cd7dec6bc5317476342afecbc3",
        "powerpc-unknown-linux-gnu": "ed0db5c8638e056db735905d7a2fba31",
        "x86_64-unknown-linux-gnu": "54f5af5c0330a2342e4725c096de29d1",
        "riscv64gc-unknown-linux-gnu": "a323d5fdde813993401c6edeb6f725fa",
        "thumbv7neon-unknown-linux-gnueabihf": "6b8289406f6d5fba6e16fff178259076",
        "wasm32-unknown-unknown": "cdde15eb7431c28137e567b5070642de",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "32d1ddb44cd49d6497ab6a24f440d4286a20b2667fdf928b876f59c66d13d722",
        "aarch64-unknown-linux-musl": "5202b22bf78e62f95304f6dfafd7e3e10ac839fb808e01cd12d66bbb99e7c1b8",
        "arm-unknown-linux-gnueabi": "4bcce56db9e1529782e01a3ce76d4a20c75625838f079a3a38cae87be86cd9f0",
        "arm-unknown-linux-gnueabihf": "d1bc03d5abb9b5630a8e01e324d08c8199a29edc365615783d04b6b2355eaf4a",
        "armv5te-unknown-linux-gnueabi": "91af7c29fe2f0c25a91a10b122d186ae134f2df5c96b5f81f42ac39a3ecf8cea",
        "armv5te-unknown-linux-musleabi": "a67a640fee3f40e78ffb0a8876b3c6d9d0bab358bf851eef413af431fc209b32",
        "armv7-unknown-linux-gnueabihf": "a0bf6fb8e1746141b54fb05b610e7f6785f63480aede45c458774ec8aa3d2f32",
        "armv7-unknown-linux-musleabihf": "7b645443b03902affc407d8819df64c51de8af8d2c410037770b7b672f7ce60b",
        "i686-unknown-linux-gnu": "8e33e5567bc1676f88bf3864a9969b7e1567492f99ac8e972803d5579b43e0ea",
        "powerpc-unknown-linux-gnu": "b8ab6a08027b36ce9606889c7ce2e80e8b3dfef849c5e09e6a82ad3208418794",
        "x86_64-unknown-linux-gnu": "d1290c05994a59c029e562cb75be1bddc6fb11a4c501e1b7b0f61d119c6cbb12",
        "riscv64gc-unknown-linux-gnu": "99be238e1967297caccc4ae91fbe1b2bfc21b4f803966125893449b6271c8eca",
        "thumbv7neon-unknown-linux-gnueabihf": "2541cf2b4d945d183463cd2de5168e777edb71247582277d197adb669afb34af",
        "wasm32-unknown-unknown": "fdc80d2da1effc88df0bae8503ad117d268a4854afb14a8e31fd1ef6df0aad17",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "23a3eb935fdfd3ca97222eaf0a1f1a75",
        "arm-unknown-linux-gnueabi": "b06360f9a7d90a1e394d86e9ec9e9a1a",
        "arm-unknown-linux-gnueabihf": "226589e6abdc185e90ffc3bfb4980321",
        "armv7-unknown-linux-gnueabihf": "dc7567f7f2fbf1acd3dd82a79ce1e548",
        "i686-unknown-linux-gnu": "fedc28c80550dbdfcddf98f1d63dedd2",
        "x86_64-unknown-linux-gnu": "f78dd2c85b4e1b8b4c7eb0825ec9fd41",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e4656174f0ba5ea3dab5f58d069b7afae6d7616187de31c65cb6432e4f941399",
        "arm-unknown-linux-gnueabi": "107a19a1df36e75cce58ace754d628dc8053df707bb29ca689bfae4e9575a9a3",
        "arm-unknown-linux-gnueabihf": "08dfc90a174d9e5fa48305d172af779df290ee2ef3c986b2e86c41151381fd6a",
        "armv7-unknown-linux-gnueabihf": "05d3fe48e34cf8379eb636adb11f3b994eb64e861e90a7c19cde55d3f39d6a69",
        "i686-unknown-linux-gnu": "c0de951b74fe9c6c6140c02dc95ac9409bf4ce13b050256dbc17b3195ca966a2",
        "x86_64-unknown-linux-gnu": "85e7c0e6f21636f714e2a42966011364a6cc56b6548126d32144d6ba90904966",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
