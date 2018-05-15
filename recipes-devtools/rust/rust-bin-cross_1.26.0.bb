
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1a7fe8bc42e2e1e8a59950fbcdc43a22",
        "arm-unknown-linux-gnueabi": "1a49ec9bb275c57a7f9fe4a770869e13",
        "arm-unknown-linux-gnueabihf": "0498b89e9d4849af47a523509298a917",
        "armv7-unknown-linux-gnueabihf": "cc4d0f367ca53792ed2d40bd2e3410c7",
        "i686-unknown-linux-gnu": "a8dfbaf8e75f8afe4d989ccd1bf3cedf",
        "mips-unknown-linux-gnu": "76fe92463845b951bbc300dc94531843",
        "mipsel-unknown-linux-gnu": "485624494284180d4b0b69ba814c4df0",
        "powerpc-unknown-linux-gnu": "3e98bb64e476249b24756b5ac03708c5",
        "x86_64-unknown-linux-gnu": "643460e582de498eea53ec1e93aeabab",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a583ddc2d4b5f9516bf136f781268ae0e813295d1d145fab4b46a4220f448923",
        "arm-unknown-linux-gnueabi": "3b42dfdf06d5789139ccc90e711676cefaeeadf952d50a8f6ccc626301664858",
        "arm-unknown-linux-gnueabihf": "8de869f809800fb1167788fcacbe5e5605a01bda5de716d1f231e0d0af95b5cb",
        "armv7-unknown-linux-gnueabihf": "c457862d5914afa752e17cb173c9e2838dac651f27ed5f3c5222da5977099a5e",
        "i686-unknown-linux-gnu": "916c93f13e1cd51df7e09081ef8edc7a3856897928f3e4d80aee7a87a7a9641d",
        "mips-unknown-linux-gnu": "df071043029440b187f59fa8f19a32e8d294930cc735388fa014fae5d7c7212f",
        "mipsel-unknown-linux-gnu": "af80d8fc980cb6a7a5d01cdd51cf37dc52a9fd4525eb6b738f40825fe5ed802d",
        "powerpc-unknown-linux-gnu": "5c4d99ca053d2867630275282c779d3a093f76200d487bbcf3acbd65b183fd38",
        "x86_64-unknown-linux-gnu": "e27cb5c21541a500c8df919e15c8d3b002456ebbe573122e7b058cf5b4c3c13a",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bdd8a11c75ad68da6b5b6804b0207d72",
        "arm-unknown-linux-gnueabi": "4bc1372aa07d4e133ca406d4d0952f09",
        "arm-unknown-linux-gnueabihf": "ac12c4217572a4a9a3f272507055da68",
        "armv7-unknown-linux-gnueabihf": "9e0e70a1d6b564814cca7a486865b847",
        "i686-unknown-linux-gnu": "f81c2288a93d47484375b424a0995d2a",
        "x86_64-unknown-linux-gnu": "939631f19dd9ca5ae8493dc8ec2d3131",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ddddaddb585b95d81854171ac4e02d07790505853cee3034f199c8b7897f32e2",
        "arm-unknown-linux-gnueabi": "592e16e2dd90a897e753bd6158fa7ce4552273f5be618004f038cc2f3103bce7",
        "arm-unknown-linux-gnueabihf": "1dd5c6a2335139217b3957ddd0bb2d5f37003b04b5aa2cf26fc2ca414b2078e7",
        "armv7-unknown-linux-gnueabihf": "668d98bcc3e89d073ab0c0b5630695136233491ab42cd27587951e0da2dd4a61",
        "i686-unknown-linux-gnu": "ca60545afaa3f11ba50d39ba4a59c9a4ac8b787a536fb1576f242df11d5c1d2d",
        "x86_64-unknown-linux-gnu": "7ca9a30010602aaf2244c376a3cc5baa89429d54da17b8ba1cb0cdfdc846cc61",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=99c369ad81a36cd5b27f6c6968d01055"

require rust-bin-cross.inc
