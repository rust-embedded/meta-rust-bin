
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3d8653f13e05af99b771b6119f49d622",
        "arm-unknown-linux-gnueabi": "60d0230ca3fd8fc62b314b017356f967",
        "arm-unknown-linux-gnueabihf": "c1e031c3f1b4fe23890eeabc346f51b5",
        "armv7-unknown-linux-gnueabihf": "4274ffcc4c368f2513f50398c9f6d2ac",
        "armv7-unknown-linux-musleabihf": "84c09560d8342e2f3a18e90c072ee344",
        "i686-unknown-linux-gnu": "3a9585a3f99da98f24265078e53a7fec",
        "mips-unknown-linux-gnu": "4cfcfbb1a7b7576e7d075930809dbabf",
        "mipsel-unknown-linux-gnu": "5e9a9aacc70969cafa1c74403fcfb93b",
        "powerpc-unknown-linux-gnu": "68cbee59f311b8935de26a18f5518e2b",
        "x86_64-unknown-linux-gnu": "00b3a799835e24ab594f6aec434bb53f",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "60d64dde9178fdb698b44315b182375916116e30f5fe7f0d8278dd62eb15e7b3",
        "arm-unknown-linux-gnueabi": "709351f2d3329faf6fb5c2474ce8e06ec0fa77c2ffa7fa80f9696ddfa45c4cd4",
        "arm-unknown-linux-gnueabihf": "3e0f58fb599bfb0a9d106d4f6b7cdb27d833a9fb62ec0554e809bd29883ddc40",
        "armv7-unknown-linux-gnueabihf": "d5e0a86515b102f0b7a541e324d3e49b0346b02e8cc388bcf84a8bf48da4680d",
        "armv7-unknown-linux-musleabihf": "beec3f2ac4f81eb944ec0d3dea19c9416273f5c757b804edcd426ef591daa60d",
        "i686-unknown-linux-gnu": "0de45c1825c0f8f11eee94021b4c5ae9320e506bcd5f666466e7c8d1c99f88b3",
        "mips-unknown-linux-gnu": "84cfc1de8885eb7cc60d0b8a22930e7e34430a9dace10ef09772e7e2792293be",
        "mipsel-unknown-linux-gnu": "8f7eb8078359db5b8e573665da162ac5dd5a6e1b7ab3d99b4c40e0932460eb37",
        "powerpc-unknown-linux-gnu": "f0b9d6ee00d056de964c25828afa40d58c61162d7374c67157c75f04cb76925c",
        "x86_64-unknown-linux-gnu": "09a531a97a16701eb794ecbeeded5d8f8da33da7f1bd372661ad385e3f31c048",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e783c4e1cc670b2ccb1e6a2021ef5117",
        "arm-unknown-linux-gnueabi": "e8b0a42302d5d3e91373d39f66616680",
        "arm-unknown-linux-gnueabihf": "ccdd7b5aa9fe3fba931280a729b489ac",
        "armv7-unknown-linux-gnueabihf": "39565782524957172c14daba4f6640e0",
        "i686-unknown-linux-gnu": "12d550e3b572f1f3c1ec06b4f8ebc77e",
        "x86_64-unknown-linux-gnu": "8f51831a43c2876fa2cb05d759984769",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "721ba21dbe9b350a8c50a4c783c76ba3f6926525480518851dd6ba92ecdb042c",
        "arm-unknown-linux-gnueabi": "bc52586b31b4589a0a318c371a5f5c352698b9f851a2ca1545bddb919aaa1636",
        "arm-unknown-linux-gnueabihf": "fee3dd400a52bbd4278995a8a8914163a08c702874770b6b4415c0b92cf25da0",
        "armv7-unknown-linux-gnueabihf": "5ba4a6f5baa45f952ce3a72c4480e676236c107d3353f8322b61bb76b049c340",
        "i686-unknown-linux-gnu": "c9aad7765a6dc700ce5110de48153129408a7d93cbefd6fc03698c1088fc63ff",
        "x86_64-unknown-linux-gnu": "c759b318f333639a45f29c1551ca7ce55b1bf64e0fc3a3357d6b9356885d1626",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
