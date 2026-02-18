
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6dc4b0893b61dc43b4daa2f0243e88eb",
        "aarch64-unknown-linux-musl": "c98e16d33eb2ce113eba1e1e514875a2",
        "arm-unknown-linux-gnueabi": "f14a2ab1f440e1613fa22e82847a48e5",
        "arm-unknown-linux-gnueabihf": "cda7177e4811001fd160eb7a712c4289",
        "armv5te-unknown-linux-gnueabi": "6660981ee846f60eb50cdbdc527ad6f4",
        "armv5te-unknown-linux-musleabi": "2f732caffb64deb807887f9e24deed9d",
        "armv7-unknown-linux-gnueabihf": "9e1cec0d5c054a8304ca90bb5ec1f1ba",
        "armv7-unknown-linux-musleabihf": "135bb953863dab3a8262c9ad171e89f7",
        "i686-unknown-linux-gnu": "957bf338254eb8c9efc6168fa7439e35",
        "powerpc-unknown-linux-gnu": "fe41c2498c17dc95dd1b18bbac64e3c8",
        "x86_64-unknown-linux-gnu": "fcf0e0af957b5760304f359b87f05661",
        "riscv64gc-unknown-linux-gnu": "16081d7a7cbb910ad101398fb3595f4c",
        "thumbv7neon-unknown-linux-gnueabihf": "d14bd9097a337d5d8c1194658024614c",
        "wasm32-unknown-unknown": "aa42e9b8483b5d25c43cb3d9ad734b6a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e10aaf81c552ffe09f21e01492daa4d0b15217b31b4b7c1d4195cf98a3184380",
        "aarch64-unknown-linux-musl": "593a4de1d973757d050bbf79787d18033cdac825aa869c15895f9f9ad5efc09c",
        "arm-unknown-linux-gnueabi": "47572210068c9b6f9170f4e2dc797930792ef1d50907918bb7956535454a2eef",
        "arm-unknown-linux-gnueabihf": "e6eafb25c01f80523c17e9c8f32db26dc525a081b96be44a9736a40284b6820b",
        "armv5te-unknown-linux-gnueabi": "9fbc7733c1c358197b9de1128643a7c01a4d327185ea9294acd8818f40eb87d6",
        "armv5te-unknown-linux-musleabi": "36b7ee91d7ced9a32b3e78ff7fd5103d110fbb4ba810cdcc6d13158b198a8f79",
        "armv7-unknown-linux-gnueabihf": "f5fd4283f9c6cd8dde21c75f8a7d4f6c2788613dca495b4383a9ca5822b7662e",
        "armv7-unknown-linux-musleabihf": "52df412ac1d6d06b42a153e5520ff42eeb18ed3856bcfe9536c084ec85cf2d75",
        "i686-unknown-linux-gnu": "7d90ebc1aadd715a99ce8772c62ba5576334c40ca7add6edac904d3c532845c0",
        "powerpc-unknown-linux-gnu": "b3ff7ded33c1e051310658473a30ee95c8c02915bfaf4f561f0625caab978915",
        "x86_64-unknown-linux-gnu": "8e276f68c7793bbc18a2856a501dd6b296af2296d6482407762e3ce79a2221ff",
        "riscv64gc-unknown-linux-gnu": "0088b76482832e7fb8518ce795267800ba4299d536a0c3e2c5a7aaf471f5ec66",
        "thumbv7neon-unknown-linux-gnueabihf": "9e3e9a69e0e10b9db7624e39a5382fe51cad71fb11909c722269aff4efdb034c",
        "wasm32-unknown-unknown": "06b0afb67b970be83152b3c342ce881f4b68bea619eb6ab95fd504e92210891f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cb8857c1951bacd65a06d774b5e262ad",
        "arm-unknown-linux-gnueabi": "e6b767ef10e75797f6ccf68cfdf4d8be",
        "arm-unknown-linux-gnueabihf": "f7782bed9b8562cf2f6ecb8ef96141c6",
        "armv7-unknown-linux-gnueabihf": "f75ee82822ed6d41292c79b60c08e1c7",
        "i686-unknown-linux-gnu": "34dfd4995022fcbee2bdae9af630deda",
        "x86_64-unknown-linux-gnu": "debdc223ee50732625ff164dbd88a727",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f8609d27c42de42ab655c7072c894cebe1091eb481c0aaaccbad7dccfa8b06fd",
        "arm-unknown-linux-gnueabi": "5f3882331c3ad3a720cb73ca3a2b1f0009b9d82b6d5ba8e47cb170418e8391c4",
        "arm-unknown-linux-gnueabihf": "462a8a8115ec8699afeb7ff14d659e9d8b370b9b465babf4de8ee39c857150cd",
        "armv7-unknown-linux-gnueabihf": "e8de297768e9d94e84c5f82a6a6b8f4025335bda6b79eb855d3cafcbef2e1e9f",
        "i686-unknown-linux-gnu": "a62f96eb7c955b2050b506b9213ccab4c5f606e4e66ac8f9f67a5f04fc3f104b",
        "x86_64-unknown-linux-gnu": "9e35d0d8251db1fff243fe36e417263f7dd48c9ec7c61f8c13560f7e21a37f46",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
