
# Recipe for cargo 20260716
# This corresponds to rust release 1.97.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "86d29632137636850215d7a78791e970",
        "arm-unknown-linux-gnueabi": "7804f3de22762b8d61760cd59b71d069",
        "arm-unknown-linux-gnueabihf": "c65169ef6cc50660a36bca02f7d45cd7",
        "armv7-unknown-linux-gnueabihf": "adf3abc8f573441c53ab66eaebc618f5",
        "i686-unknown-linux-gnu": "7f62bea9b67708cc0d2a309f3d8afc18",
        "x86_64-unknown-linux-gnu": "e1bcc4ffd7134619bdecbede27ca483d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cafde243518b016f825d13a5f2ca4ffd7d80f5966dfbec3539cd092c7c4f9871",
        "arm-unknown-linux-gnueabi": "647f5bc3d8cba149ae02fecb6b703969f1cf3d5e86fdb99f2ebc4f7ecf611aaa",
        "arm-unknown-linux-gnueabihf": "fd7105f315db6fe5a4555988ea3e0efe4046cf0cfbde0b26243455fe198ca92d",
        "armv7-unknown-linux-gnueabihf": "8f35d1e08601b479741823220c20fbbe391ed9cc1b08cbdd88593cd4c4958ed1",
        "i686-unknown-linux-gnu": "29a4085ca70b49370d43e35fa3902cc345e0a727615fe8b9a6680184bb2aa197",
        "x86_64-unknown-linux-gnu": "90cbeb8adfe8ca0fcbe01a18bd9b99d3e5e98fd29c003032828ebf3ffba0e4ed",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2026-07-16/cargo-1.97.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.97.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
