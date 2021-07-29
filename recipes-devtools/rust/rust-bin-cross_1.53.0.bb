
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "07b6c1721833d3d83fcd5429b01a79f5",
        "aarch64-unknown-linux-musl": "d9c9343f304a55763270443896e88004",
        "arm-unknown-linux-gnueabi": "ace0ba159f3a810f3b13ff32354a369c",
        "arm-unknown-linux-gnueabihf": "2fcbff07a06174bfe4b31eeeb330b0c5",
        "armv5te-unknown-linux-gnueabi": "79da312104a6576884a650f6d7a82b58",
        "armv5te-unknown-linux-musleabi": "c82b16e892751038545b7b4c55574f64",
        "armv7-unknown-linux-gnueabihf": "63ab803b3e1a9a150b4cb15bc1ec0c4a",
        "armv7-unknown-linux-musleabihf": "576ab0040a444c6378e6b6a3453debed",
        "i686-unknown-linux-gnu": "4ba359ae6fc6edfce0a21be0b1933b22",
        "mips-unknown-linux-gnu": "5f401f804827e0e0b70e26d189340e26",
        "mipsel-unknown-linux-gnu": "2b46ba46c26040245f26eb862e4b44a6",
        "powerpc-unknown-linux-gnu": "ddbe7328efec9d26636ef1b60011c4fa",
        "x86_64-unknown-linux-gnu": "72f8d5515f8286bcc700f7ada8212ff7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9e5c09d14fec5609bfd042299900f20a44c52d53c64e76e184faadf67d07590d",
        "aarch64-unknown-linux-musl": "7501cc0787a63e550f9918dc5d23ee9fa9f3f3162088b33213694be2d6e2aa32",
        "arm-unknown-linux-gnueabi": "71496c8c6e723099ee9b1f119ac0e63527e5bb265226557ccd8a6c0338ce1321",
        "arm-unknown-linux-gnueabihf": "c46c38d4b61776f9712d7331b7a6dc206a2a18fa55430564a647d5be6f3b3c63",
        "armv5te-unknown-linux-gnueabi": "46a6a7f3df289a880c77c63d2bbaf048f52b1154a2fca64eae1f5e7aad480f2d",
        "armv5te-unknown-linux-musleabi": "aa342256bbd4fe3ae7e09e6d582b044e1ba74047565f7b79973e12b76d701b2b",
        "armv7-unknown-linux-gnueabihf": "10d29bceef74016989d4b77c614d4c953b0a9333aac975558f4a0ecc643438d9",
        "armv7-unknown-linux-musleabihf": "da622a4c588ec1da4c7f1d6d958eb33f38b28107ba426b3f0393d81a2fc6b7f5",
        "i686-unknown-linux-gnu": "c1a9877f301b64655cff671029bdeab3106a17715a6cb9bbfc9f4200ce33c065",
        "mips-unknown-linux-gnu": "c8aaacc2208e9b0137dadb48dd690351d62b5efc2d8654e8cb3990f292a1ec37",
        "mipsel-unknown-linux-gnu": "42574203bba6ad848b0aa65167d83a41a07320dc35b5e5c92ef8a740a7de273d",
        "powerpc-unknown-linux-gnu": "0c7de1a87b38e3f8a335c9cb4a6f6a7421834e7e3162b0b7a9fa6d8ac267bb0a",
        "x86_64-unknown-linux-gnu": "b3428b9ffd5a8f8f13506eedf2fc865665a53894408f0b64314686e8a08d06b2",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c0ae7b97ebe3df4fff24ddd8969b7b63",
        "arm-unknown-linux-gnueabi": "a5efde3876dc1645f18f29cb40088c71",
        "arm-unknown-linux-gnueabihf": "f670f92a0398cc51ef67262d4e117a16",
        "armv7-unknown-linux-gnueabihf": "f08981f8471c4cab365a48c69cf927b3",
        "i686-unknown-linux-gnu": "a70cdb94189cc239549dfd1bdd029fad",
        "x86_64-unknown-linux-gnu": "8284ecc16dd7844011fa86f23fa6415e",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a54267708a1e80bab2c0a919284b9387f4b70ca61a96dce7544b2c8001adc5dd",
        "arm-unknown-linux-gnueabi": "170ddbcd6ce4f8e121cf4eb52197a269ab489746ac14ec65eb029fd9185d6a9c",
        "arm-unknown-linux-gnueabihf": "0316b20376f249a4a869f91b73f4d7b024856bb808ce5fe2c046892c5343d0ae",
        "armv7-unknown-linux-gnueabihf": "a83cb786a965cbea9a7811b490c0e7eb5e4f2b916ef8c390521ac942a98fc196",
        "i686-unknown-linux-gnu": "a3dff5684af2e168fcf3408a18a370b615861b953083d1592036c191d3798043",
        "x86_64-unknown-linux-gnu": "c2c24b41602a589886f87276d4d46e42efddbad820917dc4dcbf6625cdf9ff52",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
