
# Recipe for cargo 20230919
# This corresponds to rust release 1.72.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "70df0ef7374f8f01048cb9cb1257d358",
        "arm-unknown-linux-gnueabi": "d7103271e6272f914419eef4a3a8cbff",
        "arm-unknown-linux-gnueabihf": "877e9de5bf0473a4c2042ae7a79a21ce",
        "armv7-unknown-linux-gnueabihf": "42176c779e172c49edd9b1f348420faf",
        "i686-unknown-linux-gnu": "613251f8fa9a4d33f340d87541ad52b2",
        "x86_64-unknown-linux-gnu": "836d30d0fd4c7773edb21e89c3c6ca63",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ad282984ef42304a1c700ecf47f75344c69bdcc0f682d61c46a8584d6e3e904b",
        "arm-unknown-linux-gnueabi": "bf5a447214e5c838d7f57f9c115543ff509960c15a108a42e404373eb58f1c78",
        "arm-unknown-linux-gnueabihf": "386cfe89d1dc1c33ace2aab8afdbe8db124474d5b5df2a767cea246cbc905e03",
        "armv7-unknown-linux-gnueabihf": "065bd9acc3453806ab97b311d7171b567dfe8a988ff9e72b309a299008b954b5",
        "i686-unknown-linux-gnu": "892034f264f86d45c5015c19f02b179711178ea2a64c24320d1584a789bb3e03",
        "x86_64-unknown-linux-gnu": "8eeb3412ddec7be32bb8599a7d86c8a5e3a09b82ca8d870f3b30133bf478a155",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-09-19/cargo-1.72.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.72.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
