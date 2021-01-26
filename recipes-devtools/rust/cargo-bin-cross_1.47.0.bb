
# Recipe for cargo 20201008
# This corresponds to rust release 1.47.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a20e459ef915b0b287734ef2c051dcee",
        "arm-unknown-linux-gnueabi": "ed04b4098911a64acb3df26f49ae412e",
        "arm-unknown-linux-gnueabihf": "1ab359086d8ed0fbb2600273f846601d",
        "armv7-unknown-linux-gnueabihf": "1aa6653b10f1c8eaa8aada865415373c",
        "i686-unknown-linux-gnu": "8c2b0309f17f77650d01dabf6be707e8",
        "x86_64-unknown-linux-gnu": "b610d900230b7e294d8a2a778d18cd20",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3421561a71918f8327841a7f982fcbb1b187d918988698a8fe8a51fba9e360cf",
        "arm-unknown-linux-gnueabi": "9578cb400b75dda9408e34ed9c2c18b555d751776ae3fd17c566f09fff7cdc75",
        "arm-unknown-linux-gnueabihf": "fcc8088549e36b112455a61032dd10a3e7d569d3eb11d087fb5f451dfe994d92",
        "armv7-unknown-linux-gnueabihf": "4c5eccd10092a344d8e62370509617a21556f98a141d9412677bc5b5bf6f3460",
        "i686-unknown-linux-gnu": "d10fed01c128e1d2a5af29c604b321ef1c37994f250c55799d66ec2126f73381",
        "x86_64-unknown-linux-gnu": "e53b8bf28603a28c09c6e8dd4d0045adefe86457642f1dc68c2a71b54b04f202",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-10-08/cargo-0.48.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.47.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
