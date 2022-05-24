
# Recipe for cargo 20220519
# This corresponds to rust release 1.61.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d766881177507c801822e23bcbb298ac",
        "arm-unknown-linux-gnueabi": "ae55e4620e00e18f9ff7b9b915a0317d",
        "arm-unknown-linux-gnueabihf": "57cb975b49a63fd44c9a215cd4e36866",
        "armv7-unknown-linux-gnueabihf": "cf5876035d2249b1aaf06842e06e03d1",
        "i686-unknown-linux-gnu": "03782cd4c16e178c6047be2a4c579157",
        "x86_64-unknown-linux-gnu": "cf8e34acd77f84f876c646d726e57a9c",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0d31d5a050e41f8b56c920527538886db96c09824a8ff619d0fc4c410dbf7e5a",
        "arm-unknown-linux-gnueabi": "e52116927eb34095c7a398e971fcd34d1b55d64877ca73095fa352a7cbbb3cd7",
        "arm-unknown-linux-gnueabihf": "ad56880035902319cd39d11e2c5eb3a67b3f72b3d5f52aef240774f9a1d1109e",
        "armv7-unknown-linux-gnueabihf": "2d920df1355a989cfa0e2e4f5e92e763a1d774823dad5e01479fba14d648a14b",
        "i686-unknown-linux-gnu": "b68cf8257393a9f32dba1969cfcb77567a0e5874179f9cff0d4dd040b748bac7",
        "x86_64-unknown-linux-gnu": "c6e108e13ef5e08e71d70685861590f8683090368cab1f4eacfe97677333b2c7",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-05-19/cargo-1.61.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.61.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
