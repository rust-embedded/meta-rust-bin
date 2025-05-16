
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d9366144cc4dbb27160c34c2f8b729e5",
        "aarch64-unknown-linux-musl": "2ff735bb898a8c1bfeb306feff2d6fcb",
        "arm-unknown-linux-gnueabi": "d239cffca8df336cbfa5d5f1d6a44bdf",
        "arm-unknown-linux-gnueabihf": "65d71414fb2bedb36b0106587b608964",
        "armv5te-unknown-linux-gnueabi": "5c6f7a071c6c34b3d35a40102f4cd9b8",
        "armv5te-unknown-linux-musleabi": "2378a873a0bfcbce4cc7d292f8ce6ed9",
        "armv7-unknown-linux-gnueabihf": "fae459613a71e9d02a6787caefd8d846",
        "armv7-unknown-linux-musleabihf": "70b9e84fbb6b7c6152241dbd56f640fe",
        "i686-unknown-linux-gnu": "833b4ad3f0c867a5c586ba6ee50b9a06",
        "powerpc-unknown-linux-gnu": "21377b08a25c8f186418b43aa3499f6e",
        "x86_64-unknown-linux-gnu": "5e2e420ec306d9f0de726ab2668cb038",
        "riscv64gc-unknown-linux-gnu": "e4281aad61372ca6aadcf83fecc42b26",
        "thumbv7neon-unknown-linux-gnueabihf": "8961accea107029188254d66333ff652",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b9b2c50c2fde2a95fbb9769393c9dd02b1a97e43e0ec2edd1ac4fd4475fe82e7",
        "aarch64-unknown-linux-musl": "3c1280458a806f784b4437bc72cd6fe04b749724cbfc77c52339a7f93d99a78a",
        "arm-unknown-linux-gnueabi": "679c9f28e1ac9f01999c94c7215ededdaa25ffc77919aef67f0c55c4186987f2",
        "arm-unknown-linux-gnueabihf": "ec8c55bdb4884e6ef3320cc670cf9f9559be0d916890f91d529d2ca57ddc861a",
        "armv5te-unknown-linux-gnueabi": "58a7df09434edb40799c8fa09fbfca3732a3aee560a776044dde9876204cfc9b",
        "armv5te-unknown-linux-musleabi": "8b232fc09eb5c97ba3042a184b0204a00c767c39bb3c8d87c67421de5419f61a",
        "armv7-unknown-linux-gnueabihf": "e438399cea75d0d7b1b679a05aefaac8239e23bc3ee1504416282c6d2f443457",
        "armv7-unknown-linux-musleabihf": "72e539e46fb3529ac2e30e200d5915fe3599db2210833c3377ec910649ae846d",
        "i686-unknown-linux-gnu": "0455d9d0570090d08ce905088233aa7708794bdb915ece8aed6aa3a38cce53f6",
        "powerpc-unknown-linux-gnu": "4ef6a6f32ac977cb699510d154ebd2394acd2466738ce728a04b1fe4763f6864",
        "x86_64-unknown-linux-gnu": "68e2cb00d28b42caea0d07be6fe603ef28389dfb02f19013f2c57e5783831328",
        "riscv64gc-unknown-linux-gnu": "ed54c611c8a80fb2850be077b1b3fec44ab12a65cef239a8b731a2f9630ad79c",
        "thumbv7neon-unknown-linux-gnueabihf": "15c39e11dd231a9630aa63b1b103101bfb8bc8bec14fb92da7bdca1fa852c163",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c10eeb0ef653ec81a1251abf6a0e9893",
        "arm-unknown-linux-gnueabi": "43c9534813acdd7438b7678b6dfb77b1",
        "arm-unknown-linux-gnueabihf": "36ff406de6c46559e4eb8abea5cdd8a5",
        "armv7-unknown-linux-gnueabihf": "7f6227fcd0f3e584adf15a536a00441d",
        "i686-unknown-linux-gnu": "2bf2a0e1d2b6144950d75476d286939d",
        "x86_64-unknown-linux-gnu": "f5c03884ce1094e2eb2008da9193a66f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "771a702962fc004eb5b8390a56fbe79fb2615684190187e6143851860d27f92b",
        "arm-unknown-linux-gnueabi": "86e42e1284b059d56bb5a642d78916fb40328ad29137b120fc44f331594a3908",
        "arm-unknown-linux-gnueabihf": "fce00ad6e6349a2e266cb894bc845c8456070ab1e74fe2789708a5fd57a2206c",
        "armv7-unknown-linux-gnueabihf": "e87a723587e60f510ed0ed4b095328689c40db4c53db360ff71255367369da8f",
        "i686-unknown-linux-gnu": "2a789a02a9f69b40e73d66aee2a99973f4e7301483dcfe0606a6a1ec6d140ebb",
        "x86_64-unknown-linux-gnu": "1cffeb2f402efb594baf1bc9e752dc9dc5cfdd22230d54b56f5ff05c429795b9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
