
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "028b1371c8a02295543619a6c023d1cc",
        "aarch64-unknown-linux-musl": "612017dca358a7b9bd24eb52dea4e65e",
        "arm-unknown-linux-gnueabi": "ea06a51ad0a4dd04e81dbec42cb298f0",
        "arm-unknown-linux-gnueabihf": "c5b57e8478ef710f0675043fc1accd0d",
        "armv7-unknown-linux-gnueabihf": "4ebd0a2686181eb6f645de10cf171a2d",
        "i686-unknown-linux-gnu": "2f0a293362e41697f6e482f47e700b83",
        "mips-unknown-linux-gnu": "71fd54b62712f4735dbf682a6e5874ed",
        "mipsel-unknown-linux-gnu": "4b3c49b70633bbf4974e6fafbde0bce9",
        "powerpc-unknown-linux-gnu": "522b51ba15528fa26a1d778bbd51ce6a",
        "x86_64-unknown-linux-gnu": "d573c5bd3a965c973734c1606968a91e",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "26f13cd80c95d484ccffecf517f1e05ce521072a00f1adea43d02b3f9d37f82a",
        "aarch64-unknown-linux-musl": "47c7ed55b77e161c9489ca903be32be80dd0efdf88d55f472bb54cce832629de",
        "arm-unknown-linux-gnueabi": "71e5e752e092fee4b75e039b2dca131ece1cd9abbe55aec0180ad818f36b28e5",
        "arm-unknown-linux-gnueabihf": "2ceb92bc8cda753db1a6a333c40c1d78d4cd86ba1ab4cecd3ecc7d13149f6cac",
        "armv7-unknown-linux-gnueabihf": "ae7801238f4f1c50ba12687169ebfb611dc22c5c9541ff80fd0b3f7165ed7f27",
        "i686-unknown-linux-gnu": "f4bba5b77c61a30f0a4c83e152f216c62f974185c4c012c295a5d19d44381a62",
        "mips-unknown-linux-gnu": "db5359b509ffba417a6828273dcab3c5418f6abf2167fa1263c5321a49df8dd0",
        "mipsel-unknown-linux-gnu": "caa6ddc8c1d3c5a5ea3da5b4b34fd6f5c3ae46eae56255b6a187f5d440726a6d",
        "powerpc-unknown-linux-gnu": "c3205c8d00c41292856b5c6aec5bf8038963bf5387c7a054f99d22d4efa14820",
        "x86_64-unknown-linux-gnu": "661c2ba717ae1502f002b4c6e7aeb8941685c7ea8fe7ac26ed9ede26f615b7af",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "71569bd214148253de61c1b314815116",
        "arm-unknown-linux-gnueabi": "d46008da35813a063c212edd4bf036a8",
        "arm-unknown-linux-gnueabihf": "73a844ad345b09ecad9b0101b29155d7",
        "armv7-unknown-linux-gnueabihf": "e054087c5661b80d2f63c3c800bfb133",
        "i686-unknown-linux-gnu": "f09e7d9dc9b0399551bcaf2267c24d1d",
        "x86_64-unknown-linux-gnu": "c1ec989c1965dce754dda1e54274a68c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e23141cc65d1d8e3957a96f3a601bdb7a9d09026ac20396aeaebd2613ea0d08e",
        "arm-unknown-linux-gnueabi": "75ce4cefe6dc2e974500cf4f717e3e6843ee1a7666d825b3c29935be4f1c90b5",
        "arm-unknown-linux-gnueabihf": "53dab02b28b84116386c49b0ca1a06d6be9294356ca717c557ea377d0b5f669a",
        "armv7-unknown-linux-gnueabihf": "27ba0cbabe2e0cb4bc7e977f8f7bcd24242e2f7f39173e52cfe933d3de1d1898",
        "i686-unknown-linux-gnu": "be4cdc82b511b0f2499fc9b7048b01069257ca2dedb270a7938e1846beb5a349",
        "x86_64-unknown-linux-gnu": "54a342f718b712d8a17fd7878ebd37d22a82ebc70b59c421168cd4153fd04c2b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=27e0aaa5e5cbd279af456711d3bdc066"

require rust-bin-cross.inc
