
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9c018b6424e6f4f422ad2460e5ff7fe5",
        "arm-unknown-linux-gnueabi": "1c13d338132e3b3777ec53b340de4761",
        "arm-unknown-linux-gnueabihf": "70f41fd91be7efa59c06290b287785ae",
        "armv7-unknown-linux-gnueabihf": "ce11136f6519a4ed87876315061ba37f",
        "i686-unknown-linux-gnu": "48507590e56854ab5d2bc672b75568da",
        "mips-unknown-linux-gnu": "9e72aed0c9add269caa32ff7a8529fee",
        "mipsel-unknown-linux-gnu": "10bb339e10f10d280d9397fb35d090ae",
        "powerpc-unknown-linux-gnu": "ce877c610496092fd4487bfec6e39893",
        "x86_64-unknown-linux-gnu": "f9f89caf41e3f9c092118272ceb5bf6b",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e0e5cca6acec2439bb4925ac43c92f11b7336f8aebec8648d7c49ecb5110a740",
        "arm-unknown-linux-gnueabi": "803526cf163353235bb26274a43e3c76a4c321a53e43be8cca8a3897c8d12029",
        "arm-unknown-linux-gnueabihf": "12113afb1def70a6ae27843c37d6a55ec5692a1cf6fe2e518306a1c23756acdc",
        "armv7-unknown-linux-gnueabihf": "85d0384e8d4b29ab98d8235f304a8ff2dbec6eb483e2eec2867a22f107307776",
        "i686-unknown-linux-gnu": "e39b3a60898026ad01bdb136e0a58a02a9da61dbbfb348661e6fe199923617a9",
        "mips-unknown-linux-gnu": "1a504b5965831d376ae9b7af56ec94ed9e84975f867ee34f3bcda88d94abf674",
        "mipsel-unknown-linux-gnu": "7d504034c3a0c2bfec1132b84a24139900345a5a6ac97341356b3b596b414ad6",
        "powerpc-unknown-linux-gnu": "8e3efe3e9201f67e2bb959d7947320adc6ab2807e201d714e5fc9b2f2cc143b7",
        "x86_64-unknown-linux-gnu": "83c7351bdc4326caf785c208cff86682825dad4a89ccee705fa05f55ce7bd25b",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8a33e0c8b92804a280e2df39ce9184ab",
        "arm-unknown-linux-gnueabi": "9374f161d94606772acaacdb70d81bec",
        "arm-unknown-linux-gnueabihf": "868bef7f223a6299f0c148503143769f",
        "armv7-unknown-linux-gnueabihf": "3162bead042ac3aa0d3a560763a85953",
        "i686-unknown-linux-gnu": "d38866fdb43baec3c53d05b37e165b1c",
        "x86_64-unknown-linux-gnu": "068fc6566772c4ce165cc547151f514c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "26536a06b5f88294780733eae48b8200aba3ef723e6cd649ff641d6d42e48fa8",
        "arm-unknown-linux-gnueabi": "e7927dea3bfc2eaee42fab5f31cf1b96106b39841c63193be7b7772d381b262a",
        "arm-unknown-linux-gnueabihf": "56492c6fa722c94c2882d0c10770e69138a653cfecc4e81121b772a0f44e53cc",
        "armv7-unknown-linux-gnueabihf": "f5166a422c2ce02b97c6c5e699665de10eed61155156857ff780695b6b7ef2db",
        "i686-unknown-linux-gnu": "bbfd1267f57e70c7e6d3b65e7b5d577c97e647b4326abc890d84acc236a6fc47",
        "x86_64-unknown-linux-gnu": "27b124fd0d94c082978ff81e45f7b7c37e91d64714587829bf828d64d76524ee",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

require rust-bin-cross.inc
