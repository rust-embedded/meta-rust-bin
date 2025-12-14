
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "284e33842c3dc608f0c78345e35e95de",
        "aarch64-unknown-linux-musl": "e86611585606783043e19ce1c63e6485",
        "arm-unknown-linux-gnueabi": "6c228a90969836fa8dbf1cf3221490df",
        "arm-unknown-linux-gnueabihf": "5faac99c0842af11b545e9703ee6e9c6",
        "armv5te-unknown-linux-gnueabi": "b86100eecaf142227a55df7571300ea6",
        "armv5te-unknown-linux-musleabi": "51377dc84c247998ef3d466d93bec4d2",
        "armv7-unknown-linux-gnueabihf": "77a79c85e62b7368a3192de38524596d",
        "armv7-unknown-linux-musleabihf": "0b4c1d2a83279d6179184256900bb641",
        "i686-unknown-linux-gnu": "e271e9cdd08fe15a5fdc7ade0b34c1db",
        "powerpc-unknown-linux-gnu": "91ee2184a667e2edb3dd01a5eead0047",
        "x86_64-unknown-linux-gnu": "ae148f391e11cc8a02b8b0ed9999354e",
        "x86_64-unknown-linux-musl": "b545d4d21df5f5cd90f40eb4d7f24f23",
        "riscv64gc-unknown-linux-gnu": "836f5455d0e7d67f0e19d7a830f27288",
        "thumbv7neon-unknown-linux-gnueabihf": "3d4b2fd78aab3944375fa8d22ac76132",
        "wasm32-unknown-unknown": "85a1d3150ac91d47c96b60ce6dcd1053",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "74960aa36e66541b3e9a8f78aa5df9c5c5a0e93207c0bb42a4fa141bccfbfd14",
        "aarch64-unknown-linux-musl": "362fc890fac4c837661693489ea44dddb36fdd0dbfcdeac22eb2d004452220fa",
        "arm-unknown-linux-gnueabi": "56530bf5962e4e6a60c104b2432c1c8b442ee45dc6ae71730063410c9b286a8c",
        "arm-unknown-linux-gnueabihf": "7bc05b986d8da982d78ed05ddb12ec65e21d84513a140542346568517685e8db",
        "armv5te-unknown-linux-gnueabi": "55777b1247ff0ba998f53c3df4346fdd0a3317186986123dffeedd4643ef7969",
        "armv5te-unknown-linux-musleabi": "c4c7f0e1db886e627692f8abd4904475cf77221fbdb783b59d9104c9d8f1c86c",
        "armv7-unknown-linux-gnueabihf": "7b6d6b579a0c1d195f004f2f064169bdb80f57d029fc673d8564078b966cc22d",
        "armv7-unknown-linux-musleabihf": "eaa19e977559e0b23bdafd5a0abb9596421b09de13d71f7f7c3fbf77e4d1ac82",
        "i686-unknown-linux-gnu": "13b47d53abd290c9ac27e67f3d4bb8a3e1e483c2d8d0bd8c376a9d6a30e65af1",
        "powerpc-unknown-linux-gnu": "33ab9b777d48f478992290acbb19eed2d439d49a8cb33b0681387c47f8b19801",
        "x86_64-unknown-linux-gnu": "b7a43ed4bc9a9205b3ee2ece2a38232c8da5f1f14e7ed84fbefd492f9d474579",
        "x86_64-unknown-linux-musl": "c9ad24df044fc221d3032732ba6cb5604718e75e11d18b9e9d02c963955d4620",
        "riscv64gc-unknown-linux-gnu": "bfc9b562ca488801682f62303bc9c1f429bbe66adf5eb05eb193484c75ae9a2f",
        "thumbv7neon-unknown-linux-gnueabihf": "a4725ba7545d9f6521416be99914bb81a5bf3dc47426649b3b9f0cbab5aad1fd",
        "wasm32-unknown-unknown": "b806e467d4334169b594807bee4006c0fad39e0320d9c29cf6948f4840a6e995",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "094c3ca4879a9d15eb698c2aa4933535",
        "arm-unknown-linux-gnueabi": "4a7dc76b84bd9706d75534642d1848e6",
        "arm-unknown-linux-gnueabihf": "b57805762a61405928fc2358ee2e30bc",
        "armv7-unknown-linux-gnueabihf": "9b8f920a6b6fdd0e979a08680ae95c26",
        "i686-unknown-linux-gnu": "4cf252d3f769c1e990758f80af529758",
        "x86_64-unknown-linux-gnu": "f2a6069547e8b77643f470e49f2b698f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b7da2133a86e15a03e49307c0e91b0ab39c6ec8d0735a1c609499713f7e31571",
        "arm-unknown-linux-gnueabi": "ca2c3a8cb5287a686f70c73fd3dd1b294c7cc48c571b46412e54dd076a6abca4",
        "arm-unknown-linux-gnueabihf": "726f8141471148d9efa57508f792d4196a3c2c87c03f2e787a8344d9438fe07a",
        "armv7-unknown-linux-gnueabihf": "5e5d9e153ad1b84dbaff6ccc9f6d2493e3f756f410ce914455724380484547f4",
        "i686-unknown-linux-gnu": "1891647418fc1be50bb2289fe39715379904cd59bcdeb0945f6fb5be1a42fe01",
        "x86_64-unknown-linux-gnu": "9684bc337f41110821fc94498e0596f76a061fae4667b195579b03fd141ad538",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
