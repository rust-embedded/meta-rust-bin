
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "143628e8aa22fd35273b2ca1bef236cd",
        "aarch64-unknown-linux-musl": "0427863136d17d17b65cebc66f531bd6",
        "arm-unknown-linux-gnueabi": "7b109856498c8890e7612e9cda2214cb",
        "arm-unknown-linux-gnueabihf": "81b408401bfeb4a6202a6fed463d7b0b",
        "armv5te-unknown-linux-gnueabi": "8f1a00288e190b24901eccb5c582f8ee",
        "armv5te-unknown-linux-musleabi": "206488e8ba28bb29b06f22abacb1edcc",
        "armv7-unknown-linux-gnueabihf": "ff4199e005901e9de8924e4ad8f09179",
        "armv7-unknown-linux-musleabihf": "98f6b44d2e0507369087af35a4430913",
        "i686-unknown-linux-gnu": "b05449270e2a5fd6a0f86ffc6c5d2edb",
        "powerpc-unknown-linux-gnu": "be2a3429dea322adf5288dd62c29590b",
        "x86_64-unknown-linux-gnu": "5beb421883ffbc5ff66e38154e27cd9c",
        "riscv64gc-unknown-linux-gnu": "cee94f1197c782c2db2f5d9b564c8956",
        "thumbv7neon-unknown-linux-gnueabihf": "1df3d1c3fdc0adfcf602bb1010d25cf5",
        "wasm32-unknown-unknown": "32749119542b556e67ad40dddc6baf64",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b90b066ea8edd7b3f815fcfe4b89b5c9000b886d9b935ca03e29c28ea20cfc81",
        "aarch64-unknown-linux-musl": "63b32ccbec4c160632b0771219dfa4dca4df6e11330c27eeb2fbc3a6bb0e0094",
        "arm-unknown-linux-gnueabi": "7c422743db6db17cacd11d71968cc9e4429ae19592e81be3cae69251f08b336e",
        "arm-unknown-linux-gnueabihf": "124a0e1859b7d44577ec94c7663f6c0ddfea61deebd0e726d42c1c11697f831d",
        "armv5te-unknown-linux-gnueabi": "8e0c032564e41e73b0d9f5ae87ad28490d116de11a42be4a63c595b32f9207fa",
        "armv5te-unknown-linux-musleabi": "eb99748ca647a39883a714c6532dc74e1ffc56c7b8d77afbb870f09ff89ad1d1",
        "armv7-unknown-linux-gnueabihf": "bb154fe1157fc1ca99f4d2d8ff9c0df15cee384e60d0b5a7e818f5ab2c33a5bc",
        "armv7-unknown-linux-musleabihf": "1c1c5fa17c455d17c9313934e4f1f7a7bd995d0d056389dcfc074f275734f87c",
        "i686-unknown-linux-gnu": "607f3510edd7931c1b7c4743432dbc8b2ac6d31678d92f20a5e7f2107c043356",
        "powerpc-unknown-linux-gnu": "0f82c32c1baa71455230fffd153ed52832f85afd6c3be52ad1a7f171883515be",
        "x86_64-unknown-linux-gnu": "9a51712a090d150bcaf00f9d6a26950d60702c324020c691caa55c3b8dacce73",
        "riscv64gc-unknown-linux-gnu": "1ae6a51357e0119082a07a50d9cf5d2d7497e8cdc45a61ba9702a6ffb41390e2",
        "thumbv7neon-unknown-linux-gnueabihf": "72325f9e4d14b9416a4c5b71d71723e12605bf66a1ec0b2757a30e209529244b",
        "wasm32-unknown-unknown": "bc1c937f26c0804921eadf19a32319093aefe9b6aed6ce9ee6d2422e38a5bd38",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3c264f423a75718a6959021605a6723a",
        "arm-unknown-linux-gnueabi": "526f4f497fc78da67f30b3d2bc7579ce",
        "arm-unknown-linux-gnueabihf": "6d17905c0ebb375246e2cb2a8fe477a8",
        "armv7-unknown-linux-gnueabihf": "d25cad591c7ee7600889e1592c02deb6",
        "i686-unknown-linux-gnu": "af0db2b6a43564062709deb728599169",
        "x86_64-unknown-linux-gnu": "226d7e55da409f7ed89767e9e319927c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9a4d637a9a35889e24093097c0751d9f308aefdf8c311fffd4611952a1639088",
        "arm-unknown-linux-gnueabi": "df3e29a4bfa4669daa0e44f769d31766acb1e6ae5587096304abb382c55d9f67",
        "arm-unknown-linux-gnueabihf": "15dfb8d525e9065e30bb33b209983d2f22f76f36b88b466f8ca2298fd76a9cb7",
        "armv7-unknown-linux-gnueabihf": "893babcd84f6afabf727914d906eae2393cc58c3bf73ca71c5bbf039073c53f8",
        "i686-unknown-linux-gnu": "a860d198d7703594453d011efaf1191612f40d4a2257ec76982c50f2bd34d941",
        "x86_64-unknown-linux-gnu": "0b6ce0a22f7b536650a0349be0e2282aa9bcbd5090203254760c78265466fdc6",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
