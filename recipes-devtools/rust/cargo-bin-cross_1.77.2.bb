
# Recipe for cargo 20240409
# This corresponds to rust release 1.77.2

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f1d6bb6febf174790ed37d3b34eae9e9",
        "arm-unknown-linux-gnueabi": "ef5cd0b3e79a0f79d164ab84766aaa31",
        "arm-unknown-linux-gnueabihf": "e0927cb45c33e9839e2e46addc3b338e",
        "armv7-unknown-linux-gnueabihf": "298e0dc35466b1d9e47339fed09d15d7",
        "i686-unknown-linux-gnu": "4dea4f40f60c0fb0288af78e1b6d0b10",
        "x86_64-unknown-linux-gnu": "b45d737a89648c54c387270407915a82",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d39e07dcd037c46d7cd6e74f8005c674b158f5cbc69205f725fa84109e8c9f2d",
        "arm-unknown-linux-gnueabi": "476652a1d42119998c06c23326f5dd9ceb0ca339176416bcee2fa55a786889b1",
        "arm-unknown-linux-gnueabihf": "5d497106a5643c417ef365e386ba321f4f0e12dacf1d020147375bfd5905ee9d",
        "armv7-unknown-linux-gnueabihf": "4890ddaae315989172233f95602f38422a73b014d6c4361345f7a3b36e18de3b",
        "i686-unknown-linux-gnu": "3c99f5c4e6a51ed1a49c38c04144dbd181f09347a427d01407f562a34dc64c6d",
        "x86_64-unknown-linux-gnu": "bbc8afe87bb6860430f8374930516c3303720916aead3cc908863fc0e6f8b3a3",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-04-09/cargo-1.77.2-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.77.2)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
