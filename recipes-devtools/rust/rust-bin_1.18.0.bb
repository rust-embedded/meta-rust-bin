
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1e2a2be21b3dcd53f9127d1f3bb6d79",
        "arm-unknown-linux-gnueabi": "17c00c001a99191d02a1d4d00c35adaf",
        "arm-unknown-linux-gnueabihf": "0bdc3e74ba6f13fc08ef6175ecd3f795",
        "armv7-unknown-linux-gnueabihf": "548d9096bc859079876f407f835e3236",
        "i686-unknown-linux-gnu": "3e6bcb51f37317523fa8cb6ce6652b85",
        "mips-unknown-linux-gnu": "9a7445cf748d492810f8e588800b4abb",
        "mipsel-unknown-linux-gnu": "3f2907772dcc696e8de19250f279affd",
        "powerpc-unknown-linux-gnu": "82e0b6d3a495dd8cb18edfd00f6a9c19",
        "x86_64-unknown-linux-gnu": "79ecc0a63383459da84f10ba90db5dd6",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1a6b33f8bce7637fe038667cd82dda60a69fe319adf3820f621670ef9d75af2b",
        "arm-unknown-linux-gnueabi": "8da327ff42cf895ff341bca862f8a235c1bd78e473464183bff85ceccdfa3a91",
        "arm-unknown-linux-gnueabihf": "8cf92d8a4f6c04f66edafbbfd1ad12839bcc0ee1477b2ccdaeb43fb81788c4fc",
        "armv7-unknown-linux-gnueabihf": "bafef1cc817fc0b6fcc06d19fc9a28638d7a85dd6c2345a803c4c89d3ed89a9f",
        "i686-unknown-linux-gnu": "3b93c7b856b98f61ec0f640bc96373f4762484ab3340866902c8c96933bcf10b",
        "mips-unknown-linux-gnu": "312bc9444d3b43a78fc82755f84ccf6b692778233983546c4616e08419a06bb0",
        "mipsel-unknown-linux-gnu": "76b14be2770bff9945a16f95e23f6bf0bbd921b9529b9cfdb5c7569f312746c8",
        "powerpc-unknown-linux-gnu": "8716a44ee1be60500e9cc1460f12f211e1ae84ddf50dd6f05faafe13478962c0",
        "x86_64-unknown-linux-gnu": "4a66150781e224412ebd9dd6d643ad65ecc5668a7754e4a12e115be6ce7bf527",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "217a05fcd6276e6aa456b4710b04ed6a",
        "arm-unknown-linux-gnueabi": "d6568f2f14bbb48e73d7288e03dea343",
        "arm-unknown-linux-gnueabihf": "3ef4600cdc15f2802597ffa17597da8f",
        "armv7-unknown-linux-gnueabihf": "97a3e2356fe0287188a35c6ec5fb6fee",
        "i686-unknown-linux-gnu": "b50fa0e08a8bf22de5213cf252d34896",
        "x86_64-unknown-linux-gnu": "fc959a1a2891cb9154460cf00f8deade",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e6d6dfe0a552123cc328cf2cd1c04a4e4e086c95eeb6267082d4be1a8a1a43e6",
        "arm-unknown-linux-gnueabi": "f1ebf3de69aef023eacaa590bd56bad1beb6d55594473e948f6ab71902f34fdc",
        "arm-unknown-linux-gnueabihf": "d881e213f852d99c4425154ac0cc7108183b6bfd659d1a2c2e085eadb4769ff9",
        "armv7-unknown-linux-gnueabihf": "6baa101eaa791d201848cac8220c8222c6b34dde30c2e2d88feca6b85ebe9e17",
        "i686-unknown-linux-gnu": "0cb9bb95373cee8ba26e8f517c46f8c58a29e22f2c7c08a4d152306c6ffc7115",
        "x86_64-unknown-linux-gnu": "f2a34e20166ccf6eda4de46a9efb02821df5c3f34667e2988284a8eaee408113",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
