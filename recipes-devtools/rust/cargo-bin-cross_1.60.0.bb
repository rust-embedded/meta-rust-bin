
# Recipe for cargo 20220407
# This corresponds to rust release 1.60.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b647ea4eca4bccdd7e18bd8876272fb8",
        "arm-unknown-linux-gnueabi": "c64be1b63d9b5b80d4053ba7b2f4bd9a",
        "arm-unknown-linux-gnueabihf": "6ab9fda029a8f11a0f22042c0958c6b9",
        "armv7-unknown-linux-gnueabihf": "f4cf6f392ccef814676b2c933ed1484c",
        "i686-unknown-linux-gnu": "c94c64e74f20b0860e6d3c8fa99e654c",
        "x86_64-unknown-linux-gnu": "10c9c230b5a252872459989b350b7933",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "60d58e3c7eac74c4e7a15799c374a49d0c3d5f9ac28534b28b9507912c1d6af5",
        "arm-unknown-linux-gnueabi": "2203f2064dfed21d42ee2d78d03ece84894f5ccfab57fd4efd57760380c77bb6",
        "arm-unknown-linux-gnueabihf": "df0c44c056eb704de494dddf8dd5c02b58283ad8a34e980b4e75a8a9d197cf95",
        "armv7-unknown-linux-gnueabihf": "1e617ae218e2f2bd607211daea6426db4d5b3b93498b4f76058bea8b9c9f5120",
        "i686-unknown-linux-gnu": "8989db50fdd8d3bbd682295b3da1a0e3c2a4548cc0559c26b671e197b30f03d2",
        "x86_64-unknown-linux-gnu": "6dfc8b0e2d5ac2ccfc4daff66f1e4ea83af47e491edbc56c867de0227eb0cfd5",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-04-07/cargo-1.60.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.60.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
