
# Recipe for cargo 20170311
# This corresponds to rust release 1.16.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d34352bf18875df84d47e2e4a5fa52ff",
        "arm-unknown-linux-gnueabi": "d1da2bcce20d8ae452835be10300c0ab",
        "arm-unknown-linux-gnueabihf": "f91c8ad235968bd7b9816bcf46560d22",
        "armv7-unknown-linux-gnueabihf": "cf2f9382fbb9b4a4dad0afc76d90f5aa",
        "i686-unknown-linux-gnu": "ff761a210ccd74ee2c7f8467994c0bfa",
        "x86_64-unknown-linux-gnu": "b7c8df22546d317e0de8e38440e23f2a",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a73fe409f3d206454101e91a27f4830cf8fea4e65bb642e8d0973822cb0eb11e",
        "arm-unknown-linux-gnueabi": "07f31188173a8a06fd18296c06bb5665117faff4dc6748c6f672f71e1e692d7f",
        "arm-unknown-linux-gnueabihf": "3adebf177ab71445603a98169650d25cfa9ee716cdc49e39a4534b0c7e50bcc0",
        "armv7-unknown-linux-gnueabihf": "6a522088d3f71e9044d0ac1a6ae3191912184ba9cd1f9493ccd788d0e2e687e4",
        "i686-unknown-linux-gnu": "cc1d0573341a892e80cb273b9dd0cc9b0703cb5b046b389cc52252095965af60",
        "x86_64-unknown-linux-gnu": "dcbf1c0f57414501b3d2c6b26cfa7fdfc951c72862e4e3e1e290ab4761961747",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-03-11/cargo-0.17.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.16.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

require cargo-bin-cross.inc
