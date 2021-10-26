
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "039a06ccc56d82c1fe28f91ca321921e",
        "aarch64-unknown-linux-musl": "9cebb4b2a668c46b8cd87aa469db1a04",
        "arm-unknown-linux-gnueabi": "cf6fdb20e5aed680249b4853b1558f1f",
        "arm-unknown-linux-gnueabihf": "b02d7a123dc7ef57a3559f2bff254e31",
        "armv5te-unknown-linux-gnueabi": "c68d0371cf08eb3dc5a158e5a6dfe9fc",
        "armv5te-unknown-linux-musleabi": "c7e2723d3a61640da0a6a55f21f4b41a",
        "armv7-unknown-linux-gnueabihf": "cc34c81f831850e4f51e51fdfcea3ce2",
        "armv7-unknown-linux-musleabihf": "384655b3886168e07d361bd77f227859",
        "i686-unknown-linux-gnu": "f31cfc3873b94dcc83959b1d1c0a498c",
        "mips-unknown-linux-gnu": "a582b074029f32c159f49a0d6ed9bff5",
        "mipsel-unknown-linux-gnu": "68e336367533c666c3e684996bc5ee3a",
        "powerpc-unknown-linux-gnu": "7894790ecd1c9450515bf70fe8722cfd",
        "x86_64-unknown-linux-gnu": "d43f2f9d2d0dec81d7ec33e7b75be941",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "061c8a855696b3e23fb48ad69aa90e70ead825825e4cc02374d3cb1df4486258",
        "aarch64-unknown-linux-musl": "2a83ec23e14e0b578b636c3c95283c92fd034e8b56a564c043db3f8b746eeb2e",
        "arm-unknown-linux-gnueabi": "5e39ef97677771537656d23418432237a9ec3ad1717af608002fec9383a8a413",
        "arm-unknown-linux-gnueabihf": "f33fc6b3c59d48a51a735634529a1d802e211652a20d8d3f2fc33722c34fe239",
        "armv5te-unknown-linux-gnueabi": "3815ecb458e2088af3f64650ff14190c62a4e82d844bde3f140d182483909895",
        "armv5te-unknown-linux-musleabi": "c6bb721df267a4365200239924e2a99997ea11e81d2af57c2c97b225f7ce2bfd",
        "armv7-unknown-linux-gnueabihf": "0b3130ee5941f5b96943d17d9abf60ac5e0beddf0e5ed0477583a4bb1640640d",
        "armv7-unknown-linux-musleabihf": "f376b9a5698bef67a5eaac7715b106b4bc40de7abacb19a877ed5e82b7faf8b1",
        "i686-unknown-linux-gnu": "04f44d8c8479e1b7a1048dd238a81c547705a14f7f93d2071a56f23396a2e8e7",
        "mips-unknown-linux-gnu": "2ed8bf19d73f306343399c51f0c43fa53da427a2f12aa72da4a354623e0a48b4",
        "mipsel-unknown-linux-gnu": "01acc71b0eac8f19a9542fa384e97cf8e7e4d59434e18c1b5efca23abda2bc84",
        "powerpc-unknown-linux-gnu": "c2797b0e578897bb818fb7a186a5052d8d69bd85ec1b83ccc9eab58748d28b46",
        "x86_64-unknown-linux-gnu": "3c314efa230f95f5d9e3357e5f915a4f40d2a21b10ba7b92fcc9036cbcd9fbac",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ddb8a9cf910eb379e797647ff88a76c0",
        "arm-unknown-linux-gnueabi": "9c6d963141abc0e201d1f5a3684c4362",
        "arm-unknown-linux-gnueabihf": "8cfb5e7b8d055b5f817770a2db59aa8a",
        "armv7-unknown-linux-gnueabihf": "95fbbab9be36b23a9d4a88010fc51408",
        "i686-unknown-linux-gnu": "d1a3c80960a9995e4fd9ece116d5a35f",
        "x86_64-unknown-linux-gnu": "fdb0a8f43d60431d918764585c7b54e7",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eb7283729bc4c336aa23b020489e8feb78eed70831213ee2e4121ce7d6ac33f4",
        "arm-unknown-linux-gnueabi": "2d60613ca155698fab770980c2f9660f0e848a1a7fa170c6867a966dc413bcbe",
        "arm-unknown-linux-gnueabihf": "865bbffb83c2375334adebbf7792c7dc05aff2eb6f009ec1f82c9cd047b867a1",
        "armv7-unknown-linux-gnueabihf": "1406ffd50c2e46ae17109b432bb515ea2c296876713c78c7f3807f4a03b8f58f",
        "i686-unknown-linux-gnu": "c8e82dd5d1eeb60d77929ce51eb9a36d31b2e404c383d2382b0622d0da6a0adb",
        "x86_64-unknown-linux-gnu": "aa66db89c3f89325e40ba0bfe481f4d631559884ae4812c3c3d091d80ba7c245",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
