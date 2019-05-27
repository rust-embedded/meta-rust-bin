
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "801ff1a95c92f3acab57738a67e23b26",
        "arm-unknown-linux-gnueabi": "dafaa4e1c1f081cafe8c7b5a689deb43",
        "arm-unknown-linux-gnueabihf": "19a8e6e4a4336bc3103b63c9f7de8fac",
        "armv7-unknown-linux-gnueabihf": "0bf8a78c8c23241f3943cf79dacfe66e",
        "i686-unknown-linux-gnu": "458d8f7465372ce8ccce163c6af63243",
        "mips-unknown-linux-gnu": "7a6edcc9d6cd98025cddf247bef9027c",
        "mipsel-unknown-linux-gnu": "8c6dad7f9d4f78ef245e5bb17838333e",
        "powerpc-unknown-linux-gnu": "1f7262bc0bddf32c7fa1420084dbc5f0",
        "x86_64-unknown-linux-gnu": "5c58d2b6b7d9b9a600d36742b5391b94",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eee3c6a5c7ef5bc21b626ce350b0e1b02310e0463b6686683262f3fef400746d",
        "arm-unknown-linux-gnueabi": "fa3b53ac36eaddb5250985a2af8bfcff9c8a3baf60262b01c11594c2a1583d79",
        "arm-unknown-linux-gnueabihf": "8a8b31c3c1086219a10f2bffd6f8bcd13da8b254e8162dbd79a38b33bde49fa4",
        "armv7-unknown-linux-gnueabihf": "8f62b615b728e38ab350eaf4f20a81c423e1ac33b51b945960500380326ce248",
        "i686-unknown-linux-gnu": "ab41c886af02a16a9a38780043d7f3da24c637629afa222b38f616fe6de86402",
        "mips-unknown-linux-gnu": "3276d1be3ca2942115bf5918277c1d00c38dd639630279749cde4de6b544df45",
        "mipsel-unknown-linux-gnu": "3edabc96c999400725050c2f330482752b2c6b7076c4210f5874e7e0ac20ed71",
        "powerpc-unknown-linux-gnu": "6998070a6bc56ffa788078cb2afa28e1c54c88f70091e319f3ac3a45e8bce40f",
        "x86_64-unknown-linux-gnu": "5dfa92661ff1a22680785bd6999b6117ae66841e2bd9e5318eb97002956131e4",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5f8cddd52b96e4ebd5db6609b0966dd6",
        "arm-unknown-linux-gnueabi": "812bc08a98b8bbb20e41ded92f62bfe1",
        "arm-unknown-linux-gnueabihf": "9e26ef9fc4698a49f458241e2ce54b6c",
        "armv7-unknown-linux-gnueabihf": "44c1de5e74c0c9ca79a05b0f36b6fb16",
        "i686-unknown-linux-gnu": "5a7d7128e98e0c62d82c748cddb8496c",
        "x86_64-unknown-linux-gnu": "2942b5ffa86e243b46f20fe3ac2f4d64",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dc06d77e6cdc06693d3b87ce473f151c96bda2c1e5dbba8c0354c54990c64fc2",
        "arm-unknown-linux-gnueabi": "04b87df1511333321bdb68d1da5fb3c98949b7baa8507ede8c8b911ca160ac2d",
        "arm-unknown-linux-gnueabihf": "c7a0a4ffcdd26c0dabe8e1e985f877c9bb0b0354ef35476460c97f3c0e14b733",
        "armv7-unknown-linux-gnueabihf": "4eb787ac84d5368c1323160134d641145826a0f5d5b42066752533eb572503e1",
        "i686-unknown-linux-gnu": "b05ca05cfb6f106f92283bb06158845f29abb3c1145a8dc306d2aa210f42d106",
        "x86_64-unknown-linux-gnu": "bb3a07a1f2fdc3eeeee25fc40131d3f05494e3838dfd4e9275475ffc500d7a9e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
