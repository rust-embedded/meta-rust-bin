
# Recipe for cargo 20190926
# This corresponds to rust release 1.38.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3cd907972d1fa26f2c13a147300737b4",
        "arm-unknown-linux-gnueabi": "173334ac7a08e41e1385a91e869e0cc5",
        "arm-unknown-linux-gnueabihf": "3fb6e0bb55ee8a982dfbc4eb48bf0da5",
        "armv7-unknown-linux-gnueabihf": "19c3fb15fab4ff54a0727590a9fb11e1",
        "i686-unknown-linux-gnu": "b844b897d70b178dcbbc28ed6522b0ec",
        "x86_64-unknown-linux-gnu": "dc8c847f332ec9dccf9fb6589521770a",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "496d008dc715ccd7d509c531cec04d9d432c84d779e7b2b1b3cf5abf3d68d172",
        "arm-unknown-linux-gnueabi": "c46a770868446e293506004f592a1a772bdfac1feb931cb1b3f1159fb780a318",
        "arm-unknown-linux-gnueabihf": "4c39a9cb874cc59156fc84316d39b071bcedbd7d46a57d9ccca675f1da5c1051",
        "armv7-unknown-linux-gnueabihf": "b2b540db824694002778ebd63bc29a4fac6784d8a7ab1cf24c394a66ebfadc52",
        "i686-unknown-linux-gnu": "eb991e1e34b40b470dc11b7d146fcc946e3cb001cb0178bc7040f0be1d36225e",
        "x86_64-unknown-linux-gnu": "406ea5822851cf853a14b250386d47df0a60000410ce8ae92b47dedf8162ba9c",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-09-26/cargo-0.39.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.38.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
