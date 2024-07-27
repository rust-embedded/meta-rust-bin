
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c7bce186e5e9c1e7e5fed9d1a7031b34",
        "aarch64-unknown-linux-musl": "bc4155694c8f370575ada90c024fba2c",
        "arm-unknown-linux-gnueabi": "ccd650f6182c4e01937e4a300c2ed9e1",
        "arm-unknown-linux-gnueabihf": "bcbff1de30d83ad914b9f88de5d297a0",
        "armv5te-unknown-linux-gnueabi": "b127fa0d883a9d2187ba744b1b4bac9a",
        "armv5te-unknown-linux-musleabi": "c8b0db1525a20912c1bca1d34786d273",
        "armv7-unknown-linux-gnueabihf": "1d8030094b264845d27c01ac5b12a72f",
        "armv7-unknown-linux-musleabihf": "1b1d887d36a43daa043866c75e090a15",
        "i686-unknown-linux-gnu": "de0c0bda3e2f5f4c74bbc3f72aca54e3",
        "powerpc-unknown-linux-gnu": "4072cffb22619ceab44c9c3d71a0285a",
        "x86_64-unknown-linux-gnu": "093653b92d0f131c51d383e7f08d8af9",
        "riscv64gc-unknown-linux-gnu": "eb089351d7e9f4ea9c9ac8784034ea84",
        "thumbv7neon-unknown-linux-gnueabihf": "6a3daeb50d4ae7fc832551696ca156f2",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6cdbe8c2b502ca90f42c581b8906b725ccc55bbb3427a332379236bf22be59b3",
        "aarch64-unknown-linux-musl": "7e901aefb3b6576bdca9a6a332c810d463e829d893def7c997754bfbe8494f5d",
        "arm-unknown-linux-gnueabi": "ab78f4ccc002443de840f22a2fc9357cee2594ca24605c44e264a5606d586dce",
        "arm-unknown-linux-gnueabihf": "888fdea6202b15ed8c9399089db74aad9cfb0328298e924c5e6161cbc55b25da",
        "armv5te-unknown-linux-gnueabi": "153b4f1cb1c3055b9f1053b78241ca6ef59302accae35953ca11aa5f6e24a33a",
        "armv5te-unknown-linux-musleabi": "576f41ab452d92392442a8b842d30a0bb0a79e0d6693bca5c0f3e324262e1886",
        "armv7-unknown-linux-gnueabihf": "5acec3391a6a67cdee9719c2a03e9059ad3b482872c94f8224a67e1f1f09d1e6",
        "armv7-unknown-linux-musleabihf": "74b950e2f39d9b4f2a639ce3f356d964d1b6fbc46db1d55a57439103c2c41254",
        "i686-unknown-linux-gnu": "3d2ff151af3dd0628d85b50614ee24d642079162483d9ebd37e364d02f9b289a",
        "powerpc-unknown-linux-gnu": "259306814c34c539a3cd0c3b8c6bceee836bbdb0e6918f32b82159029a03d957",
        "x86_64-unknown-linux-gnu": "ed301dff3a26da496784ca3de523b0150302fcb001ef71cdcd40ff6d5e2ec75d",
        "riscv64gc-unknown-linux-gnu": "08c016ed824705bfc7367613001dd6d7696e2d314767f96c224e9e8cdf998f6a",
        "thumbv7neon-unknown-linux-gnueabihf": "446bb691128f3b4d88d63c4688abaf5579846308e1b1fd86510676a58955210c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "87fd8714e3505b75e29191f43595616d",
        "arm-unknown-linux-gnueabi": "659608424410d5151ec6c5e107fde39e",
        "arm-unknown-linux-gnueabihf": "c69e45797a23d006b27508359624cbe1",
        "armv7-unknown-linux-gnueabihf": "e430bc631653916f070dcba40fb93f75",
        "i686-unknown-linux-gnu": "acb8bf613546cc81aa6e0d2c575fc575",
        "x86_64-unknown-linux-gnu": "51e03b01a3f2ad97e11796d67e0b5336",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "49465b52ce0efc35aa7b96e95995011a2bb6a7d4aeb052e204467c1edceb62a1",
        "arm-unknown-linux-gnueabi": "1fb14d6d8caf22c2d37b500ca8c6aeb170a893a8cb824659f236a63e66e722e6",
        "arm-unknown-linux-gnueabihf": "e9c5db3f9a231921ef553f1d07bbbb04c3a4ad29c138375fad90dd5768b67553",
        "armv7-unknown-linux-gnueabihf": "cc15913cd588572ae64599ac5ea73c8cd95e6511002220327ef5d30a5b61c2d7",
        "i686-unknown-linux-gnu": "58e95ac415363b90fd2158c3439c8a20117f2f3ceb7a2c3e03fdfacaad5aa2f8",
        "x86_64-unknown-linux-gnu": "383f59272ca8753bbe6c45135f2ea64d59ec4e73a1747d1de2c9345777223204",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
