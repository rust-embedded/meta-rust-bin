
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "27d6b22b46d6a7a3d22a353d1b66a6fe",
        "aarch64-unknown-linux-musl": "76e859c1f5b00fa8720bc7595e286517",
        "arm-unknown-linux-gnueabi": "64933cff18fa66bc8ccb88b594701723",
        "arm-unknown-linux-gnueabihf": "5703031a4cc843888370ac4c40b31108",
        "armv5te-unknown-linux-gnueabi": "aa3f3fee5bd1ee596b2d6923c148cf10",
        "armv5te-unknown-linux-musleabi": "7416febb30a2043dc66f2b5884ad876a",
        "armv7-unknown-linux-gnueabihf": "913c2c020abee33233714932cf6e98ba",
        "armv7-unknown-linux-musleabihf": "cb13ede6f1bf32b07e371fda0bc961ae",
        "i686-unknown-linux-gnu": "dda075da1ec27e65ebef4c017c439e88",
        "mips-unknown-linux-gnu": "29d90b3cc476861f56c764e27faae270",
        "mipsel-unknown-linux-gnu": "fb2e46833dee12b2f476e9ca0e3e569b",
        "powerpc-unknown-linux-gnu": "d5726dff55782ee4963d981e387141b8",
        "x86_64-unknown-linux-gnu": "8710587edb029bca26b7d35803c9abfa",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e30063a259e32cd0e31baadcee82112ef840e0f654d5128dd79fc715ede92058",
        "aarch64-unknown-linux-musl": "f540bf8238b46cefc5490eb6e626f8712ff5a49d8fdb7e75e838a5c1e1b3046d",
        "arm-unknown-linux-gnueabi": "a11314593ca93fd96b3576af8b1816ae87142d338dba7ba5e7eb646843dc2b10",
        "arm-unknown-linux-gnueabihf": "7d686718735bc4001d998b45712cba6329d86bbfaad12f41c64aa403393aaf7f",
        "armv5te-unknown-linux-gnueabi": "9509f1d9011634abfaa6fd67f92a57f8e6408087358f88ae7f7a76759a5dfc11",
        "armv5te-unknown-linux-musleabi": "e4c1536f86f338f1c08044dcc199bccd30c4366b8517c1a0dc5cdb2169506f22",
        "armv7-unknown-linux-gnueabihf": "5c994f3dbf6e0425037fd52639813c233ead287b4035ba1e18ace70e1bbeb259",
        "armv7-unknown-linux-musleabihf": "33d5313d9420b0de00b8f5ed4d60f6763545ec6609222d6af7dd9e7433d8c0b0",
        "i686-unknown-linux-gnu": "4698030427f41952ac51678a3359aee18cae4e1e791243dc650c74d1e08c4d4a",
        "mips-unknown-linux-gnu": "3c46162167d273d2f628cfd4a9fe83cb95f7b36ce35ba99c32511efbf3490066",
        "mipsel-unknown-linux-gnu": "aac605008c9a89978db33af9b9957cc9fb9f60b1934d40daea63630834d1aa14",
        "powerpc-unknown-linux-gnu": "e987608acb148f593aa4bed547da645233d48c69ab11f7042b1acb65c6ed78dd",
        "x86_64-unknown-linux-gnu": "c07c5ce96b86364601c0c471bb85105e80a5e345b3e4b3e2674e541cc2fdefcf",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b50bfb03fa84a5ece2676cb2b3169e09",
        "arm-unknown-linux-gnueabi": "af9f69fb5de7ee7b713c720f7cf4c8ff",
        "arm-unknown-linux-gnueabihf": "0e1ac8d4e00f36a422939139b9f65b7c",
        "armv7-unknown-linux-gnueabihf": "5e8a3e304c097dd6002575285ba4ffe7",
        "i686-unknown-linux-gnu": "2d984acfce0e1296cf7471df8f3f4947",
        "x86_64-unknown-linux-gnu": "64e1eec8a2b70c00e3c873048af382f9",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "31dbbc1395f5a545c114e778552159713977dec423bca5705bd4c92ee3840cb1",
        "arm-unknown-linux-gnueabi": "e316c3e2e58639ba4f02dbaef51453c28b4cc6081ecbcea23b11447b3ea92fac",
        "arm-unknown-linux-gnueabihf": "459b72d6cbe041222fa6fe2c3cdb0f390f51c8d16d68f174e4b48c9bdbe58081",
        "armv7-unknown-linux-gnueabihf": "24691eecdd7526d6b12d5965370e4a50dc68b1c403a1c9bd32aaf8cfcff14ff8",
        "i686-unknown-linux-gnu": "e10e53f4a48b58b1f954f93c84c3585a8852661efda3a3344e6750751432c161",
        "x86_64-unknown-linux-gnu": "9da098b2df01124f2c4b9789767151521f4bab98f50befdc75a691cece0c0d00",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
