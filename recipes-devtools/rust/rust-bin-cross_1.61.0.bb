
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8ddf16e2c69b2ad54e62c5feace50ebc",
        "aarch64-unknown-linux-musl": "cd31e8862c3e56e426615a950d2e198e",
        "arm-unknown-linux-gnueabi": "a5db24304d6e601529a60d9825e470fc",
        "arm-unknown-linux-gnueabihf": "68814f846034639e009a560c8353bf6f",
        "armv5te-unknown-linux-gnueabi": "a6d191dd083e0cec05bcf8c8a248308a",
        "armv5te-unknown-linux-musleabi": "e52f3cc89b3862fd6cfa8a6bb38907e1",
        "armv7-unknown-linux-gnueabihf": "c483ffd85fd10a803a418bb3ac8d50a5",
        "armv7-unknown-linux-musleabihf": "e009067e0f170a937631075ba6a5e6ad",
        "i686-unknown-linux-gnu": "1ec00dad2e1ebbf91ccb9ab6e6f0bf7c",
        "mips-unknown-linux-gnu": "0b4daa31872ed76c5fc30cfc198d0161",
        "mipsel-unknown-linux-gnu": "f2e76b59c7bc2f3afa2f109ef126eee4",
        "powerpc-unknown-linux-gnu": "efdbd3e15bd966ac7e6aa0010050a1c2",
        "x86_64-unknown-linux-gnu": "8eb87473195fa7ba6f12e0d0300ac251",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2cc8cfc5cc60e0c6a473bb609b54251c561d8d12a986fda8a7ca86dc1d36b4df",
        "aarch64-unknown-linux-musl": "4858a62e12e8541d2f5a7dec0ce0ea73c73ed9dfc73766e6e2d08b8a8bcdfde5",
        "arm-unknown-linux-gnueabi": "12f7e57bebe82f4d0881ee6c4eb3c3bb9c499fb741f42ac5a05a76ea80877cba",
        "arm-unknown-linux-gnueabihf": "71c07f51c3b7b84cfc327acbf2ac359796260cbbd9be3a73b9502860df220fac",
        "armv5te-unknown-linux-gnueabi": "1895e430a9c807aad94227d57f519773c6858321c5c59a49ad1d0ef22e63c50c",
        "armv5te-unknown-linux-musleabi": "2d3eece4270dd4ece11bdefb9f11d5f70bf8317403f4dbfcda5df97829d382c4",
        "armv7-unknown-linux-gnueabihf": "34640c0064e15313c7d82a48175503bcb36ffc0e39c3384e899fe4bcde6c82e5",
        "armv7-unknown-linux-musleabihf": "3de3d5a2474e48df063096ef6c52f52e3ac718f15a3f1dd40f6accc3bb944e33",
        "i686-unknown-linux-gnu": "0a7687a9ce66e06ed92f82e2123fdad220bb3caa36a6764bcc8504187948b1d4",
        "mips-unknown-linux-gnu": "922afca9d46a2a48aeec9f04171dd84f92fd1de13321023b3f3ffe0b9e1a3f42",
        "mipsel-unknown-linux-gnu": "033417703a369959b957c09f8b3a99ef84bf6a204dc0efe622bcd3b099454f4b",
        "powerpc-unknown-linux-gnu": "763dda95a945a6effa6f8507d1f94fc690cda55612dc142406fb26f755a242d8",
        "x86_64-unknown-linux-gnu": "27383bf7b39d2ff1298fc0dfcd70ac70e1c01e70d7d0c60a2002c266a25b2015",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d5f22003b0026a931cd895f11492e420",
        "arm-unknown-linux-gnueabi": "0195a7cb7aaf01b456df7677be334cc9",
        "arm-unknown-linux-gnueabihf": "6d43d3a3d9ea4003365ec00199634750",
        "armv7-unknown-linux-gnueabihf": "5e6626f4405a0ea0be500c8e5ed5eebb",
        "i686-unknown-linux-gnu": "70fe8771147cd21ffbb6956d431c2cb5",
        "x86_64-unknown-linux-gnu": "a7bc396ab4958d25cec7c5c50c7b700c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cec2afb78b5f0d3303cd6629232dcbd9f9dfa0d5e99b8ca0a95b77d570b1d591",
        "arm-unknown-linux-gnueabi": "482bdc2f70242df5144702db7a6f568d3ee0a9201a9bb20c0b9bd7c82dd865f6",
        "arm-unknown-linux-gnueabihf": "6f61af7a576105123d5f4d6581bfc3f6c241f154a5eec3e5f0ce940fd13582ed",
        "armv7-unknown-linux-gnueabihf": "5eabe9953359fb3cf9c58415a2b425afbffbeb110a584e7e1b7b2e6df7a9d32b",
        "i686-unknown-linux-gnu": "7400c6bda7bd235c1d2f8ffaf95ed92cad65cc11fb969d751f844a66f726e85d",
        "x86_64-unknown-linux-gnu": "708a8f8b9ebda188e133695a12c96ef7875723bb3ad2ed2a2b6a20ebfcd57ff3",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
