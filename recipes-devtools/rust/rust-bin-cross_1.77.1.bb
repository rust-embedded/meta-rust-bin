
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7785f2ed358a49de0ccb4ee0dfc200bf",
        "aarch64-unknown-linux-musl": "87c4e16e5a2d186d5fd52dcbe2480cd1",
        "arm-unknown-linux-gnueabi": "71b04d4b56c025ebb54a300aae5f1165",
        "arm-unknown-linux-gnueabihf": "fd24f03a2531a8bbccd6a1a36fe21d8f",
        "armv5te-unknown-linux-gnueabi": "b761910377ebaabaad8d5edb21d19e9e",
        "armv5te-unknown-linux-musleabi": "29b830bacf4dccf2f8f62479bdb877b6",
        "armv7-unknown-linux-gnueabihf": "3e00464e42ef751738f1a0eabcf832b6",
        "armv7-unknown-linux-musleabihf": "567ebbcef0a145afbc326c9e462f0318",
        "i686-unknown-linux-gnu": "d286b9621edbe0240c55f7e5d1e1ab31",
        "powerpc-unknown-linux-gnu": "2cc94c177812830241e09bce45e58b67",
        "x86_64-unknown-linux-gnu": "abe3cba26a5e0b02d2d7d3f7c2066a7e",
        "x86_64-unknown-linux-musl": "381adbddb2fe4fdb07eb2a11339a78bb",
        "riscv64gc-unknown-linux-gnu": "08a0a9e3d12659366f3f9b972c62356d",
        "thumbv7neon-unknown-linux-gnueabihf": "589ef17b75d9396d278e0806584d2052",
        "wasm32-unknown-unknown": "219b0186cd97958c47b4fb2787ce603a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1292f031a4209e3905e3dc079a25f44cc9f0e6ef5ee9bdc9566f48f9007d4173",
        "aarch64-unknown-linux-musl": "41875443c3cb229c144f2926a4f3c8c59088091d38e6bc23f9950c5064305731",
        "arm-unknown-linux-gnueabi": "d7340f93ef697b87edd2e0c7ca4fccf27b0be255975c38af4374d72a4135d829",
        "arm-unknown-linux-gnueabihf": "f67930b67f8db2a87251b52fb407d26491ff2e8e06265234d4ab8760673a01df",
        "armv5te-unknown-linux-gnueabi": "0f37d3acf5a6f1749f3445a7e4f3d56ed52728a8da116a44df7785603950fefa",
        "armv5te-unknown-linux-musleabi": "91a02f27bb7cdc2ff4025047313f88bb2f40fcd39e21520e867e780b1ac7f2bb",
        "armv7-unknown-linux-gnueabihf": "e258f7c94bc0f176713eef95eeadaaea7558b8f42b5a0dc68fa6dc0c7661e35a",
        "armv7-unknown-linux-musleabihf": "c8402a261d86b6ba53f3fb85410d0a679e065452c1bd255015dfc17c6ee2203f",
        "i686-unknown-linux-gnu": "465a1d77d7c5935d3eb7abe2dae2f2c63e755a89d5282b390c0122baa3d70311",
        "powerpc-unknown-linux-gnu": "dcb9be262c0ae2b893f5f691ba45823745b4de8353ab012cfd1eef030afc84d5",
        "x86_64-unknown-linux-gnu": "eed95cb4c951768eeec372c7a20f5e074837315dc0d066b4ec79620ff26f657a",
        "x86_64-unknown-linux-musl": "2597293e8d2b5be05baa8d1581e0da5ee3ddfa49dfb154336fcfab00bce0909f",
        "riscv64gc-unknown-linux-gnu": "b0fa4d4b551acb8c58f41b8b212cbc76b9e1e9ef3f35d2b30a9e364894901646",
        "thumbv7neon-unknown-linux-gnueabihf": "484beae3fe1d1396a919ff35df9fa52c9b3872ff175dd3e3a792a41424292d21",
        "wasm32-unknown-unknown": "aeb8e4a596933e2ea0dc857eb15a12aa85511454f9c5cc9aba5f4ec61ed91870",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0ba27123189ba52b2996a3b739c400f5",
        "arm-unknown-linux-gnueabi": "f27bfbcec9e51c7e3abbd2b3a89552c9",
        "arm-unknown-linux-gnueabihf": "715370015fe8823defc201420dbe71de",
        "armv7-unknown-linux-gnueabihf": "ce65a8b421f405e565f7a2c964d413b9",
        "i686-unknown-linux-gnu": "0ca113d39f6e422833b4b849583b2c99",
        "x86_64-unknown-linux-gnu": "57e506bb5e07c35b21c4ba3ca7eac694",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e98b495a4b6029bc298a32670f718438fded80ebba5dec00b03e45f2b3c0ab6b",
        "arm-unknown-linux-gnueabi": "b806106dc884927ddbd44296af630eb7c5595202913e2fb1a16bc38c223a56af",
        "arm-unknown-linux-gnueabihf": "a5f0f9a7a5a5a1c2320ecc48268bda81ed087c82aac9f1bee14436cb21c49780",
        "armv7-unknown-linux-gnueabihf": "53a88de4cae7eebc97057dbc5fb0dbb8c840e340a68087e0bdaed2d8f7ba20c6",
        "i686-unknown-linux-gnu": "f4381aac7ff4a13ca841e8d7a64f025f220450eb1d6f983dbd9b42676262e0a9",
        "x86_64-unknown-linux-gnu": "9d81e82d202be160c7f6c2d3006845ae5b315d210f875acb8f64380e3df7d36e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
