
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ac98d4e7541f2375b6c86c2dc417d827",
        "aarch64-unknown-linux-musl": "7fcdb1e47cd8f37fd2834fcf58e3f56e",
        "arm-unknown-linux-gnueabi": "83a17189c2c9f428aa70e50f35b7c55a",
        "arm-unknown-linux-gnueabihf": "799d7e367f6e8af661f70671a3ae8c4b",
        "armv5te-unknown-linux-gnueabi": "5db48da84114dfa81033e63c86b7fe90",
        "armv5te-unknown-linux-musleabi": "82d6397e9575fc4309e49c49c881019a",
        "armv7-unknown-linux-gnueabihf": "e5a41ed5809dc84a573c9dc4fcee2de9",
        "armv7-unknown-linux-musleabihf": "5273541a34f7d1e5ca84fb529d78f0ea",
        "i686-unknown-linux-gnu": "f4b90198482f61d402514c5035811302",
        "mips-unknown-linux-gnu": "c4ab4228bf1f6d3e37e62ebb2d129411",
        "mipsel-unknown-linux-gnu": "2a41037086ed1e04e41afddef18bcfcb",
        "powerpc-unknown-linux-gnu": "8256f8e1b597049d54b9643c16da11f0",
        "x86_64-unknown-linux-gnu": "064f6d8f88d946de1f657e64d241a70d",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3b0e5c4d03ddb97cd462947c539005427813f5ba91be81888db77e7d4bf36e45",
        "aarch64-unknown-linux-musl": "29be0b241bd14651bf9d470a9766000b424a112a0b4a6160f422b075e4668c4c",
        "arm-unknown-linux-gnueabi": "e206f39ef804ea117a99158be7dc10cc0405636c836d7ec1a74229bd997a46e5",
        "arm-unknown-linux-gnueabihf": "6bcd9a9376bd7141c76c6faf82acbc8689ba5ac50f2c1405a7beef568f15ce8c",
        "armv5te-unknown-linux-gnueabi": "ebe1a44ce5046f69e1ef4c18c0f35e6d0abeda702046e7b2984345ad2d7e371e",
        "armv5te-unknown-linux-musleabi": "c67769e69abe205e6e0d9014be66322fe27cd1d31d59fbe69334b4b342ecd761",
        "armv7-unknown-linux-gnueabihf": "ec2413e4afbfa3a674fef789896ef66b1d4986367d6402ed1c59e66c4a0163aa",
        "armv7-unknown-linux-musleabihf": "f2f1da7d2f1934526d8934bba03bb0a28b1268b5f986511347b97206159b0a82",
        "i686-unknown-linux-gnu": "caa71db54348d40f1729f4a6119e09f56a8c131158c9ed9447b96540d45ff43c",
        "mips-unknown-linux-gnu": "e9b00ee38a325438be7c58c608fe24fe2f46115dd16a6bf16ae605261e99d1fa",
        "mipsel-unknown-linux-gnu": "0d00e5b4a1e9bad5f245652c8703c392e4ff2e8f8a2e34cc67584596fd37c5a5",
        "powerpc-unknown-linux-gnu": "977889fe30ec1aaeda6b25a1b3c9231cd8e7f3a1447b14c748e1b0e806e2faa7",
        "x86_64-unknown-linux-gnu": "2e7152e5d24cea7e44e6645ebbc0387cbe1c7059b54d95d8ea3afe298ac8b2fc",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "04a3c4488d9f14ece5cd67f01edffd07",
        "arm-unknown-linux-gnueabi": "cf12d0e17d8287e042c9d597342edd94",
        "arm-unknown-linux-gnueabihf": "6afd3200a7d732e7d58b1052a3313993",
        "armv7-unknown-linux-gnueabihf": "de43523ee1b12266088ed0f30a6f8de6",
        "i686-unknown-linux-gnu": "239a22ea161d6ced49806b9fc3742eb6",
        "x86_64-unknown-linux-gnu": "029e67ed544605f3eacec875f5b95165",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9c83a5d18f6ca913eeffd78c53913da288b171ff245137b646a8fd280fe72340",
        "arm-unknown-linux-gnueabi": "f0e84a682cdf890554efd75d03d46ffc3467c51f7f4b2c8167ddc2e374ed2111",
        "arm-unknown-linux-gnueabihf": "77a4bc6cc7fb857989a96e57c86f12e827f858a00f0770a04d5fab888a9a3383",
        "armv7-unknown-linux-gnueabihf": "88030908dad49ae17f67428edb6348a8b4b05dd7ae92fc309d33cd19e859c51b",
        "i686-unknown-linux-gnu": "05d80840da179cd26bbc6e3e3973feec607471d800465e2b37614c225060cd2a",
        "x86_64-unknown-linux-gnu": "aa4a96b010e0d4573e6a1fec230beaadaae6cdce2bb4befeee7b1c081ee9ef8c",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
