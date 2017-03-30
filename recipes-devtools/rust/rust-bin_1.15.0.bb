
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9ac13d5c8a270f7e2f96cb2d2aeef9c2",
        "arm-unknown-linux-gnueabi": "904014ac1b18d17680946d34081b64fe",
        "arm-unknown-linux-gnueabihf": "edf26ff56cdd7661c68ce521f8be6ac3",
        "armv7-unknown-linux-gnueabihf": "7c8fdcd7d2bdeca882e694727d2527f4",
        "i686-unknown-linux-gnu": "06ccf27281ebe489cf569bdf65907a9c",
        "mips-unknown-linux-gnu": "974c37c1e0b6b2b86aed676132e8c536",
        "mipsel-unknown-linux-gnu": "dddc7b3592e5bbfd267675371753cdd1",
        "powerpc-unknown-linux-gnu": "50575950b7f8ee37e5033dbb08639edd",
        "x86_64-unknown-linux-gnu": "67ad9f1d85134dec59d0137fc317f3a6",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6ce986685791917030c6c811b211a518b6347fd3b36488523c0690769549cddf",
        "arm-unknown-linux-gnueabi": "90ca71a666d2dc20e46a369e048a501909415bc1678105924a599815dc932d96",
        "arm-unknown-linux-gnueabihf": "653ae98289bc3366dcaf57630b3ba1cfe356946e8ec2c45017592553dc01a702",
        "armv7-unknown-linux-gnueabihf": "c0f18e11656df3ff5628f13bf9f0183b20910c48a182c06e7b1d1acc351eb893",
        "i686-unknown-linux-gnu": "317ed31e4698dd7e35eb53a42bb159250044b5eb64b77b6005a5dfe419814241",
        "mips-unknown-linux-gnu": "b0c1933781ea832436e6a6a6125fe856b790b91d783e976d8cd624f1674a13df",
        "mipsel-unknown-linux-gnu": "a6e6fda7964b1b5d1c8ffd10d6f27c0092d7ad663e9fc6907e2bf4d84f4fdcdb",
        "powerpc-unknown-linux-gnu": "24f0b49a7dfaec957dee990927e1186ab6aa35175048d71069431887fc847a0d",
        "x86_64-unknown-linux-gnu": "a8349997993578c2ae730e0c84799d0c4df6f58a7e493c821a5be69e41ff3121",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5b54e3c7f8ae30ef731fa0dd751702f2",
        "arm-unknown-linux-gnueabi": "6200e6d605f66f18edb0ddfac8830de0",
        "arm-unknown-linux-gnueabihf": "0d4072cd58770fbe5d66797053e6582d",
        "armv7-unknown-linux-gnueabihf": "5dadbc065ab1924cd44ddf1e68ab0a49",
        "i686-unknown-linux-gnu": "92da88e57f048dcceb7ec380f2d909c5",
        "x86_64-unknown-linux-gnu": "91190bcdc79d57a171e6c34f089f5985",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "71bae9c1ac089db9eaf044ff5e806b09eb8306a8dd515d6358ac6e1a7b399496",
        "arm-unknown-linux-gnueabi": "b3ead231a5776edc0fa35ba17e3e7af3f435f0c70ecb0196dccb3737ad02ff9b",
        "arm-unknown-linux-gnueabihf": "af5517685de35c8c4bb0d735109244f777ee13939be449cbc10dc0521ca254dd",
        "armv7-unknown-linux-gnueabihf": "fdf9aa96a3de582d82a388bf6770fb5f6eecff7a4ea590f2c7f05b88fdb516b8",
        "i686-unknown-linux-gnu": "338dda1e2574cbf56c1f990a07a2520925f3c998b114d2b9952ae26dc65a3b9a",
        "x86_64-unknown-linux-gnu": "0f7abbc790df9a02108673c0090c3127d3ee0053f3e1dbbe021b6da9c7d3f4da",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
