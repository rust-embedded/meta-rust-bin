
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a6b1946a6455f427cf389db8e8d4cb0d",
        "aarch64-unknown-linux-musl": "00321de7f0eaa126ecdbb2ad4d8155a4",
        "arm-unknown-linux-gnueabi": "89e6171576151a551ef45ea8dc807500",
        "arm-unknown-linux-gnueabihf": "45f2b4c5004f4c275e5cd4c7f9c8904a",
        "armv7-unknown-linux-gnueabihf": "1ccf4f0b46d24a11a0918d98514332eb",
        "i686-unknown-linux-gnu": "7565b2138f1c91420f1709df7eb30fdc",
        "mips-unknown-linux-gnu": "ef5dfe71d7b11e6d0546f053d980b154",
        "mipsel-unknown-linux-gnu": "5be76d9ce4097c287956f5619ad74a90",
        "powerpc-unknown-linux-gnu": "4e608a93c490de0af12ee242d82a629a",
        "x86_64-unknown-linux-gnu": "0e8831c2b916b2391734a3f46dd586b0",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0166650de5072545c3945416638dec9beec5ae1f3c72069e314b7c50e18b4819",
        "aarch64-unknown-linux-musl": "03ea73844f2963e1716661142a15fc39b8dc026b2654ababe009d31df4e78363",
        "arm-unknown-linux-gnueabi": "2dc5e1e0af871eb6b2ef2152821bd8e7d8ad77e7e9efa805a86f2cc3919e6851",
        "arm-unknown-linux-gnueabihf": "d3a337315774f8ff4afe7854f59daac96e3c0e08bbc216a2cc3efc83d30f4f7a",
        "armv7-unknown-linux-gnueabihf": "ecbb41147795d17958b21e9e15314d9ff143ab932bcfcdca408aa6f6d6603a75",
        "i686-unknown-linux-gnu": "fe0f7dac3f37d2063c7e6bb99e31f0a83633317ec5920124e583af5ee9365fbc",
        "mips-unknown-linux-gnu": "25734ffdd1cb8297f41a7bc13813900633fc6365d48c1da201fda6823b434587",
        "mipsel-unknown-linux-gnu": "3961b0c13d1c5c7ef324e7842dc0aa75cbf21f256c3bd2dfc58796235f9608f5",
        "powerpc-unknown-linux-gnu": "09d38d3280781fe58dc3899422be135957520029c1beeaed7de067887e163a0e",
        "x86_64-unknown-linux-gnu": "8514eedc0ed99ab75c61be3137c3e57c4115063ddc07aec842f687ebfc7ceda3",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d896e5a8ed5b070faa7f99db70e254a3",
        "arm-unknown-linux-gnueabi": "ecdd1d40babeab998c18c5dbb10388aa",
        "arm-unknown-linux-gnueabihf": "773b1fcf9dc0e6af99808645a8697ffb",
        "armv7-unknown-linux-gnueabihf": "40793a91e7a7441655934db600a0ee31",
        "i686-unknown-linux-gnu": "7d49bebc83589b9df02062bb37fe0e50",
        "x86_64-unknown-linux-gnu": "262fe55e3261ecf601d3a434afdc6832",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ccff6c6d8386655955265f586862314dd3b646bbeccd1369877f4343b1960a53",
        "arm-unknown-linux-gnueabi": "1906681c33ecdb5cd26fb17e0cf48f88262e668130b116cd81eb23d2d0462355",
        "arm-unknown-linux-gnueabihf": "37cd664a4d78f4b9838205e8e90c1566d08ae95590341e1e1fa395718d6cb31d",
        "armv7-unknown-linux-gnueabihf": "1d3d3b9223ac3f217f9f43145f87970c4935337787264c54c6a746c0992e4b59",
        "i686-unknown-linux-gnu": "cc8c00e32b68b6a925d5680cfafe3cb41240ab50e3b00079c1c0707dbc66432f",
        "x86_64-unknown-linux-gnu": "cc45058e9963d33ca28220e752d9e360b7e05f17e34284f5f8197738c3a88444",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=66ddc8ecd998476b7cd5732e8c3a6c1d"

require rust-bin-cross.inc
