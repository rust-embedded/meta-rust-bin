
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9429d06389da8482d71d2f7d315c4f36",
        "aarch64-unknown-linux-musl": "56e49e8f70b622cf6f131dddc30ef25d",
        "arm-unknown-linux-gnueabi": "42068996ba641f56ddb2d9c8fc7b3d22",
        "arm-unknown-linux-gnueabihf": "3816653ef43b9fb8c6d09ed00d42703c",
        "armv5te-unknown-linux-gnueabi": "df06a09b411e0f9c6b6cab9855da7444",
        "armv5te-unknown-linux-musleabi": "9947ad462963aee3fa3d955025780dfd",
        "armv7-unknown-linux-gnueabihf": "ce720ce71341014bf58c5855a8337f7f",
        "armv7-unknown-linux-musleabihf": "46c297ce9cbb1babb07a70dcf89215be",
        "i686-unknown-linux-gnu": "55e39f9aa65089c9dfab8368a69399f3",
        "powerpc-unknown-linux-gnu": "ccf1f42967e75f380467544a1b7a36f0",
        "x86_64-unknown-linux-gnu": "4f74ce13c1e65b68c9aa5ecc64bdd8c5",
        "riscv64gc-unknown-linux-gnu": "ecec733bb95a436d07480e842b3c0b6e",
        "thumbv7neon-unknown-linux-gnueabihf": "6bd29c517304f81f1549a1c009c9d8bd",
        "wasm32-unknown-unknown": "83a72b4cdd89c3117a88f8e518d7c78d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "779407b14507542581216d89eb9f3fbb232abbf3abcc15c365cb32fa0614e409",
        "aarch64-unknown-linux-musl": "630ed4ccdc9877864aa3bd8689161dffd8987c7a923bf01e50c7d8affef7ae47",
        "arm-unknown-linux-gnueabi": "b8ccd51ad152b83309c59c0e5d1197184e978cf365c5020f60aa43ae910f37d4",
        "arm-unknown-linux-gnueabihf": "c91de0362fbbb96fa9498b0b252323ec7612d28cbc770d3ca8a30041090f74bc",
        "armv5te-unknown-linux-gnueabi": "96dd2de83616903576a71986394b380eeb2e8d22495bb1d140b06f7733f774d4",
        "armv5te-unknown-linux-musleabi": "499bd921e0ee72889b63a0cb7ff5a591ef2401066e8086c0452735501e89f510",
        "armv7-unknown-linux-gnueabihf": "6f15060d308793d1687a5092c80f2fbebc808c73096980b67f9de71d4f54f92c",
        "armv7-unknown-linux-musleabihf": "4a91d98eb5ec0583d8366eb7c0a602aae7e51be1fbe50038461e479027985a46",
        "i686-unknown-linux-gnu": "1ff30326661de2134d545fa019d81d78e5b5e947b06f60b4e1fe8969536af55f",
        "powerpc-unknown-linux-gnu": "f1a267d4d9d41ab4debf1062d3af9305b980e384df79b392a8cc144810c117d1",
        "x86_64-unknown-linux-gnu": "eddab0358cbd12aeb897716aab00d1db7b59696e85b9ac4982e72259a9a976b1",
        "riscv64gc-unknown-linux-gnu": "bea4eac8f0b752aec63389d626d96280424da68b033c2d515bc4af204f07bf44",
        "thumbv7neon-unknown-linux-gnueabihf": "5e314d2feaedaa1bf461fd1f7c33ce38ff8fa7d53b9145147775c2092382c0f5",
        "wasm32-unknown-unknown": "30d5028350da153fd10a87cf326dab3ae02426ace678a1e23991dfe8ec64bae3",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "77d86fc27edd57a8eb19bc197e3b69b7",
        "arm-unknown-linux-gnueabi": "c4296803b6f2fb0629ca39bba519149c",
        "arm-unknown-linux-gnueabihf": "8664cce935a6ab84af1e02a4a6918f3a",
        "armv7-unknown-linux-gnueabihf": "4efc60f8b7e37c3a67a04641397b702a",
        "i686-unknown-linux-gnu": "ad184aa0945dde49eebe959eb2747423",
        "x86_64-unknown-linux-gnu": "a9821f6ef02cfe8d4f561e9091d8c92b",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c6998e0d7faa373ba9d571715dcd04626a7735619bc1c37cfcaadf6efffc1f74",
        "arm-unknown-linux-gnueabi": "74d0f262db3c576e2cbcce33b14ecc45f0067a3fd4ba7bd4e590aa3f73cbf019",
        "arm-unknown-linux-gnueabihf": "ec978a7122ae342051425dec7ab3b4220c1609c5fce3dbbe6261cd024e7fe092",
        "armv7-unknown-linux-gnueabihf": "2fdeb12002dadb228cd3d1cf8fe79ab1cc3809278547ecd4394e58b082c4021d",
        "i686-unknown-linux-gnu": "8ee7c76cb8f4a2503b2f05c012e738b3a88073ea6e6879dbc5d3be407fa91275",
        "x86_64-unknown-linux-gnu": "a6e35741daaac7978e7f485b564a783d13b6740a1ecf3e80c2e71696ca5cabb2",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
