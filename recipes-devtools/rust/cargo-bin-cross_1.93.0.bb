
# Recipe for cargo 20260122
# This corresponds to rust release 1.93.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "43aac2857d557baa17306b77d3fa9022",
        "arm-unknown-linux-gnueabi": "cb273feac27678acbb9ef49daade2121",
        "arm-unknown-linux-gnueabihf": "b933dd654e8e9f61843dba9ecbc368a4",
        "armv7-unknown-linux-gnueabihf": "e7586a0cd5d6e5fbb6db819e0d0e8356",
        "i686-unknown-linux-gnu": "bf7ca092dbdb2bafac3265fdd4faf0eb",
        "x86_64-unknown-linux-gnu": "c1f90a43c626bcc1524367f4be0eecd2",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "21c823462acf538d9e35bc36a39f1690e1a809cf07048506bf7bb8dfd7be6df8",
        "arm-unknown-linux-gnueabi": "dff4b0ab692246a160ccae05291590bfed33163cf869cf0fae74f8ae46fd6698",
        "arm-unknown-linux-gnueabihf": "275612e467468972f5a6f627f91721a86565fd05dc9cbfaf4d7a10d6b30dcc88",
        "armv7-unknown-linux-gnueabihf": "56e5378ce69e26d5e4164b04e32fc29c186c1264ede63dc8a4d940b776ee87e1",
        "i686-unknown-linux-gnu": "ed0d08e48c640288b756d99da347c93bded18412e2c9c0d91b8174a2f426fbf4",
        "x86_64-unknown-linux-gnu": "c4ad6f857c3b72f1a515adc7d02fc1edd376a1313bb4edfdaffc1835cc920e37",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-01-22/cargo-1.93.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.93.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
