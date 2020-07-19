
# Recipe for cargo 20200716
# This corresponds to rust release 1.45.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2076727845ad5ccef9c6fce22c943667",
        "arm-unknown-linux-gnueabi": "1fdbfe340e8afd6d2f175d962319e744",
        "arm-unknown-linux-gnueabihf": "e8f9bb7243fac56bdbe47a80c742fc04",
        "armv7-unknown-linux-gnueabihf": "00348bc69e12fc8eb40230f751e9ebb4",
        "i686-unknown-linux-gnu": "3aad0d5cb7e876dbddb96bfbd933a7e5",
        "x86_64-unknown-linux-gnu": "22b465bc32e3c847b42f82fd4db4b946",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7eac1b091eaa56ede9d401e772d0973feb0388f944e779c65847ba49770bcb5b",
        "arm-unknown-linux-gnueabi": "1aed83d0f99ae2df7985de7388f8d8f3e67fb279c3de9f796fd84c8332e5df03",
        "arm-unknown-linux-gnueabihf": "5ec4e22ee48cd5adb7447d42aa89d906cc984fffb5f4e1338aa33e8f1f4a206b",
        "armv7-unknown-linux-gnueabihf": "839aac88e2b80e5d3b448e419148c13cc9cd26e077d1b4db782b497dea7be5c5",
        "i686-unknown-linux-gnu": "739f55f79ae94b03d6d99ff77d5a8a97d146b32be239f6fb58e1477c65210379",
        "x86_64-unknown-linux-gnu": "1c40a43c743797ddaddbdebf0fe8c83d12558bdcbae5cfe8da6c3bb7e259817e",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2020-07-16/cargo-0.46.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.45.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
