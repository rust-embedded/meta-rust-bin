
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e43d839617e9a5261307cb14c96c1feb",
        "aarch64-unknown-linux-musl": "ce6bef602ac3763a7d8985111ded6dff",
        "arm-unknown-linux-gnueabi": "47f5e276a3d17d8a488d9779e5b4eb1d",
        "arm-unknown-linux-gnueabihf": "f5b97ecd5099f672c60db153dcfc4771",
        "armv7-unknown-linux-gnueabihf": "2c542edeaf89b5eb1208b61460a01085",
        "armv7-unknown-linux-musleabihf": "d37b6c7c259b2b48dd141aa931cbe95b",
        "i686-unknown-linux-gnu": "1f1e688ecef3dd5d271237dd9f404509",
        "mips-unknown-linux-gnu": "45c36521baf61851b306bda2eec6362c",
        "mipsel-unknown-linux-gnu": "73ae88a9b5b300eb5ef75dad4eb70e82",
        "powerpc-unknown-linux-gnu": "ed48013bfee2f4ed9366a789f75aa888",
        "x86_64-unknown-linux-gnu": "49e817c36dbbc865f40dda61784bdb01",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "59b8dab431af29dcd28c6e92e82a488ebb20dbb5dff93ca14119ba8e2fabd9c8",
        "aarch64-unknown-linux-musl": "775a256864417d93d20ae106b775564051be888a78e77a6a88c67ac86e401059",
        "arm-unknown-linux-gnueabi": "315e58f01a3023f38bbae0d2baff642dc0b9ed57494146c3ae67727022148508",
        "arm-unknown-linux-gnueabihf": "59b9fa9c8d714cbdcfe7d9ed1b798717c9875ebbd19c47fd59fc3b4e90ac1af4",
        "armv7-unknown-linux-gnueabihf": "9653715275399967b9fb2dd5f5aced4b1d1e52ed80f373b1d32be27cf30e1121",
        "armv7-unknown-linux-musleabihf": "73eb6d007c520b6d3d2ac6c1847a5de7bf1c5478962cf9a23a6899b431ae3e94",
        "i686-unknown-linux-gnu": "0d40689f59749882876a30a55881dfa7f2c325542a521d4d2ddaa690f157f207",
        "mips-unknown-linux-gnu": "097a7a9279c23f6fb9759beea6cf25aea371384e478b540e581ca51008308624",
        "mipsel-unknown-linux-gnu": "aff9e6ad6854c4aab382700eb8468034cc008e8085b7017a0f2490a1d3570af4",
        "powerpc-unknown-linux-gnu": "9cf066a280c1defa34040248672efa4821b59f5386efbef4cbe6ccfa386cf097",
        "x86_64-unknown-linux-gnu": "b563fc979eea8372f5b371e10f0857e79cdffc34b124c7a7b0d89014d1b351b7",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0d02ffc3fccc35ac060bcdb5ae8d1044",
        "arm-unknown-linux-gnueabi": "c9f6864cdb9e48b9cedb98af03aadf03",
        "arm-unknown-linux-gnueabihf": "4e50ada08b518ee648914a04b82de1d3",
        "armv7-unknown-linux-gnueabihf": "19e228d66554a67a56feb4e8d679e580",
        "i686-unknown-linux-gnu": "39e4109bd242acf6ecf5c6333633d10b",
        "x86_64-unknown-linux-gnu": "c20b90feef64b7790db27f0f9bb31226",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9d994935f92088c968f520f558a88b140bb7d60e917fc4ad69019e2b830b1db7",
        "arm-unknown-linux-gnueabi": "691c149b1bc63b8ad36550da9a9d28f2895176c6677b3baeeb90282b4cd2f8c0",
        "arm-unknown-linux-gnueabihf": "20b33377ee71280c413c3bdf9db337921d7cc04af551b41e0729a8aa67e3c6ae",
        "armv7-unknown-linux-gnueabihf": "441d6b0e453595cd960a42664f0615e6b9089af5d562fb38b57785e27a519161",
        "i686-unknown-linux-gnu": "b4a20542788315c285e8187c4fb2531e9ba2f5974ffffb74880b8ffeef6afbb9",
        "x86_64-unknown-linux-gnu": "531b4cc77cc25e960aafa2ebaee073c137fceb0004447c6b7274557281c62a6d",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
