
# Recipe for cargo 20261112
# This corresponds to rust release 1.100.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ef848cda19192933870e8ba8a2906495",
        "arm-unknown-linux-gnueabi": "0d94fe5871445818f4a2f539b9cf8c6a",
        "arm-unknown-linux-gnueabihf": "22c9916e7bab025d19bba04b4a944e12",
        "armv7-unknown-linux-gnueabihf": "f2b345ea7588f66001f7dee4dd5b0b9e",
        "i686-unknown-linux-gnu": "b61b5ffea44084d9a71dbb0b740aefe7",
        "x86_64-unknown-linux-gnu": "f18b78b26e5d781f9bf741ffe5ef2714",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b3acccbba065da7e97c20592442f104bd9554d54bf87a323bba8a1d6e61282eb",
        "arm-unknown-linux-gnueabi": "902ba5e735584503b57ddd9762471526f275b8c89a172abe5d891c4eacfa1d3d",
        "arm-unknown-linux-gnueabihf": "563f5d5ae6babdb58cf4e3afe98803c444888306189cdd1b6696fca53a691fd5",
        "armv7-unknown-linux-gnueabihf": "e7165f69b8258e49571b03d5a82f68fc825789cc8f4f86bd6243385fd00e017f",
        "i686-unknown-linux-gnu": "3087b6c2dd9499c1d3b03c20b9b7f7991d6bb39e07ff462cc89b2904189e10b5",
        "x86_64-unknown-linux-gnu": "4e7fc3cbe98e23c88a3c6ce37f834e3ffbc91536789782c4c4a9670df6b16a49",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-11-12/cargo-1.100.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.100.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
