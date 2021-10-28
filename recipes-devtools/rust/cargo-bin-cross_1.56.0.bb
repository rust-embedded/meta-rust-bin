
# Recipe for cargo 20211021
# This corresponds to rust release 1.56.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "89ace07dce8eccfc8830e845af936fe3",
        "arm-unknown-linux-gnueabi": "f64398ecac5a8cf4045f9580e016118e",
        "arm-unknown-linux-gnueabihf": "9cb092a10b678e1a32391b05120314d3",
        "armv7-unknown-linux-gnueabihf": "ecd08dbd04df549eac8e07e38df7d2f4",
        "i686-unknown-linux-gnu": "6476f3a459f7b0c3b0426a97ddeac1b3",
        "x86_64-unknown-linux-gnu": "679eb622fc3e95a5bd1b0e477cf676c3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3a3b0b74a18247db46badc1e94285fe5e60ad0e9c18fd2dbf15878aa56a5994a",
        "arm-unknown-linux-gnueabi": "dee1816edd2f1722a522afce56aa9f7295f6b6e9e29e52f2b71f5658c186a14e",
        "arm-unknown-linux-gnueabihf": "efedaecea85cff872e4097fa373c512adadcd5969fc4fb4cdd1745d9d8f7904d",
        "armv7-unknown-linux-gnueabihf": "b693b25b8b3833fc216e86961b9f0e7b775e38bef49215b32792d697bab7c1b2",
        "i686-unknown-linux-gnu": "3de2dd5e14941b5433e00fab7ef6902cf62468fc960e373dff5c02201f70bb4a",
        "x86_64-unknown-linux-gnu": "e74bd0038893e76393f67a58786ec33ef9251cdb65550b3a2a8117c7355ead71",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-10-21/cargo-1.56.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.56.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
