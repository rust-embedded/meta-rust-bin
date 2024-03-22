
# Recipe for cargo 20240321
# This corresponds to rust release 1.77.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3a4e60482a254b291c5a40eeef6774a2",
        "arm-unknown-linux-gnueabi": "f5be914cd602f5122fee967a19351259",
        "arm-unknown-linux-gnueabihf": "2ac677f86c7f7fbbaaca6dc0628d4897",
        "armv7-unknown-linux-gnueabihf": "600d40f181a5f998b987544a63c33504",
        "i686-unknown-linux-gnu": "0b8f72f5d3becd1ac4285ad3a70c89c4",
        "x86_64-unknown-linux-gnu": "c564b1ff3fdb521478d0f80217b8efef",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "897e384cac892c30b4fe7b47d7d349622a61f2ec91fd3e59632a9784a5ce4b98",
        "arm-unknown-linux-gnueabi": "7f603046d7e18277060e3a986caa2af7ad33d4bb52a85db5b587772dfbe907c3",
        "arm-unknown-linux-gnueabihf": "fed08c6d225489b693b758a7d91243562ddbcf75554ad19a22f3f1ed4c6bbad6",
        "armv7-unknown-linux-gnueabihf": "0c0985ad955ca1a975be019b436cf2f6fb4a65f77cd15a7c63cdb737487a37de",
        "i686-unknown-linux-gnu": "c1ce2a69defc46464c9df2d69543c6f5f13bd1b8f19a7d2e5477a335bdbc86c3",
        "x86_64-unknown-linux-gnu": "c25097d2cbaca931c0ceca878d2b10938ca0f809df8ff8f2b69a3f3754d45622",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-21/cargo-1.77.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.77.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
