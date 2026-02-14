
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7bed58c1095730738aea79f45f3e557a",
        "aarch64-unknown-linux-musl": "0d59b0688eb926bdc8d4867e5085b06c",
        "arm-unknown-linux-gnueabi": "acda32f6a52fbc3fd8b1a66c73be8d6f",
        "arm-unknown-linux-gnueabihf": "56ab5622fb348f078499117a2cb457fe",
        "armv5te-unknown-linux-gnueabi": "dea7efc9134683d1455879a8133faf57",
        "armv5te-unknown-linux-musleabi": "48e34f833aa2ce2f063741b4dcb03aab",
        "armv7-unknown-linux-gnueabihf": "7422b99882d0bd1f09cb0d95abd14c9b",
        "armv7-unknown-linux-musleabihf": "70f0b9a8b6756c66320d5bb216970348",
        "i686-unknown-linux-gnu": "2fa1545cebfad35bce4ac9772f399830",
        "powerpc-unknown-linux-gnu": "28a5c267b8606a31e0d3a23306e38118",
        "x86_64-unknown-linux-gnu": "b687e1e8c08d4cf88065d271a75dc633",
        "x86_64-unknown-linux-musl": "014cf236c1ec0775fc4f8de013068334",
        "riscv64gc-unknown-linux-gnu": "f435089285829aa133bc46214c629047",
        "thumbv7neon-unknown-linux-gnueabihf": "5b8b5dbf2eea4b06542f942bd001c0af",
        "wasm32-unknown-unknown": "e2dfe44d0512d6a98e99cd8ba36c5f04",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "47f2f904befca10a5f6dd68271a343b3700e651c67e25e723d4a4a0e2b4e445b",
        "aarch64-unknown-linux-musl": "ea4a46131c39b27a4d8a74e3ee0d63a70df7995683828f87fad08fccf5592fd8",
        "arm-unknown-linux-gnueabi": "00b26559bff1532b8c2a2adf9f39447f0d40ee18152382d01dc77a8bbf1a9bad",
        "arm-unknown-linux-gnueabihf": "4f2e613aba4053abf0d3e519bc366420922dc48b175f6d30ee449355ca2a786f",
        "armv5te-unknown-linux-gnueabi": "0819db0eb290d52c1c2329a81120bf9c903af14467694c250c5f1051be2faf0d",
        "armv5te-unknown-linux-musleabi": "c0aa0452a3ccdc6eab70b4e6f09a00fae1ae8c205c21d68607d8c70319403ce8",
        "armv7-unknown-linux-gnueabihf": "d6b645f127517c9553af2eeb919e120a59d84b2b035334a11a734f2ddc7775ca",
        "armv7-unknown-linux-musleabihf": "b314174907b4f4127e61f8c61580be4dcdd8354dff471c39d6e3573742142402",
        "i686-unknown-linux-gnu": "75f92f0e33c6724cb1876625289126fcf2d101fc6e30ab5a34309e618d6e06a5",
        "powerpc-unknown-linux-gnu": "49692419b05e82adf1099ebc17468f9bc3d411f5d42d39ec77c13473f2b5ea2c",
        "x86_64-unknown-linux-gnu": "9e941972c8679c2d852addf979455afd61e3ec33000cbc2421b162bcb05897a6",
        "x86_64-unknown-linux-musl": "3a0fd7481cf66c4d2e237e07a4b84887efe6099cdcb948c7cd7409ebd56d54be",
        "riscv64gc-unknown-linux-gnu": "18438669633be274ac50011bd4c8b9ae2d94174c9eb5a219569ad9add7429e23",
        "thumbv7neon-unknown-linux-gnueabihf": "12a862561090e64606bcdb0fee285a4316b6fffc7f231b36f700e69e8e99a3fb",
        "wasm32-unknown-unknown": "f5b840b93f00db0785c32f5193b6e3492fe4c626e148a5ebffe07184b6435104",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2b2d0d20dcc5023f4c1d6030a893a7cb",
        "arm-unknown-linux-gnueabi": "bc5650cd946f0d252c82e86f54495e7a",
        "arm-unknown-linux-gnueabihf": "37bf53bcdd26b84b91200842784f92bc",
        "armv7-unknown-linux-gnueabihf": "21d4bd26fd8b50fd3c92d1b2a8b89a40",
        "i686-unknown-linux-gnu": "bd27cc2e136e6422fa80430a579f2db5",
        "x86_64-unknown-linux-gnu": "b177e99c118cce783f1916ed620db55e",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5f7141617b833f84a279b19e7c349b95e839d924e2a3ed3ae545b2d4ab55ce05",
        "arm-unknown-linux-gnueabi": "099d9511c34f062b0db7614fa23af1552d2ecabcbe58e31c32bc329529d7088f",
        "arm-unknown-linux-gnueabihf": "9f6eb085a1795cf897b831e5c507b126fead0e5286e524307112a92942b84aa8",
        "armv7-unknown-linux-gnueabihf": "31ba70b4cefeccf2a2300fc46fbfd3fc1c82239e483161da5c840f5130df9d65",
        "i686-unknown-linux-gnu": "5399791a11a3d8617f680f02fc7f1c14fba1a0d27a1cc3a256e31678853763a1",
        "x86_64-unknown-linux-gnu": "31be7397a8a70fcb48e119925c9ff05554e2094140889ef9760b70a724d56346",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
