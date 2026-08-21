
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e3b04cdcdea26dc8823c64e798ea22eb",
        "aarch64-unknown-linux-musl": "72dc51d3219524f88142cd471252e4cd",
        "arm-unknown-linux-gnueabi": "c84bf32a562a92fff4cb6feb97c30e9a",
        "arm-unknown-linux-gnueabihf": "afb9a02cbc8530f0f0364fcac2a6a836",
        "armv5te-unknown-linux-gnueabi": "c47d1c337dd023dabbaf52f954dd1052",
        "armv5te-unknown-linux-musleabi": "c4e6b8d5e2a1519855cb285b406ed52d",
        "armv7-unknown-linux-gnueabihf": "35333c1cc6d9ca6af007647ea035254d",
        "armv7-unknown-linux-musleabihf": "b295a2497b08dbc7671fcbca79e04ab7",
        "i686-unknown-linux-gnu": "0bef8299cdfb8a5fc28ac57cb5d98759",
        "powerpc-unknown-linux-gnu": "d8a7db010d2ee45b2f2f7cf845fd9ba1",
        "x86_64-unknown-linux-gnu": "8f057ca009ec49d937afaf8e1ee19bb1",
        "riscv64gc-unknown-linux-gnu": "333ee19a2f0492d7717f7643ed8b194d",
        "thumbv7neon-unknown-linux-gnueabihf": "633c20bf6c4c3db57ef3c3c3555d6ffe",
        "wasm32-unknown-unknown": "3eb261b5b6ea7afbe2b4045cb291b047",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a2eece726a579de1f554a2c3bcc62410226b0be55736f57c2b5430c1bc71b98f",
        "aarch64-unknown-linux-musl": "4367ba0e6b8fa5ef9c195d12f0ab4a39b8f08cda627cf121f5f929d47161f4b4",
        "arm-unknown-linux-gnueabi": "c841b032e6a3d27d91e8faced0e9a93008835cf4eb4b0ccc123af3cf72bfec39",
        "arm-unknown-linux-gnueabihf": "e8e86da215f14956225e4052ac007f454bf7a8b3d9a9e7574e33202ef2d92704",
        "armv5te-unknown-linux-gnueabi": "e5975f3db9b95321096b886314e43fb7fb2a14232a7355ad7536808e680b53c1",
        "armv5te-unknown-linux-musleabi": "0a631db6b4bb74161675bd71222f558d0f7c4da315f57fb6364e4f6fc71a9a2a",
        "armv7-unknown-linux-gnueabihf": "0ad0e7b3692f474916a5c7fd1b6268de43918d79d414dee1d838f79eda9a5340",
        "armv7-unknown-linux-musleabihf": "3425b1273241838e3c4d4d0558c891eeda5c2d4e9745fa455132c04071c86e80",
        "i686-unknown-linux-gnu": "2c11ba7ff18145862d5435d3e246c78d1c9ffc2c17f09a202a1d036e20451299",
        "powerpc-unknown-linux-gnu": "9b6e5106ca2f8b10b4c060fa72cec06164125928cc4bdfeb8d37bc9924819ab1",
        "x86_64-unknown-linux-gnu": "8aa6405356392ce50160d1b286e86091c5e14adae3061115699c84ed4394d546",
        "riscv64gc-unknown-linux-gnu": "106a006b11374de67ee1098f0aab317ed28453c8cff049e6a167f1b654083340",
        "thumbv7neon-unknown-linux-gnueabihf": "7cf3dff3344089569fd8820f3a568573c41de2f9917df16d081769e1eb810019",
        "wasm32-unknown-unknown": "d2443b4da8d168f152875416ab204fea42f2ed7d9dcce92725d579722e0bdaa5",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b7cf0f3826826af21c407a2217337f60",
        "arm-unknown-linux-gnueabi": "a24216c483005d2ad0577649d6d1b032",
        "arm-unknown-linux-gnueabihf": "130d672963d15b2be3e6a50172c88801",
        "armv7-unknown-linux-gnueabihf": "27e5933f7eae87141d69c63f3f677012",
        "i686-unknown-linux-gnu": "2789a34f8f001056c5132f7ba0cd2802",
        "x86_64-unknown-linux-gnu": "c7e7c03822b88e1b10679dae94d492b1",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b6fdb37bc08e320bd92381e13d7311837f04a98423b8a5b678a5eb5e87c978ca",
        "arm-unknown-linux-gnueabi": "9bbcfc657a3ec1552042d3edfdb0496dd1c1545b87cee056d654a06124bd088f",
        "arm-unknown-linux-gnueabihf": "0aa09d8717c3e22c89a9ebdc367f8c29896b8a2f0d21f52ea2fcf4930ed3bc8f",
        "armv7-unknown-linux-gnueabihf": "af1e22428773ed43a87dadf5ebb71dcc84c00153f2590b6de18080ba4e959756",
        "i686-unknown-linux-gnu": "0e8307334eb6c9e217a84a73d39e5ec47a0947b3114d593d043fe2daa094e961",
        "x86_64-unknown-linux-gnu": "18ed6559de1b8ea6b77474ea86992b9a507d3a3d134d9ee017d30cf3f406e3ee",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
