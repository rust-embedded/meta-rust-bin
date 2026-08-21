
# Recipe for cargo 20260820
# This corresponds to rust release 1.98.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "258d0ab85d7e505b83dc38806ad402ec",
        "arm-unknown-linux-gnueabi": "40d241e372c932cf0c72bb6a8cdcf5d2",
        "arm-unknown-linux-gnueabihf": "8892668a4ebfba651c40e8ad665b1953",
        "armv7-unknown-linux-gnueabihf": "fde5df689e909d134fe3cace11c83091",
        "i686-unknown-linux-gnu": "63c1fb74feb2bf9c27051fb207693008",
        "x86_64-unknown-linux-gnu": "ad494be5db9a052dc283ab5090b23cb9",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e271c3c5d50336259a166e68b60ba792a64278ab117686183be3e51a0958d34b",
        "arm-unknown-linux-gnueabi": "7e3a9561d76674c63d084de779b918925f3db917620853cef5a5c5f4d2fba72a",
        "arm-unknown-linux-gnueabihf": "614c88e28a17996411a025e22552e96b59289f9566701fe9bbb0f8ab62a2d198",
        "armv7-unknown-linux-gnueabihf": "31ce71bda766d4eff9c6ea69f5f531fb47c9ef2e23393dbe5f39e706da55727d",
        "i686-unknown-linux-gnu": "4611cb6004bad61d0277acc9eb554e7ec949cbb220375c2db682635522f33f6b",
        "x86_64-unknown-linux-gnu": "18bf1598891b30dd5eb52a337d08a92b4456255ddbe4c1ab996ffb578077031c",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-08-20/cargo-1.98.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.98.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
