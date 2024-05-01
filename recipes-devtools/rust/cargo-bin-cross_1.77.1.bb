
# Recipe for cargo 20240328
# This corresponds to rust release 1.77.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "010725099aaf50b06efb8f8df0951b32",
        "arm-unknown-linux-gnueabi": "7e4078bb041d344d9af5055a80307c2c",
        "arm-unknown-linux-gnueabihf": "1558b72d99496c08793bcbd489f0f822",
        "armv7-unknown-linux-gnueabihf": "c489bd9d76bfaf2cc8650a61fac4eacd",
        "i686-unknown-linux-gnu": "e15a2c6e0dd8eb86ffc2446823e2844f",
        "x86_64-unknown-linux-gnu": "7dcad23472a1139fa528cbecc7a52b29",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5ff108c862c97465ec31ad61cb671ffe2d34050ffb051684a0ddcd05b7a893b0",
        "arm-unknown-linux-gnueabi": "316bef4708b8a2197ce9d22553663877d3440560c95c5387715216e5098715d7",
        "arm-unknown-linux-gnueabihf": "5ce6e5e730c317d6c8ce8dde5cc6ff216b8c6804d36e7ec93475ef97e5aea4e8",
        "armv7-unknown-linux-gnueabihf": "39fba4761612717f96f0d5a8f0f20e7cc50d639c02720399b5939ab197205310",
        "i686-unknown-linux-gnu": "2cdb57367caefb0e6bded1e8702d5ceed90a7bd8110b291de85d29cfc1262150",
        "x86_64-unknown-linux-gnu": "e6ee01b895704b549b76aa38f8a282e17c08020e12fe857f3f52cd3787fc5616",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-03-28/cargo-1.77.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.77.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
