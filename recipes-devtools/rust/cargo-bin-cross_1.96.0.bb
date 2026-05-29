
# Recipe for cargo 20260528
# This corresponds to rust release 1.96.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8d56764d5902f869d2c93fd98de04ac2",
        "arm-unknown-linux-gnueabi": "37ce03b69dfef8c222c4166ebecd0868",
        "arm-unknown-linux-gnueabihf": "f120a341dd37066394b6747885c77af9",
        "armv7-unknown-linux-gnueabihf": "4f6dcf3830b78f80f89a6c97bbbd1af8",
        "i686-unknown-linux-gnu": "72fe0588c66d3db0f9eecb67c1a2210c",
        "x86_64-unknown-linux-gnu": "a70ecc0a0008aeb9842ab9aae9eae9de",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "aff68544337c835a58ff303c47fc1ddb0a1a0bd9df332e37c8d466d8f78eaa32",
        "arm-unknown-linux-gnueabi": "6c41451fb5672778546cce5c3c1d8a02d198960318c2f97a625b5d77e1847ee2",
        "arm-unknown-linux-gnueabihf": "675b916e06a5bf6d312179823bba51f62f3de4ce4aaaaa2a3b5dfadec643fe5e",
        "armv7-unknown-linux-gnueabihf": "a24cc08401d2100429efeffcc4491b4a23aa0d5549ebb647047aa2055b21780b",
        "i686-unknown-linux-gnu": "ddc368e2a70dffcfb9330778841cb0d3ec7f2b852cfd4a1918955ac2d805e4b7",
        "x86_64-unknown-linux-gnu": "b691a9e31b1e5498017be91155a1e7501eccf6437e7dc9ff1896e38aa1584dbf",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-05-28/cargo-1.96.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.96.0)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
