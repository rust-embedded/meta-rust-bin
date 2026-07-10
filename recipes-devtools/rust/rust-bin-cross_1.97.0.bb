
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "99d4a943636fdaca616adf92c80426f5",
        "aarch64-unknown-linux-musl": "cf0f486421ec57c659e8ea304caa6119",
        "arm-unknown-linux-gnueabi": "4770a14be9bbfacc6274f623f80c0efa",
        "arm-unknown-linux-gnueabihf": "a939e2cd4f1fd5cbcbe9b9a87239fc32",
        "armv5te-unknown-linux-gnueabi": "c29a03d3d042720b3b08b3ff88f25baf",
        "armv5te-unknown-linux-musleabi": "aad3a81b5f92c88590e2be0493586478",
        "armv7-unknown-linux-gnueabihf": "957e6f1cd614004c08f2f9961d002235",
        "armv7-unknown-linux-musleabihf": "367e7f4e36a803cf80f00bc8c8142b24",
        "i686-unknown-linux-gnu": "5ad432131006a17aa97719f18c74f93e",
        "powerpc-unknown-linux-gnu": "0dc43297a1abd9e107acc6e522082022",
        "x86_64-unknown-linux-gnu": "3abd5a3466f164b98a1e22bede9a0f5a",
        "riscv64gc-unknown-linux-gnu": "287e6338057f6b882b05af74ddab4c0a",
        "thumbv7neon-unknown-linux-gnueabihf": "2acdbbc69267020a629e505580b5cb44",
        "wasm32-unknown-unknown": "4a003640df16a0304f2dc1d4e8da99d2",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ae6c76b70be4768ecf2f320f1e6fa28525730b7fd7d6cfc822a3a23e0c07fcc2",
        "aarch64-unknown-linux-musl": "09879411d1e3e8da9358a1f4a071dc1af01d4ea0e3c1ff501dccc0c0a496cf3e",
        "arm-unknown-linux-gnueabi": "73e86ef5fbbc652e4943af68a8728d36a0b752ef73bd46f4c756bf457cc53079",
        "arm-unknown-linux-gnueabihf": "d789fd5bf9df5060c5ce9b95cecdb6f176d1c626520d50b474fbd0604096220f",
        "armv5te-unknown-linux-gnueabi": "102397143bf151461d9a85637401dbc34e02a910c8dcb21853065d3ac2770c3a",
        "armv5te-unknown-linux-musleabi": "193afb0df8cb68f02c4fd8913394a6658f1309210297046378b3f799fcd5b0e2",
        "armv7-unknown-linux-gnueabihf": "f4d3c7590a662109be4937cbf6b17f3d7257a5d7f26244f982f20f54f99393f3",
        "armv7-unknown-linux-musleabihf": "3cc371fe3c7a7ec08126d4c50d7077fa48d19e0943a415d0f25edb4a73021bbc",
        "i686-unknown-linux-gnu": "2887d1ac8d3c18e4b2697b41fee0019457affd1a0918e61f04aaeb74605ec068",
        "powerpc-unknown-linux-gnu": "bf7999a75627868b6e8e6a6b87c3edbda1c1075f98aadb658c20502c8ea1aae4",
        "x86_64-unknown-linux-gnu": "26abd06b9c4221811af1baec86dfb6de9535862fc853b85388dcc314c96cea6d",
        "riscv64gc-unknown-linux-gnu": "feb4d58a9f47c1f6b8ec8166cf29ac4c03498c3817cc692f772eb02f9357b4f6",
        "thumbv7neon-unknown-linux-gnueabihf": "0ac9c1e1a1c57f5c3633b5ddcb6dd154ea1955b1ae248182d6039bb330cfed46",
        "wasm32-unknown-unknown": "ebb7e78290ac440be505d701ca99101e9450ac5b8f701722f9c6a020cfd9bc89",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "733d719f64727dc51ca582711349f6b4",
        "arm-unknown-linux-gnueabi": "a4423055ab84946001b39d21aeca9a5f",
        "arm-unknown-linux-gnueabihf": "3ca47df8867462c65168659024758758",
        "armv7-unknown-linux-gnueabihf": "8f34564e7b160ec92a1b39088ec50935",
        "i686-unknown-linux-gnu": "1afecb06f9bf1a980c781bcd3f6e443d",
        "x86_64-unknown-linux-gnu": "edf37468fcaf4bb9bcd40f9a9451ea9a",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f91c23ade7e7b4ac173f12593eb1dcf1a37189d4e545ca2f64e3c14090ff6c0c",
        "arm-unknown-linux-gnueabi": "daea984acfb6a4493bba97a6598361754d40718e6b47ee0da6eef2899518a4d0",
        "arm-unknown-linux-gnueabihf": "1f67c31c3bc7abaa0212adb019e7e09a3963184ce1311479b9046b80745c5e1d",
        "armv7-unknown-linux-gnueabihf": "f47595c13adc24b1f3cc2bfcb5965145db41653fdfc14eadfd590680a43f4483",
        "i686-unknown-linux-gnu": "04533b79eba7016b0d798429c19953d0f0b138700b311e245d3387efa5cf0d7b",
        "x86_64-unknown-linux-gnu": "ca0439140d02e91420f4755cc4681a6444a2dbe8e9a6f685f403946ed3efd995",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
