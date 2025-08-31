
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "aef024e1dee4905cafc8d6fdf964203c",
        "aarch64-unknown-linux-musl": "4d3a5651c24ab9fc6b5c7c8fbcebcd2d",
        "arm-unknown-linux-gnueabi": "e8a74924776220bcbe3f735bba956530",
        "arm-unknown-linux-gnueabihf": "f008ce1864bca458c5240fc38e847a2b",
        "armv5te-unknown-linux-gnueabi": "cdb3655b1810cc49c1ed43408dd1e138",
        "armv5te-unknown-linux-musleabi": "4f181ed7f027ccba08ca53899afc9143",
        "armv7-unknown-linux-gnueabihf": "23366d28280630ed5f1e6e58ad814b19",
        "armv7-unknown-linux-musleabihf": "849e4ee23eb914c7dd4a9472c2b92154",
        "i686-unknown-linux-gnu": "e59f1b78805719352413a73e725a7c00",
        "powerpc-unknown-linux-gnu": "b76aba28748a5c4534116a9d1002d3db",
        "x86_64-unknown-linux-gnu": "ea4af6c5eab4e990449b1bd1e6b432ce",
        "riscv64gc-unknown-linux-gnu": "38011531406f956175f2e4615bd7bf00",
        "thumbv7neon-unknown-linux-gnueabihf": "47540b5d4fa7aefbd9d990ab2874d4c5",
        "wasm32-unknown-unknown": "054992d043e3f66b4c0b00971672f32c",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "86eea00f31fc4cfe320624b38547d1850efb3c890ed00e73b39f725803c4c755",
        "aarch64-unknown-linux-musl": "5136887db2170733bb40b18be597e0ac9474fac030d7344c4517b38b0c98c70a",
        "arm-unknown-linux-gnueabi": "0802275835c36a936031a1da78e11c8070e3fa7f699951977bc0463748805d07",
        "arm-unknown-linux-gnueabihf": "cbbd549a619cf13c413e1954ed8dca72939e583a34b59076e1fb034e4e04dc24",
        "armv5te-unknown-linux-gnueabi": "e4410b54c63eab57e234a5c230744b3bb63704e012d503bb27ea27e47b85afb1",
        "armv5te-unknown-linux-musleabi": "8897a7c3df9cad8d5686c7c0aa5475f82aa3e94de2f8ff7184fa017e94da96dd",
        "armv7-unknown-linux-gnueabihf": "616714d28c5c4c0273a22cbc18179ba5354d2e3f4dfc300024266c46b4f68127",
        "armv7-unknown-linux-musleabihf": "da790276100bf066127987bb7964325379ef249f887d17fd3e26bc1628700a8f",
        "i686-unknown-linux-gnu": "8f3c90a21494b90e7f7bb16ee8f0b170b4d63389b05ce6c158eeedf5904d51fb",
        "powerpc-unknown-linux-gnu": "7c1f66581e7024e6e3ecd69db878defd5ea4a88b8b049ffaf62965ce9d652b15",
        "x86_64-unknown-linux-gnu": "8c194b0e3814efecb87fc4779767ef17d25399fbd476dbfc92f9a7f88b98f784",
        "riscv64gc-unknown-linux-gnu": "ee47cf94cd4fd130a233518236f49b742f7f29bb66e2256be23ba71a292430e2",
        "thumbv7neon-unknown-linux-gnueabihf": "1102d8d4f3cea919ffa97655120f312dc4ec52c86918966f87c0145a055b4a5a",
        "wasm32-unknown-unknown": "177a35ce65f969127bbd58ef08e24471afb2c638a811104c493699a23f5e0006",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "13d1342ddfc4cf7bc946b67198f3c96c",
        "arm-unknown-linux-gnueabi": "fb3a11d31f0280aabfcc0c3982e9be8c",
        "arm-unknown-linux-gnueabihf": "3ef74037119919ea1e060409ff2c638b",
        "armv7-unknown-linux-gnueabihf": "a469dac41cf1082102fc625efa2b644e",
        "i686-unknown-linux-gnu": "09d536e054bb7b7149037a4824e38d19",
        "x86_64-unknown-linux-gnu": "4b750d7206e9b320ba61f911ffda94df",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5ada1a7c9496017e3eed5d8ada62699c8d513f7664d8e02d5d9f02d26974cedc",
        "arm-unknown-linux-gnueabi": "05a72c333b1ef236fbbb1dc7245b38af1818f0de4e7148f4f7d03b4019cc9c5e",
        "arm-unknown-linux-gnueabihf": "2fa0fc7b34eaede3a9a9b85386fc217dc5f455e0a5252bcad10bbc2027b14ef9",
        "armv7-unknown-linux-gnueabihf": "34698308b23db42d36e2a651d1d122d0078eb0b1b6ad8d0fdf7dde8358f1486c",
        "i686-unknown-linux-gnu": "88b9ac8670c55077be42cb9168e0f17d922c0b0eba3044ffa3e63729f02b363a",
        "x86_64-unknown-linux-gnu": "6a30ffca17a244ad6bfb1d257572155f4e2b08d3ca2d852c2fc7420e264c6baa",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
