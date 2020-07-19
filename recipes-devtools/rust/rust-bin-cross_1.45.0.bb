
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e70f46de6fdfe58d1b4f9b7e9aaedfe1",
        "aarch64-unknown-linux-musl": "52d187af6f58a8b264c0508e34d37d27",
        "arm-unknown-linux-gnueabi": "59b13f5bba91a7087bffdc1a475f3a38",
        "arm-unknown-linux-gnueabihf": "f483c663ba679ddf2ab32098b65cebc0",
        "armv7-unknown-linux-gnueabihf": "fd021dc91f90b66970a2b6c59d097263",
        "armv7-unknown-linux-musleabihf": "e0710c6945edbaf619158b488c284dc3",
        "i686-unknown-linux-gnu": "5e9cf9a2148ee9c160f34b44d58fa376",
        "mips-unknown-linux-gnu": "9b74a1693ac044336a264316dd837f65",
        "mipsel-unknown-linux-gnu": "be2e18b36dc67afd5794b7c0ea3cbe2c",
        "powerpc-unknown-linux-gnu": "1dffcad4b9f77ae382340ef162f30da9",
        "x86_64-unknown-linux-gnu": "70f791dc49834644122fa5781cd51c8a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "816f6cc132db84617bfde6ad47336bfb020552a45bd0a10250c4e420d512d5ad",
        "aarch64-unknown-linux-musl": "c37bb023f496161ef3238f37b44606a93e15af225d70d3083bfd52e7f8fdd36a",
        "arm-unknown-linux-gnueabi": "606ea9b9ddfe414bb27eae00c24237ef773164ade5ba9ef1072169600ac290fc",
        "arm-unknown-linux-gnueabihf": "94be4af513c1d459a60bba811f8f2a6b83f23111444fc65d7be62717203b2f30",
        "armv7-unknown-linux-gnueabihf": "c71b7e102a7fc3cb16efbd728cd5d11bbac980cb7b9322fcab9c1305ff281fea",
        "armv7-unknown-linux-musleabihf": "9fa5fe2404063ce640027b5e7c80eea25afb2d2f4ba4d935a80bd472411a1fe4",
        "i686-unknown-linux-gnu": "c69d9af31679c021c31df2021d3a438650dc7c86969cd54fd6011a9ed2256db4",
        "mips-unknown-linux-gnu": "3c5e0e528be273e78fefeb6cb643e6f3aa2aebf3254494ba8676087a0a49e0ed",
        "mipsel-unknown-linux-gnu": "c5cc024c410a3414e971ce7d741c53b86d285be57ba7c21b89016739b6239db0",
        "powerpc-unknown-linux-gnu": "bbc5606e221382820048f255e1a7321260c72b06f9daf73796dc2489ed378b2e",
        "x86_64-unknown-linux-gnu": "7ab1dbcdeab16dfea1ed024675e60429db9719f03648e6a09662de72b4ff730f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9396fc7daff1608f3ff936a86b95cb51",
        "arm-unknown-linux-gnueabi": "6e3be46c4c7bbe27dd9fb1abbffa343e",
        "arm-unknown-linux-gnueabihf": "ef3cd6ec657db21b7336d2d89b14ba56",
        "armv7-unknown-linux-gnueabihf": "920079618a3e9f697a797491f768654e",
        "i686-unknown-linux-gnu": "934ef9afd4d4bc2073aac48526b5d5f3",
        "x86_64-unknown-linux-gnu": "a9cb8225e7277209481e1bd30fef1a78",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b1ef2ea19142d851f2ee6936cd46a30ec8f157ba53048bc2748279d1e9e0ad17",
        "arm-unknown-linux-gnueabi": "9e7051acdf390e49e856256798d62ae05cb0c75b89e7931a66f469c6ac5ed5c6",
        "arm-unknown-linux-gnueabihf": "866668213f7e0fe0feee7e2d4292d657305da2f8ab7d75588393ef195a1bb42f",
        "armv7-unknown-linux-gnueabihf": "357f50175e71901582398638141abdeab9234144bd86114058110996dfadaeab",
        "i686-unknown-linux-gnu": "44daade9c046b6a692706460854d4510feead99caa0f1c7ea428f38d386c480e",
        "x86_64-unknown-linux-gnu": "3ef2fcf818c133c3e9957441917b23ea536805efd0ff9ac6ee0bea349d703a90",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
