
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cae9215a174f8c6082ef58a127eaaec4",
        "aarch64-unknown-linux-musl": "359b87444e9b2028303452e23da614ee",
        "arm-unknown-linux-gnueabi": "48731d16a3cd21a305bea25ca8a5a53b",
        "arm-unknown-linux-gnueabihf": "3218567e45383f599da88ffb031a699a",
        "armv5te-unknown-linux-gnueabi": "e9f7ab8adcf801f5ba25565a05583035",
        "armv5te-unknown-linux-musleabi": "e323b233dc7a283180898afbbe7f30da",
        "armv7-unknown-linux-gnueabihf": "9090b42d0288ee3ccf641570d67de691",
        "armv7-unknown-linux-musleabihf": "49d445e2fffb509587637c2b1e790e8a",
        "i686-unknown-linux-gnu": "69b5428986ef5de00ac2f90e57501a47",
        "powerpc-unknown-linux-gnu": "743945a11164f145e0b915e128082aa7",
        "x86_64-unknown-linux-gnu": "a97f19d70ec564f13c9a8ee0f28ca2d2",
        "riscv64gc-unknown-linux-gnu": "f1fde202ab58b411a9ebb1c942bb2d81",
        "thumbv7neon-unknown-linux-gnueabihf": "81b1ace53c67f65b52d7333988984266",
        "wasm32-unknown-unknown": "27130d3ac3d4d268e2523745cd96880a",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "04a5c9883bce2c4e89d22dd68af1bdc29b741bb456c01f8839b759a163e8e9d4",
        "aarch64-unknown-linux-musl": "715fbcfd8712c723947a020d0371c8a1a21f7531f2b696aeaed50ac23ba675c9",
        "arm-unknown-linux-gnueabi": "56d8b0df4b716a69aeefc06fbd859461938d54bcac37d7eea25b07764f6e3c5c",
        "arm-unknown-linux-gnueabihf": "d0a355524cf219351f15d8984c102f6425bc2c6c1e14af9282e2db60a997a5e0",
        "armv5te-unknown-linux-gnueabi": "547a6282ed5896dbac1df388a116301cfedf41fc579fa25caa57b3ee7e333e19",
        "armv5te-unknown-linux-musleabi": "578a0eee2513520e4195e09c0657b074cc9f7bff215507ddd905cfe7b15bab77",
        "armv7-unknown-linux-gnueabihf": "2c44994e0982bdb60c132c40b481b3c6ca83a131f09d568831553e3e29384130",
        "armv7-unknown-linux-musleabihf": "fc5c4ca757599caab8e93000becb9d57587088d32dab5c4f3b253f00ec3a2fd6",
        "i686-unknown-linux-gnu": "f568a3c307fad16528bf5accecfdce9e77b6ebda3302ae7a79588adc10d2bd29",
        "powerpc-unknown-linux-gnu": "28320c60a2fb42756d7a825f44d35c12100492c44770b0658056e4c468974f86",
        "x86_64-unknown-linux-gnu": "ba4e0b4a60c082e0b1cc6284a38bb144844c92f1aab09732cd1183658e08a6e7",
        "riscv64gc-unknown-linux-gnu": "b15965fec2297deff49412cc0e22a005db5ff710ca77187058c4907f1e7dd467",
        "thumbv7neon-unknown-linux-gnueabihf": "c9de934e22d796a4f542783d60b43b62a213a15014bbea02ca9f9520abfec872",
        "wasm32-unknown-unknown": "4763b575ecceab7637557527a91af6c5c36816a68e3f2de1e18518dd15a63bcd",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2734b3350e24e3559efadeca2b522ace",
        "arm-unknown-linux-gnueabi": "8fbd1982e9bfc35895c5c9cd150a8fae",
        "arm-unknown-linux-gnueabihf": "050ed05ee4d0c1aa7e0769c8b5b9bc84",
        "armv7-unknown-linux-gnueabihf": "02cf60bbd2cd3aa803844ea7ae7ad8ed",
        "i686-unknown-linux-gnu": "8a2455f745d117c431a56a21c7029f1c",
        "x86_64-unknown-linux-gnu": "02cc0dabb2f7ecd62a5f1bd38c5ea020",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0d4e2145fe184fd6069c3a67deb44cc5bdadee7a631e742a025a47e3ea774577",
        "arm-unknown-linux-gnueabi": "601d613c027cccc3ed295c057d5948fe57cbe75992419970d15dc04e9b083b6f",
        "arm-unknown-linux-gnueabihf": "5b79849c220f59a41f0949cd3b8fbf719200d3230b5922ae9b1c88e1f0860c42",
        "armv7-unknown-linux-gnueabihf": "f34a35f33fd922ffb5f9b40753c86159707449788dbb7fe43090dc030bc47cf1",
        "i686-unknown-linux-gnu": "81b884e76b8e3b45509c20874f93d993477c4db2131745c8bf61282c8e673d78",
        "x86_64-unknown-linux-gnu": "e133546ebb40974356cc82434e07f6a0ce15966d8b01898f97eab235c46883e8",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
