
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "06f5c6c5f6414f466085f29115245cb3",
        "aarch64-unknown-linux-musl": "c335170190f1f931b458f03dc47bcbaf",
        "arm-unknown-linux-gnueabi": "4068c46d2e41dbcef176cbc3ac746c27",
        "arm-unknown-linux-gnueabihf": "19cae266e76462f7206507ee65f824b5",
        "armv5te-unknown-linux-gnueabi": "9496f7b2deae71facca6ce0e41850b83",
        "armv5te-unknown-linux-musleabi": "d617e385a804a76ba09ee22e78bfc4ba",
        "armv7-unknown-linux-gnueabihf": "1ae62f90f18889e99f88e9be75787bce",
        "armv7-unknown-linux-musleabihf": "0a9f391525a0ce6632236400f6539fca",
        "i686-unknown-linux-gnu": "109e0e1abcbeff7d44fed74c72802a59",
        "powerpc-unknown-linux-gnu": "4a8ded79e923eb9afc4c5d750609c322",
        "x86_64-unknown-linux-gnu": "d9a9bba8e16426b641f2f8113d9c4104",
        "riscv64gc-unknown-linux-gnu": "a546d5640a5629f0bd73b93635a2d592",
        "thumbv7neon-unknown-linux-gnueabihf": "251f8a4e47391574eec8594f40d7c657",
        "wasm32-unknown-unknown": "b681adfaac8d9309aa8a550a7b5482fa",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8f42b40c0a0658ee75ce758652c9821fac7db3fbd8d20f7fb2483ec2c57ee0ac",
        "aarch64-unknown-linux-musl": "07788bc6a1d17e8f0791c3367734c3c65165ca806ee83d01dad303059690b19d",
        "arm-unknown-linux-gnueabi": "096aa203d690339f3831052b9dac52d91cc5dd63627c6c89688c16d7f70dca4a",
        "arm-unknown-linux-gnueabihf": "f0630a13adf0f86f5db528291a838645e31ce63e1e052ef5284aecd8ae6cecca",
        "armv5te-unknown-linux-gnueabi": "2e6b90f114fb81cd8d746895560552d82c09c08bdac97116a29f336019ca3982",
        "armv5te-unknown-linux-musleabi": "e51d66540ac036582d8a84af72a5a6da27bc338ea42fcbc5ca7679a8abb4acbc",
        "armv7-unknown-linux-gnueabihf": "08edc4547495299393a0e18f8eff740d7cf31e00ad2b31671688e5e4438abe16",
        "armv7-unknown-linux-musleabihf": "fadb41835ada212a248f663caa0c727e32a3c8d9471bea25f63a948b760e3124",
        "i686-unknown-linux-gnu": "d54849ab7168e16210107b812871bea7f282a3f50b4b34aa252f04f25f8a8bf9",
        "powerpc-unknown-linux-gnu": "dd5c877591ad9df7a5cb541e23be18d1ca7ccc04850c20118b1eab35625845b0",
        "x86_64-unknown-linux-gnu": "b6986b4042af7b17fc8f51127018617b32d45cd555c582efa816ac194d4b53df",
        "riscv64gc-unknown-linux-gnu": "b8b03db1ca7286976099fae83b972b320aa69ea50b94c8a1a4001e9a3b85c888",
        "thumbv7neon-unknown-linux-gnueabihf": "6d9765056f095182a39e67f51fea587f445096307c77a46421c8eaeb8aec4ac4",
        "wasm32-unknown-unknown": "895f79222ea5d9cc50a1257a8ac208c1525ccaf8f25dcc138183a6cd61be79d6",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8ec2b575041b8bfe7a2f9e3942474730",
        "arm-unknown-linux-gnueabi": "eddf738af5a4348722d821cbd5f32bcf",
        "arm-unknown-linux-gnueabihf": "89bd230acff44bddf8296698cfb73a6d",
        "armv7-unknown-linux-gnueabihf": "8f1f40dbab07d1f4a9d21c9e772ede5f",
        "i686-unknown-linux-gnu": "371ad2179819f2e24e66e79c33dbc51c",
        "x86_64-unknown-linux-gnu": "0d8e7aeec55238c13d32c884cda88a62",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b240a2d8182adb0aa2978ba8ec4812014b3a93a1aa36f10ca2ef3b1f4d80a47f",
        "arm-unknown-linux-gnueabi": "6a32cf470f510d0882f9570524a5616db644df6a409c99922d5c74ed8bb8a42d",
        "arm-unknown-linux-gnueabihf": "e5e5fa9ad8e7e5d455f515c8308e870b9916ad836f0ceb36897a16c3bab24924",
        "armv7-unknown-linux-gnueabihf": "53dc923efcfc8c6dffe8a635d24668d0146732228deeb6a560e1e3baedfa4fd8",
        "i686-unknown-linux-gnu": "aca43ad204a3ced049e389f4187afbe14015acdd803bdf6269b0a6a45ab9ffa8",
        "x86_64-unknown-linux-gnu": "edd616432207bee868bd585fdd7c7229699f8bc3ffdcfc90e5a7404aba0d30f4",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
