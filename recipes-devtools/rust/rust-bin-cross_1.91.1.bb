
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d88ee36c39f0f68829db56fec0206b13",
        "aarch64-unknown-linux-musl": "ef637607063d6e965e0340c8dcff5572",
        "arm-unknown-linux-gnueabi": "56d47f526f15c284f87766c3f8f00b20",
        "arm-unknown-linux-gnueabihf": "6c9810c7d7111b27dd03a6f045709904",
        "armv5te-unknown-linux-gnueabi": "726daae5feb494eab881f37709b2b7ff",
        "armv5te-unknown-linux-musleabi": "4e344d90e1f70b57de10bdb6034c304b",
        "armv7-unknown-linux-gnueabihf": "44ec0ff7d3f7ce86595d203c3a42d6fc",
        "armv7-unknown-linux-musleabihf": "83dd089f5f4504fb24d952c42aa363af",
        "i686-unknown-linux-gnu": "195d7fc2cc47a96f1bde9262610f2201",
        "powerpc-unknown-linux-gnu": "6631b59bfabb11d32395738dc1725828",
        "x86_64-unknown-linux-gnu": "81e2f2f2a33abdb323512848fd3a19e3",
        "riscv64gc-unknown-linux-gnu": "cb361994fef9d2c0eee9616eab00847b",
        "thumbv7neon-unknown-linux-gnueabihf": "e7958091b0d9a5ff558b91d21fa00e2a",
        "wasm32-unknown-unknown": "b0efccbad9089510749caeefb08f3ab8",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6048ce372848591efa8765ff8f51b98e624def9262862c05a1e31724aa86d2ca",
        "aarch64-unknown-linux-musl": "5bde46f6028b4b2cfea204d9888b7dde66031b778ab84b685eb523435929b7b5",
        "arm-unknown-linux-gnueabi": "53d3fcfb8cb0072960481dba0a61bec35c69d72a8e77f44f8119411b98896c00",
        "arm-unknown-linux-gnueabihf": "95d701bacfbaaa2a5ea8c4eeb2324593da86877fffa9a7b21ef4552849dfe6c0",
        "armv5te-unknown-linux-gnueabi": "95e7edcbf6d594197b40938162dc1073ff726cf75be84cae24e541c35f31ac49",
        "armv5te-unknown-linux-musleabi": "5097e19f4d1fe9c466439018d1cd7226e4fcbf60bd09ed289cbb8e67aa5265d0",
        "armv7-unknown-linux-gnueabihf": "a8371a17a0839cc101d4cba6965d639f298cb28f56522ac8bb733e7892fd99d5",
        "armv7-unknown-linux-musleabihf": "96701a187a28003d64506809680b605ef2710a09b538e4833955eac8da47ae2f",
        "i686-unknown-linux-gnu": "8772b1f1860490a31ba7a7cf6ac90b78534b2b9dfbbf7f542ebfb4ff4080601e",
        "powerpc-unknown-linux-gnu": "77728f0a829c4eada1ad4288c7bff7d33ef6b725c08d0135e31e6d37a88a4eea",
        "x86_64-unknown-linux-gnu": "51f5cbd301f055fc00bee171743c4a65500e3988e59483d240499ca5acf0c10d",
        "riscv64gc-unknown-linux-gnu": "17a07233ac9764c30bf7a3e78402ad50970b8c98925a9abe4af54de24db3883b",
        "thumbv7neon-unknown-linux-gnueabihf": "b5202c800c71f29d4386f9801608a75362de0e76fd4fcb1e9886b9489f279b04",
        "wasm32-unknown-unknown": "673cd75597a9a44fb20b8bac0d9dd6cfeaf4e1fca09b6cc5f2699a112d988daf",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5896baafbd8afeb1b3e5bbd300f8cadc",
        "arm-unknown-linux-gnueabi": "4d1de4a6c5ef78ef80c73aa074cbbd42",
        "arm-unknown-linux-gnueabihf": "65ebb1c74a3e742c03845c5521c9558e",
        "armv7-unknown-linux-gnueabihf": "440990e00e8bb3a2f13e4132c573efef",
        "i686-unknown-linux-gnu": "897b8f4dd381e1e45f13a5943f08772e",
        "x86_64-unknown-linux-gnu": "966f2401024eefb23fbb607aeb17a3d6",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9d2946db55b5d462893ffcc0e3c9b2f74f33e4ede8cb471c2f8d8abd54545525",
        "arm-unknown-linux-gnueabi": "3b2a888b3a9993abd87208c4ba4e13f118a433e5fc488e67cfe8a33de7951072",
        "arm-unknown-linux-gnueabihf": "97e447f7a6fe551ded7f2d2dd3f15b8ba3c7600e9bd072bca6cd66a2db9410a8",
        "armv7-unknown-linux-gnueabihf": "5c3e209e34b1bb530fd58d2bf158605bb0ebc2ff068c229d7ff5aec4dbab4134",
        "i686-unknown-linux-gnu": "07c1ec6a14b1a20bfaf9f392383397127b96a2a65beaf0223ab2153f9f384577",
        "x86_64-unknown-linux-gnu": "30284e508ec1536bad12b92c467aeaed78351bf0f3ed9945a0775cfe0a71ef4f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
