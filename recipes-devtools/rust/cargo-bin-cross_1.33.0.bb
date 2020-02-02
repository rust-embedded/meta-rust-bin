
# Recipe for cargo 20190228
# This corresponds to rust release 1.33.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d3e58d4c8ea7cbc958ccb42e62098e63",
        "arm-unknown-linux-gnueabi": "d00bd129610df17864f3e1da5287a4bb",
        "arm-unknown-linux-gnueabihf": "60995a40185d1c3ec09b8fee62f06ea4",
        "armv7-unknown-linux-gnueabihf": "435e613647be5c0a222eff3fa068413f",
        "i686-unknown-linux-gnu": "8050b994889fc2d10bcdc133253cb8a3",
        "x86_64-unknown-linux-gnu": "de0e635afa9bf495cefecea476bfce36",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "723b20633940c1a76b32f2f5ae103ff933a6277ac33fc930c6d4196e89246c55",
        "arm-unknown-linux-gnueabi": "19f19dc8cef9329b1e85d620d5abf523fec407b2e8570d54b983b7b4c474edc8",
        "arm-unknown-linux-gnueabihf": "52b75c649080f0e176f44c181d0ff768342e7a46d008cc405385a7e8fd9ce5a1",
        "armv7-unknown-linux-gnueabihf": "62c7e2082c5c651a6ce5b4b68def78f3c2470628d13befee3a9844c13c84f681",
        "i686-unknown-linux-gnu": "651f8cbb2dd5634c5b8a38611ce6d6a48638fa3541f301f60c1e06837b8a6fca",
        "x86_64-unknown-linux-gnu": "4795ae5ca3bb8c7c83ca338676bb02b670efa1eb474e346284b629dc872bcce8",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2019-02-28/cargo-0.34.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.33.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
