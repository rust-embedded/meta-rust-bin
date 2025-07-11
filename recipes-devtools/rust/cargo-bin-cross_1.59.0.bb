
# Recipe for cargo 20220224
# This corresponds to rust release 1.59.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "65fd4e8519574dae47da045b19b9b8c8",
        "arm-unknown-linux-gnueabi": "cb82d0441e72d902669b5acb109f21ee",
        "arm-unknown-linux-gnueabihf": "2cfea7d478f9510820f7e7a2c65647f2",
        "armv7-unknown-linux-gnueabihf": "ecdc4ac54ddffa97c1afa22bfd2b3e6e",
        "i686-unknown-linux-gnu": "a11154477b7ac45f471832c4e32ce9eb",
        "x86_64-unknown-linux-gnu": "49f04578e9d68f20ec0ccb4b12dac7e0",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "857d0b4afa76773a68ebe616db01d1b97d24b6d02b55e7348c968aa48104793b",
        "arm-unknown-linux-gnueabi": "9b8320e7c67f2321d2c116a011c6e9720e320e0e4a1638119517d6d329d988c3",
        "arm-unknown-linux-gnueabihf": "8c533cecd206d47e05a92debbc00cabb4ba0551c5582c7ab55e6140c3b3d6351",
        "armv7-unknown-linux-gnueabihf": "010b050857601fc2fd53b46b51420ef72293ff4177da201df3eef5a43fe1357e",
        "i686-unknown-linux-gnu": "c3ff5ca5737fa0f4645d083f56245bef6702061e6c0637a0629b6faa36849a04",
        "x86_64-unknown-linux-gnu": "703c1c66f1d68549d1ee0b7a96f91935a3583af8ec13cc1722ff7a0f1c69ca70",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-24/cargo-1.59.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.59.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
