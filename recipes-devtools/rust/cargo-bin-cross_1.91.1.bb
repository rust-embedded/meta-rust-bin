
# Recipe for cargo 20251110
# This corresponds to rust release 1.91.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "55e0a28fab9779d5224c87321761e4b9",
        "arm-unknown-linux-gnueabi": "d4d63cb18f59fd1b6349e4364c404099",
        "arm-unknown-linux-gnueabihf": "e13e4ce2363ca602e2606f9d02b364dd",
        "armv7-unknown-linux-gnueabihf": "f7292f963b15182e0fa5c2497ea64d97",
        "i686-unknown-linux-gnu": "83213e7b02a89d49c6853d78bb295260",
        "x86_64-unknown-linux-gnu": "336793760fb37500b8b5a8a7fc1243bb",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "10d48a512ecd8b832292fcd273e35946e49f04ac0030112f4f974eb2df8d202a",
        "arm-unknown-linux-gnueabi": "a9253f8587b0862d9fe8ef661b203a3f261916a3644ec06e5916d43bcb22635c",
        "arm-unknown-linux-gnueabihf": "789f5d5228b554e749b8b390c0fe42938fde0b0f884b94be501f694b154e6251",
        "armv7-unknown-linux-gnueabihf": "3a1f65ea2137021b3a32486f24dec105c67a3b5c3e3c056fc2abb03a3c72c160",
        "i686-unknown-linux-gnu": "05b6ba135c2cd1c0285b709e4a89ac8bd2db396bc6418aada56667f6c696f437",
        "x86_64-unknown-linux-gnu": "2e9565bcf38987d585bfeafdb0623a82ef36a3899fcff1c30c9e6b8df1541004",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-11-10/cargo-1.91.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.91.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
