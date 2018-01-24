
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "91f604ac62e01bf13f15dc1ff98ffb06",
        "arm-unknown-linux-gnueabi": "aba7c1c7d373b48660534daadb09aff0",
        "arm-unknown-linux-gnueabihf": "d3745dedaa6d2aaef1613fafa5c009c8",
        "armv7-unknown-linux-gnueabihf": "230a92b7569846686d18c9cbc22fcc5a",
        "i686-unknown-linux-gnu": "aebfe6a871a2da3d69d722dc71b6d3a2",
        "mips-unknown-linux-gnu": "b88bda2ab51fe8749ed5c68f76a2135c",
        "mipsel-unknown-linux-gnu": "ec99e8fbeabf52bbc918aca90e3821de",
        "powerpc-unknown-linux-gnu": "d80e1f04e4386525aa504d978ca87fd3",
        "x86_64-unknown-linux-gnu": "ac9c973888cc5d85572f3a242d43fb98",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c55f8cf587d56ce7a4c64be3e75a8e84e5394e9c123572a4b4d3caca58990bff",
        "arm-unknown-linux-gnueabi": "57acaaf25f66241cd8cf6ab2d71842007224a72d8fc8c139310a8cebc0af1a7a",
        "arm-unknown-linux-gnueabihf": "a1ac0aaf111febcaf88f8a43117f1c87a2555526f81c777d53be99ca4623d3b1",
        "armv7-unknown-linux-gnueabihf": "6273ca84d8bb497f4262c37e81f95bc521b82d823a723b5784dff88900185930",
        "i686-unknown-linux-gnu": "a7ae8a2c068d507a76897cb4833a07438b8f04389e96965ab410b3d2b43c7c02",
        "mips-unknown-linux-gnu": "0be94817bc17e83c34e087cf5e78e1fb23a109270707cc5798080dd7c3df3e7c",
        "mipsel-unknown-linux-gnu": "249ec949d0fc2a758aaf503a362335c6876b9d093293d4f9bb86ab04330c6461",
        "powerpc-unknown-linux-gnu": "8a6e0fefb0c23bb54e4a136f0630169bb7bcb50cda74fa5e6a494d2f8850b0c1",
        "x86_64-unknown-linux-gnu": "87637e4f669d42ee7334a02f7f92ae81a9c41cc569e9e3354b0ca84ec251b78f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6ab23a724f913d311db11db2e1e767f1",
        "arm-unknown-linux-gnueabi": "4878bf45b650bf2fa97e7d5f48bc3b33",
        "arm-unknown-linux-gnueabihf": "ae6fd69ec69fb166edd31997f012fd70",
        "armv7-unknown-linux-gnueabihf": "2cc452384675f19549f97508cb02cbc8",
        "i686-unknown-linux-gnu": "53fc14f02750f17391fa3925b8076473",
        "x86_64-unknown-linux-gnu": "c66a083f0b8add2e85c50b5146c67a2b",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5b047438e96c6d3b17f0407af68420c0a5c28516ad6e8af77192d00813b1257c",
        "arm-unknown-linux-gnueabi": "c32dbd2d7bba22e0a3fd7b12b4bbd43ad9006a5174e25b58b78061b762b29b58",
        "arm-unknown-linux-gnueabihf": "ceadb2328b6308f027ce3aefb771ae441416bc7fc4d3bd35f08b490c783c37c8",
        "armv7-unknown-linux-gnueabihf": "a53ecf28a5968ca6c8b472ac7f02efd51a85f6340ba5661f6047108cd4c4fe6e",
        "i686-unknown-linux-gnu": "506bc2d49e5e71d143459a95b67d16b257c69a9c155219a87b80aa84732f4ddf",
        "x86_64-unknown-linux-gnu": "abac14debf905a8beeffcbe6d168184de94fef3390f1d509890e32477a54cfad",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin-cross.inc
