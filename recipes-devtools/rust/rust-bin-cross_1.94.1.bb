
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a649062b2b6d4fb8d16f3f0a990fee23",
        "aarch64-unknown-linux-musl": "e58cfcad7b22e5fa7977a2c0e8a3cc4f",
        "arm-unknown-linux-gnueabi": "5072f092b5b95ae0934aa02b4ab558bf",
        "arm-unknown-linux-gnueabihf": "b4b2736b9dfd3c330e2401c394a7370a",
        "armv5te-unknown-linux-gnueabi": "a0a075d5a5ebdcbb8cc3c59521a6f15c",
        "armv5te-unknown-linux-musleabi": "cb7eb34f9bdf1a24336645fbad57edbf",
        "armv7-unknown-linux-gnueabihf": "0c4b5006f5455ca40c65f7e7068314ae",
        "armv7-unknown-linux-musleabihf": "8c17441e37855f50b8f80c68526de163",
        "i686-unknown-linux-gnu": "d8dda7207de5372c5d38cef39b139ccb",
        "powerpc-unknown-linux-gnu": "69334d47729d874f690e18ba4f61b5e5",
        "x86_64-unknown-linux-gnu": "cd47affc509f9ac8096597e184393f0e",
        "riscv64gc-unknown-linux-gnu": "fc3141e84ce48a86347b9dea2f715f0b",
        "thumbv7neon-unknown-linux-gnueabihf": "5d6e9d0a4cc3e167b9573697ef72dc39",
        "wasm32-unknown-unknown": "3da124fe13be78faf0f4d67057088d8b",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9166355a067f1807d5f434202587554b71fbf40ea73de65502322684e989569a",
        "aarch64-unknown-linux-musl": "cc079f4224ac54742c7266c6561a908d9e47ba37e36b0d4b9d6d6a24e6944515",
        "arm-unknown-linux-gnueabi": "b52c4b90988a2bce48744925f8743b9529d37c9f1d6850624bd29e5b7284c4be",
        "arm-unknown-linux-gnueabihf": "0474a3753f68017ccee8653dbdb3d55fcc683f696d09b2da419e7838b5140a09",
        "armv5te-unknown-linux-gnueabi": "1a035687b5495f3b70a26c20954e11dff3649ae2ec390886093ed8dacb571944",
        "armv5te-unknown-linux-musleabi": "90ec24da3cb78f6b256087db63231211935ebe6e3537eae52fa68c4ded3f10dd",
        "armv7-unknown-linux-gnueabihf": "1d76a291566652b59d94961ad575e03d5ddac1afd6f666cd21f6e3c5ffa3f346",
        "armv7-unknown-linux-musleabihf": "bfb36c0e58098047b91b7df721a7ecbf8361ed5eb3ddc2c3a0eac7179f75ca35",
        "i686-unknown-linux-gnu": "7fa6162011f57419fa2becdde9229ff3a6a209c5e20848f725606589b8b8d881",
        "powerpc-unknown-linux-gnu": "299d9237c885ed66819d78ab283621b5dca893146fc0fe97d9ef6939401738d1",
        "x86_64-unknown-linux-gnu": "2d18871ef4ee2a0a7b8576529a5780f6672d5d5a828aa396fe4512fadeeab792",
        "riscv64gc-unknown-linux-gnu": "0f68fa7ba111f2b8ce78ca66843c9e90dfaa8ff0d626141201cafbb2a7a19b59",
        "thumbv7neon-unknown-linux-gnueabihf": "5ca266714744eee8a19dd75942c040b61095d2f04f98d4d9d3fb641d5de61b5e",
        "wasm32-unknown-unknown": "d9b438eae15a462f6a3ec54a5ec18f951acbed1511cf7187839bdda27ce9ca2c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ea44cae5d11fcb252fea0fd57a0783c6",
        "arm-unknown-linux-gnueabi": "780635ae432fab8ca2bbed6681b43fc8",
        "arm-unknown-linux-gnueabihf": "0ed39db41f98f1a92484cce553d17d36",
        "armv7-unknown-linux-gnueabihf": "a7f73f8b34c8c347086a313bfee3452a",
        "i686-unknown-linux-gnu": "6815dab8f517102fb55812a6da087abf",
        "x86_64-unknown-linux-gnu": "35cc785cefbd2adea01b7bc627d2e18c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b308b58548e7ffe5603e3b8de5982200e020f2fcf701f9adfb5a2e90c9b76471",
        "arm-unknown-linux-gnueabi": "cdf914eb66b39f01a7465d5105cd2e297127be2cad11d3883832b9fa57117fe0",
        "arm-unknown-linux-gnueabihf": "8b1fff2d9e9f9e037fe297a17c983527a3915bd02b8e5458fd55af477ec0c940",
        "armv7-unknown-linux-gnueabihf": "9a7ddf7e5e3f2ff8e57e22eebc42e28fafd370b92df6f45252ae181fa3e29d91",
        "i686-unknown-linux-gnu": "94c6e1ca4617e5a34213535da06a4204b3506d77dcc1424caaf0a3cfbd0127d8",
        "x86_64-unknown-linux-gnu": "83b2061ce39408de3f0e7e100407313261db434679cd399f24904f5e1580558a",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
