
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f136de0ad0f77c64fdb48c32be5fe5cd",
        "aarch64-unknown-linux-musl": "aeefefacd46ca0ce580f4235a451bd87",
        "arm-unknown-linux-gnueabi": "f0f16e09a8f3e01689a366584b830907",
        "arm-unknown-linux-gnueabihf": "6ed72002fa56f08675ef0c77dfef4933",
        "armv5te-unknown-linux-gnueabi": "56bb8b03ee48a5a547fc45c316282b01",
        "armv5te-unknown-linux-musleabi": "43c561bda7014c1645de3cd4151db02f",
        "armv7-unknown-linux-gnueabihf": "f8b3f417020c7fe2d0a92813b01266d6",
        "armv7-unknown-linux-musleabihf": "1629c470b5542de876623dbce040c433",
        "i686-unknown-linux-gnu": "1a89ae5f276a4bce1d21f7ad7546f094",
        "powerpc-unknown-linux-gnu": "59216f57de54e1cd149bf51ca7c11ac6",
        "x86_64-unknown-linux-gnu": "a8f43a2f5563c13820473b2f1059c144",
        "riscv64gc-unknown-linux-gnu": "772e545365d5904fc7b051b6bb5e791a",
        "thumbv7neon-unknown-linux-gnueabihf": "300797483cbfe96b189f09c04d6300ed",
        "wasm32-unknown-unknown": "18fb36ac4c2ed41bd45cf6242bdad06b",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4c70901d1cbddec9ea99fbd62b20f454d30e1ffbb48a21169ac823b3f02a1fbc",
        "aarch64-unknown-linux-musl": "4f0c6533186b8fb596ee11b49bd6c9ffb76be59eb8bbdf26f25a47d297666c02",
        "arm-unknown-linux-gnueabi": "976ca4b8feef5e455734ee121f947719c32e1a3bea273e186c110bfb2c129c5b",
        "arm-unknown-linux-gnueabihf": "5d64eaa7af15fc79de39f12ba354ef8c9bb6d5728350c66d7252ba25c64aa205",
        "armv5te-unknown-linux-gnueabi": "2d2eaaa29093306eb65ce7011456e5b4fa5e2f262697b72d25d804403a8ff632",
        "armv5te-unknown-linux-musleabi": "3f29dbb27b75626fc5ab0d31a932c60126e1c696c191ac444910889cf65208cf",
        "armv7-unknown-linux-gnueabihf": "39b170358cf76c6dc284cf2c99439338871b79f5d0417f3342d48694c392121d",
        "armv7-unknown-linux-musleabihf": "0c3917cb3e166fc1f3dbb945893199a12e578df32f02c70c9bce1cda7d968c1a",
        "i686-unknown-linux-gnu": "6fb3eb0e9f401d568a3da52c7cd26dadfcd6f1ebd4bc25075b5a092e51e230c9",
        "powerpc-unknown-linux-gnu": "dc70b13f3cd8bf6eab0d619a5e0113b071b070d06cb0bacec0e0632e09a3c5cc",
        "x86_64-unknown-linux-gnu": "9140ad6f46a903345d4297a987ccaf37b9c5ca594cd6fd5a27d0be482116fe7f",
        "riscv64gc-unknown-linux-gnu": "ab549d4b6ac630abb96e2739f36f2165816efdd0bbba5982a827953886ab2531",
        "thumbv7neon-unknown-linux-gnueabihf": "03e596499c02298a6633afaf942a6efc2358730bdf1bed71fa2a23e6d45466af",
        "wasm32-unknown-unknown": "3e0525d9e16f1a58e847080f2d3c02e275c2d5563b7980311e39382bb6c8441d",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7076f4b6c327797afed21efb215d7ee9",
        "arm-unknown-linux-gnueabi": "60912736346f3b273e8c2afaad782af4",
        "arm-unknown-linux-gnueabihf": "04f071453e39f409e7132539336caa71",
        "armv7-unknown-linux-gnueabihf": "cbaa2bd5367b9c211ad7f20408f568f5",
        "i686-unknown-linux-gnu": "aac8578c856d2a32ca181b532dda5a79",
        "x86_64-unknown-linux-gnu": "d35ab3fd33c00411e00d9e1fd7d1b2cb",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "91f1e29387fc53430592985b0620c8587e4aacc8ac582de4ef96c45c9ae930d4",
        "arm-unknown-linux-gnueabi": "db328c9cff0d47e15c5fcdfd462d62433457a077a2e531a7b488c44572912f1e",
        "arm-unknown-linux-gnueabihf": "14ca5b876d92c1311be7cfbd38e25eb0945be98c9d8f2dd491702c3c4bb9d8c3",
        "armv7-unknown-linux-gnueabihf": "f7293a081f9ad5afc45ef31e35fac1390705b6ad7b0aff7018fb6f1c2ff4cb5a",
        "i686-unknown-linux-gnu": "356a12b32b951cdb71f34b5c75e7a32f331148bf3fae81106d3ed070fd598f93",
        "x86_64-unknown-linux-gnu": "92257646cd85b7c03520c838920851c879845ed8dfd2b339d2ebb4480ee4d4d3",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
