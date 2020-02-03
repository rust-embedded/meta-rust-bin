
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a78cea44233a1d89cb223a0ca0ab078e",
        "aarch64-unknown-linux-musl": "1053749da5f342151abeb5ee0df316e9",
        "arm-unknown-linux-gnueabi": "1ab544d8d097d19e7b96d649e1bee1d6",
        "arm-unknown-linux-gnueabihf": "bf939d3b4632ab73c2d6b6ea4fb118d3",
        "armv7-unknown-linux-gnueabihf": "e970ec17cbf90c34f5c5e6011768ebf0",
        "i686-unknown-linux-gnu": "bff5402c09fdca86ebff3f1ac5f783f5",
        "mips-unknown-linux-gnu": "4e35b0e1ebb266842cca401ef73a1c0f",
        "mipsel-unknown-linux-gnu": "99263bbbf0696c12e47dad66fb20295c",
        "powerpc-unknown-linux-gnu": "e3d917ba90ab1f46f094d11c70d2635b",
        "x86_64-unknown-linux-gnu": "1c911cf792eb8bd847fd77ceb73bc6d7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9ba698f68c5643f53934e1085af40c79c6d1b3bfa01ca6dcdffdc5eec8f44cc0",
        "aarch64-unknown-linux-musl": "b1acdf055d534f4ce295271fe6101833c65261aeb52ffb619911a4db3de35663",
        "arm-unknown-linux-gnueabi": "26dff0b6e2196e04565a555d95952d7fd7ced3a95fdcfd96e37666a26902177d",
        "arm-unknown-linux-gnueabihf": "b1761c6981e802e6851af12f625acaf8af2ad4cb743a813ea57eef57927fbc4f",
        "armv7-unknown-linux-gnueabihf": "6811d49d312c06b0f0e67604e1ab90f899c66ab942a37b3ac46b5b1f6a5a03c7",
        "i686-unknown-linux-gnu": "fbf71c10787fa1cd4fbde0a1ef6805fa4978705c809959f48917bb7c5b5b6d61",
        "mips-unknown-linux-gnu": "d56c080f05c19f0e2834e5cdcf8cecf2457875646193e9aa3920aa3ed0597fc7",
        "mipsel-unknown-linux-gnu": "0737196e63684f1ae9c1b06e3d11708476eacc45c1cb120b54038dc31f9ecf64",
        "powerpc-unknown-linux-gnu": "f1a52b44afe7787cff8e8d449748553332681637cbe6d8aa2a47276ae7952b56",
        "x86_64-unknown-linux-gnu": "c5aed4c7ef362b5754526d26acaccdc9300942fd12e5cc67cc56fc89576a9dab",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9774a88b0b4b683cce497a36485ef7ac",
        "arm-unknown-linux-gnueabi": "f94361a2c714abf2d774414cea2547aa",
        "arm-unknown-linux-gnueabihf": "ea3928e7156013f7e11af0f3ce6a6029",
        "armv7-unknown-linux-gnueabihf": "86d246691854c456c8870df369f360c5",
        "i686-unknown-linux-gnu": "9472ec78b0cf66e3657c2f69b9f2f1aa",
        "x86_64-unknown-linux-gnu": "b3ab0bdc2801c9d5b5434c266a42bd53",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "09d1fa08d7403495ca07565eaabfcbe6703e842b765a68d5110cf4e64e988476",
        "arm-unknown-linux-gnueabi": "604a41cb2536409f4eebdc1a1ffb5d30550b9d9f7774a18d268244ceaf62aed6",
        "arm-unknown-linux-gnueabihf": "c9ae032094f0b122ec8a327abc7590094931cd4d7e366181fa429b5304baa34f",
        "armv7-unknown-linux-gnueabihf": "0caa3c6190045c6d12ad9ce7615591532d5640a24ebe58bbfb92bf9066505f78",
        "i686-unknown-linux-gnu": "30fa399934c90024275a08aa8992e76e98e04f152fc65b8aad3ca1fe231db39e",
        "x86_64-unknown-linux-gnu": "008bb3d714544bc991594b29a98a154441914c4771007130361bbadfb54143d0",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
