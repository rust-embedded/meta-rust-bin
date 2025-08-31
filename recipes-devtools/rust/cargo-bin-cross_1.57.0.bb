
# Recipe for cargo 20211202
# This corresponds to rust release 1.57.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "90cb73f7e9957077cac41b63c7857b0f",
        "arm-unknown-linux-gnueabi": "d859820eb84e525a1741640c1f2db782",
        "arm-unknown-linux-gnueabihf": "d176468261adcc21a355ff02f431a8a5",
        "armv7-unknown-linux-gnueabihf": "2c7b96dea0c311ae3644cb55e1c385b6",
        "i686-unknown-linux-gnu": "f1abd831b310b8aa56d652b22e1c4d96",
        "x86_64-unknown-linux-gnu": "c19383ef26e45fd9a7464c1c6836dd57",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8c046fc59feb1d670757b6de30990e346faa4b2ff49cd42f6d5f6a2b92a1ad6c",
        "arm-unknown-linux-gnueabi": "d6efa8b3ccaa679b7637c8c36ac4772d35c2ba6517ddaabe59fb2823a7d9bb29",
        "arm-unknown-linux-gnueabihf": "4d1a1f8bc824020321560636dcc2989cce1114739c6d0c3864d8ff371cb7e85d",
        "armv7-unknown-linux-gnueabihf": "16a1c7390dd13ae03e85948ceffe33b1592c08999764e871adbd3f23b6d2f626",
        "i686-unknown-linux-gnu": "ac2f436f87f04d40cfff9dbc7a0554c387dfc1ec1ff5e5a9425b7203b0528fc5",
        "x86_64-unknown-linux-gnu": "2b341034e4c30bede47a432751935549a28e40b566a1fd4b59c824ccd0a26ff6",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-12-02/cargo-1.57.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.57.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
