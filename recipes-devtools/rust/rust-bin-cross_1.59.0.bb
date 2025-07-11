
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "63f3266fa1f82698c5c30f552ae14d53",
        "aarch64-unknown-linux-musl": "7ec89ce7f70900a71bceb0b0acb6725b",
        "arm-unknown-linux-gnueabi": "531da99285995808f698a2fa17a70710",
        "arm-unknown-linux-gnueabihf": "e7a01e4776cee18972aeac7fd5bb13eb",
        "armv5te-unknown-linux-gnueabi": "3b8cda807f81848647fd33aa7ca23eda",
        "armv5te-unknown-linux-musleabi": "ee07d14c3ae02f2456b69e9323aed2a0",
        "armv7-unknown-linux-gnueabihf": "6d95e36897a970bcb616e67ac1e7b36b",
        "armv7-unknown-linux-musleabihf": "752011663a41fcf84aad2143eda56a1f",
        "i686-unknown-linux-gnu": "c2f9f27ab8069eb38d8eea014912efed",
        "powerpc-unknown-linux-gnu": "14e9875d79781fb3b03ce51e969e182d",
        "x86_64-unknown-linux-gnu": "bbb80d3b60091cc5d6328ef6b0d49440",
        "riscv64gc-unknown-linux-gnu": "654079f6e9848ad2fc38bec852a1c7f9",
        "thumbv7neon-unknown-linux-gnueabihf": "8e3120c0ac83d675dd08634efb91e675",
        "wasm32-unknown-unknown": "c13448e0b6c2354fd8b678fe1d2c77d0",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "81dbd37919f631f962ac0798111803eb8f06ffde608f0e5dd3682d701cf5566d",
        "aarch64-unknown-linux-musl": "e4f73617db73df7cb3b97984e38184f57292cc527654b52451293cd70f36f5a4",
        "arm-unknown-linux-gnueabi": "11d0f3305cfa2b1ee5d402d63a6c9989dbe9df0c909690527b1586cc59c8cf69",
        "arm-unknown-linux-gnueabihf": "14511cf20e65aad774744e8f5a6f2b26cc67c4a73db66fe20923c9cc3deea605",
        "armv5te-unknown-linux-gnueabi": "c48dee7e00bf1bbd4b2282dad5a9ad870b8a11ed41e6d5ff790ccf2590c5927b",
        "armv5te-unknown-linux-musleabi": "715d1feedc346fbf1a5075f67668f475c701445ba86d913248301342cf8081f9",
        "armv7-unknown-linux-gnueabihf": "ac4c1758db6001179faebe210a7d2bd1beacf3998d690d0957a5412728763c45",
        "armv7-unknown-linux-musleabihf": "282586b053bf60cf21bb9a6275edc699bf3a9861cafeb378ce20e94d431a12fc",
        "i686-unknown-linux-gnu": "8a2f0f36b4d2146e044fd6253db24f86319c2109f54b34d708cf25f754778d73",
        "powerpc-unknown-linux-gnu": "db2bd4cc6389e2413fd91877bd5ff0d3b024b9e68fc402ad6b6422f61e6ab5a9",
        "x86_64-unknown-linux-gnu": "3927fd7a094ba063daaf3163fa1b3b0b196968356845fe31c901a23ecc5048d4",
        "riscv64gc-unknown-linux-gnu": "f97f5e9d84528499c8fc31c3f295412f7ead44affd9c118c0caf54b4f7bd826b",
        "thumbv7neon-unknown-linux-gnueabihf": "3e8f5dab01aab6acef3af4ee84e8d225a427c10fe84c91d8f188e57a5dd2413d",
        "wasm32-unknown-unknown": "d79f31c54eab23c24e245e8988efa2f73451dc8537d386c52dcc1d7a6db246dc",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ca423cd11c0dcaab8ecaab56c52601fe",
        "arm-unknown-linux-gnueabi": "3d279c992c74752f21eef1b942a902a7",
        "arm-unknown-linux-gnueabihf": "c526d413635cf1534c190141bb18e30a",
        "armv7-unknown-linux-gnueabihf": "debc570a1f56198ffefd1e3de510e353",
        "i686-unknown-linux-gnu": "b2518b798342c6d5010ce03397a42d52",
        "x86_64-unknown-linux-gnu": "8e1205b7890e85f45febfe4d4a88b0be",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "04d4add5530d247214ec8afd32f2c91d75b219035130b877e4769cebcd4174d8",
        "arm-unknown-linux-gnueabi": "c577c39e47161c9f8029afd428ad676b04b1d44265fc2741a9307cb10cc87e10",
        "arm-unknown-linux-gnueabihf": "2773b2049b599f54fc0c8e799e539140b41fb685183343b161f049321b700267",
        "armv7-unknown-linux-gnueabihf": "05b343bacd43d3789820b59f945c3dc39d6b6534ab7606b2853fc5dca7bf0d9b",
        "i686-unknown-linux-gnu": "55e41a12c84628ef7a592da7673a687d1e02ecdc2c8abb1ed224ee00edf55b60",
        "x86_64-unknown-linux-gnu": "e7ed041c93b77a7d986aa198d28f63ab96493fdf164bd28c8785c5b31a9e62d9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
