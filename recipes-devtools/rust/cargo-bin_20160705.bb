def get_hash(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "21e17ddb5bf706df5662338a9d675695",
        "arm-unknown-linux-gnueabi": "99c51d4886934d4a5cc307f4ec4b3ce8",
        "arm-unknown-linux-gnueabihf": "307c208afe0a470eed48d05125c62e48",
        "armv7-unknown-linux-gnueabihf": "0e4735148dcaeca5a9ff98a2769f0f77",
        "i686-unknown-linux-gnu": "a1f1e479289894639d6b9c58809560c8",
        "x86_64-unknown-linux-gnu": "8481e37267273bea60cf012d59156c80",
    }
    return get_hash(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1bdf1f446199b164b8e4234fede68fb82d4528adce9757ad69fa6ace67859d94",
        "arm-unknown-linux-gnueabi": "d2debabfe50ded1598e9b61a0b1e262c44e6b6f6e14a994d46ee445c77466618",
        "arm-unknown-linux-gnueabihf": "c2ced46ebc017d163aa8f47999c6ff8883169d8f5496ca6b03cbcd68eb10fdd9",
        "armv7-unknown-linux-gnueabihf": "eba6649f0b6b38e44ff8d6b7df741d79828cfe78b3cdb8fe035579cc42b5e36a",
        "i686-unknown-linux-gnu": "f640d0dc0badeea87e2bab26b629e0acad5ebf1e7d8b6adef16febb72cab3da4",
        "x86_64-unknown-linux-gnu": "cf47787fd50bf6c7f68db290eab054e493e4619d42a8faf66565431449055f1c",
    }
    return get_hash(HASHES, triple)


DEPENDS += "rust-bin (= 1.11.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
