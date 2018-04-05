
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6c4ad81415bca48ac330e366311b8a7e",
        "arm-unknown-linux-gnueabi": "3e1a27b11f17428290a6133a1b0211c8",
        "arm-unknown-linux-gnueabihf": "1c4d35eaf252f66b2266b31dedef88f8",
        "armv7-unknown-linux-gnueabihf": "9e0610fa920f4a442fd05a54cb7b1b8b",
        "i686-unknown-linux-gnu": "5f248be4a20a53419d0bf5c5120ebe04",
        "mips-unknown-linux-gnu": "fd19bfb4b0eefa1033b2413bf3422630",
        "mipsel-unknown-linux-gnu": "db92c51a1f7e224e2e1b6a435adebc12",
        "powerpc-unknown-linux-gnu": "2a7b485c6aa38290fe2d1efb9dd359af",
        "x86_64-unknown-linux-gnu": "37e9f9193413caba47134af3306328c5",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1dc571379b63532227d87a24c6c34848016717e12222270a612ea213cce808bf",
        "arm-unknown-linux-gnueabi": "d37ec9e1954b866e0cac5a0fbe10d46bd2ae4b1e3b2a7f1d1b184ea8f84582b2",
        "arm-unknown-linux-gnueabihf": "4490cc593924ff49a3c4a832ccfd2c5bdaa8be0e023eee5ef66341a3caab1f74",
        "armv7-unknown-linux-gnueabihf": "04adb1e7775c27f761a8cfb1d0a1960ebf4ff74dee0e60b44d7bcde50fdb76d2",
        "i686-unknown-linux-gnu": "407318bad891e2e2ca8e35f1be97a4cf70b76e4c7ce8b4e838048bfabea26acb",
        "mips-unknown-linux-gnu": "6ecfa4bd9242ded00f5668b5fdc1a1f9c3b101c898211a4ed15668632f9b8395",
        "mipsel-unknown-linux-gnu": "ced31785c5d65b8fdf4a30738a80307ed80bebc369e1b61001dc0d7e8f65ad53",
        "powerpc-unknown-linux-gnu": "4a55b766956c787de3b539d795c890c1770b00fa4a687b2aac61dbdd13ec6894",
        "x86_64-unknown-linux-gnu": "a3258308e3a9fe364d63b5d782efb285ab410bdfc01d168c119122ddbc9a02e2",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ca2c931398c160e8029a96612f7d3a98",
        "arm-unknown-linux-gnueabi": "5f277935c04a431fb64bbac160d53118",
        "arm-unknown-linux-gnueabihf": "f4cdff624e7b363d133afbbbb9e0552a",
        "armv7-unknown-linux-gnueabihf": "b2813aea2ce8f94efb3bfee0ed5b5efe",
        "i686-unknown-linux-gnu": "d6c7c406e1a783b174aaf1414e9f0900",
        "x86_64-unknown-linux-gnu": "6e9c8ae2946cf6626ad6511c7a1d6c2a",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3ef72161ed7b9414d7bfc8112d9c94528a3e2a5a90f1b7dcfea0de6eddba29fe",
        "arm-unknown-linux-gnueabi": "dc979ccc3df09e3f7cceff52095736bd0300ba9c869d5da72e26e383fa397d0d",
        "arm-unknown-linux-gnueabihf": "3bb471bf2e56dfb1b271ded48235f591b4fdf11b16bac2d2568e3541dc405489",
        "armv7-unknown-linux-gnueabihf": "824b332b18f98bbccc5b66a37146c206bd2890d39618b754de35edaf9fda422e",
        "i686-unknown-linux-gnu": "12d056e4e2aecb67f1aed3e045c9c07e9ba7449bc9f39f3d66b5c256fb8c397f",
        "x86_64-unknown-linux-gnu": "f8f4ae2f4b76416bfa90758267df4280dd078235dfba92dac0431595493443be",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

require rust-bin-cross.inc
