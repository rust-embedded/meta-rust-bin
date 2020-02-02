
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fd418a7252c80c892a04ca462a77ac0e",
        "arm-unknown-linux-gnueabi": "abadeb3a32348919170d32acf7d8a6da",
        "arm-unknown-linux-gnueabihf": "1bfcdb7d5ebb18dabf0e798f9c588c1e",
        "armv7-unknown-linux-gnueabihf": "8717c64f4edbd7febe232c62a3d02b8d",
        "i686-unknown-linux-gnu": "82e75d70b4675ffac56dfd91c23c7369",
        "mips-unknown-linux-gnu": "faf431088e0c1cb2d4d119acda282939",
        "mipsel-unknown-linux-gnu": "e32dcf93ea021f3052fbb7fa21cd4f16",
        "powerpc-unknown-linux-gnu": "fafa65476f4f66b71f8cb1f5a1fa3fa7",
        "x86_64-unknown-linux-gnu": "3515a647401436d93289dad275445713",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "64410910d73628a77dfe94dbcd0cd49709b518b5f641fbe4a2476b9af097d47b",
        "arm-unknown-linux-gnueabi": "8c2ea7c66a86450561234df8d07e4cff6519db93626a149496e187690dca4aeb",
        "arm-unknown-linux-gnueabihf": "cd21b66e983a390ecbef87fafebf35f299759dbc821e6f775cc49c57d16a0f9d",
        "armv7-unknown-linux-gnueabihf": "18c6cbe62105f2808ba8fcb785e5dc69e540e6fd1ab21dd0f3f2a6dac33c17bf",
        "i686-unknown-linux-gnu": "88aadaf4dd4fdf565a72ec822e08de5c6a72d3784fc378b82689f2843f8da874",
        "mips-unknown-linux-gnu": "2047ed1e53c44fc12a8e1f84f629eb7a0aa9511bccc0cdec20a1b00c52a59ddd",
        "mipsel-unknown-linux-gnu": "3d6076cd1a2a1081f265b87f143090cb6dfd63d18cc31a85084a3bbd3a2ae56c",
        "powerpc-unknown-linux-gnu": "63b8c63c487a759a2c00cc094b7752b3f8df2367c88d4f6a71eb0ed34fd70cfd",
        "x86_64-unknown-linux-gnu": "12c4b164efed44c28096fcd141225ee9bf74e7e3395bc6a60c11c9115a0536c6",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0e15561c170d7a7d3f0221a549000323",
        "arm-unknown-linux-gnueabi": "5b39383ae231257ba3fc8f731856d3f2",
        "arm-unknown-linux-gnueabihf": "3af277292572242424f27500bf0885d5",
        "armv7-unknown-linux-gnueabihf": "cac86321371850b5b96793c1920bad84",
        "i686-unknown-linux-gnu": "b28f7e17ce2b11597fb324a1b6ef1d77",
        "x86_64-unknown-linux-gnu": "195712758f05eb251dd212a803d83883",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f3569c0a74f07aa2e56bf93c9f2aaddf7434ce17f85d6d6ff854fb9245888bcf",
        "arm-unknown-linux-gnueabi": "0946d2b637a4474d55408f7a0528f3dbfd2eea60d316880e60c9f05288deef4f",
        "arm-unknown-linux-gnueabihf": "8f50c7c6e54b1c2fa79029a32a6dd3b4cbca33c6628442c958c094aaee47f64f",
        "armv7-unknown-linux-gnueabihf": "421daec92b7be355072e94ba51712f5a3aa4401973ac4a6eba8b1bd1efa1c516",
        "i686-unknown-linux-gnu": "7259121446e2ef579f2a3ed24c8a54a85a2a1a8d5ff517a0249ba3639ee989cf",
        "x86_64-unknown-linux-gnu": "d84de208499b59e4a3c074f9f3f2fcbb26fb20d6bfd19262e6d5f4181ddbe34d",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=66ddc8ecd998476b7cd5732e8c3a6c1d"

require rust-bin-cross.inc
