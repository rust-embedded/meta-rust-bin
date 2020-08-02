
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "62556956cbca95ed938f2eb7454da200",
        "aarch64-unknown-linux-musl": "d58a8ff1bfeedb6f3727f7010c229f80",
        "arm-unknown-linux-gnueabi": "d418e476046da63dde945079dff10796",
        "arm-unknown-linux-gnueabihf": "60d984d15374fbd05cfa0192e480eb84",
        "armv7-unknown-linux-gnueabihf": "fe09535e2bbc9eb4c3c30830d4c8c4fe",
        "armv7-unknown-linux-musleabihf": "da7bd781beb2a21659cd8398be79bbd5",
        "i686-unknown-linux-gnu": "b3d4515e46e00fec57703aa221509df6",
        "mips-unknown-linux-gnu": "3f6e793c144b94207eb4574222ddf6fe",
        "mipsel-unknown-linux-gnu": "b9d54feb4216c3fb3815e8278212315a",
        "powerpc-unknown-linux-gnu": "a4e861527520588a91ef830527f8a526",
        "x86_64-unknown-linux-gnu": "fa6b6662b61faa13a5f0f6ed0d7dbd0e",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0265920b4b672b9671986b5a25da11445857880172aacafdf3594fee9efc17b4",
        "aarch64-unknown-linux-musl": "1fde6444a089bc057b2f2ff2482663ed81c10ef85aa19ef04fa6a83320f8bc60",
        "arm-unknown-linux-gnueabi": "b955bf183a9de17180c32c40027e009a6c17ea7d07f7426c6758544126280ae9",
        "arm-unknown-linux-gnueabihf": "711ac07aa57bc535abeb043f2a185243bebb659c920a0b7e58804402dd44634c",
        "armv7-unknown-linux-gnueabihf": "21571442e509705603ab337e9b6d5690ea120f45cb0868a1eb125df448cd093c",
        "armv7-unknown-linux-musleabihf": "f9cb53fc3639bae8d032e5a41a735dc33135ce8ea43c16db4bbe873e9510efb2",
        "i686-unknown-linux-gnu": "03a83b7f77de636e59b029e06b2008af45a301494975cd5653ce0fd03d391c28",
        "mips-unknown-linux-gnu": "e273249459515b106b93b91b83f6c50b9d84e7e7fe2bac9538731edbba9f79d4",
        "mipsel-unknown-linux-gnu": "733320c0927a4bafd9e4961224d8a6ec30831ad050cde946a0e645f5e32b2596",
        "powerpc-unknown-linux-gnu": "d5db27389c8e9367a6bfabb6c9bdc61d7d83352bed79ac53757166b740ed3869",
        "x86_64-unknown-linux-gnu": "db38e6f11364f608ab234f4586e9b596dd7636bc5fdd66409506b95c181b1f25",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2727191d01af48c23b389045270f09ed",
        "arm-unknown-linux-gnueabi": "ead718d1748ed0fa5524457f7701abcf",
        "arm-unknown-linux-gnueabihf": "9880766dcd031ef10641c51bbb668dc7",
        "armv7-unknown-linux-gnueabihf": "68f496034a8c0a18960df95aa7d285b9",
        "i686-unknown-linux-gnu": "ea3b5be28953d300344e1ccc7aee983a",
        "x86_64-unknown-linux-gnu": "07ffe070995198baa248998c05adfc63",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "88f814a3beed60c3c01d6d31d2e861e35640bd2ab12c76d8d4660ab1e4c92fe6",
        "arm-unknown-linux-gnueabi": "875feff2a5a4ea482c4621c837450bf854a8b448cf92147a83d4737235166c90",
        "arm-unknown-linux-gnueabihf": "70b1a2b04ccea2d3ceefce0cabe047254e7f22edcfc813b24a08838cbc34a9ce",
        "armv7-unknown-linux-gnueabihf": "f8e15205d1054d0cea51e516e5588f2d8f942bf752cea7eb7bc78cb8ee636ba2",
        "i686-unknown-linux-gnu": "affd8554bbaf38b01ac282429bb632965cd9c9d710fac5840ecf42746ff07414",
        "x86_64-unknown-linux-gnu": "bd11810537abf3c7749e73af2f5184104c3fdf369cfe2550d4d610ab269ef4b6",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
