
# Recipe for cargo 20240725
# This corresponds to rust release 1.80.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "58dc218af2e33efe17aca4d7ae3f062c",
        "arm-unknown-linux-gnueabi": "c9e2c9fc8568164f7967c264c6f16683",
        "arm-unknown-linux-gnueabihf": "744670e53d058f35b88fb5a1f9c7f129",
        "armv7-unknown-linux-gnueabihf": "774bc0ebc9759ffae6c400d729b378a6",
        "i686-unknown-linux-gnu": "93948493dc8412b76cfb96d962654821",
        "x86_64-unknown-linux-gnu": "fc7758d04a7f779fdc8cb073f93bfcf3",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7612e02605822de66dfff3e91f010cf965de1075e9749aa4ab697de80f8493e2",
        "arm-unknown-linux-gnueabi": "f796a2edf107f3772e39ec6619b4b618f115967ba786df6d9cb22e663126c289",
        "arm-unknown-linux-gnueabihf": "6e3281c8c94f2ab7087edc636d595d9cb0f3314ba246c7e22300b73f7792dc84",
        "armv7-unknown-linux-gnueabihf": "491fa770027f2d79befb9f15f9f663a484f19fb99d1fd41eef19e5f1c0c21b24",
        "i686-unknown-linux-gnu": "f773713d8c57f6da59f630fb7b81cdbcf5dd440016849e5841669908dc868856",
        "x86_64-unknown-linux-gnu": "df8aa17a99b7993d315b2046d404996619295ef74b12a411406a4c84de06fcdc",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-07-25/cargo-1.80.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.80.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
