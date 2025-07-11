
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a4d1b184317695e94e4150f1a6ac4ac2",
        "aarch64-unknown-linux-musl": "e7948a4c904ef7401a225ef076c50daa",
        "arm-unknown-linux-gnueabi": "6432e31fbe980e05c0ee62a89f8f1972",
        "arm-unknown-linux-gnueabihf": "09d242b9886b26847923dc090f8d9dcc",
        "armv5te-unknown-linux-gnueabi": "4e44a7ff408b1fa00281298b0efc5c01",
        "armv5te-unknown-linux-musleabi": "348cdf230bdbbc9544ff9c5f63b2a932",
        "armv7-unknown-linux-gnueabihf": "294364a35b349256986e77da783ac46b",
        "armv7-unknown-linux-musleabihf": "d3422c3a8a704365a0946b2b93a7f901",
        "i686-unknown-linux-gnu": "bb3f87ec834d66375f5f21fb3892d10c",
        "powerpc-unknown-linux-gnu": "302d9b9ea97360c038ad1ad7d54ed0b2",
        "x86_64-unknown-linux-gnu": "61132498f4526e5390b027b3994f769f",
        "riscv64gc-unknown-linux-gnu": "9b2c09e0dfa6874936846922b97c9f69",
        "thumbv7neon-unknown-linux-gnueabihf": "aff1c70b17eee967b1218bf37c1ce558",
        "wasm32-unknown-unknown": "4ccc95a26751eae57c34ddded578ca82",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1f81a91f29d1a5dd4bbedbb76be74582553bb363103bc390c2f8f1f26c2a24bf",
        "aarch64-unknown-linux-musl": "feeb863de2688b70b98eafaf7e707b2192373b649ad147aa07d1e95d8cde825d",
        "arm-unknown-linux-gnueabi": "fedccc489d98e269d6d71824fc8fd24c6801776fb137511c877da58eedb971cd",
        "arm-unknown-linux-gnueabihf": "57c1c148410b1781f6a931c0c46e1570e6c1f5faaf27b2578aed55026047687a",
        "armv5te-unknown-linux-gnueabi": "004209dc566c7d38f11f13488fcc32a85178412580691e7bdf4336c3499758be",
        "armv5te-unknown-linux-musleabi": "d0c082d769326aef6387469769adee11c066dcde50ef9c858f7341a2286f88b2",
        "armv7-unknown-linux-gnueabihf": "5cea8641145397b42f088b369cc59b991d96937b3f7f4204fb9fec73247ca008",
        "armv7-unknown-linux-musleabihf": "77672d915e5981e6a9e4d6820eeb051af38519f95035665ae75fb3bdc042d11a",
        "i686-unknown-linux-gnu": "e6c8486886e13f47d99e1cd9bc941a75aa149936fcc6ad3cc6ab2e32cb8a7641",
        "powerpc-unknown-linux-gnu": "83587c6c2d49ae13c4ac35c73582c190834a72faf605fbf657c437313a2ededf",
        "x86_64-unknown-linux-gnu": "649bda48542f211d77afab4b71505572a4712b6b5c5bdee94533e2e7a9a832f1",
        "riscv64gc-unknown-linux-gnu": "07746a0c64c65a913f4552d845175c4f007059ba09974c914d96b789a465eb61",
        "thumbv7neon-unknown-linux-gnueabihf": "a2ebfccc9bb1c01f00f8fd52ebe8736ed8189dd374d7494ab42d3f24b7856a73",
        "wasm32-unknown-unknown": "ef92a50952a03111c59745b8732f55f209da12e5dd8cd15072ad4ed96ad048e7",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "33eab4a9d44838e1317c0d6e9443f09d",
        "arm-unknown-linux-gnueabi": "c4adde2ecc145e12a2ed6e344be77faa",
        "arm-unknown-linux-gnueabihf": "50cca5f06cbf1464c76266bcb31c2c30",
        "armv7-unknown-linux-gnueabihf": "c0ce4621993de78c8e163fd1656e4189",
        "i686-unknown-linux-gnu": "08a6e609e0b6b3f7b83e884df4573ac9",
        "x86_64-unknown-linux-gnu": "fce69af9057f7ea165fa25b60e0f7e0b",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ad97b6e3ed1e6701ceaa1bad7f2da391546d27b121d967b606bd48542f21c669",
        "arm-unknown-linux-gnueabi": "cca92ad7b66a9d0a6700e24f3bf65e6784bfa0a26b02d1f862cff0cc67627ec7",
        "arm-unknown-linux-gnueabihf": "eb8f8dbbea56ce434c910588b279a55a5fa6f2161e04cf2fdb793b33af7ad1c3",
        "armv7-unknown-linux-gnueabihf": "ee9ace99d789973346a0da5f82ee1dc53a7b452c2d2c1a65b9c519466d88de8b",
        "i686-unknown-linux-gnu": "da87c1522c3a87323f4dd5cdc9fa3826a21f8c14e39ea148e927a2f144cf6fcd",
        "x86_64-unknown-linux-gnu": "1bab764b75bec5b83ec88f6cf7e6127f0bc5bf64307277d1f5ce8838a8b8a415",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
