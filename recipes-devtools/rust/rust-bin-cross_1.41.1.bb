
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6b74c4e98f15d9b33d17ab90ff1491a9",
        "aarch64-unknown-linux-musl": "e4d3901034ae4eab24fbe359fdd00d25",
        "arm-unknown-linux-gnueabi": "eae5891e89582030a1ddfdfcc27c0bbf",
        "arm-unknown-linux-gnueabihf": "b12b85fe318c80ce41458eb9977c05d0",
        "armv7-unknown-linux-gnueabihf": "5530b967efa8f64b3a8d7bcf736cd64a",
        "armv7-unknown-linux-musleabihf": "d797e17d3a0f7f675289f9de89d4d001",
        "i686-unknown-linux-gnu": "86674c3e3faf2fd525ddda7d76125f41",
        "mips-unknown-linux-gnu": "c71ef166cb69c708c53381a87ba51956",
        "mipsel-unknown-linux-gnu": "49a607c73b30405c1ab32e557ea1ec45",
        "powerpc-unknown-linux-gnu": "33ad196f74cdb520fb9bcbc671c1a4ae",
        "x86_64-unknown-linux-gnu": "46ec0febe50aeb2cd8752571ac26b200",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d4bf03f2c27050d14c0c5866898d9f00a13a8bd4bee018354650c5bc98ed7f91",
        "aarch64-unknown-linux-musl": "6bc9a28a9248e6cba84ab11bee1a875bceb3678ef0af30a118fd92a09fb799ee",
        "arm-unknown-linux-gnueabi": "240a4f19c587fc513c48e8c86c95ddac8de7bacc93ae9a72edce83f27f520a3a",
        "arm-unknown-linux-gnueabihf": "8aea8c9e93a70535035a454179ab5fcc77e80dbbd1b4d7f4e97aaf2d9850b035",
        "armv7-unknown-linux-gnueabihf": "63ce1ae72b788d16e2a3facbf4934e32cd3a0589c8365e772d123ec6086c8151",
        "armv7-unknown-linux-musleabihf": "6a7aea69079a30a7b4e44f013e59dddcae8e634cdf87f3ed43f2f833f5e8e7a4",
        "i686-unknown-linux-gnu": "cef42a7aaf72f501ec65db645e5ce7bf4e2bc4c40f39a74be0005a923f28e491",
        "mips-unknown-linux-gnu": "51326e579c6bcf15dab0c52027620e51f71ef4b2386faadd1736b4aa869b4562",
        "mipsel-unknown-linux-gnu": "0aa8d2c28bb1d01d514ca217e245bbb4baaf105a073b176ae372e0acb8d1caee",
        "powerpc-unknown-linux-gnu": "43c76144a9f8cbe4a6af324e5c8710b978778fe64fe8c55e50858ec887ecc479",
        "x86_64-unknown-linux-gnu": "b0ec3593f9ee5ff5b9938075371d280832062249b551d0fc585ae4452c576f08",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1b5fe5a13351528032c83a4234f9a0a7",
        "arm-unknown-linux-gnueabi": "9217ca039e445ed0957526240d332c35",
        "arm-unknown-linux-gnueabihf": "d85a9998ed903bb8f489634796eb8f58",
        "armv7-unknown-linux-gnueabihf": "11c5bf90163671453566bd38841d1056",
        "i686-unknown-linux-gnu": "b0119afc66dd139744ce7729c8de8571",
        "x86_64-unknown-linux-gnu": "63f3444a3adad24037a9fef447500650",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "768a88349133fb8dfd3e589ae09fb3e16a5516b9b2afd39529f679d62851caf5",
        "arm-unknown-linux-gnueabi": "599b4436ee93d23e05ca46d8642d87682492f1c816681d149edcc1bbf3663cad",
        "arm-unknown-linux-gnueabihf": "5cd59746dac9a093e32f20f77790f3af15e05cbd246d4eaeece6e3bf2da25357",
        "armv7-unknown-linux-gnueabihf": "ccb299d994ef414981aee059b08b9813e278cbee3b81c3ca21214a618993cbce",
        "i686-unknown-linux-gnu": "0515d497b3e11a78b128619faaba040739f38bc44d83d9866de5bff38b1f941d",
        "x86_64-unknown-linux-gnu": "6276dc3280186f45beba5abf92d1197be04d473f291a4456776d376db1acc480",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
