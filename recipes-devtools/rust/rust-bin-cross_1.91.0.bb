
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bfb45a93fbd9f651e848c349c60836be",
        "aarch64-unknown-linux-musl": "fd7bb2ed72aa60edefb1d230c8cfb446",
        "arm-unknown-linux-gnueabi": "6968e70466948ca2a7a35c6913a3d708",
        "arm-unknown-linux-gnueabihf": "0e231534851af129926959f4b39175ea",
        "armv5te-unknown-linux-gnueabi": "86a9271ea979cc68c7cad5769f3f5806",
        "armv5te-unknown-linux-musleabi": "9cb82560cd5302db39c4d70bf869d221",
        "armv7-unknown-linux-gnueabihf": "131da4f5ec62d80f565a7f99ffb50c6f",
        "armv7-unknown-linux-musleabihf": "c3c3e0162d5f631c0ca426bbc33f34e8",
        "i686-unknown-linux-gnu": "f32b5df8ac0f70992a3546ee7241c8d4",
        "powerpc-unknown-linux-gnu": "d9ba47ff96fde8cae97868866656b37e",
        "x86_64-unknown-linux-gnu": "28c251d5139a507a3540f6a0b2a23e7b",
        "riscv64gc-unknown-linux-gnu": "6142966ea36bfc463ef0f874829b44bd",
        "thumbv7neon-unknown-linux-gnueabihf": "85a8c49fa8a6321a0ea6aba5eda22631",
        "wasm32-unknown-unknown": "986c5fbfd534de0c3314728e79b306e4",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "db427ec9e344b1de8d9c26485353135fe86c391932b23852fb1687add64299b3",
        "aarch64-unknown-linux-musl": "ee09f645ace3b53fe485278fe61f03fab81ce17fa2142541464bfcc1aa0a21a8",
        "arm-unknown-linux-gnueabi": "d4dcff493019fa1e0654982ed47a5b22eb132caba8dc8d722f2dcb1f92686cec",
        "arm-unknown-linux-gnueabihf": "6cbdf54e28e75d3b779eebed15d71f0dee24e59239fe11a1e079f35f2908b49b",
        "armv5te-unknown-linux-gnueabi": "9dc78ffb85a54dd9652286d3f23996cd92fed83df00de0a3c0e0a7e48f6ffd41",
        "armv5te-unknown-linux-musleabi": "7b2f6e24770c42cdfd9df563bd2ee39e3c02a90bb4a78cb2a7a6279cc1c1e436",
        "armv7-unknown-linux-gnueabihf": "c82854c04e65188248c94b75e85160765b3779cde6692f1eca0575188f9ab9bc",
        "armv7-unknown-linux-musleabihf": "09cf4e3ce714075815d5b1e7c4dcdd0547b9aaa38d5d055b045acb3ddbee34da",
        "i686-unknown-linux-gnu": "91d150acc7c2c311047b34c8ad919c6e933267d045fecec5653621692fb121ac",
        "powerpc-unknown-linux-gnu": "d13b678585ff91824b57572588e3cb9d142fc1a9adc3d6a4564a43f240ea6e44",
        "x86_64-unknown-linux-gnu": "b1518c4bd449e1c6aa6d5f6d99ae93d3fba449a4311846cf0d25221991543de1",
        "riscv64gc-unknown-linux-gnu": "d6b7a6b699ab920078fd67b065d54ba42219671af3b35035f47808ec9a04fbc9",
        "thumbv7neon-unknown-linux-gnueabihf": "23ea8beae7f4cfd00de80c11517f23051dc61616b6383d91c1448ba2e18448c9",
        "wasm32-unknown-unknown": "103632dbc4ec30f8074f783873e48b28c6696ec58880d1fbc533b5ca906cfcf8",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4c2db60475f8127375563fa486191845",
        "arm-unknown-linux-gnueabi": "fbd7a726fdf3c060642fb4da82c571da",
        "arm-unknown-linux-gnueabihf": "5f5c53e7280822c4d221eacd66324cb6",
        "armv7-unknown-linux-gnueabihf": "f3b223bb0878e1e8c9f964ba89dcfb14",
        "i686-unknown-linux-gnu": "fb38e938c39354cdbf9516f8814b3064",
        "x86_64-unknown-linux-gnu": "bc1b19f5006bd16bf8903c5d2adf579a",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "8dee11a6e4025a8600d102ca0470e13d7883ad678a98982842bb14c0d086ccd6",
        "arm-unknown-linux-gnueabi": "3c9f39d43da2603fa039b8487547490a9582044e9de550710bb180e545b20927",
        "arm-unknown-linux-gnueabihf": "030d9e343bce686d5b06b1412eded569cc8be7e1964e620d77429f7107c7c9c3",
        "armv7-unknown-linux-gnueabihf": "b976758103ce601ca50848387bfdac7319f2496b39ec3f857272e3b1ebabc0f0",
        "i686-unknown-linux-gnu": "6e15487ab9f1e7f083eb126ab2098703539d880d9bfb2a7898652e9e9658ba0c",
        "x86_64-unknown-linux-gnu": "a3c87b08fa2f1ca12d3ef21ca74b3eba3e66d84540f82a9b19c89a8e777241b3",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
