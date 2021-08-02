
# Recipe for cargo 20210617
# This corresponds to rust release 1.53.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "11d53f0dc2bd84869e2498e8e258d4a2",
        "arm-unknown-linux-gnueabi": "dd9667540e501a4b6a1b8862676232a0",
        "arm-unknown-linux-gnueabihf": "51332e65cd38d7993c675bbbdf56ea42",
        "armv7-unknown-linux-gnueabihf": "deb15137be9f2eb2256f5317032d699e",
        "i686-unknown-linux-gnu": "2ed04273af4b1909475a7f8c91ee5275",
        "x86_64-unknown-linux-gnu": "585191fa61dcaaf23ae734736c781339",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7c35c086e294af3ae82df5609c6833a36bd8e6634e8ecca18f863829cfe80ca7",
        "arm-unknown-linux-gnueabi": "56df4591b0051c7957f757a60e8978a07c6999ff86c837a8e4b43ceb9db50557",
        "arm-unknown-linux-gnueabihf": "6b294d369278af80bea2cc6a01211e07dd62c21744b5f748216695cad5af5915",
        "armv7-unknown-linux-gnueabihf": "7efd9decad862086014506c502fb5f21524e2c4bedf4b422212ee5dc64802126",
        "i686-unknown-linux-gnu": "8ab2174a813b00573c0aa3cdc13b1b56931400fe95459e50855de4033f3e9e09",
        "x86_64-unknown-linux-gnu": "e79d9d0b03cb331428ef3cfc4cbe60ded9f90708a7dd1714d974dab9a03ee7b3",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2021-06-17/cargo-1.53.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.53.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
