
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "13a647b3b670f914259590cb180ccf7a",
        "aarch64-unknown-linux-musl": "5709ae8979c13b488b8db5da684ca280",
        "arm-unknown-linux-gnueabi": "4d828960e631d47d8c48b61894c2d65c",
        "arm-unknown-linux-gnueabihf": "51768b064cf1f55dd5e78717786c5875",
        "armv5te-unknown-linux-gnueabi": "7e88e98f246894d37606ba2588976045",
        "armv5te-unknown-linux-musleabi": "68d81093d0c2ea6faf245ed71bd9a4b2",
        "armv7-unknown-linux-gnueabihf": "7a955d4a3d0c5e9e9ca509fb6aa78af1",
        "armv7-unknown-linux-musleabihf": "43a978185853469505aa74099f2dbf18",
        "i686-unknown-linux-gnu": "aca6c601c083599e8b120c913a78dd7e",
        "powerpc-unknown-linux-gnu": "ffeb18c944d8789d627f7054fde5118e",
        "x86_64-unknown-linux-gnu": "336857bf48bc1fab0073893b272b56a3",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dd504733d3d8939b448ee93247d62d7fb09316b54c2f247b3c9f4709bf70784d",
        "aarch64-unknown-linux-musl": "d560f26d20708f4073d40190abe17d119852f991a17182a6a2cbc53a4c0c5da4",
        "arm-unknown-linux-gnueabi": "f54d9a863354d5003013fd786c85ca08590141c40f13a939ac451920545ae749",
        "arm-unknown-linux-gnueabihf": "44eaed1b11e16cbfd6a713c686fcaddf2cbb447744594267068a04fdea321080",
        "armv5te-unknown-linux-gnueabi": "6dd09cbf767daba265c50d1885a3edbaa2a153a85ee487fda2eb5290e0d2f4fc",
        "armv5te-unknown-linux-musleabi": "60d3892060653e656a8268a2fadeb3a911e70d04f9059475d7c4b7c67755e623",
        "armv7-unknown-linux-gnueabihf": "ae5ee9aee53e1248746aa24d993a85e38662c17777982e7cd8925e1953a699cc",
        "armv7-unknown-linux-musleabihf": "e1e504dc7f15fb60f83ce836d6c420f807a9037312f335fb1a1bcc2c5c150610",
        "i686-unknown-linux-gnu": "75708e4e4d01a3106f6d84be1a70b22405f57cc04ae1390c3604e74fe957011e",
        "powerpc-unknown-linux-gnu": "8db8bda10b87e6717ac90e78cc5ccdcb8f5c3d8c6a3b9cd5016df836784dd6e0",
        "x86_64-unknown-linux-gnu": "89f6f6ef25e7e754940c54cc0584bfdb83e1df75019d5aa126e3fa66c2921b15",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f08ba1672fa18d9bc5b8b679dabb8023",
        "arm-unknown-linux-gnueabi": "b6e9dc272fdedfc964eb4083e39b1714",
        "arm-unknown-linux-gnueabihf": "e2172af00d86735b10a3bf8e302f4541",
        "armv7-unknown-linux-gnueabihf": "7f141138729cec74eed15ad210969932",
        "i686-unknown-linux-gnu": "f220119f16dcfd7785812f05e30a427b",
        "x86_64-unknown-linux-gnu": "b2f3b7bb99e8220877f4080fed2534ba",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3a2d1a5b5b713615162dcaa6319b6ad65ab4b951f90557dfb1e5c54f2a64c4ee",
        "arm-unknown-linux-gnueabi": "130bb74b4baa3d55182f6bcae1d8cf5ef3004f410d9ad2fc81787590e81da973",
        "arm-unknown-linux-gnueabihf": "4eb145d9a0240963e001933c7173f9c7222c6fc872570194e7a0484fe377bbe9",
        "armv7-unknown-linux-gnueabihf": "c73e4bf09478b4176d66f166b78ba5b08e87991b43f337ba07748cc86188bdb2",
        "i686-unknown-linux-gnu": "0c6adfe6c06b66fea2ecbf7e3e47a9375bd6c32d9e34c050d0bf03ba685abda4",
        "x86_64-unknown-linux-gnu": "f414557b12f2a7a61fabf152b4b9d6cb436ff15698e64a3111bca1a94be97a3e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
