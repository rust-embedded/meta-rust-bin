
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5d6539e7872c77647d8bd0c223d69acc",
        "arm-unknown-linux-gnueabi": "24dcf42bfab48799fbbaafdcbc8af2f9",
        "arm-unknown-linux-gnueabihf": "1cc61b9a679408326a8dc3016fcf4663",
        "armv7-unknown-linux-gnueabihf": "3043dd404da88627b06519bc42977419",
        "armv7-unknown-linux-musleabihf": "1bb4b79be63bfe56f903e0d90d75cd14",
        "i686-unknown-linux-gnu": "bd1e0d0079df721478f4d37363a9826a",
        "mips-unknown-linux-gnu": "0fc12b65377d006959bc5f44175ba2cb",
        "mipsel-unknown-linux-gnu": "eb8146fbe0c98096a44e72720843e806",
        "powerpc-unknown-linux-gnu": "4a4016390f1cd7369763e8ebcad6a244",
        "x86_64-unknown-linux-gnu": "fc9d38f7f3beecd594207b4a1348d95b",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e1a1bc577d51556c53e39d4f11fb4918f0ebf27e166ff63321b2991754706d16",
        "arm-unknown-linux-gnueabi": "540fcfc3c21adac1155acf4ae751e80f675793f4e615fd1e246ff2299d3a8b54",
        "arm-unknown-linux-gnueabihf": "704e1f497d8f1a71dc80b56d0aa286fc8eb847aa6d3c5df88ca5d2209005acf5",
        "armv7-unknown-linux-gnueabihf": "4c7ea8544e2b6e9401ac73b657f06e401d924fcf80f3e4c1448c4d17c3818fb1",
        "armv7-unknown-linux-musleabihf": "a9aad44b6fa04b566d3a943519724711f46d4a80891fc3db2ed5d10047070829",
        "i686-unknown-linux-gnu": "a51f3f889dd319e2ebddf4b0480a52724b15ea12a49999c45a32669a0c222051",
        "mips-unknown-linux-gnu": "4f287db594028052d45e770855661035a37ef6af2810c7e52997259911e8d29f",
        "mipsel-unknown-linux-gnu": "efd346bae896d9170de41ef46ac4cf259025edbec4267a764717148acff24213",
        "powerpc-unknown-linux-gnu": "a5b6290f629c8f83887393ddaf1672e70d5421d45e2b451db92f3ad1a587b4c4",
        "x86_64-unknown-linux-gnu": "735affaca1370699f9bc3fd7b1320694afd250923d283d88c842b7913a97d083",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5ab2224bf18a7e207e0bcc5ed8fe2436",
        "arm-unknown-linux-gnueabi": "903ee0f3b8a6890ed1152b5afa1b57c8",
        "arm-unknown-linux-gnueabihf": "7ca8d07b81e61c77cc000b3667726010",
        "armv7-unknown-linux-gnueabihf": "1029e343ca820576b7f30a09f19daa5b",
        "i686-unknown-linux-gnu": "4f5de8800e63edcaaecd2a0ecfd70728",
        "x86_64-unknown-linux-gnu": "1f0ac82daaca12e6df1a96b868c105ae",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8981d500261ecfec93c4b52e8f96a81c705b56ff9317d63e0363d11a72ee09a0",
        "arm-unknown-linux-gnueabi": "fc20c4bcdde9fed97f8ea02d0197917b959fc8fa01613b27949b54a31b35b19f",
        "arm-unknown-linux-gnueabihf": "5790e4ee15369936ef3d4e72ffd91863d32cc115587d24dd3aadf24094eb1e36",
        "armv7-unknown-linux-gnueabihf": "9ab7ad1d4c6c1a4da64cafc1988b22736d32f74d7d3d024fa7709d65fe0107bc",
        "i686-unknown-linux-gnu": "d37386ce562c324c0fe36645a8c26acb38edf09c9819b69edde3a3551c27ece3",
        "x86_64-unknown-linux-gnu": "5085a26abdc932fd9339aab2078084f9ab654f8298ad9f301611ac41ba8eca19",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
