
# Recipe for cargo 20180720
# This corresponds to rust release 1.27.2

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ed26b4ebb549df13b4c101c26eb973c8",
        "arm-unknown-linux-gnueabi": "54764a91f15a40e7e5c3e9a3413796b0",
        "arm-unknown-linux-gnueabihf": "669005bb37206a780f3f2053e366062f",
        "armv7-unknown-linux-gnueabihf": "695aa9ed46a831e98214e3501fe7de7c",
        "i686-unknown-linux-gnu": "84501c56b38664eea19aae8e641f5701",
        "x86_64-unknown-linux-gnu": "c04d9ce9ef7c8da9918b77b3c89dcb5b",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c8df753a61c2951267c4bec214442905827b09a0d05ce755144a8249a675f971",
        "arm-unknown-linux-gnueabi": "b82e43508dc092c42218bba0bc23be925616640c4f8cd3ccbb0d185449b81e63",
        "arm-unknown-linux-gnueabihf": "7381c039de23f0658fe61146b2deb4caebcead9bd485fab0bfa18ec344e6401f",
        "armv7-unknown-linux-gnueabihf": "b7e956667515034015f152b9afd542c679e1fb22b94faa9e216e2dbee3680f67",
        "i686-unknown-linux-gnu": "a30c3b7d49f9cc0105091dee97e8d4ee859c9dad7ffd0712fdaf71bd2b5cd538",
        "x86_64-unknown-linux-gnu": "35da884d43a8620534f6da1fbdd05f1e1f24823749f93d3d3be0eb46b3a6d884",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-07-20/cargo-0.28.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.27.2)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
