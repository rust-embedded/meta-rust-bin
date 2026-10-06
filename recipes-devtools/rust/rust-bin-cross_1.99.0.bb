
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "87b6c7707e7cffa69acee1fbc7c933db",
        "aarch64-unknown-linux-musl": "876551b6c9d0b48ea9f52db9cb690e50",
        "arm-unknown-linux-gnueabi": "b4bbe0a43bc3504e3c51f571a6673d8e",
        "arm-unknown-linux-gnueabihf": "20c5541610d66f378579206c0f05e4a2",
        "armv5te-unknown-linux-gnueabi": "338e0074e233eea7f9671dc35a7fd378",
        "armv5te-unknown-linux-musleabi": "c5117d4ce8c470963e10a2278efcfe2c",
        "armv7-unknown-linux-gnueabihf": "4bd1a5920967caea86b82715f3eb6d7e",
        "armv7-unknown-linux-musleabihf": "0fb02b47129ee4f29893418830a85151",
        "i686-unknown-linux-gnu": "c4df1fe5531ddff0b94eaac5321a7abc",
        "powerpc-unknown-linux-gnu": "41f72e68a2d4f219bb724b05d8bef726",
        "x86_64-unknown-linux-gnu": "b3cf6ab086af2a2a49d447658447408e",
        "riscv64gc-unknown-linux-gnu": "a088f58d3a42dcb142e52550ac1aa5cb",
        "thumbv7neon-unknown-linux-gnueabihf": "b33f593c4b25fa6ee7a912f851a26122",
        "wasm32-unknown-unknown": "e4c969ac2678c224ac0dc970bc330dcc",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cdffa7100206633ccfd2514ea7781b4211813bf04c831a509240e1cda5308512",
        "aarch64-unknown-linux-musl": "202f95c683d30d2f65cb7e3b6b2c7853a364d268bff54dd44a1dcdbb63632374",
        "arm-unknown-linux-gnueabi": "6272920de48e6f268053c6510b167795d106b9c560bd96a41b07f1fe5e1c1637",
        "arm-unknown-linux-gnueabihf": "915b74fae669d9a3f042064e1e54699695507b0453992f785dde361ad8105cc1",
        "armv5te-unknown-linux-gnueabi": "3b3c06a8caa416c89d3b0d10da05a40e7a97b2f9762d07d777e969faa305a9cb",
        "armv5te-unknown-linux-musleabi": "5fb86a94557e5cd6979895032b8411d510c33d1f32bc4a279eb7178a35ceceb6",
        "armv7-unknown-linux-gnueabihf": "9dd32a12d921a3112fe7953ba27df0bbb6227c11c9e5821b41ffd9828be3c7cd",
        "armv7-unknown-linux-musleabihf": "1ae1cf536cfe99d478e22e94b8c8ca6a438d2c0820357f1a9ab1bc99f86f7f10",
        "i686-unknown-linux-gnu": "2b7db847af9888ddb249d3e1c8aeaeeb82ae529bf62426b82330a4cddac8bb38",
        "powerpc-unknown-linux-gnu": "ba971c534181400ab788a8218dfd42c97aab07c1b1cbbcc59b61370ea647bf20",
        "x86_64-unknown-linux-gnu": "1dcaa01beb6bc78fdb13815b4f15214719167c58e3d79fbdf214591f8c195ee1",
        "riscv64gc-unknown-linux-gnu": "5384a71d5b83601dae803a4418a73ea446a44b0829d53b9568cad4ce93e2d72c",
        "thumbv7neon-unknown-linux-gnueabihf": "a0307ca1ce09ba26c5b741697e9e98d240b9dc87ef6d4418f85a53ade03a5ba0",
        "wasm32-unknown-unknown": "4dffdca3c11a88f18a35021cea4ed0279b41650c0e3e2e98928ecc28958bceba",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4dc16487eb79d589dd52715af93ef32a",
        "arm-unknown-linux-gnueabi": "1d85be10e2fd5c1ca857990a2a50ed4d",
        "arm-unknown-linux-gnueabihf": "9cae58d3cebe0b57f623ea83a91653a1",
        "armv7-unknown-linux-gnueabihf": "489a5bb8e4d585b58b8a5e103d3cb390",
        "i686-unknown-linux-gnu": "1fe4df8943a4ac9ff58344a58430484f",
        "x86_64-unknown-linux-gnu": "d47111d79ace641b69efe159829d9542",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6780ebb1b8ae66cc5d37ebfdc70b18fe775b1083c997f4e2c963d45a7eec59bc",
        "arm-unknown-linux-gnueabi": "35883bfb83790e44cb838de0be9c7f9c65f74b1ac94fbfd2d579e83426902958",
        "arm-unknown-linux-gnueabihf": "70d931b15c7f00a95f2a2653f6f5fa55a40326a3272f0a8838293275c1cc7467",
        "armv7-unknown-linux-gnueabihf": "f3193c1ae454c9ebf750551a1291d51a6ffb6a93a1bf1074dff80fe13f6c505e",
        "i686-unknown-linux-gnu": "9be63a7bc8faad373cf57e2c889d71aa4dd07c030f20b50d99dbf4c26415d948",
        "x86_64-unknown-linux-gnu": "238e72b8617f79bc96f27a5bfeb1a208b5755fe1a48f8bc190fe403ef6d54ab8",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
