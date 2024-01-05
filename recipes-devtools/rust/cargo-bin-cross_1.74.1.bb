
# Recipe for cargo 20231207
# This corresponds to rust release 1.74.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "777d6d3002591a9e6518f351c112db8b",
        "arm-unknown-linux-gnueabi": "6d0f4ea023bda6b6731ca639cbc35cae",
        "arm-unknown-linux-gnueabihf": "921cfdb39bd0eb3fee5bb63d359f22b1",
        "armv7-unknown-linux-gnueabihf": "031fc7e5d41d7905b3d9b6fe2e67f12a",
        "i686-unknown-linux-gnu": "882f61cf307ee40701644c08845870f6",
        "x86_64-unknown-linux-gnu": "89dea7b51a487298c481e49457ab765d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1d2d6a3c2eeef9d35a0868bc382123886ba165e31b023cbc98449fefd6ca148",
        "arm-unknown-linux-gnueabi": "579178733e325ddd73bbab4bbbe73c4d691bc3fd733552ff59eb1af1bb190cf0",
        "arm-unknown-linux-gnueabihf": "151c05b889787d1f0f4e43e36931571ca760bfd610a46778adee3b4210c58204",
        "armv7-unknown-linux-gnueabihf": "6e9e08a30a5d57ffa535e207b39c329b75f251ed4cfc76409da697df2696c1c4",
        "i686-unknown-linux-gnu": "8a0c0c893224311e7435035b7e27e5aa2c0e301cd881a79d38fed4a2069da6d8",
        "x86_64-unknown-linux-gnu": "9e63c034475d602ae303e827c318ecdb491c6ae72608b7d1f70056979efadfac",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-12-07/cargo-1.74.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.74.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
