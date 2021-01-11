
# Recipe for cargo 20201231
# This corresponds to rust release 1.49.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2ba3a6a4f8cedbb5f662cada79421435",
        "arm-unknown-linux-gnueabi": "26384352f6a31122064a21545b010728",
        "arm-unknown-linux-gnueabihf": "d7bc4b9c7b88a315c38f8db101f21a64",
        "armv7-unknown-linux-gnueabihf": "3bf8cece9cf178e3335ea6918a78db5f",
        "i686-unknown-linux-gnu": "b759115afc83c0fd645e393da4576248",
        "x86_64-unknown-linux-gnu": "4a201aca6b3bea98a45eb681c95521bb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fce2bd0eabf9a9958b02f5ede3c227c992ee7048ab34293cce57bc3d48e63fc0",
        "arm-unknown-linux-gnueabi": "509d1be6f1cb751e86238e163c11da5a3c60694117530194ed1a858fc0129466",
        "arm-unknown-linux-gnueabihf": "52c1df52ce3e6175f7ca9f5c6851127312b7c10ca0265d0c4dac2a0702895bcf",
        "armv7-unknown-linux-gnueabihf": "3269e9be467ea3d8fc0fab21e81b01dba71791a9020e123125d2fafed9b6cc91",
        "i686-unknown-linux-gnu": "90ec7eb7272a3b0a3c4e7d25eac0341ca14c55f168d385006f77c6b1dd0df836",
        "x86_64-unknown-linux-gnu": "900597323df24703a38f58e40ede5c3f70e105ddc296e2b90efe6fe2895278fe",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-12-31/cargo-1.49.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.49.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
