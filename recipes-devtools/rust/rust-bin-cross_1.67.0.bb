
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c3d78762dda87793df7044e407432aa8",
        "aarch64-unknown-linux-musl": "0b37dc5a6e59a7749d87e2f73853a2d3",
        "arm-unknown-linux-gnueabi": "35f2940888f618e77a4298b88a3ef7f8",
        "arm-unknown-linux-gnueabihf": "4971f0010b41102fb193e9f5101a2c3f",
        "armv5te-unknown-linux-gnueabi": "9cb692a0acb9495dd1e13d6cecf26282",
        "armv5te-unknown-linux-musleabi": "25b82de629636160769e1e978885b3ac",
        "armv7-unknown-linux-gnueabihf": "9d37aab7c50b122d6ef16c791c95940e",
        "armv7-unknown-linux-musleabihf": "b97c2f5636971b886913ea3972e57f68",
        "i686-unknown-linux-gnu": "db3765fc976f13c11dd311c455737189",
        "powerpc-unknown-linux-gnu": "9931a9713c94f8ab837e6b2b867f5e4b",
        "x86_64-unknown-linux-gnu": "8bf77dfb3e418bbd83cf03aa2a29a581",
        "x86_64-unknown-linux-musl": "dfc6af84714bf9890b2c4c3744d5f74d",
        "riscv64gc-unknown-linux-gnu": "827083f342c16075a326b89125dcb4db",
        "thumbv7neon-unknown-linux-gnueabihf": "d7c2923918abcbc39fee3b25b389e510",
        "wasm32-unknown-unknown": "33e8d6840e1db3276f6c4fb50a4a5ba9",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cdd6cd98e80a8ff130f2f0f8f78d51fa012ca55988bfc3a108f684b3cf331295",
        "aarch64-unknown-linux-musl": "1f1239d417894dd0d56cae7b264ee88ff13ecca0d01416d14ba069bbde6a4e40",
        "arm-unknown-linux-gnueabi": "9e2b3b3e2e291002d1dcccf983aa48aeadfbdcdf7299861d3e25cf4cfad964f0",
        "arm-unknown-linux-gnueabihf": "e37b5185e8a583aff8144af2f5e72cab52747ba39e98f43ab4cdd96202e78be6",
        "armv5te-unknown-linux-gnueabi": "f0dfa7f9bf08c334567450189ca7bbeb48854c666efe8c97d994f770e819712a",
        "armv5te-unknown-linux-musleabi": "4936fd71bbd9667be3872ff8f53e88b3a9edf9e7268458738046824a28c6c82d",
        "armv7-unknown-linux-gnueabihf": "0ac50c8ea22308044125c0956ab916d16160b5b0cd01b7479c868e65320467e1",
        "armv7-unknown-linux-musleabihf": "6d8a092005fb8ea480a84346bde55047e8b0e23b78f37e38b482aad9e4649fea",
        "i686-unknown-linux-gnu": "71e0ce5ae10f4b48fe8b45fcc0b7f2e70bad29f1095f4251c838cf070465beb1",
        "powerpc-unknown-linux-gnu": "379c4f43c5ad7a5237a44bc1618ef264005957974417580cc32150ed30ef718b",
        "x86_64-unknown-linux-gnu": "eb334a2e07da87c749010844a70d815efddfe6f2572faafadbf126458a2724ca",
        "x86_64-unknown-linux-musl": "48919e755a1c40107da50d219ccb30b1cedc6d0e3c91c85b57ab26749a90d12d",
        "riscv64gc-unknown-linux-gnu": "0ee76277930223423c1aa4539b0422012c1ad1f026434487dc2761f25ac2b8fb",
        "thumbv7neon-unknown-linux-gnueabihf": "71383427e84b7be24e6ac79ecce5f6f77542c26d20dc4dcb0417479e8352b9bd",
        "wasm32-unknown-unknown": "9bc09c4a9e09975a92be540039051d5cf4445e66f129c643a40e86f21a42a3db",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1c0bcba54792972b3962dd9d5f9c1d5d",
        "arm-unknown-linux-gnueabi": "924ad9171475158bf264d02cefe3064c",
        "arm-unknown-linux-gnueabihf": "51287235c487baf34cd42970b214b33a",
        "armv7-unknown-linux-gnueabihf": "b9fd83ff85e652c1895f90811c966c9a",
        "i686-unknown-linux-gnu": "51804dfe95089fc721db0c2c164312ef",
        "x86_64-unknown-linux-gnu": "ce44c5575d8d49e1dcd188f7b6f3c4ee",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e6e1d0299de9a74ff43c894329da4062281843bd0b1bf422009b2cbc6b6b7c6f",
        "arm-unknown-linux-gnueabi": "4e8b8ec1b302c599d471224e4a03e204aab19028bc8a52feddeb51a86f0591c0",
        "arm-unknown-linux-gnueabihf": "cfea1b7953b0dfe93966970dffbcc32e506eb61c2a346c4e1b19e860ed84fc74",
        "armv7-unknown-linux-gnueabihf": "8a909f2ed63fb898439c80efc963751709a0c62e48e8e5554435ce7ba3325d6f",
        "i686-unknown-linux-gnu": "aafdca2c01912198c5d906da823400ed6e0cfc5e9a121d978484fb1b7c09c661",
        "x86_64-unknown-linux-gnu": "a1dbe7e5db23c4dd5a91b604315fa8b36cf5eef6274ce65ab6b0efc1b25b37b0",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
