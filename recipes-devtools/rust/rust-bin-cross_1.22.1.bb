
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4333cf381c0a76eab20c763654ce7e27",
        "arm-unknown-linux-gnueabi": "bf00db914952878c771f61b1f39c4168",
        "arm-unknown-linux-gnueabihf": "8c1e10b73a348ff4426b0754c3b691dd",
        "armv7-unknown-linux-gnueabihf": "061d300e8754bac2fa56cea776ba485c",
        "i686-unknown-linux-gnu": "1f0bf3cac813fcefcc23c73d397a8bd1",
        "mips-unknown-linux-gnu": "37baaf5b0a2c1db89386b87e5225029d",
        "mipsel-unknown-linux-gnu": "f068f601a9f837549e9f76fa436d7a22",
        "powerpc-unknown-linux-gnu": "6bcabd62b1ef50ca0843873c0c693bcf",
        "x86_64-unknown-linux-gnu": "280c1e0c6dbc0a0d508463d01bb2ff02",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8ceb35380cffa7b07a14401236660b59b73f9d6abb156c33a6d23c30d15827cc",
        "arm-unknown-linux-gnueabi": "9326fe0463f30bbffde98b4e6bcbdea65d60fd106cf4a914a1477ab308e6aa92",
        "arm-unknown-linux-gnueabihf": "6dc1845abfdec6e7963addbd0dcb3b5144bac2d9dc8f29f9f63289d16d67960a",
        "armv7-unknown-linux-gnueabihf": "17da76a8fe849e5de63566b41a7ef5d9f0b588d889b0118566d48617417961a8",
        "i686-unknown-linux-gnu": "6c23f53d74a6520d894d8f54eac8ba8ff56b4d7c5dc0c101135de73a588a6c5f",
        "mips-unknown-linux-gnu": "cf9afb6d56381ed31be8a626c999dd4767072684840409d22b654a0b150f19d1",
        "mipsel-unknown-linux-gnu": "864e10876bb6ea50aa624625d44689ebfd7ebec68783633b9b07db33e812a5b2",
        "powerpc-unknown-linux-gnu": "fc62d4b0270f1fefddb34c9766bc4f91c09e26445d41cdb933e3366dac2f2661",
        "x86_64-unknown-linux-gnu": "cebe357d25d234110a9db5c27797ff220973bc980cf9fc50d0b32cca10b90a89",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5e46709b8c9c5931975407e6aaf24b67",
        "arm-unknown-linux-gnueabi": "5f274e0b3312238b5515074a79946f28",
        "arm-unknown-linux-gnueabihf": "737aef9914f3590d513e6effd11f3fff",
        "armv7-unknown-linux-gnueabihf": "ea47b8e61266007f1c63ee167a4de86b",
        "i686-unknown-linux-gnu": "b498c12bbe269241b2d59032df37ae19",
        "x86_64-unknown-linux-gnu": "2827cdaf31c60d967162ea17ab4a69e2",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1ba90669bf3f8e342a5394e862d45fe0ffc816796b93516758db6327f4598f8c",
        "arm-unknown-linux-gnueabi": "f955965956aa4b534612bfb9f846eab73e96e168d9dbda8dfa2476d102fa7535",
        "arm-unknown-linux-gnueabihf": "95cc4bddb2370344863d52d6fe8a8d8da9d0b70683f417daaca11c7605590493",
        "armv7-unknown-linux-gnueabihf": "7c2110ae6efb1179d6fbd7bb882d96b7f0596b8b91a030f512a0e853ad8a16d2",
        "i686-unknown-linux-gnu": "61d11a3de42a0efff5d364bd0252529ee327dc4d5a2929acbcb97becfd7e5512",
        "x86_64-unknown-linux-gnu": "81430c45ee4532650859cb9f2f08f6ee02bcb6671d67d86e31c9708120c4cec2",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

include rust-bin-cross.inc
