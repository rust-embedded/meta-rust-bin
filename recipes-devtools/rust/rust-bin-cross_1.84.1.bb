
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "84b73255742a8084f62241b509c3dff0",
        "aarch64-unknown-linux-musl": "d5260b4a10b4f6677f921eecc7c3b591",
        "arm-unknown-linux-gnueabi": "377951a706a5e66f039a0e0f5e2b82ca",
        "arm-unknown-linux-gnueabihf": "3040df9ebc3422cfcbb1a0e124d60415",
        "armv5te-unknown-linux-gnueabi": "261fc06619b10afb0a7c26ae1d64b4fc",
        "armv5te-unknown-linux-musleabi": "15dbeede80fddbb5fa6586e1a166c679",
        "armv7-unknown-linux-gnueabihf": "3a77d100317034305bad1ecf5841f866",
        "armv7-unknown-linux-musleabihf": "03b08895b4001b87654165e14f919df0",
        "i686-unknown-linux-gnu": "ca946b811231e2f58f538001225be3c4",
        "powerpc-unknown-linux-gnu": "e60c9f805f883070b93968adc9ea6fa1",
        "x86_64-unknown-linux-gnu": "9d74abd1acd6ecb2c13e6b8fc5c76a77",
        "riscv64gc-unknown-linux-gnu": "2e79d326f8562da0744a54f65510fb25",
        "thumbv7neon-unknown-linux-gnueabihf": "b3b5207dd993d229404664130845d8bd",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7ba02e7a18031302232243efca0be0cc8b85d2f776a56e2534adb5e5f722d469",
        "aarch64-unknown-linux-musl": "5ada136e346b157dcd939d3f6f00f0b84e7462163248e6d88dab25631287b98a",
        "arm-unknown-linux-gnueabi": "b5e3ff5ed3105dfedce9367ec7a3a61004b631cfad80d748605bef0d7335f941",
        "arm-unknown-linux-gnueabihf": "e913f289bb36a527b577ec3d9a772a892c18b5fac077168db8a191faf53c5fa5",
        "armv5te-unknown-linux-gnueabi": "8f920916d8357c1b35d5768baca2abd854f064c60ea426e0f934664ea8307abc",
        "armv5te-unknown-linux-musleabi": "da7280adfa2830c171ffb8e6ea2e522880dd42f10348f163636a6147bbb52ebc",
        "armv7-unknown-linux-gnueabihf": "102efe8a824e420333ec6aaf11b09b5397b3e7bfaa349b261d28e428d238045b",
        "armv7-unknown-linux-musleabihf": "8d54006baab38ec32a5d0a382191ce882463b35da91903e556f977fcdd3f0cd9",
        "i686-unknown-linux-gnu": "d5b87fe719237c583dabdf9771fd12f5ef8fbb9fb7525b7bc8b346ed2e81172e",
        "powerpc-unknown-linux-gnu": "8edff890674a6b461761f37aeaff10edebb8d4351966717174ebb5d5da3b9ca9",
        "x86_64-unknown-linux-gnu": "cbf724ea079f6aae03ad619dacdd205c97bcd624077332cf6a5ddba521667e0d",
        "riscv64gc-unknown-linux-gnu": "b6c7b5e9868b08adb3ec81b903d339388762f23bcd56a9bfb10c55af7ef36537",
        "thumbv7neon-unknown-linux-gnueabihf": "4e3a0d9eb2f15a32ba06cd3645062b0a40728e4cac03a84e7c5e53c323b5f871",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5f193b6afc310efd84aba1f2d69501c2",
        "arm-unknown-linux-gnueabi": "5fc135607e23f0474386b9b35591f94e",
        "arm-unknown-linux-gnueabihf": "60d936f7fb94f24b0d7c880f6c9016e8",
        "armv7-unknown-linux-gnueabihf": "304c139d8ad1f4c2d4b2647374349aef",
        "i686-unknown-linux-gnu": "53083a58302ca7a261e099ebcc1cb1c1",
        "x86_64-unknown-linux-gnu": "597b7a6ed51cdbea7f38b7f34ee3001d",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f909720cc86a783973744fe836b115beb09dc93ae9ae9342f9fcf658d02fd91c",
        "arm-unknown-linux-gnueabi": "f81d7ae01da680ed945df3f7c205210395a59abe45781879c0246b353411df61",
        "arm-unknown-linux-gnueabihf": "c78dec56ef80907a6f30e600474529b3c8e86b053b47845e08239271e08e1d4b",
        "armv7-unknown-linux-gnueabihf": "41d65cf83ca7a837e1e85ab5937b4d7f10660197c7f6aca0a2596e42d90a78df",
        "i686-unknown-linux-gnu": "13c19acdd6b44aa03760ec042ed1646c04b6f57816572f7fd5747dc9bc2e231c",
        "x86_64-unknown-linux-gnu": "659c3dd0b93aac581ad1df6613d6038b85d3eff480c73d5915845630349b406f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
