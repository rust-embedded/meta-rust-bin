
# Recipe for cargo 20250918
# This corresponds to rust release 1.90.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ecc513b5e96f8988cdc835d98a3a9eff",
        "arm-unknown-linux-gnueabi": "0cb86cd7e5d8e7c54f1fc7a62373b2f5",
        "arm-unknown-linux-gnueabihf": "0910b803c35415f36ecd3b42856f4084",
        "armv7-unknown-linux-gnueabihf": "4959cf7bc1b240535f040049a7d292d0",
        "i686-unknown-linux-gnu": "80887c9d5c630e2d55f92b2f0d302d53",
        "x86_64-unknown-linux-gnu": "ed050b7cd7c35904811d099ed67612b6",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "33527828bc38026702d85996a28c08a894d5376a5756dd9085247d36aa208405",
        "arm-unknown-linux-gnueabi": "625ec0d3d27d1eeef044a109560e1060a9472886d770fca3b3636c06493cf238",
        "arm-unknown-linux-gnueabihf": "455ac4e24f8da188bcf890ddfb871ce20226970e3e439f43500e82cc21d41dbc",
        "armv7-unknown-linux-gnueabihf": "ea37292c265115c86e880896c90a4d0d35d38a0d7fdb37cb42e4d6d3669f0fc9",
        "i686-unknown-linux-gnu": "d96e439702f269d61ea49b628b81df24e98510ec33168b7761902f52a7126527",
        "x86_64-unknown-linux-gnu": "dc0f70c6e681776d0c5e01953b50488e8b2f972eed5aece6d094e497ea480ab0",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-09-18/cargo-1.90.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.90.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
