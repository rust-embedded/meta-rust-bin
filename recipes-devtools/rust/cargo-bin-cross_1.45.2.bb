
# Recipe for cargo 20200803
# This corresponds to rust release 1.45.2

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3f71e6348fab8628776c65125c49320a",
        "arm-unknown-linux-gnueabi": "8ecbda27d1598d031329167d6126abc0",
        "arm-unknown-linux-gnueabihf": "07274da246f3c52a9c72b4c1601a8e9e",
        "armv7-unknown-linux-gnueabihf": "d175b60333c1befbc8015050522551c9",
        "i686-unknown-linux-gnu": "eac6dc5e16b52e4b981790119dfb3abf",
        "x86_64-unknown-linux-gnu": "75169fa60059b81987707430f1284eec",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bafb9cc4ccd36cb49a8b598fb18d58cf037a7eaf457691fca841023c46b0d093",
        "arm-unknown-linux-gnueabi": "4c2245180f3b1d677d52547b74f5b6ab915218f132b5e30e3d0adca33c228680",
        "arm-unknown-linux-gnueabihf": "2b65d55d2e3ff0c900c6db9ec84b1ace30327d9ec1078086d208192ac6876832",
        "armv7-unknown-linux-gnueabihf": "d359fbba30ec90971bb5da1baa81a791807d21dbf3ece17a7cd37d068fdeb224",
        "i686-unknown-linux-gnu": "d3243d6e54ed092c96713f14495fb8005dbbd12dc78c35f25d135e573987685e",
        "x86_64-unknown-linux-gnu": "ac2746e3d3bab7301b8aa747eff7c4d66f9c88a61f9117a4d6669c40317b69cc",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-08-03/cargo-0.46.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.45.2)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
