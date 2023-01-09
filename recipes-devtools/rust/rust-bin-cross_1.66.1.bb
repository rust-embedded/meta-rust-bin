
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7eb65b9c155bd0da3e765a5e37f117f8",
        "aarch64-unknown-linux-musl": "35ace019bba2e1ab81fa20a9443b3b03",
        "arm-unknown-linux-gnueabi": "e451c9d782e78ab5f62329176b25ffb6",
        "arm-unknown-linux-gnueabihf": "726d36bc8d330fadac282935e134f24c",
        "armv5te-unknown-linux-gnueabi": "3cafe5fea1c2322b3bb9e19b683017be",
        "armv5te-unknown-linux-musleabi": "b7985cac7d0a00aaaafc75a628c422b1",
        "armv7-unknown-linux-gnueabihf": "05e483655f6cc825bab204269d5075a7",
        "armv7-unknown-linux-musleabihf": "a5b41b026fd23cc1cdfcbc554b69e7dc",
        "i686-unknown-linux-gnu": "f2c6072cdec5d2dae68ba82569b0b8c8",
        "mips-unknown-linux-gnu": "4e8fdcc2c37b343657217e35bcfe61bc",
        "mipsel-unknown-linux-gnu": "889e10d7127359c96d6f1d9e67c0f26f",
        "powerpc-unknown-linux-gnu": "f7f761f8bd91684ab447aeedc2417332",
        "x86_64-unknown-linux-gnu": "4e1545cd02387cc624e06e405631b850",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0ab8e60caf3c63f687d02f16cb577da86ed292481fda29da9e9acd53140f9b31",
        "aarch64-unknown-linux-musl": "5fe9813f157add9291cb7bff633bdaea567f232a882b39c8383029b51de11d97",
        "arm-unknown-linux-gnueabi": "35cc58bc6c9390f99bb1ae49b6273576f08c99609f0aa33c3b7ad0d4bc9ede3f",
        "arm-unknown-linux-gnueabihf": "db178fab229f61a21368718330dcd749171439abf60bf14a2ac415e96e624226",
        "armv5te-unknown-linux-gnueabi": "2267f1149fe323ceaced52c638a8c6d82c8485724757903804b839f3e4d8b08f",
        "armv5te-unknown-linux-musleabi": "7c8a14b71589f26a3a8aa3a4ad1bd46d50df9538b0ec603e22f4687f78d8b6dc",
        "armv7-unknown-linux-gnueabihf": "c4150af5f8366cb4a9e1fe4bd982ee84bb66789c3b5085c55f6f7ba8012a8feb",
        "armv7-unknown-linux-musleabihf": "bd43b68a4384acd7a5b862e2260c3a1eff8897e4e7fca1a7032d20e8e7c1c701",
        "i686-unknown-linux-gnu": "e8a937cb56aa2f644a537f403b4e92978cdb17a2e4d8b737f4a9743bb17724b4",
        "mips-unknown-linux-gnu": "d61188ea93c117fb7534bd49c46f2f0116bc880f8e49a591688cbc2d4eb594d6",
        "mipsel-unknown-linux-gnu": "cdc9a4caa8356e49c7f5d0806bf8f8cef693eb03e42d875388abc0bbed9b8099",
        "powerpc-unknown-linux-gnu": "c70872a80ca38b2daa83132da5ea979e443c8d973d4692fbaee8b9134926c8c1",
        "x86_64-unknown-linux-gnu": "b225606cd0cf02b1f5fc77420647a28b35f22d67e565dcdbe29f0c919245565f",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f2cba011c559934a6d9c047a7ac144eb",
        "arm-unknown-linux-gnueabi": "b3853d9ee36f32ce72b53e6f434b7544",
        "arm-unknown-linux-gnueabihf": "a472e56450a354a52dcda765574dd09f",
        "armv7-unknown-linux-gnueabihf": "c6180907a93578c6d566705ec1b9f5c4",
        "i686-unknown-linux-gnu": "cd465741cd04f1a076cd700f329f2603",
        "x86_64-unknown-linux-gnu": "377660256a84456d0f8e12f4ef705283",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d268a5c65154613349d0f4d35456f0f6a62da1b94490bf63930405d077a3a1df",
        "arm-unknown-linux-gnueabi": "09235884c8b7779fff62e15efef97b2f894970df7fc3159ed526822bb9720f46",
        "arm-unknown-linux-gnueabihf": "3d5afab28d52fc4d5e2d27c937a45b3ff287833d104ee264d3dc010306fdaf18",
        "armv7-unknown-linux-gnueabihf": "37b5574893a636f8ac6a506b8b7fcda0fae23996ed86d9bc8bc330ac95e96abf",
        "i686-unknown-linux-gnu": "61647bf6cf5d0210c069e05f0b9ebad41f44f3c15b44a3a4543e14e64fff75b9",
        "x86_64-unknown-linux-gnu": "a3aa1c42ca384fa3a0cb6817d00affb47c747c28a92072d2353bd103c9973a03",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=92289ed52a60b63ab715612ad2915603"

require rust-bin-cross.inc
