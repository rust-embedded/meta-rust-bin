
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1a27cb446b2792b9a3663611653bb7de",
        "aarch64-unknown-linux-musl": "a15d3e8a3dd66a43f1a65d881426cc89",
        "arm-unknown-linux-gnueabi": "5eb0a22df9352d22707b9e89842d0ea9",
        "arm-unknown-linux-gnueabihf": "098c6a76f5881317fb981b307ba221e0",
        "armv5te-unknown-linux-gnueabi": "b4ea4d71f1ca3c262b1d886941a9dd46",
        "armv5te-unknown-linux-musleabi": "9d33bd13d38325da0e0fce0e21f3b0bc",
        "armv7-unknown-linux-gnueabihf": "bf1d5575419429eae0427f9d68153842",
        "armv7-unknown-linux-musleabihf": "232b90e5498b4d58d89af7d8be75d3b4",
        "i686-unknown-linux-gnu": "d570b61de91491ede1c926adda42cef7",
        "mips-unknown-linux-gnu": "8f6fa2b253c1d5c0836ebb086e88a609",
        "mipsel-unknown-linux-gnu": "644664175ca40196f92af31e6b5c9abf",
        "powerpc-unknown-linux-gnu": "d725dccafdcf91eb702cc75730beb758",
        "x86_64-unknown-linux-gnu": "7e8c209615b1c65c4f710c2255010eac",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6af6bac7a3ae1b2e1b9153d5d0bed124122daf8e6a8e90440701cb199c2c95d2",
        "aarch64-unknown-linux-musl": "ef305007ff13cefabb08a6bc69751fdc25a453fa54aaf535cfda21d8ad86426a",
        "arm-unknown-linux-gnueabi": "4d5a75ab5b254ad78635174b4b0fd09b22ff6d3116b1a4a799376f544fb0f268",
        "arm-unknown-linux-gnueabihf": "dd0ca5a39cb5d7c02abdbe872fe9045607b8abd4920f2dc1750dcbaf7d2a4dfe",
        "armv5te-unknown-linux-gnueabi": "1ac393901b778fa9bbde6394cf77941d1ded95cb35538009b657420a84458cc2",
        "armv5te-unknown-linux-musleabi": "a2d3e10f4cb216abcdf22a3e6d9a68ed4f0ecfbbbb530962f43dd96e4d04f4a3",
        "armv7-unknown-linux-gnueabihf": "13515c3ef9356511bd2b750e98761ca08503f148db871fe08036d4a619b6d37f",
        "armv7-unknown-linux-musleabihf": "2a983f090160b3537faa18e3d852711ef757f30bd90eb53972a1f691efcd21c4",
        "i686-unknown-linux-gnu": "22c07df648225e1a1cf23ad84668772e2ea072174537353b739fd80464e74ab5",
        "mips-unknown-linux-gnu": "0586a7c4b225a0ae5cce29229dbf4ae96a99d855830d6d436d32437530a6c7a0",
        "mipsel-unknown-linux-gnu": "2aee14fcc2e393eaee744c4ac158d2b9ad159f9982124b2cd4d5ebda23f1417d",
        "powerpc-unknown-linux-gnu": "d409da640e9b46893d9d07fd493a1cddd622f399e945e2da9ce127ddf9f82b7f",
        "x86_64-unknown-linux-gnu": "564e5afc7151826190f8b31ed839fc305469158967ffe907d4c6e712a281ff5f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d3e87582a7c0c75903de4d9b72ec3739",
        "arm-unknown-linux-gnueabi": "f4fecd817ede238b729979ccb16c9dbf",
        "arm-unknown-linux-gnueabihf": "4a2d2de678d0eb5dac6a881e740e5e9a",
        "armv7-unknown-linux-gnueabihf": "ee4d6a45692387a7a0b61b94bc882c9b",
        "i686-unknown-linux-gnu": "648afadeec12f8617ce54a89b6926126",
        "x86_64-unknown-linux-gnu": "b0781405c138b25c47a9478190909500",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7f61cee6f69fb6895cef5e5d077504ca69dbf35535defd5182b7e60582b7f1d0",
        "arm-unknown-linux-gnueabi": "ef84833d3ba5f4ebfb277a46db377f3d3c18a28fcbac9379fe79967c896cafb9",
        "arm-unknown-linux-gnueabihf": "f0ff294417fa1d2583920cc203812e911c3e7295ef1023df0a794d71591bfc96",
        "armv7-unknown-linux-gnueabihf": "80f26a4dbd072e65ffe500dcb3ffb352fb54e505b957511ad1eac9ad59af028f",
        "i686-unknown-linux-gnu": "3b1328dccbe32ef476e5f3429f81b90e243bfbce717c9d00bda35e18d4c10c54",
        "x86_64-unknown-linux-gnu": "4066d5f897864f88dbe55fdc190881272132d3acf031f6aa29e1b19a3b589c9c",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
