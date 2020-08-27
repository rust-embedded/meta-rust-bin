
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3a2399a24e28c2e3514e475c04972126",
        "aarch64-unknown-linux-musl": "273fdedc128007ea30a5aec02d2ea3ed",
        "arm-unknown-linux-gnueabi": "6403f89536cb5562ceea6b214117de36",
        "arm-unknown-linux-gnueabihf": "7d228ace50b0f46c6c829058b9dfa0df",
        "armv7-unknown-linux-gnueabihf": "87f932c9e533ff0dc0f38eb28e544703",
        "armv7-unknown-linux-musleabihf": "6a0bfebf05d7be62322163ba1eb5f6d0",
        "i686-unknown-linux-gnu": "b3e8359faee92291d5b844d9d1696512",
        "mips-unknown-linux-gnu": "83941c0d5eff90365ab7936efb4865b5",
        "mipsel-unknown-linux-gnu": "aa6d84ec6a6898bf9312490a2ade9cea",
        "powerpc-unknown-linux-gnu": "94064f16bad8526d05e7185c68e0d9ea",
        "x86_64-unknown-linux-gnu": "e56498680e36552b3659034af9439f0a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "eaa7cfd73e96b6ce03498398f4bd9ded73870fe3c5db980038a4863c37157597",
        "aarch64-unknown-linux-musl": "5ad254082e3af2d301d3dd2c9af90942cb91eecb293f86778d163a75cd6bafd1",
        "arm-unknown-linux-gnueabi": "cda9f9b4fc4a51e09f827bc6e68d70b19086affeffb067fb8e0ad242b361c4eb",
        "arm-unknown-linux-gnueabihf": "86b82e9a97523a3b348213201fae4ca0e1247d31a4b8c2fa16c96d6d445330fa",
        "armv7-unknown-linux-gnueabihf": "4d122dc215a971195c9f7a9eb64b4eee2b85d062fff95203b66c2cceabb31a62",
        "armv7-unknown-linux-musleabihf": "e7aa31b7ac3d97218d0a6869d35328f41c6c6442c7ad6ffc5844fafd697d9761",
        "i686-unknown-linux-gnu": "4b67b401759e034cc07b996d0235e3c5371893bf66de60c45b849cd15b05606b",
        "mips-unknown-linux-gnu": "e65949181e35175b90204f493da1e10860090b9b5f43e5e6870a6244622ba463",
        "mipsel-unknown-linux-gnu": "bb0e02e67e169d7647e054403d770b3b1e68b7dd6a68128899effc4cf415cc27",
        "powerpc-unknown-linux-gnu": "e705177df416aca10521153556ba30e5479595641ecf06862f42680debc27793",
        "x86_64-unknown-linux-gnu": "ac04aef80423f612c0079829b504902de27a6997214eb58ab0765d02f7ec1dbc",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "855f18c5f1c19e916cb0f2633b7f6765",
        "arm-unknown-linux-gnueabi": "e8efe7413b4323a664445327501416db",
        "arm-unknown-linux-gnueabihf": "f4501bd3275dbf4e16ddf3c91b6ea6f0",
        "armv7-unknown-linux-gnueabihf": "695c229213f49a7ec1b19f02fa704a32",
        "i686-unknown-linux-gnu": "c9907fdd6bbe39f4eb858a20b6240000",
        "x86_64-unknown-linux-gnu": "cd7299c5dfe89636b2a3ef9a124029ba",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "41239ece19c79250a205e5b2fae60b242bba4bf72b687bccc88f011e66a872b6",
        "arm-unknown-linux-gnueabi": "58f4d22f427d24cf0a435b69145ea79549db302e7c3738a29f708813d324cf2e",
        "arm-unknown-linux-gnueabihf": "d61c9b4844f737206b823d9defec75982226a85058b37edb95c71889b7af2607",
        "armv7-unknown-linux-gnueabihf": "3533ce84003674e5556df5d21718021c5e3c67493a21a04299e0e862426ef110",
        "i686-unknown-linux-gnu": "4b874e323ffa5e5ad92ada07ff1ec0e052a23e0286af60e59a4e681c7a48d923",
        "x86_64-unknown-linux-gnu": "4c0c740cfb86047ae8131019597f26382a9b8c289eab2f21069f74a5a4976a26",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
