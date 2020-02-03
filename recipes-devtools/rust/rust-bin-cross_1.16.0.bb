
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2ccc7a28cd2215479cd69ee46bb8316c",
        "arm-unknown-linux-gnueabi": "5869e3c8b3d1382ea6f00ec8413d608d",
        "arm-unknown-linux-gnueabihf": "257defe4dc2175965eccae2dd9e40f06",
        "armv7-unknown-linux-gnueabihf": "24c11f7ce6009fb558e76baf20421b55",
        "i686-unknown-linux-gnu": "2944870b1626d1c059718c1c461a946f",
        "mips-unknown-linux-gnu": "af64121d2c89c88530e1f0873dd81dc9",
        "mipsel-unknown-linux-gnu": "3405d5df0f8ff59e84d93c67f190e57d",
        "powerpc-unknown-linux-gnu": "fcc7896e902fdf519046f695ded0f1e9",
        "x86_64-unknown-linux-gnu": "033c36a8dccd54f5e417dbd137cca1be",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dafe92282dd5ca67f95c5b8cc2a729b2f8cb04d6e30c6d790819a27f0119d8ca",
        "arm-unknown-linux-gnueabi": "b220d8c0fd1a5039b91181fd083e96c9b48c71fb5892e98ec99e60e4ac4bb29d",
        "arm-unknown-linux-gnueabihf": "bc7846a432d672995bf7ef349a79ee422a003b808579996fe0a30f335dce16f4",
        "armv7-unknown-linux-gnueabihf": "dd6869bf2d2f31711d327ac9a5e42667a65b3fa9476e36a4c6418cb1cc5109fb",
        "i686-unknown-linux-gnu": "5a74e3661f4b300bf73353389acab097f3e07813b0f3073007830a549656054a",
        "mips-unknown-linux-gnu": "0d2f91ce61e261e11f44732ea3bdf04c2dd498f441b89b3ab1cf0eebc6d0b8cb",
        "mipsel-unknown-linux-gnu": "deeade93a16fa3c2258fb11ca2cbc31fa22e721c89f5db7457ac233351efe073",
        "powerpc-unknown-linux-gnu": "a8faf140202c3ad35fd335b32c4b0ce14aad0ef5b9485b9a542b1bb8aa495a7a",
        "x86_64-unknown-linux-gnu": "cbd43de2ab819d3332ce309046f3b5d715c1b47877a237791b99c96b1fe0d555",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d237f012426c38e6ffe0705711f8dcf5",
        "arm-unknown-linux-gnueabi": "96ce680f007c5196a9be563a00723115",
        "arm-unknown-linux-gnueabihf": "69fb063d3fd974bcd64980a2f26aa239",
        "armv7-unknown-linux-gnueabihf": "76eaa614bee2d8fd4233942337869c85",
        "i686-unknown-linux-gnu": "9059260e519f602f73148097670984a6",
        "x86_64-unknown-linux-gnu": "b4a4b5b48c0e23b7c87687b60254df45",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4ef8377e0a118d3a90b16b0c925719bdda521aa9392c64e4b65a272d26fae50a",
        "arm-unknown-linux-gnueabi": "e4e8d9f06204709899bcd25a9d1b8cf5d6ec014409cd0c24f98e10351540e3d0",
        "arm-unknown-linux-gnueabihf": "8ea4188d46e44588e30d51d296666d1609429365437ff44f6d8b3b6a058b1827",
        "armv7-unknown-linux-gnueabihf": "9f90916ba8b2e1abad66843bfcd2881ff928d530eaf2dc5249a0865e97209f6c",
        "i686-unknown-linux-gnu": "f8e0f96c17d8345be7818035e9bcae8e809a1b13635fe9a322df4a82d6dd1275",
        "x86_64-unknown-linux-gnu": "b1dc3f754eeaf03891a3bd398c8c5024404c0078a334e5d8795e9dc419d147b3",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin-cross.inc
