
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1fd3bcb3897c7fc8005788dac69a5b64",
        "aarch64-unknown-linux-musl": "5d2f152b942464ce5660d05ac340ad41",
        "arm-unknown-linux-gnueabi": "4c27c91eca7f9cae113e54d73bdab077",
        "arm-unknown-linux-gnueabihf": "be4b489f52135c37fd5af840604163e1",
        "armv7-unknown-linux-gnueabihf": "95bac40cd43ba12494b113843478dc27",
        "armv7-unknown-linux-musleabihf": "e4a51e8a7f79fe007a387edef74e1476",
        "i686-unknown-linux-gnu": "afdba42e9c9b16d47beeba8be0f50a3b",
        "mips-unknown-linux-gnu": "bc09a34d4b7d892dcc10f1107dd018a5",
        "mipsel-unknown-linux-gnu": "02ac12873d3a83fbb378a6952018afff",
        "powerpc-unknown-linux-gnu": "ccbfcf8f7d09c362ee7d56321a9a5478",
        "x86_64-unknown-linux-gnu": "aed849b81f9d1199b7e21a0217ad4175",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c9601521dcd0f77d4dd60d0b64b4e7a219d1565066828d1d577ca4967be54718",
        "aarch64-unknown-linux-musl": "e1b5a0c15d31e2f96e290c247aec29c996e3a65d5ef2c1c1a004446abf00e125",
        "arm-unknown-linux-gnueabi": "da4c096392d5b73bb327cc6ea1fd3c018104e13e0b34fd3322aca38ded97d895",
        "arm-unknown-linux-gnueabihf": "c75e632c6def2a7c74e1fc6a6df3ffd15d2a8513fd9ab81eea6e4f303bd437ef",
        "armv7-unknown-linux-gnueabihf": "136f46eb3bcb746138d66a6042394e4fa1184a19d3c423f4630018555257b095",
        "armv7-unknown-linux-musleabihf": "ddd13c8cfa51f80ef8b3c52c38b1ce50de475a1764507c6ba7e8a1983153b956",
        "i686-unknown-linux-gnu": "ac2d764d7c3a16fc397129fdc92314b1bcdc8870259b5b6fddcdd8491ea7eec9",
        "mips-unknown-linux-gnu": "5720fbaa13b1da04468fd0f2ed106211fc56c6d87348c84f28c2c60382d5facb",
        "mipsel-unknown-linux-gnu": "2ab6abfd4aabd2346cc73f597b0a63973ff1142471341559ba9734cfba548aad",
        "powerpc-unknown-linux-gnu": "ae0534b20414265277831e6f8bf59c97788d94190f4abf5d92f46f7f385a881e",
        "x86_64-unknown-linux-gnu": "c7c4fd298fec5023d9f2fd73ba39dd7bacbf0702c3824c8406b90c3ff6d81415",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "32949d012525adfabe4e431431ffb5cc",
        "arm-unknown-linux-gnueabi": "854df87c3bc6d161e51d80fb3b0ac561",
        "arm-unknown-linux-gnueabihf": "a22d1a13914f215388fa833ce1129a4e",
        "armv7-unknown-linux-gnueabihf": "852e35b985ccbf0eae3d8f07dad48471",
        "i686-unknown-linux-gnu": "d1881d1c4358b6caf0d1581dd0ab3e82",
        "x86_64-unknown-linux-gnu": "cd450a3c74158114ffce030b0e45cc4d",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cdc837c7793219fb160f92ebdffeaf0354650e603d622478e83d796cb0e8ae6b",
        "arm-unknown-linux-gnueabi": "2044e09d489c07f2de0dc7db5087fd43519b1223a75575ffc093af4972df10c4",
        "arm-unknown-linux-gnueabihf": "3ba476a9963619ca22d140f37af1ef295b6ae7a846e4ff5a43592ab229fed356",
        "armv7-unknown-linux-gnueabihf": "992445dbf96b0b7b7ac006a694ba743877f9e14024371d0e3bb8626ab50e4c73",
        "i686-unknown-linux-gnu": "a10370ac3a29feb2bcbb70142cf67faeb6409698e128251230f6be27b394ca65",
        "x86_64-unknown-linux-gnu": "0197b38ab021d6584488a200576dad19e0853247261dcd4b9ad6648b1b313d98",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
