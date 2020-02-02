
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f4c2866ec98fad0a2ed4f742bbd20f88",
        "arm-unknown-linux-gnueabi": "909c6429fb03d7c094e21bdf4822493e",
        "arm-unknown-linux-gnueabihf": "a134e6516463a93f3c189e28402c1b71",
        "armv7-unknown-linux-gnueabihf": "6812e833b77436b8dcf65633ee93b03b",
        "i686-unknown-linux-gnu": "3b0b1a0f696372d93baf5e41859351b7",
        "mips-unknown-linux-gnu": "9847118a4d30abdac75d827c0dd4c281",
        "mipsel-unknown-linux-gnu": "2e1bd8f5ec00140764321fe38b706368",
        "powerpc-unknown-linux-gnu": "e8a89a177ceb7351e8467f91b060939e",
        "x86_64-unknown-linux-gnu": "200283f7ac053dedd12216478a62e101",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b7422499fdef7fbad13fd877962325470f9d1bc61f580b1556919be0a1b2339d",
        "arm-unknown-linux-gnueabi": "6586c458659547042e33cb0a8c95641b01a7e05c5f0790e0560d1ce3fd9740ab",
        "arm-unknown-linux-gnueabihf": "24189bf2f7ab6f30e51822924039021f7cfc055725f7bfc54d8f3a2ab7540b46",
        "armv7-unknown-linux-gnueabihf": "e25d6a74c290067fbb06fbb8a85b70a3000a4033752129b82ecc26633b6139a7",
        "i686-unknown-linux-gnu": "1f13fd2142a016d8c6b38d4e58ca78113edffa08a736a197e4eb7d5ffd2971d8",
        "mips-unknown-linux-gnu": "8d5f8a58fb24c3404a0bdc336bd94a253c0b0159316c955625bde6e28901cf91",
        "mipsel-unknown-linux-gnu": "fdde4a8ec83ced079ef445dab15c39bdf2673562ae3cf7e6adbddacfa377f89b",
        "powerpc-unknown-linux-gnu": "3e018f2f71e24c0b82a2e737d712eaee4e0e1e9525e9518f855851ddcf362ce9",
        "x86_64-unknown-linux-gnu": "2d428042fd0b6cc1b08584341b2ad81dabe7abdfadcb0eb5082cfbc93e1ab90b",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "199eb41add634e002fbc2b20a2b33e27",
        "arm-unknown-linux-gnueabi": "86a26513645b40b66ea940fb463b8ed7",
        "arm-unknown-linux-gnueabihf": "27ba3eff91e939b6d1983ab6aa3d9c6e",
        "armv7-unknown-linux-gnueabihf": "60a4a099b166481fe96c165b39441995",
        "i686-unknown-linux-gnu": "f1c1b3c6cd6195e4fbc386a7ab49e64d",
        "x86_64-unknown-linux-gnu": "a03bdb0111e3b68a3626237d2ec7cb95",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cefced37eab789785ed4647ed42270813216d0923f3edd029f2dfd969f659f17",
        "arm-unknown-linux-gnueabi": "b537f7b0368c004e3db5c36ca7235ab65f69d0d65a68324b55ebe6f3b9dfe1d6",
        "arm-unknown-linux-gnueabihf": "f3f1510d336c134203eea8dc05a9d0f886c1797cd7f55492a58c2a45a56799a6",
        "armv7-unknown-linux-gnueabihf": "2dabc41a0c9d7b78ef85dea51f58e5a68ec5b6e668c074d619c803936a2eac30",
        "i686-unknown-linux-gnu": "6c1f62db6f9c317aa656774b5193ce3d0783de4c73f2424d98ff4c9f1f962d25",
        "x86_64-unknown-linux-gnu": "a753e3b6cfa8417978e4bfc0d3282f22be4abc5e106af39f4cb54dc775f64546",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin-cross.inc
