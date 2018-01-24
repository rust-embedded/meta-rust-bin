
# Recipe for cargo 20180104
# This corresponds to rust release 1.23.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d4df90a25d3932f080cdd3d93285e61d",
        "arm-unknown-linux-gnueabi": "6606bf8fd070e34821fb3bb2dbce561f",
        "arm-unknown-linux-gnueabihf": "2df989c6d69db6232fad43b13470ca93",
        "armv7-unknown-linux-gnueabihf": "31fd607951e227e11c31224107205768",
        "i686-unknown-linux-gnu": "5f149398a682fac3ee88cfa35cc7339a",
        "x86_64-unknown-linux-gnu": "830041cfc8627d3f7187954993449cf9",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c4abbfa2f976d50b814dd5bcafe65bc8a31c551438f106e6d3612aaf78206adb",
        "arm-unknown-linux-gnueabi": "9b388aaf7e5bcd1498499e19edc851fec14d68da58f1da058f5152db48ea16f2",
        "arm-unknown-linux-gnueabihf": "f2cd233ecd13759c5cc19329a2fac6b58305b9d675a86a920b3a46d4696cd975",
        "armv7-unknown-linux-gnueabihf": "78cfc9eb3d8614955bc0d22df3ed971aa259033dfc209cdb9eebf40ea3c2d562",
        "i686-unknown-linux-gnu": "a3e2d7d53623e239616a49ef80cb17d3e742f75b8c0237d96256b3459caa9cde",
        "x86_64-unknown-linux-gnu": "ff8a454104aba20426ea898ed7515ec5da7de07d11733cdda17462455beb76e8",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2018-01-04/cargo-0.24.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.23.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
