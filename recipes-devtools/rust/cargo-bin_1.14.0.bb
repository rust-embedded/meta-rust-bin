
# Recipe for cargo 298a0127f703d4c2500bb06d309488b92ef84ae1
# This corresponds to rust release 1.14.0

def get_hash(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7d825d3be7f9f45c9be79453fca781a7",
        "arm-unknown-linux-gnueabi": "37fe7f2e705b734cd5352ef5b7e27ebe",
        "arm-unknown-linux-gnueabihf": "639d8252c5ddd46382c9a8f3ba51dd5e",
        "armv7-unknown-linux-gnueabihf": "ae1a0fd18965285e30e24afbf45a6557",
        "i686-unknown-linux-gnu": "aded776463929b457690423977ad4fa1",
        "x86_64-unknown-linux-gnu": "ad23654285541462e537b7187c2aaa75",
    }
    return get_hash(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cd16f241bb16cbe70f457ae50e25fa4f1206487deaddf8ccefe1936d46db90d3",
        "arm-unknown-linux-gnueabi": "a98891b4d4d7576b544e70b791c2c87887653b9def92e29ac10d5e7323db08f1",
        "arm-unknown-linux-gnueabihf": "2854f265d1eb9c5ffe8fe04da39a4a34273465112d36c55b108864b56c3d49b6",
        "armv7-unknown-linux-gnueabihf": "0f1b282017676ba17ccf6873d9553446714af8724d42d1ea31446b277ed36ad2",
        "i686-unknown-linux-gnu": "03861ffd057032f201b723fa9018fbe18c5c8a76f0e9ad7fa52ee9bc2305d0d5",
        "x86_64-unknown-linux-gnu": "349a01c2c87f6b5c5cd39ddc6a86a2f6b009a05a48c95a633beea27ac22fed6b",
    }
    return get_hash(HASHES, triple)

DEPENDS += "rust-bin (= 1.14.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
