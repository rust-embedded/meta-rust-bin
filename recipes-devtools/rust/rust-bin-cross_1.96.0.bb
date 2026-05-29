
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "dedab208c9cacb710b69dacac3a05975",
        "aarch64-unknown-linux-musl": "4fc709c6beedc1d3c649690ad2eaeb84",
        "arm-unknown-linux-gnueabi": "1a850522626998621adc36cc572c3029",
        "arm-unknown-linux-gnueabihf": "367a0a4227afd3dc8890bcfcca6fde47",
        "armv5te-unknown-linux-gnueabi": "2d76a3dc8ace7f1b21beb79162eea191",
        "armv5te-unknown-linux-musleabi": "dcd3edf6c73dfd346fc669d235e3f61a",
        "armv7-unknown-linux-gnueabihf": "57ad9d5f2b72cad1a09646e78b893c86",
        "armv7-unknown-linux-musleabihf": "0b77ff5eb7b290ef2b906fcbb9012fab",
        "i686-unknown-linux-gnu": "d145bc13c6605c3a9c16698791122041",
        "powerpc-unknown-linux-gnu": "18c43835ec02734b083ece05765a32ac",
        "x86_64-unknown-linux-gnu": "1950bdb6a64660e212f726e9531c99ed",
        "riscv64gc-unknown-linux-gnu": "42f2b32552976c9b10001ed805edf63c",
        "thumbv7neon-unknown-linux-gnueabihf": "a6a0d4ea587b714a8d14710122e4162b",
        "wasm32-unknown-unknown": "586919d0ddede43512f7a4df521296d7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "66ad5d73e79dd44b93c260ee61752abce3ce5ccb5031832beaccd1c248b88586",
        "aarch64-unknown-linux-musl": "1c32fdbdc25f86cf62c8fe8d35ddd252e4ecf3d22efefb00d885bc86030318ea",
        "arm-unknown-linux-gnueabi": "39cbd553f32daead553482123a1298f37a21f0cd38c28738c86be90f96c8e8aa",
        "arm-unknown-linux-gnueabihf": "2ad60ba83eac16934d35cbd468abb8721b10a37554cab02ad4990b9e54ec5db3",
        "armv5te-unknown-linux-gnueabi": "3c06d36cc557067fe6cf2ddc6f44819e407f062e068954eaa13c51792f264b5d",
        "armv5te-unknown-linux-musleabi": "4191bc8b57a40f1f2dea72da6a7d0d226a3b2c545dd3facc6a2957bfceeb0e53",
        "armv7-unknown-linux-gnueabihf": "2b18e8e8d582ed5e4a0ef68540cf364252846e96db6d9072c982a6e25cda66d6",
        "armv7-unknown-linux-musleabihf": "ee000bcf2432dfcc15acb0cbbad0f4ad0979e0b695e91f858fcf3b5f097bfe5d",
        "i686-unknown-linux-gnu": "6c46e9623d9b657cc4a679b83de0bd878b34467be1dabf9fdce8016548a15c20",
        "powerpc-unknown-linux-gnu": "2ad7cb5eb2c104a7e972b969febfb4f553d5f36886615efae9e231e4065219ed",
        "x86_64-unknown-linux-gnu": "36e577b66f7b2f8fc6493f97f81329e5f6e1514360d0c6c31d5d8463184e6773",
        "riscv64gc-unknown-linux-gnu": "9967cc4ee0dc64c1c21a9d81a9d39703bb6c697ad34a36ce382abbe499e5fe89",
        "thumbv7neon-unknown-linux-gnueabihf": "452182f2be1a6d825c4594ac3d5b991491928b1c38c454e7fe454ab4749c21ce",
        "wasm32-unknown-unknown": "a4a0751051c0a3df4091f56482a93259c6109a5d68718bbc85330f75c262f9dd",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6f5929d4a250fccb75fc61427b389ff1",
        "arm-unknown-linux-gnueabi": "59d566cacccdd791aca805422ed2cbae",
        "arm-unknown-linux-gnueabihf": "a9b5da9e36c9e13ec60b25095f5b4303",
        "armv7-unknown-linux-gnueabihf": "76bc42e60c8682f6ed98e6bf1019c117",
        "i686-unknown-linux-gnu": "4a6720c3b42ec584b75ba49dbdc72b91",
        "x86_64-unknown-linux-gnu": "669f6566f0927e66bed35773c6ad6a36",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ba3c19a8e3a54efce3bd8d6c8ceb21173c8c64a100dd84e62fdfd8313c1ea7ed",
        "arm-unknown-linux-gnueabi": "72868ef1b134c08155f9dec4d7f1c634af822ff933777c66dc6a5b7558901f30",
        "arm-unknown-linux-gnueabihf": "a50ecc4a33c5c6f1f30e091e4a1236085e33dd62775218634745d0a1b7159b27",
        "armv7-unknown-linux-gnueabihf": "020d8dd974f238ef0bf1ea008d4dc951adb1dc297f5ba009308785f726b9dd92",
        "i686-unknown-linux-gnu": "08e1d5420e34826b857be102327e139dbb826a472980745795c90b661431654f",
        "x86_64-unknown-linux-gnu": "71143d6075582b7e65233992c77e375aadbec4dfda6df2675160bf05b89410f9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
