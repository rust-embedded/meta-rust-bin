
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b72d82daf3a82c04b01f89f33b23c31c",
        "aarch64-unknown-linux-musl": "d48561c3cd5565ff8d290304af4b26eb",
        "arm-unknown-linux-gnueabi": "d9526e38b221eb458388069a4bb1ee59",
        "arm-unknown-linux-gnueabihf": "81e00b17903df994d564391613f14c63",
        "armv5te-unknown-linux-gnueabi": "719425d6c13cc2c17aaf785e625fa576",
        "armv5te-unknown-linux-musleabi": "2a782473af67ddcb235d783f42074fe4",
        "armv7-unknown-linux-gnueabihf": "e7e91070c7613410cc53dd72a5de16ed",
        "armv7-unknown-linux-musleabihf": "5d2c459ee894195f8c13a6c6d97147bc",
        "i686-unknown-linux-gnu": "3f0434bcae6a40ae31b07ae8d1ad595a",
        "powerpc-unknown-linux-gnu": "e57cb8821b5f7608eb7e3bd460cf39bc",
        "x86_64-unknown-linux-gnu": "1d4af380ba0db6466820b0d37c82264b",
        "riscv64gc-unknown-linux-gnu": "90a6b70bf99f59567e5affd0370477b2",
        "thumbv7neon-unknown-linux-gnueabihf": "1e818dc3138cc2f825184a038b0ad901",
        "wasm32-unknown-unknown": "428c6162bc21bad4f155e4899b588397",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ceffa428fe573507418858d59add342b351730725f36f7679b251e8b68103dec",
        "aarch64-unknown-linux-musl": "996597f66ec22cd0401e1f171545cd87267d2efb5519d8119b747467053f438c",
        "arm-unknown-linux-gnueabi": "8e4d0edb9d3e094411ddc50f0ddc5b05c2215bbc67949105868da8727ec2df19",
        "arm-unknown-linux-gnueabihf": "435f7de23513a048ae06a91f6af5399d22a8a53f7b09482d8363b22cef620a20",
        "armv5te-unknown-linux-gnueabi": "b9eea1e6e8282a989ae35a5e29ec031b0397739bac1add0efd6c3f235e89c32e",
        "armv5te-unknown-linux-musleabi": "92e90b100aef8a11a5b279a4b5231358e05e31387b8111388a8329aa3d0e8789",
        "armv7-unknown-linux-gnueabihf": "63bec0c52cd9f416458339ba80fa96058b40292170e419caefd6e529988d53af",
        "armv7-unknown-linux-musleabihf": "ba78ca65d7a90119b002dfac50c02aa8dd47d2a059b72cdec9b067b723c75bde",
        "i686-unknown-linux-gnu": "73b95d3f0e93a9a1d81bc25f2ecad3777f6073c0a8615d976f5e2b309b0c986e",
        "powerpc-unknown-linux-gnu": "ac7cad09792c1e6a39de1856b74e59c9bbf06a88e65624da9de5a0c7980fd76a",
        "x86_64-unknown-linux-gnu": "45b927ecf776b9645ca2ed5b287fc6814824a073c30c7c5d5c0ad4425295ecee",
        "riscv64gc-unknown-linux-gnu": "c7e88038a2b22ac726b12c360b18c9ac9e6b1480eedddf0c7aaed53bf6ef2a40",
        "thumbv7neon-unknown-linux-gnueabihf": "f139eb9533adef7b8eecc6d90ba8543e90e51f9e10d98638dade531cbe8f43b0",
        "wasm32-unknown-unknown": "13902d5573eeea50701d75acc774b6df2dfb4942ec88cdbe40bb07e448c307ea",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b221d2a160081b80d17ecdc96aeea581",
        "arm-unknown-linux-gnueabi": "ff93011c6157a58145fef0a76d4b867e",
        "arm-unknown-linux-gnueabihf": "39e1214ebd5065c7a8f705b105a66c8f",
        "armv7-unknown-linux-gnueabihf": "477c5a92dd015ad6fdc3c9d3fba0156b",
        "i686-unknown-linux-gnu": "948792f7541a503c3582b04f6e718d23",
        "x86_64-unknown-linux-gnu": "9bd498907f59d7dcf6c2d113541c4960",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8d9f3095a3108e38232f123645e2a0368bca67c975f8b91088004f8ffd9a6d39",
        "arm-unknown-linux-gnueabi": "fc09f8f8983ec1f7462f1b3f3e315b347acf33e43d4d9c05d373716035cd7624",
        "arm-unknown-linux-gnueabihf": "ade97ce74857ed20b249b54d273d1ed408d0a3f52dc9c11bea0f04fae0ebd7d5",
        "armv7-unknown-linux-gnueabihf": "e8aa806e7e1395cc4cd768765b72f27a1bd1c2fa502c8b81543bbe9b16d4578f",
        "i686-unknown-linux-gnu": "af0cd4c7c98a6f20673a8a839fdb858eee8963baaa25f632d1ef97774563b2fa",
        "x86_64-unknown-linux-gnu": "1c441e430c1cca49dff54a8d59c41038bf6f79f7b8756596cb2f36511a015eba",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
