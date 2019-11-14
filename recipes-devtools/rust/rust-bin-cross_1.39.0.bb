
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6f67b384089ac16fe1b38c7310523c5a",
        "arm-unknown-linux-gnueabi": "9a05ee0cd393cb76bc675aca082d912a",
        "arm-unknown-linux-gnueabihf": "383522e26872f6c119d6df15945786db",
        "armv7-unknown-linux-gnueabihf": "4145c34db4d86aecdb1d8bde0af2b139",
        "i686-unknown-linux-gnu": "cc8310532b0de368a31ec2405420aba0",
        "mips-unknown-linux-gnu": "2df5108213ca33b24df6f63e7e88de5d",
        "mipsel-unknown-linux-gnu": "5347fad6a99237308affb3b8d1b5afd6",
        "powerpc-unknown-linux-gnu": "19a332ac2b62e5c3470753eefee5aafb",
        "x86_64-unknown-linux-gnu": "e6396eba80a2f3dbd40c00c08d78402d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "adbecacf6cf0ed19df2496cc648b16192c0bd085d7e6f670edcea4dd28ab37df",
        "arm-unknown-linux-gnueabi": "2001f86ea2df468386b8196ec8e8eead81f6b7a9631f662d66140a35cd674b2e",
        "arm-unknown-linux-gnueabihf": "4865141256b0bcc3c190368fc9db874317f66e78a7bb90a97ef191ace9eb7384",
        "armv7-unknown-linux-gnueabihf": "172770e4004fec166792fdb329afb344c2714e2b9b96c377725dfb9a173496c9",
        "i686-unknown-linux-gnu": "da0ff5cb2e82d7613186e1f1f6e24fdd0d26907cca4c77bc557d3bf18cfb3795",
        "mips-unknown-linux-gnu": "87c9f322e14529d4d216f1ed8488632da4432bdc6b517004aab6f26ed0410bac",
        "mipsel-unknown-linux-gnu": "d83746c7c7b9f39e9671c8b17d82305f4c1cbf9e6d29e384bc8cee98b7959868",
        "powerpc-unknown-linux-gnu": "a75836011d157dbeefc7096f5bcbc38f6e1be5c7d745f6024540b82426308e6b",
        "x86_64-unknown-linux-gnu": "2ddad802f048acaa5cd48f1105c18c7f4de32dc9569ac4d64bfcbb3d8c155cb7",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5169d3380e5c439cb5ce76f12190ea9b",
        "arm-unknown-linux-gnueabi": "f895d2d3aae61e9bba7cb3b0c97b9983",
        "arm-unknown-linux-gnueabihf": "362825379065c9fbfb5b7f7324da4ff4",
        "armv7-unknown-linux-gnueabihf": "d4f00ea5eaac96870306caa4ec807b3a",
        "i686-unknown-linux-gnu": "c6a2bc6d1d31c15311d7929abe2603ff",
        "x86_64-unknown-linux-gnu": "b8591bf4f8aa9296387b26273f4618d0",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c64fc482404277fdb160a4b593b0be5a1b0c32d985464595015295321d111621",
        "arm-unknown-linux-gnueabi": "e5436dfbda9d572af32e7a2ed9ccebb44eef5557a16faadd5ce1112979c8018a",
        "arm-unknown-linux-gnueabihf": "ab1c558fce9bccdb3ad1aa7536ed56c41b20a9d4d9066007d1988f4d41b41175",
        "armv7-unknown-linux-gnueabihf": "d019bb567cde2bb82d2826a92258470de3d1db85c390726b6ea990b31855673e",
        "i686-unknown-linux-gnu": "0b3f096e989439332a2323f9528dedaa5ddd58ae4c12b0a8c07b3f6b080946f1",
        "x86_64-unknown-linux-gnu": "333399dbf96dd6b8a9dc9cc56b1cb5d8aac2296b4e4aa857bd59d906d6df6fa1",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
