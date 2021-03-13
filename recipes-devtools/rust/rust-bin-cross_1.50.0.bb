
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7de8401c733b693dbf79be5bfac854eb",
        "aarch64-unknown-linux-musl": "52c0661b3e7a86ed865bb7d747f3edab",
        "arm-unknown-linux-gnueabi": "3cbc0672b3d679c38eb2f0161b2117f4",
        "arm-unknown-linux-gnueabihf": "d92e352615d1e73906c6d9fd489827d2",
        "armv5te-unknown-linux-gnueabi": "f57bb387e06a15c64adcc53e0b2f6c9c",
        "armv5te-unknown-linux-musleabi": "d1d48f0a86482eaadae4c2a775aad234",
        "armv7-unknown-linux-gnueabihf": "02745747a621c3a30cebec4d558f486b",
        "armv7-unknown-linux-musleabihf": "b5b250fa0aaefac45c5f374637959631",
        "i686-unknown-linux-gnu": "cbc7d69504006ed786b22bdeb0c05e58",
        "mips-unknown-linux-gnu": "347d58b756ae166b5773074e11a7fd55",
        "mipsel-unknown-linux-gnu": "692b644fcc419cc567b43b90087169bf",
        "powerpc-unknown-linux-gnu": "ab6d371ec0a6241bd78a819e4202b97f",
        "x86_64-unknown-linux-gnu": "8a79e3dad14987c17284763d8ff83b8d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "83aeff923faa528e2ff5b582e4c3bdaefeda34078345e48878eba6ef95d41040",
        "aarch64-unknown-linux-musl": "fbfa90f58d9c96f91937666ff2495345f564955442109833189ab7dbb0facd89",
        "arm-unknown-linux-gnueabi": "51e5c0dbe85a7a39c7ad045f86e447c8c79363bc3362b1e60da652c4bcb9d459",
        "arm-unknown-linux-gnueabihf": "ebd7a22028278f9bebb60eaabe58131d580892823286e704e45ae2ae585b70a3",
        "armv5te-unknown-linux-gnueabi": "c0b7dc3ad7e81322eb6f492f9565178b219484cd433acdd23c3cb39768df7afc",
        "armv5te-unknown-linux-musleabi": "a6768cde19688907ddb2e10a6b2356de075ad7e93ead5def8df37e9ced70eefa",
        "armv7-unknown-linux-gnueabihf": "c0f3c308f2a0992c0153f6f1dbccc280a2f5bfb5af22fe0e180f4371e097a89c",
        "armv7-unknown-linux-musleabihf": "89f3547a7743d15b57a8c5784bdd8c4217aaf0e1fc61fad1dcc207671244e13f",
        "i686-unknown-linux-gnu": "1f8ab953f4f26d0759f589a11057b65875a8bdf775aed027c6d0c9c438de1d38",
        "mips-unknown-linux-gnu": "0a6b827cb84ebc71f491521d3f0f58cbee38aa3be4bfd6f227b6f97d5d05bb37",
        "mipsel-unknown-linux-gnu": "b798e9c5a7698c8a44e971cbe59c6b87921d45ac1296d144cc65716c56c730b7",
        "powerpc-unknown-linux-gnu": "b9753c2fd34cc27cf4ce36691cd7d53e6999fe0e14095e84c68aa16849be9057",
        "x86_64-unknown-linux-gnu": "2aaf284a204d605f6685d2000cf83c25d0e1c789093009801ca16e1c659ae8c6",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "552aa3f14e7835c40a27a0193fa9878a",
        "arm-unknown-linux-gnueabi": "b7388cd2742599ab4d4d85cded639d21",
        "arm-unknown-linux-gnueabihf": "1afec0fe8c8e986dd1460917c3ce6cf1",
        "armv7-unknown-linux-gnueabihf": "2bc180c18dcef694ad169f9a05726b41",
        "i686-unknown-linux-gnu": "2d16fcf50da398f99f1b2960889e8b7a",
        "x86_64-unknown-linux-gnu": "1f288e78f9a5b7245f4e6a2d6e879110",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9afe0e968da845981b463beb75f91d6da0d4de5443d1abb6002b75a8cf066ea7",
        "arm-unknown-linux-gnueabi": "8645101bd08a8cabdd8b099ab99657268ea40d4708411450fb6da10175f585d0",
        "arm-unknown-linux-gnueabihf": "09732d390199425716a1ddecb196912a84f8c5bf545325d6b8d0ba798686ab10",
        "armv7-unknown-linux-gnueabihf": "4b3f7325b8cf90d51e5f7ef0eca9b854afaac28f6c026fbd2bba5f63c31bf220",
        "i686-unknown-linux-gnu": "a4e979575f63f425e6c9a3f2c6d08a410df622ec1825520883a58dd942980df7",
        "x86_64-unknown-linux-gnu": "160a91a3f545f96b2b955cf48811080d8e0accbd9d9a9732b080e1ffa72113bf",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
