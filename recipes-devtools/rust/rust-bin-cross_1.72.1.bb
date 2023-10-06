
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fd224bd6acbbde07881647287c3944c4",
        "aarch64-unknown-linux-musl": "9a8151d9c632c36d2110332492abf343",
        "arm-unknown-linux-gnueabi": "8aa5ccf84a037ee7703058b8ba0770d8",
        "arm-unknown-linux-gnueabihf": "6ef1add42486946a621e71114c14a383",
        "armv5te-unknown-linux-gnueabi": "53fd441d3dcc66fac08cf3882e4b9054",
        "armv5te-unknown-linux-musleabi": "76332e25a6c804fbd7f5628aa4a96399",
        "armv7-unknown-linux-gnueabihf": "cc35f38c9c20ae3a122bc572202cfb6f",
        "armv7-unknown-linux-musleabihf": "7b9680560c70e7a664a488b23a067b4f",
        "i686-unknown-linux-gnu": "8e00b1171a851ffc5d4cf534ba40d647",
        "powerpc-unknown-linux-gnu": "f0db96c1546ff0f07d02cc98d0b2c2fe",
        "x86_64-unknown-linux-gnu": "bb20a9de56624b1cfb74b6559427f6ee",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7c43a6f56b100ce929967ef0d34fa316e0c4b233cb3ba84db67832135006c403",
        "aarch64-unknown-linux-musl": "a817c49da05ce0c6ec033c0f9228ba7886ae36ef901c2c3c040b60367c89bcbd",
        "arm-unknown-linux-gnueabi": "258aa5bd91e356a8304d83218a067d35e6de12606e565f405b22418c6300c8c5",
        "arm-unknown-linux-gnueabihf": "db33eff5bf068c0f087315b071f52d2fc30d5ab93cfae606e27341cd34e681f2",
        "armv5te-unknown-linux-gnueabi": "a900c058894e1168bca40ce8ee21b29474dc03ec5b29bf23fad5e06c86e7bf1b",
        "armv5te-unknown-linux-musleabi": "026b23aa6d26db51aea54646b9adfcabd4e45204eadd3f00240ea5ea9440748a",
        "armv7-unknown-linux-gnueabihf": "06c5dfc4e19cf743947e5da2682c548b53d99ebec0296070223827ce7636aec0",
        "armv7-unknown-linux-musleabihf": "87e20ebb58bb1a3c255c8efaee05a23539f360a88d65ec8a7d29fae57454b537",
        "i686-unknown-linux-gnu": "e53a82e2dbd9af74c3e91583ce8fe5911907f7f86f57f7e15c1f633a0dc44c1b",
        "powerpc-unknown-linux-gnu": "0c727140589d214dd7a1616776f1ab9718025065e61c32f199f62d91b68e8419",
        "x86_64-unknown-linux-gnu": "d5d3751b4558864fd95f17b1b6eaeff3130a3de1a6920750a3b8c6b0fa03fb1c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2d38c96dece95a01f129ead973113d29",
        "arm-unknown-linux-gnueabi": "619d3d084e3a8e611c201cea3712892a",
        "arm-unknown-linux-gnueabihf": "a079f3c8a18b8787b8c2758ca9fc96c6",
        "armv7-unknown-linux-gnueabihf": "f93c8e17962cb80bcc05a8028dbdf1c6",
        "i686-unknown-linux-gnu": "de10495a50eb0cf31bbca3fd7c6c8042",
        "x86_64-unknown-linux-gnu": "3fd6e3edc52614e9a1cf53452a32afdb",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "04d75869d1c0f01e365d5d579456a81e817ed97463b70e7c273d031c48d2838b",
        "arm-unknown-linux-gnueabi": "dc0f9c87f4f95de3945f40d44551f7d0e259bfa67d442f72eb24d395d6a9c634",
        "arm-unknown-linux-gnueabihf": "107c51bfe1611b84dac87c348c9dd9635e8502a1db58fa935caf8d046b653706",
        "armv7-unknown-linux-gnueabihf": "3aaf248d59af49f8851eb6d3ff07abbf9bdfbe222092a4b08b9f95486d8537d7",
        "i686-unknown-linux-gnu": "064c2b155162d36b4fa0655207fba8315962dc72840704155494cb71e48a59c5",
        "x86_64-unknown-linux-gnu": "9cf84e4de7302644e8c68b8d2abf6ac9e2b56409c3fa5b2ab95168bfaa5c562d",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
