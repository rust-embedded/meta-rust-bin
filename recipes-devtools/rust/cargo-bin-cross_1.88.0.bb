
# Recipe for cargo 20250626
# This corresponds to rust release 1.88.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bcaf1f802605d19fbf72c1c1aa1e2a60",
        "arm-unknown-linux-gnueabi": "e7aaca9db3252d9f8961e05daf1e749c",
        "arm-unknown-linux-gnueabihf": "5c54f53f726fc9c29a74a6024c2d0279",
        "armv7-unknown-linux-gnueabihf": "98cc32b9bdc49fc4febb80dd2f6ee92b",
        "i686-unknown-linux-gnu": "d522ed74f15152f4b26ed6a0f1d1bcb0",
        "x86_64-unknown-linux-gnu": "6ca7f366a89a6f1b5d1b756826c7112f",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ab3cde4024966a47f5a9d8c7199bf0975f9bab44ae85d67701e7f9c504d32b70",
        "arm-unknown-linux-gnueabi": "ef2c50cada7a2d0f480e7e92f8b1c9e7f73243f35cf2038a82018af035248d14",
        "arm-unknown-linux-gnueabihf": "f92e047b4d07bd21614715c0f1f3b4f719eace0d2f95eab6a506dd8777c6fff5",
        "armv7-unknown-linux-gnueabihf": "c65ee9d111f681368e936e43f13368028a38657c6ba1646115361e6667d52769",
        "i686-unknown-linux-gnu": "c408a9ab75a98da44794f390ba863816b5c091d5196169de3f058f1be5fd9200",
        "x86_64-unknown-linux-gnu": "3ddcf45a41114479d0267b22cc52f7f7b9fae9aad9bf433ac5de5e04f15919c4",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2025-06-26/cargo-1.88.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.88.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
