
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "11e34cf93738338e0f2c0a61c56d6e12",
        "arm-unknown-linux-gnueabi": "f1562b674761de60d0352f7db808261a",
        "arm-unknown-linux-gnueabihf": "110f26f2e2e341c15b04d9c867db17e6",
        "armv7-unknown-linux-gnueabihf": "e86f288440aa251bcdcd6bc22d0faba1",
        "i686-unknown-linux-gnu": "b3bb05fac38c5f483b4ea3d51ae81e3e",
        "mips-unknown-linux-gnu": "1f0e8439df27740fa0df2675944c3c4f",
        "mipsel-unknown-linux-gnu": "6852d5017a7a82f7c6abfcd31475897b",
        "powerpc-unknown-linux-gnu": "ddd406bfeb638853666938491ad17036",
        "x86_64-unknown-linux-gnu": "3c75138f709f533a87835ffe5be1ae25",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6f629b8c3ef8aa4a6c9439a5c1d8719905853f321a1080bb9f8a8356a1b06364",
        "arm-unknown-linux-gnueabi": "b8e6cd048ef21195386caa6f204a0480d102715a53f6ff55a9df687b75dd3652",
        "arm-unknown-linux-gnueabihf": "79ea9e2c993ad047a86c4c347c08afaafa4280a659cfb6f156869a5730f58e4c",
        "armv7-unknown-linux-gnueabihf": "420d6cff015215f47a407b19c9b5f97dbca402818e4093636bee53c966c3e6ad",
        "i686-unknown-linux-gnu": "b5a8b098338732ee39004c53ecf994b01ad10c1da6a535187864003ef532f9b5",
        "mips-unknown-linux-gnu": "eae02765faabc323683dc27b0a3c524c706f6779ed4a1d261076abdbcd7fc0e5",
        "mipsel-unknown-linux-gnu": "76b8c8881e0b584f1c6fd1385e1933b8b3704eb4ab7ab9848b82d253d65d852f",
        "powerpc-unknown-linux-gnu": "4f7a5e86f45b33b393f8a691ae33e229330a3d862f85893f477e42704446ced9",
        "x86_64-unknown-linux-gnu": "91634f05bf2d0a20e627aed08a8450673acecb963869273221de17130540fb26",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8d21854730d9f83d3df265ee6e1e7187",
        "arm-unknown-linux-gnueabi": "0c4ec78053df36a4b3739976304e2941",
        "arm-unknown-linux-gnueabihf": "08020c5e0cd1c48166f9231bc438a786",
        "armv7-unknown-linux-gnueabihf": "8a1b559c916d4a2bb7b71c63413abac5",
        "i686-unknown-linux-gnu": "d7ba8bbec480170adcf36c8a396b9e2c",
        "x86_64-unknown-linux-gnu": "17ab5a90490ea4dcf3ca79f7b6c2b025",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b09fea72e259811fcbc6aade942329bc4588356470765987ee37d6108a82f7b6",
        "arm-unknown-linux-gnueabi": "3e3c920ef0be7820b24945152a3271ae6b7a3f195b90e53c732c211abd085259",
        "arm-unknown-linux-gnueabihf": "a5ad7c82818bd49a848635729386075fc2f6bdab4d87b294bd6c5119f576e2e2",
        "armv7-unknown-linux-gnueabihf": "43534b0c93380fbc0749ced9a2c187c7ec7ecc24fa287585cd9b4d10f7fab5f5",
        "i686-unknown-linux-gnu": "48f104571f436c2a99782e998eab149d33f1ee4f6bb88873fc360b941ef98e59",
        "x86_64-unknown-linux-gnu": "1ebdafe52b581a63cea217a036fd6e77706d2715ae9cfe10a8c715d753326004",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
