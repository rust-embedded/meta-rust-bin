
# Recipe for cargo 20260416
# This corresponds to rust release 1.95.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0abcc6beab68fe59159a39886c5d820d",
        "arm-unknown-linux-gnueabi": "fcd1ffe3127342739a65a8278029c945",
        "arm-unknown-linux-gnueabihf": "f7e43193bbc0bf7e68186da8fa296612",
        "armv7-unknown-linux-gnueabihf": "bf587a6fbc9cff193f932e4ac78300bc",
        "i686-unknown-linux-gnu": "20b5fdc1a721b7ac845dbe908b8b4253",
        "x86_64-unknown-linux-gnu": "ab0b7b5fa506d34e72d6408661eca909",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f37440984c4c06d38487138adae2c5c80ec4ddfbdfe57ae387357995bfa502e9",
        "arm-unknown-linux-gnueabi": "de1ca1d1e58631f2197fc96d561a3f0a59d500203f7ff8a27b555864caf2c4a2",
        "arm-unknown-linux-gnueabihf": "041b94024fbbbab6209d68b20a3e6e8a5770df9777c5ce790909a2ff4b08acf8",
        "armv7-unknown-linux-gnueabihf": "4db9c16b2513628dcb767b65ac0e6ee739f2c280aa39b63b6e7b5d42c338b2e3",
        "i686-unknown-linux-gnu": "2042d1507652d503d5b8cb2888140e96a756b46c14f3099a2c2f031184bae7bd",
        "x86_64-unknown-linux-gnu": "47ebc468721a6ff3fb27dff33e632a4cb6246d0ea061814bcd4fe601d18c69a8",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-04-16/cargo-1.95.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.95.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
