
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cdc6d3d02cde7d7cd4aedee23017a2d4",
        "aarch64-unknown-linux-musl": "06641725868700931f3ef051609d205e",
        "arm-unknown-linux-gnueabi": "4edf451567a7ca4a8f9005051437a470",
        "arm-unknown-linux-gnueabihf": "3d506f630f33f11b761120a3024a4900",
        "armv5te-unknown-linux-gnueabi": "df639eb9ffe0376fbdb39309e22e5ae8",
        "armv5te-unknown-linux-musleabi": "7681a888bd53987b30b3e868f7608f13",
        "armv7-unknown-linux-gnueabihf": "1615d9ec0f75680996b3589aa04b6263",
        "armv7-unknown-linux-musleabihf": "1307ffbbcade0e80aca722b01a40a35c",
        "i686-unknown-linux-gnu": "4cbf94f38bbc257d845da1e4fd638d84",
        "powerpc-unknown-linux-gnu": "d9e24d9b905754f6fc0ce7bd32bab846",
        "x86_64-unknown-linux-gnu": "a742afe895015e0c17a40d89bb4bfbde",
        "x86_64-unknown-linux-musl": "b11a6034db26caa90487e8fefc7aa4b7",
        "riscv64gc-unknown-linux-gnu": "a63265ae4617edec953ea5e3bdde5581",
        "thumbv7neon-unknown-linux-gnueabihf": "c2418fc081cc216596267b94739735d4",
        "wasm32-unknown-unknown": "262b0f8962b97ae04c97318496942d00",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "234673e33b7a523818a81dc233ba636ffc5e4c94b9766f12e19a63c985ed7d21",
        "aarch64-unknown-linux-musl": "f0dbb9ed466a56f389956c51e7dc28f6bf15cb7d1c933450252503e8ac4ce482",
        "arm-unknown-linux-gnueabi": "4d3bc6440bca2acacc56a647dd426020b0d2c81d42e8731e06b0a8745657714a",
        "arm-unknown-linux-gnueabihf": "16c73e35416c8b39306d57400bd39288707f4e88004c4939ca4792c6214ea84d",
        "armv5te-unknown-linux-gnueabi": "d1f445a8a74f6f116c0f6e6f41e6e0b20770fd7d9ae25841aa6a6c57741a3b18",
        "armv5te-unknown-linux-musleabi": "188fba21986e6a2bb2bbb165bebfbf67c49419c231fae5d47d2c78fc0a94c131",
        "armv7-unknown-linux-gnueabihf": "6e67133169fd2bcb8bc9d4bc285c62a6620a38e12164c0d2a2da566a951e1fff",
        "armv7-unknown-linux-musleabihf": "6028b9bf9002ddc8e452d272d68244794f4b1d9e0da0ff1c1680716b3ebfcc20",
        "i686-unknown-linux-gnu": "0abd7d49b9e156eabf9edc7c44b89affe9d9fd6c8f823b6ab7a5e0464663c2e8",
        "powerpc-unknown-linux-gnu": "0646b18a3f29ee5dc2962c00312a3ce93d245f6a20ce0d5c23ba5686e408a9b1",
        "x86_64-unknown-linux-gnu": "7c6918beb76e62dcf43294b18fabe058239e2fb9c8c04ebda3854f9f2b22df3c",
        "x86_64-unknown-linux-musl": "4f0e181830b18c65e5ccc3281d93547fd4c061dfeb6576ca743741409c5ab225",
        "riscv64gc-unknown-linux-gnu": "8f92d15c1fa72f4f1228c145edd7e21744c3a54d777009545e620490926f9301",
        "thumbv7neon-unknown-linux-gnueabihf": "b8461fcb59eedb94754ff9c6439378907d04f4046e75b377ad7c818aa42703ce",
        "wasm32-unknown-unknown": "c5363bde6d2b680e43f7fd444ea60f88cf522070de86f0a940d6570671cef94c",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "51f6ecd3a0f743fd939cae10ac2ddd95",
        "arm-unknown-linux-gnueabi": "2c30d5e483e2bbd9abd5f1c6b3b17900",
        "arm-unknown-linux-gnueabihf": "a25bb790d8d8fbb21b666b9d0c19f3fc",
        "armv7-unknown-linux-gnueabihf": "45b296dd8b0ab54cd2f3dd55ed253b67",
        "i686-unknown-linux-gnu": "9cf5e4a981309e951f4c19504b775095",
        "x86_64-unknown-linux-gnu": "f01a02e8116cc296620e6148177443e3",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "08acb66f6cfc3d44d06c349edf947f41f30bb9fc74a28b0f003ad2d6fa96e878",
        "arm-unknown-linux-gnueabi": "ac38371ef6d0fb87358c627cd3c42b1e82e0d9cd0e9a0724e308896ef620374f",
        "arm-unknown-linux-gnueabihf": "633381c492cf72d4e5251322fe8eeaddbc8b64aa62ead830de5bbe3fcab7ecbb",
        "armv7-unknown-linux-gnueabihf": "b7e123e076844d207c1af36618be4254ef527edd2987dc2abc9c28764f501dbb",
        "i686-unknown-linux-gnu": "a25ed3295425bfef2965e4b23767e7b0f40ffad5887a678343db788e51ea89f6",
        "x86_64-unknown-linux-gnu": "d1e8db8c3ce0bd4b8a99e29bbd5132a3cf6a7e88ba4004bf7ce889fac7aa7e8d",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
