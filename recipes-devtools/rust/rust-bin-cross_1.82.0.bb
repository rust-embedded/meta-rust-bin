
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d457eae397b3ec6735242032840ccf17",
        "aarch64-unknown-linux-musl": "d8ba8093510237c887a39dccc8e1367a",
        "arm-unknown-linux-gnueabi": "a740be361e9c8fc31b3dd3469be7b0d1",
        "arm-unknown-linux-gnueabihf": "540cc56ab6da24c73bbab0dc7fe3b1f4",
        "armv5te-unknown-linux-gnueabi": "1f5d2291e207ca05ee8099e5681899cc",
        "armv5te-unknown-linux-musleabi": "fbec3561cbf839491b68914ca81f3bd8",
        "armv7-unknown-linux-gnueabihf": "e3dfc046e174802e809018a02fe373ff",
        "armv7-unknown-linux-musleabihf": "4516de2d2b6b3bb9cc26254f3a14b283",
        "i686-unknown-linux-gnu": "672163d48d2ff12de9780fbca02f1727",
        "powerpc-unknown-linux-gnu": "c1aabdf6194271c54055a778be697a0a",
        "x86_64-unknown-linux-gnu": "9b687db3086c7f12d8d451f7906bdae4",
        "riscv64gc-unknown-linux-gnu": "962fe8a8c3f605b93222a36975fcd14e",
        "thumbv7neon-unknown-linux-gnueabihf": "5a73bcd3f5a2a4b3074c7350cc1aeda9",
        "wasm32-unknown-unknown": "6fa86da050154db4da7e2a9e746a6950",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "82b2308ee531775bf4d1faa57bddfae85f363bec43ca36ba6db4ebad7c1450d4",
        "aarch64-unknown-linux-musl": "1ea6dcf3a0c0d3a7133fa75f157bd17a3e1363be135f39325ab89ee1775de96b",
        "arm-unknown-linux-gnueabi": "c99f382c52b796c12702c92bf816a4366cfad877445236e1423a04efc79afcb2",
        "arm-unknown-linux-gnueabihf": "3543becabab676100418c8a41d3976f93cf512dfa2291f4b0eb47f446eeec7c1",
        "armv5te-unknown-linux-gnueabi": "3058af47cfb839c31402c9990efea1dd5ab57ed9e4afa42f35693b2461776463",
        "armv5te-unknown-linux-musleabi": "dc884fba6a42b498e624515a41ed13ea85859a4d6b9f2e3139fb43dd0934b9b5",
        "armv7-unknown-linux-gnueabihf": "5dd8b36467e03ba47bfa7ea5d7578c66bccb648dd2129d7cec6fb3ff00f81ca3",
        "armv7-unknown-linux-musleabihf": "8015b98c45ad6251475e7ae94689e47c3ffd74af87b5ba4a84f50211d3c793f8",
        "i686-unknown-linux-gnu": "b2776d74e3c6ca272b20d92bc7593065803525119a649163fdb359c9fa2b7ab6",
        "powerpc-unknown-linux-gnu": "04cb6222f53b0bdff950e8ddaf5e869639a3726022cbd8c4e78190bdccf1f1cb",
        "x86_64-unknown-linux-gnu": "e7e808b8745298369fa3bbc3c0b7af9ca0fb995661bd684a7022d14bc9ae0057",
        "riscv64gc-unknown-linux-gnu": "7b35c8207c77e3fc2f7f7a26dea989cc2cdc13a955851ff74d4882f96f4e14dd",
        "thumbv7neon-unknown-linux-gnueabihf": "c940d08d695b9e72ed90efc727d8ef9e8b69aad5332e3270191974a33b1450ab",
        "wasm32-unknown-unknown": "c0b7be8188c1539b0508e6f64c58589775674cba5f8fe997f731d399431258f1",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1bee05c4bf83dc841a0c92c688d636a1",
        "arm-unknown-linux-gnueabi": "42082518bdae409770406252845e615f",
        "arm-unknown-linux-gnueabihf": "d838b2e66463e7aada7a9a4a664c116b",
        "armv7-unknown-linux-gnueabihf": "ab53f01b2bcf8c529f877009e4d32db3",
        "i686-unknown-linux-gnu": "749bd8d18e560b234d60ea056398cace",
        "x86_64-unknown-linux-gnu": "5471130710ab21517827c1d83dc61f14",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4e8a37508e732cfc95f0a03ebe51bd05e1212f126747c612bef608dd2223cbde",
        "arm-unknown-linux-gnueabi": "b1007e3e8ca340211552220baaf56ba157c9232f7957272089dda554a3f27d2f",
        "arm-unknown-linux-gnueabihf": "c1859e6cd8524e2b8b130eb096f17b85522287381231f13e7e512e13b37ad4bd",
        "armv7-unknown-linux-gnueabihf": "c6f13a6f313b866df4e76e5817e01dd52194ca205d37604bc94500205618c7f1",
        "i686-unknown-linux-gnu": "28bbbe8f9632bb72736a475fc00b887062b631b21014012af9b65fdd4e0341f4",
        "x86_64-unknown-linux-gnu": "94d5ac7d978a2397fd112704985fc892fb0a813e384682c697c47071ab2d3807",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
