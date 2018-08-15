
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7de9a2bc70fc142eccee00d1ff6c7fd6",
        "arm-unknown-linux-gnueabi": "6fb4507dc3ff617100868580fb498347",
        "arm-unknown-linux-gnueabihf": "7d60da9e5c8bd151a8d1d3787ffaa455",
        "armv7-unknown-linux-gnueabihf": "4956e94e61703b8446fdad068035dc54",
        "i686-unknown-linux-gnu": "7498aa45c3cfbe3a3d6068381921f6eb",
        "mips-unknown-linux-gnu": "65c84085adf0a83fd84ff542879da20f",
        "mipsel-unknown-linux-gnu": "ce86cee68af902e34f89a3af9d0b1e00",
        "powerpc-unknown-linux-gnu": "3335e9e4bd2963a5240339ca8b03b9d4",
        "x86_64-unknown-linux-gnu": "5984050796555e02702e50403a50a389",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "39bafd1db4f1e881cdbd8d81b757bfef1cad6c06f6aa4514f8b693d997764e2a",
        "arm-unknown-linux-gnueabi": "6c21611a435ad69b0356745a1c46ea8c4c5b6f505c91fb6f7140d47975b531d9",
        "arm-unknown-linux-gnueabihf": "40bbeeb9fcf61e26051626b0dd68d0d70b740dbc2572a9df5450dfc369fac573",
        "armv7-unknown-linux-gnueabihf": "ce22f7487b711f63207a040bef039442176415ae9383e6a7f574a6afcd3654cc",
        "i686-unknown-linux-gnu": "0ac6356223f53ec5f21cea6a9e9e5cd2fee3d45916f831e1ca54853893ec0b73",
        "mips-unknown-linux-gnu": "dde02015d0dadabf45cd999d51e3c8989fe1149052434c524279ea2d7e30462b",
        "mipsel-unknown-linux-gnu": "dd3f70bfeda19031081eeca33b2c8a34e999ceea582211f21f00964ef9cf616a",
        "powerpc-unknown-linux-gnu": "dbc70e87422fc7d69eb7dcdae341ba87be150babcd71c6b6ca1ad3c486ba54f9",
        "x86_64-unknown-linux-gnu": "68984f2233853d3e9c7c56edd72a91b5822157f28fdb42023fb311af68f842dd",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "015b444095b6aa7679c60827f64200c6",
        "arm-unknown-linux-gnueabi": "6279ddaa86e7084450234e99a995d312",
        "arm-unknown-linux-gnueabihf": "6bbf5ef31d7d5b7b4d4c11e781872136",
        "armv7-unknown-linux-gnueabihf": "625a86ac1d60eb6835ccc10e39a7953d",
        "i686-unknown-linux-gnu": "dba7a20c24e1f07b4358e0fc77b1d044",
        "x86_64-unknown-linux-gnu": "5bd1f3f085a13ff479652db0bba17ae8",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c1a5ddc6e40be5eef7afad8c126c6f426d07eb1a297902c7ef871279fdbeea49",
        "arm-unknown-linux-gnueabi": "72b6f3c60096dbdf7ec34280a79261b7153dc428581317d8612f6682b38ae5b8",
        "arm-unknown-linux-gnueabihf": "0448dc4a5e3e3b050934383584bbeaecc9bf76399deba86c62db435285ee2133",
        "armv7-unknown-linux-gnueabihf": "17b81723789b3a648e5ba16488312039b46b26a41496802d75877b521d9cc185",
        "i686-unknown-linux-gnu": "a9ba9c97cf4818ab14966617390eadfc3dfd5221033f8f749aebd86c1d722ef9",
        "x86_64-unknown-linux-gnu": "ec3efc17ddbe6625840957049e15ebae960f447c8e8feb7da40c28dd6adf655f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
