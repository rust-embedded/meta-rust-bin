
# Recipe for cargo 20230309
# This corresponds to rust release 1.68.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b0c3488cd5ca0dc3022e27a62ba59975",
        "arm-unknown-linux-gnueabi": "e7c68fbc07524e613eab5c70aabc9c4b",
        "arm-unknown-linux-gnueabihf": "ac4147bf5b4f503ba21fecab37d78347",
        "armv7-unknown-linux-gnueabihf": "061496b556e092942220dfccb5784ea2",
        "i686-unknown-linux-gnu": "6cef3c2e19b52f48facd19500c2a9d93",
        "x86_64-unknown-linux-gnu": "abaab0dbf00e173a59a7b698c262cde7",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8f665f6dd1ee4c7ffdbb4ac886dd1252c052689e0b982f92894b84e180af1871",
        "arm-unknown-linux-gnueabi": "8af2c88d6d846012da42a42b09e296b7a954b2c7c1f86df5e970738d8b9b940b",
        "arm-unknown-linux-gnueabihf": "69f016a0e8203be57325ab2c0f281c13ee6a34c69916346bc239bf956db568dd",
        "armv7-unknown-linux-gnueabihf": "13d4b4345e0b4f50da1d4d5649f137cd7243d0326cccf997943b11674ca244f4",
        "i686-unknown-linux-gnu": "ea5c7e7e68e3543c2149880b002e7d5619a40cb0096ed3113c7acd1f3a97a2a9",
        "x86_64-unknown-linux-gnu": "c9a841bfaf5adfb0c77b66bd83f0aaf0b5a1056054d5e133bb5cef821e2336e3",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2023-03-09/cargo-1.68.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.68.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
