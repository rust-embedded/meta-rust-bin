
# Recipe for cargo 20200827
# This corresponds to rust release 1.46.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8607634c58e6de7f6e6349ea103a0487",
        "arm-unknown-linux-gnueabi": "c1a8b0604facc395c704dd92a4b7a9fc",
        "arm-unknown-linux-gnueabihf": "c78cbb52a9453e6963403ebf96dba8ba",
        "armv7-unknown-linux-gnueabihf": "8437719afbc4a4c7b4b0399d22dc7086",
        "i686-unknown-linux-gnu": "6989f256f98ea883466595e0eb714c12",
        "x86_64-unknown-linux-gnu": "1e1b5f8a66699816597bc05cde11bba8",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5413c7c73ea0c2323042e932f7be7cea51312ad1eff5c4c86c5be1b36da9698f",
        "arm-unknown-linux-gnueabi": "b0e6443266feed2b90916f487101f66d373efb7a0a5a6bcf4d80156d5aee1819",
        "arm-unknown-linux-gnueabihf": "3023072d28a62aae6f70cfe6122aecef5107b98f952b57612d1f71c81a23cb9f",
        "armv7-unknown-linux-gnueabihf": "a12584bb993b2d57b8525905ff887cdcda7da85114f10e227ceca2595feb50b0",
        "i686-unknown-linux-gnu": "f59a5179994c92ca528ea5f141c6669211bb725e2522f8a739b6590a4a4db559",
        "x86_64-unknown-linux-gnu": "30e494f3848d0335870698e438eaa22388d3226c9786aa282e4fd41fb9cd164d",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-27/cargo-0.47.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.46.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
