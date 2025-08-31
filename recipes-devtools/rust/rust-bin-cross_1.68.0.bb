
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "36f21a0c6d38db78b5de96b26f83f0b4",
        "aarch64-unknown-linux-musl": "5fc9bf7a99082795af64477128eab6f4",
        "arm-unknown-linux-gnueabi": "20d2f77aa83b165c1b2947293410e597",
        "arm-unknown-linux-gnueabihf": "7f1733f938f3f0d5e0f89a83b4964a43",
        "armv5te-unknown-linux-gnueabi": "42f9d699d9747528492ab8197d7f2482",
        "armv5te-unknown-linux-musleabi": "324dfa0ade2034d16dc2e961ac10510b",
        "armv7-unknown-linux-gnueabihf": "1d73e9dbb93a17eff8daed594f3c1b4b",
        "armv7-unknown-linux-musleabihf": "79f20ed1ad2eb10f76d6d445af02b2ad",
        "i686-unknown-linux-gnu": "3240c05b0f63ac85b0e8891c38fde126",
        "powerpc-unknown-linux-gnu": "faa9be4d555d4ae20054f67b81868209",
        "x86_64-unknown-linux-gnu": "46c9c8247bd7096baefb195d01258176",
        "riscv64gc-unknown-linux-gnu": "94f993b8bc6823cdbd60afef8ac8fd59",
        "thumbv7neon-unknown-linux-gnueabihf": "d66fc1dc3875d99290187ea8cd0ce747",
        "wasm32-unknown-unknown": "5389553d5f02b7cc20a81661d413e9f1",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fd1d3123b12ef497c6f5a87d4a831ef3ec5942d03e5d4e2fcc6ec5ddc3935759",
        "aarch64-unknown-linux-musl": "fe17df6947ed566e3a1dfb61455c6b566dd04a4668f6292781b897b76da79a2f",
        "arm-unknown-linux-gnueabi": "b8a6bc5f1792a7d1d3b424681f4ea9e9d2b5a9b5dd7d53940a3a0d6a1aa7aab7",
        "arm-unknown-linux-gnueabihf": "0f9d5bfba15980023bd55e2658e12688497ff845ea928369420410f9d304c497",
        "armv5te-unknown-linux-gnueabi": "383db858d4ec8569fe2ab2c8380e5c73024519bb0bd8eefbe9d1dbf58fa109cb",
        "armv5te-unknown-linux-musleabi": "346414c7666d6cbfaf9c0f1100565441aa9ecddd353a518ff114ad38c3eb749f",
        "armv7-unknown-linux-gnueabihf": "e919a141af4aef500059a80cd7746aadb80dff88676e6919a0ee4f74c2272569",
        "armv7-unknown-linux-musleabihf": "52975246828ecd59164aa5b623c4dbc1e466712bb4ae3015e0a463e1214755a2",
        "i686-unknown-linux-gnu": "d9d4572a5cfd668ecbc219a42786ac2d6aa18708447c987965ef2d1c2ada661c",
        "powerpc-unknown-linux-gnu": "23d2fcedad4102d884cb35774a6ca8d765e0e07825dae64dbda19112ad99d6e9",
        "x86_64-unknown-linux-gnu": "67b8cb1610b254c296107e2516083897aed2996bb7618561520e0a1f0923c696",
        "riscv64gc-unknown-linux-gnu": "f5f9eaa9a4661e3543f284f4b0f54174991abd7078b3de9252fd59a9819d7a50",
        "thumbv7neon-unknown-linux-gnueabihf": "2942c9fb72956c77b7738f346e2ad2c4fef044c78048f05964b09d01cc189712",
        "wasm32-unknown-unknown": "7fa9c48e3cb2bb5d41cd6a6145544d37713beb84f32c7ee55f27d9a655918064",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "94974c13814cbcb5ff2f90dc941888a2",
        "arm-unknown-linux-gnueabi": "025ab9f13f2c7c60bb793606adc5877d",
        "arm-unknown-linux-gnueabihf": "b2bc73df403f8c3267c50fb9466c0a71",
        "armv7-unknown-linux-gnueabihf": "984796dc77369902e8f6cfa5e4fa0a5a",
        "i686-unknown-linux-gnu": "e93cdd6520fabbea24e5f5036b3b2502",
        "x86_64-unknown-linux-gnu": "c44024f8b7a4c58e657d1277445b664f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "43f103a98614196b58e0f9c04794eb10e55433e44d456bb28d02ac8d5e52fe4f",
        "arm-unknown-linux-gnueabi": "dbc90602c4755f914370b8e1868bfb428d19aecdda451fca88e486a94b12418f",
        "arm-unknown-linux-gnueabihf": "86189c70c48768429adb4bbeb652526f3d180827aa2f6827e8b9c5756e1ea2ed",
        "armv7-unknown-linux-gnueabihf": "49669fc940ef07924bfad801ff63d9e94bf311a2affe8f11c15fcb39a356d099",
        "i686-unknown-linux-gnu": "f2b914352e35938635956033450f3229c8f1fa7de2017d5f7f6205ff73552b2f",
        "x86_64-unknown-linux-gnu": "dbb91e39698e2fca9ebaf6439a706b3ea723ac507903c046ecafcb5151c5a74e",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
