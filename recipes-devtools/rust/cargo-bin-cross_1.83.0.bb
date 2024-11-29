
# Recipe for cargo 20241128
# This corresponds to rust release 1.83.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dcb7df9d3d60d766da08375315799f76",
        "arm-unknown-linux-gnueabi": "dda090ea841d6a21f59a32578f388893",
        "arm-unknown-linux-gnueabihf": "39cd65d0d057b9f4cb8871d19efd812a",
        "armv7-unknown-linux-gnueabihf": "e4521ff184d143d85bfc46394bea62f0",
        "i686-unknown-linux-gnu": "70631d95111af352093e6da40ce00e54",
        "x86_64-unknown-linux-gnu": "2b70b1dd20e68ea1a4893f68dbea34d3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ee61681b5de03f767799daefd93fe87501a80ffeae5f55c905e21e4001a42a2e",
        "arm-unknown-linux-gnueabi": "74829bedf1dd5dd6b60a875fcbf2d7cb391bf85076d9d04df729ddb647183867",
        "arm-unknown-linux-gnueabihf": "02f13c158e5900bb2161444d16d0a65d32120dc50b8d1777d538bc50d73afbe6",
        "armv7-unknown-linux-gnueabihf": "3631fb42694a127df434ed28e86015489e00ef9670a469390b43b0e6b3ef8b76",
        "i686-unknown-linux-gnu": "929866a0e7800ef475ca4e976b692293768bbff3b53d4ac2154f13eef0c73eb0",
        "x86_64-unknown-linux-gnu": "586bd58e7681b09ffdc95191baa95db3f7c00d739f9cb15a60c40fdade24fddf",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-11-28/cargo-1.83.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.83.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
