
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ead3bd18db5a6f49af0001f3ac2f930b",
        "arm-unknown-linux-gnueabi": "e55cf673cb5dc76c099fd4a80377bc77",
        "arm-unknown-linux-gnueabihf": "c641f936b5ab8bff78706e88e97c7e82",
        "armv7-unknown-linux-gnueabihf": "ab2492315e8d32df702679c09b0b48e9",
        "i686-unknown-linux-gnu": "d97d2b6720c9a06ac369668d9c2f496f",
        "mips-unknown-linux-gnu": "571a206d47a410c0c8fb71a3a6b68f47",
        "mipsel-unknown-linux-gnu": "3b5d02e8dd9b1ac1a77fd17519b3c43b",
        "powerpc-unknown-linux-gnu": "21a5fe2a20b604e34981cc4cf4e0479a",
        "x86_64-unknown-linux-gnu": "b6e348e588a789eca369b5404e7d7656",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1e0276d8be49b58b226fdca19f56fc3ea8d7e2a64b81acca30d87dd9f3fec96",
        "arm-unknown-linux-gnueabi": "604832eccc03b401b501aeaca152b486568d7c9fcb55242619b0156de1d1143b",
        "arm-unknown-linux-gnueabihf": "9ac6021d3ddbab5bbf9e33cc6d1a3f9101a6ca93c85ddd7be9cab6e76e75b5ac",
        "armv7-unknown-linux-gnueabihf": "65a730c78486a8da119fb5853150eb23f4392cf6b8c197916f71d61c00dfa1fc",
        "i686-unknown-linux-gnu": "372aa5a123216dcca204caa9bd909c2db711554ac37f9a8d7222c190767223e3",
        "mips-unknown-linux-gnu": "02a083136f6ac88dc81e48693de89934e18cdc15c181a42ddcf7762d9f919fca",
        "mipsel-unknown-linux-gnu": "255034f25203a66848a9b25da4f12362fff1d851fe868364b3759d72ead8f839",
        "powerpc-unknown-linux-gnu": "ca7f0e0b9cd49cb6377460f4234be0cce2a2dceb5ce71449f5ce2996c5abb693",
        "x86_64-unknown-linux-gnu": "4c431863a6a03b24b69c539de92fbdaec916e2b70df89cb788ac1e09b2e0b70a",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "986634bc08437ff5d760ef747dc9b627",
        "arm-unknown-linux-gnueabi": "b017d543b9ec539d7df7383c97cc6522",
        "arm-unknown-linux-gnueabihf": "08467bb0eb7d12fc6bc78ef84722377e",
        "armv7-unknown-linux-gnueabihf": "b6fb1cf2ec6f4e80234ab6716804f0e8",
        "i686-unknown-linux-gnu": "c3d3d0147c720c51b0bf54d7984e4fa7",
        "x86_64-unknown-linux-gnu": "6b5b084cb997d20d11b7b2b566ffccdd",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2fe9a90d5163a02a35693fa48ce1e56f76f39e953911ca5d0d8cdc491a1df4ab",
        "arm-unknown-linux-gnueabi": "08d34686bd4e1ae17d5272f82b78763dfa5bd56f61cdbfaf557ef57b1b3e7713",
        "arm-unknown-linux-gnueabihf": "1c7f380110d42fe3158c7c74dd3db4e54023577537dc60b92a2b49dbfc09f4be",
        "armv7-unknown-linux-gnueabihf": "b61b1380b2711a731dcc89e43d95be265e0715721168f2a6055f6cc392a77b9c",
        "i686-unknown-linux-gnu": "706744c8f8373b4214650e790229e5bd410f8e1107680865ef25e29f1c7e5466",
        "x86_64-unknown-linux-gnu": "47dad29c64cd60fb2e3e5a723c191c99dae883bf8e723dd0e6631427f148b87f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

include rust-bin.inc
