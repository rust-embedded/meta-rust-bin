
# Recipe for cargo 20170131
# This corresponds to rust release 1.15.0

def get_hash(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5c8a3ef81ce68de05f1d893855e64ec1",
        "arm-unknown-linux-gnueabi": "f724592cb147216a9605ef97f30464ad",
        "arm-unknown-linux-gnueabihf": "c19ac3dac4e7ca852ec00f59da7c257f",
        "armv7-unknown-linux-gnueabihf": "11655e07a9d92ffc0dfee49b5ee81ca3",
        "i686-unknown-linux-gnu": "24d4eda62991bfbaecb3a6d1e09df143",
        "x86_64-unknown-linux-gnu": "ad2b513d591f35271f1041e2e04f484c",
    }
    return get_hash(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "35fc6c708d1dcc7c44b4089aa8a9c0d3e82be31f30a550ef535e443d42e21d4b",
        "arm-unknown-linux-gnueabi": "826c2a1ba88c9ed9d50e040f1936ffa3a005c12e34a348f563d8a016a9385a03",
        "arm-unknown-linux-gnueabihf": "d8436690a182f536a348227fb8628fa964481aaa175e72c8f5df51f6149fb124",
        "armv7-unknown-linux-gnueabihf": "34dbf0a411b22cb4ac9e935dfc15e713c087c2adb34ae530f1b380509225762e",
        "i686-unknown-linux-gnu": "f20adfdcd6fb61c1252034e998998ec349c8a6b05c0320e47a539b0f6d1c76fa",
        "x86_64-unknown-linux-gnu": "0655713cacab054e8e5a33e742081eebec8531a8c77d28a4294e6496123e8ab1",
    }
    return get_hash(HASHES, triple)

DEPENDS += "rust-bin (= 1.15.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
