
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "947098063711aac1c10b6643b8b25d6b",
        "aarch64-unknown-linux-musl": "fcb306014043626cbb3c784d03a5d71c",
        "arm-unknown-linux-gnueabi": "02b08c0e5a22d56f0637a2ccec83cfed",
        "arm-unknown-linux-gnueabihf": "0e8b35c00547c09c4b22d2c17152c825",
        "armv5te-unknown-linux-gnueabi": "5f4d381802f46a449e9bbbc8b5d3961f",
        "armv5te-unknown-linux-musleabi": "3efa699f99317f6c75d646fae9377837",
        "armv7-unknown-linux-gnueabihf": "649f0a21264367405cd168b3c240637b",
        "armv7-unknown-linux-musleabihf": "489773a7eafed3e0249befcbbde580f2",
        "i686-unknown-linux-gnu": "8fd82a56a06619033cfa0dde211fefd3",
        "powerpc-unknown-linux-gnu": "eac6319ae20df3572e3f3986a89daf54",
        "x86_64-unknown-linux-gnu": "a6b12c9ba75a56bc334e64d986e42974",
        "riscv64gc-unknown-linux-gnu": "e5f9aaeea911711f77641025daafb6f6",
        "thumbv7neon-unknown-linux-gnueabihf": "c2caca412065b665f31640aa969ba25a",
        "wasm32-unknown-unknown": "4437c4dd1bc005972bce807b49ee6514",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "11e839c22024ff4fba8a6918db28607338ecd987ec4df612142719995d1cbb13",
        "aarch64-unknown-linux-musl": "5c12fa8f9f85617d343440c9acc7ae803b495c787394f04ebfd8699eee82537c",
        "arm-unknown-linux-gnueabi": "453f258623f59443ac9df7d10577e18f98c4117c58f1968443ec5dc6cc95141d",
        "arm-unknown-linux-gnueabihf": "2f18b6ec9d5042db04bd8c9c2e2f12c463e7f63fce599d2a3e8568cdd80ed500",
        "armv5te-unknown-linux-gnueabi": "34f7501592104e614f3feb1f73e6d8f3ed2332479b098030f1f551950a5d2950",
        "armv5te-unknown-linux-musleabi": "7b8294137c0fe45f8b5f2bca0f5a62fdcfd49002475c023ac5d765cde2d7eb16",
        "armv7-unknown-linux-gnueabihf": "84a22e41f79591c7ab719f8489613ee8ae80edaa40c7b021e3e4ca4569130842",
        "armv7-unknown-linux-musleabihf": "fcf720d4bea145fe5e048dccb61a4046cc1b4e209663659d591db15c22fd67f0",
        "i686-unknown-linux-gnu": "b58aa49c65a1625a8b2d01ed0382bba187b85fbf2eb66efd78deec6c1dbdc428",
        "powerpc-unknown-linux-gnu": "c4f6f849984e587804da8011e14987395576b5430383311931df605521470c31",
        "x86_64-unknown-linux-gnu": "9597f608085e0dcf48a010e9831dbb8eaf3b30c8b57e18605f02d3f40446c34f",
        "riscv64gc-unknown-linux-gnu": "2cc380a6a68c272208c88dc37533e17658114dc916cbb1da64f4b8becc8988f8",
        "thumbv7neon-unknown-linux-gnueabihf": "bbf4f97999547872696b485a20afb6fd9218bb850e26a244f7155c2b980be304",
        "wasm32-unknown-unknown": "4d56b6eaadaea1a617da7e3b464fd6f41928833ffcaeb65b319a644867ca6854",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f54ee525a94a8a34cfac6cda394c4a2a",
        "arm-unknown-linux-gnueabi": "cfdb7106c0aa9a562117415a48b25ac7",
        "arm-unknown-linux-gnueabihf": "2bf78d22169ab6e37a0552f15d7bf6ba",
        "armv7-unknown-linux-gnueabihf": "67a0f07ffb81a2e726f7096a8e8f6b22",
        "i686-unknown-linux-gnu": "7438fbf41aa2f1cce2a1ea6e9c108db6",
        "x86_64-unknown-linux-gnu": "73b584e97d819fee0cec238253bfab9e",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f952d9fc28e0029c75e1f4c43ed81bf0371cda8e089a1110bc62a8f01de1d936",
        "arm-unknown-linux-gnueabi": "541961bcc382a5695961111b9660cd015a22df7981aa69bede319869a0b8693b",
        "arm-unknown-linux-gnueabihf": "e8eeb5b863bed472dc57ba6e592b8687a131461f6608774b5256cc51bc2eaf98",
        "armv7-unknown-linux-gnueabihf": "ec8ba5aadd49e376d07b3c1287b9d96b3f56a133faaa151c35c3f1d465c81635",
        "i686-unknown-linux-gnu": "b9ffd86daeda5567a938dee5e6117d8c76bf40acb7dbf69469fc0155574161b9",
        "x86_64-unknown-linux-gnu": "0ca9b48a51f61c4a5e799d04f27ca9062000d6b4934606e5babbf3b026e4074b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
