
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "30283062716a8b6e895c8b71babc7d15",
        "aarch64-unknown-linux-musl": "1ead533caef1ca1f0363065b200bcac4",
        "arm-unknown-linux-gnueabi": "52b5b73ba51d2a1af9a28d13458918de",
        "arm-unknown-linux-gnueabihf": "31b0f30b262164744e43e49ffea45541",
        "armv5te-unknown-linux-gnueabi": "10224fb8b03abcdd4fedef7f8cdaf6d7",
        "armv5te-unknown-linux-musleabi": "cd907a55ce450e468c4f9111f8cb68a6",
        "armv7-unknown-linux-gnueabihf": "ff005d0c9514c1d2d436d03181ab8a92",
        "armv7-unknown-linux-musleabihf": "7f3a29a226bbc7a59d5f368c8617697c",
        "i686-unknown-linux-gnu": "75f3227b4251f88a07771e9612483eca",
        "powerpc-unknown-linux-gnu": "3fec7c98471104e66e2f072b1fc5d41b",
        "x86_64-unknown-linux-gnu": "5cde8a60cd76a2f6c1e3f92d96de3bea",
        "riscv64gc-unknown-linux-gnu": "f9728eb8485dca610577b909e46728fa",
        "thumbv7neon-unknown-linux-gnueabihf": "7dbe6c5bec7d23cc06081f732bc39e6f",
        "wasm32-unknown-unknown": "62e54013da86f1d8587d43efec8553e4",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2d440dbb24cf1a42c1ad030b195aad58040fd39c487013f32086a1cbc7e74c8b",
        "aarch64-unknown-linux-musl": "7ef289b1115c78ca43ee9bf924c41536e8797f5c75a21e167c23d5af7405f2b3",
        "arm-unknown-linux-gnueabi": "da7733e655ed7cf5e3b71565620998ccbb96ab7ab7eaa4186429f32c3e197b37",
        "arm-unknown-linux-gnueabihf": "632b9c2951623071f5630ee9d96b209f1ea2dbba2dafe623bad37f0c46a326b6",
        "armv5te-unknown-linux-gnueabi": "6538949141a3ff30db9cefeddd8e13e874adff3377adc3b8c79607033a9dfdd2",
        "armv5te-unknown-linux-musleabi": "40d6373f0b596de2b335b523b137ea8c1d5b2d2a6b8044cb1f74a823e45da2ff",
        "armv7-unknown-linux-gnueabihf": "f89d81efa9448204a8cd8c8a00dd9b6ad2fbd9fd5b8084150452f7d2457c5ddf",
        "armv7-unknown-linux-musleabihf": "99b5590778c7fdce056aa86e3d4a71a719e153346f23a9c071bb5d60581a026a",
        "i686-unknown-linux-gnu": "a61bb31c3f1a70c1232c62bc218145f50a1592fbd71f7e8ba942c38c4a45aded",
        "powerpc-unknown-linux-gnu": "5677fce99a1aedd78897aadfd8e0e1c8691f8da7de7bfed747df243341294c46",
        "x86_64-unknown-linux-gnu": "d134d44ff9feed5b6b5b686ab996d5dd188baa9b3a08a53e1587a492e2fc4704",
        "riscv64gc-unknown-linux-gnu": "7b072ab55e8ae9506958b1fcc04d46846fe2024aa1dcc4266247325ecb9983f5",
        "thumbv7neon-unknown-linux-gnueabihf": "a39842ff68266b5338ccee1315b945637f3111dce7e1e3639191bb6af937648e",
        "wasm32-unknown-unknown": "1287ad1cc7e9c44a969606699d72c04d15467dd72851c3c425c44a9bf8f8641b",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c526a2d6182de690df45914092b96701",
        "arm-unknown-linux-gnueabi": "b75409b839d17ef946c3abcce240b837",
        "arm-unknown-linux-gnueabihf": "22035eea0239e7b81a32e89ee061d750",
        "armv7-unknown-linux-gnueabihf": "0d48eb8eaf3fff03de4a617977ad66a0",
        "i686-unknown-linux-gnu": "4835c741c588a6b13afff5ac2a992041",
        "x86_64-unknown-linux-gnu": "9f2888b903eadf4aa1a5286c3d49eb02",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ba5906dcb294ad58ac56d098e6228b8c9cdcfc73e4771e60861a30ea08828604",
        "arm-unknown-linux-gnueabi": "489027ad2a6ffaf3035fb8495862899608fba69addacc39f013e7a902c31b47c",
        "arm-unknown-linux-gnueabihf": "7e26cfc626d537f73a804e59784834d0c1c4a5dbe01cc082240b65d00f998358",
        "armv7-unknown-linux-gnueabihf": "a81814722b82052584ac0a1f741d35c2a12b704983eee33c8524cf9cfe0d2f0d",
        "i686-unknown-linux-gnu": "c880d3c50014e5a57e98bffae3b4c9018c8b30556ac91add3e760a26b74d21fe",
        "x86_64-unknown-linux-gnu": "a221d0fd2c3e20ba92ad5e7d376155328ad85bf01011eeef85fff1a7b6fef84b",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
