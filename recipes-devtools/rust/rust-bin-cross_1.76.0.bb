
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b3ddac44bd93afd8d8eeb43472838901",
        "aarch64-unknown-linux-musl": "289c447e3704c69cbc5e99512e056124",
        "arm-unknown-linux-gnueabi": "5ae081280fe288e518f96568c1c3a447",
        "arm-unknown-linux-gnueabihf": "037f70b445672f6a5ea20e1b8676e486",
        "armv5te-unknown-linux-gnueabi": "dd95c670c3122633477b2bcb92a99c0d",
        "armv5te-unknown-linux-musleabi": "dab69a0894379cfd8af58805809c9244",
        "armv7-unknown-linux-gnueabihf": "7855f963357eaa30dc02275bf9d8454c",
        "armv7-unknown-linux-musleabihf": "fa2806be9b8e951e271361bcd26ee2e2",
        "i686-unknown-linux-gnu": "936a9b7f0fca82a0c042a31caaf6509f",
        "powerpc-unknown-linux-gnu": "bf39759062c8c92aa7bf61d67643a7e0",
        "x86_64-unknown-linux-gnu": "b6650ab5179cbcb3423f5b900648d6c3",
        "x86_64-unknown-linux-musl": "848fac7f227922cbd5d5868eb58ca104",
        "riscv64gc-unknown-linux-gnu": "b08e98d569e56a9807513337a3e009dc",
        "thumbv7neon-unknown-linux-gnueabihf": "2189ba28580c267dfcd77da0148304be",
        "wasm32-unknown-unknown": "69a6a61ad009f7f548667c44e6cad424",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f7d217f36f3dd167247f29c9bc0fc3939c69069666db915a908535d13397cd33",
        "aarch64-unknown-linux-musl": "bfccc644677947f2ee4e061c1f84920e794ec3e29eda6eaaf5c6ff5db8b32929",
        "arm-unknown-linux-gnueabi": "94be6d0740bdfe7b090d757c402f04bd2307a231146c800e33ee633369499d6c",
        "arm-unknown-linux-gnueabihf": "4d169b281b0a7d223e6789e62943372f09c79bfab26975aedbde9b5e574bd3b3",
        "armv5te-unknown-linux-gnueabi": "b26682c16d5513fbfc84c838f544f0880c82eb39fbda09bd193972ba98430e65",
        "armv5te-unknown-linux-musleabi": "632ffbae76f42fc8171564dfc781e396f349c557fdc7a293ea3e9243d551eca9",
        "armv7-unknown-linux-gnueabihf": "1c38aa0fc6e2091b40bbbe029f57173fbdf3d6ef0a511fbd36e4484cb58509a3",
        "armv7-unknown-linux-musleabihf": "dee1b77633e863b659d7be0219fb6226f076d1010a9ed5cf4d4910395969a4ab",
        "i686-unknown-linux-gnu": "a0ee55109224a57327ade93b4ea1c0e7e8d8c9acbe13e2986f321b932f64399d",
        "powerpc-unknown-linux-gnu": "29edf8a0cc49ce5f13868cb8ac2772bde0c5e3e7e183dd9a334d4cb203cf301d",
        "x86_64-unknown-linux-gnu": "403e78b46d0730a21d6b25fe80ec947dc0ac4807c1f0930db68a4866552d839d",
        "x86_64-unknown-linux-musl": "8e198eaa1ee385f88c9e73b29e555e86cfbde623c8b5e7f7d28e2b9619d74c4a",
        "riscv64gc-unknown-linux-gnu": "2b4c722ad1934de8908563fb7b295d050bf5e749705b9c3dc09f729d441ea64d",
        "thumbv7neon-unknown-linux-gnueabihf": "6bbcf66e87836bed72a5071d99c3779005be7f0ef5987792ba0be6c2b4065a60",
        "wasm32-unknown-unknown": "46ed1ff62629da8a6bf921cea2e11d8b3ba9b6bc11e44e5bc0e50b7e75dbb161",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "aaa8ee8586ba70d709d8690a8953208d",
        "arm-unknown-linux-gnueabi": "cff3d753017ba019c2e515ea89c34857",
        "arm-unknown-linux-gnueabihf": "28efe5cb984be77848e00fa5a1c3ab21",
        "armv7-unknown-linux-gnueabihf": "b51d3188a974f200d9451cc023ba3a73",
        "i686-unknown-linux-gnu": "b311c97120e2ff0b00da710ce13480ae",
        "x86_64-unknown-linux-gnu": "ff2c6b5ca91bf553def0e113faeb3042",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "20a9b0ac8551fbf1dabfe888887682598a337ab779feaa326d2e95aab9d1e5b8",
        "arm-unknown-linux-gnueabi": "f990e18ef1b9329bbc2afce665a503fd3a29b9793ded6b0ccf3983a24a1db5b6",
        "arm-unknown-linux-gnueabihf": "49be48cc05fe46f3d408efc66a1e8ca2c0a64a3436d8be01401ba49ad4be7b5b",
        "armv7-unknown-linux-gnueabihf": "a3b1f2d6c64b937f6d697d840c4ef9e660f65222e0b8aef3ecd4fbf87c247042",
        "i686-unknown-linux-gnu": "8e90b82641a4f60276ca39c31fce2c901fd1318ebe3e6095667d070b53386bb0",
        "x86_64-unknown-linux-gnu": "529f12c8874f4d912059b5b1d012f0d67bfaa89b7669509a6a2df8512da3f124",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
