
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9095163ce2e5a32452ac9fa82c34fab3",
        "arm-unknown-linux-gnueabi": "79542666656986631d5f9e6a0fc5deb4",
        "arm-unknown-linux-gnueabihf": "7e6b8991537031404161fe8f57a29cad",
        "armv7-unknown-linux-gnueabihf": "6909a564b31ba45539e6db455250680d",
        "i686-unknown-linux-gnu": "41c208f583e153051c4426219b1281fb",
        "mips-unknown-linux-gnu": "ba1f119c0b747b3d72d216a977c93b69",
        "mipsel-unknown-linux-gnu": "72e6d1bff9df129078087e5f3dd96241",
        "powerpc-unknown-linux-gnu": "69eaf8a704b699d95385aa7790507275",
        "x86_64-unknown-linux-gnu": "5e644ee49ce9ce449824f9f0a4153409",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "346efe3aef2aff7b71a611bf7661bcec5f9bc4025a599c2866ec5fd330247cb9",
        "arm-unknown-linux-gnueabi": "154a885326a8c88d7e57cce1a9986ed181c359763b3559d6d429a1e41c93e282",
        "arm-unknown-linux-gnueabihf": "fae70593f70281b5f4f7d6dd258f10748e90ff3c6b14bd5f7adc698b82a5ea4f",
        "armv7-unknown-linux-gnueabihf": "ac6946bb4df718905fc1b9411c624941d69d3382f3584ee1cb0031936c700b2e",
        "i686-unknown-linux-gnu": "69bd6064f605c1d0d7d41070efea1e329d75755b04fbc5a13ffc53efdc3a97c7",
        "mips-unknown-linux-gnu": "9db305c423cf4028f6286da4a7b393725eb4cdc05bf31453b851cf9b6bb8dfe1",
        "mipsel-unknown-linux-gnu": "b81be4fc674f837714be0bc5a895b79c0476dae4567dc6e785b84e6bc9558dd7",
        "powerpc-unknown-linux-gnu": "29c7215dc3fec15e9ca2c4a0296d0a010afc48786e44f2e87d70724da25f23bd",
        "x86_64-unknown-linux-gnu": "9f2705a3ed3217c13fd55569406c52f590030752f57520312e135223ae930caf",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a28f5b020d766520c9f526249978e1a5",
        "arm-unknown-linux-gnueabi": "5c47abd25413e34bd3dad1bec336a307",
        "arm-unknown-linux-gnueabihf": "f484c44c40d4951504f4888f95a3ae83",
        "armv7-unknown-linux-gnueabihf": "16009dd6249faa6227078a4df196b921",
        "i686-unknown-linux-gnu": "d0aed708600340febff64f9c37250b08",
        "x86_64-unknown-linux-gnu": "e8d74f3043fb0b566f6af0110a73af7f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "193cbe67161e20a0bf4eeb8bafeb302f3e61a59ca939a0454fc3fbc76e9524cc",
        "arm-unknown-linux-gnueabi": "018a78da144d8db89205d11d72868eafef3b60d487e01273fb6f19e9cc0d668c",
        "arm-unknown-linux-gnueabihf": "7b2c470279fbf5e5adc9796ffd4c0e3d7bfba3d17a06fe4bacb75b80dc2ac71c",
        "armv7-unknown-linux-gnueabihf": "489ad13952fa6e70fe7a030a5f4f2bef542e11cc98c5970985b9003afb743a85",
        "i686-unknown-linux-gnu": "45e633c985c259a13d3b096662241bd8255a86ed4917e0fec396e7071c04c734",
        "x86_64-unknown-linux-gnu": "75c31f32e19548c1608611d08b82b87560e02f15caac7b2663a8189a4609977c",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=66ddc8ecd998476b7cd5732e8c3a6c1d"

require rust-bin-cross.inc
