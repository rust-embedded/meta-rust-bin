
# Recipe for cargo 20221103
# This corresponds to rust release 1.65.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c4cbd2c8a535bfde0fa4cd7b6e2a5fd7",
        "arm-unknown-linux-gnueabi": "2873db5e8e5185ea40caff337e9c0db2",
        "arm-unknown-linux-gnueabihf": "c7fbc381e19088d043874803430ca05d",
        "armv7-unknown-linux-gnueabihf": "fd276b1be6239683bab5271768798104",
        "i686-unknown-linux-gnu": "79698294438fbe5546cc640c4eb54b32",
        "x86_64-unknown-linux-gnu": "746771eacce34cbe5fc06181af5fc7b7",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "406d244def7ea78ed75ca4852498a1b632360626fb5fec69a8442b14ef04aee8",
        "arm-unknown-linux-gnueabi": "25c783ec2a61c127215609ae5e45ca11de938cf8e1e163ccdd422be2b245414a",
        "arm-unknown-linux-gnueabihf": "1793a5773d24d6e4685870a6e47de3f764e74d35f85bdc0d3e888be0efce6a54",
        "armv7-unknown-linux-gnueabihf": "fcd2a151adebc87fddebb710d7c7606f0aa77245bb45ec05f8b600cd30008687",
        "i686-unknown-linux-gnu": "b58b88e7dbfc7b570df1ec0f7be75c318ad8e99ff1e66f4154827b2c81eee3d2",
        "x86_64-unknown-linux-gnu": "f7d67cf3b34a7d82fa2b22d42ad2aed20ee8f4be95ab97f88b8bf03a397217c2",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-11-03/cargo-1.65.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.65.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
