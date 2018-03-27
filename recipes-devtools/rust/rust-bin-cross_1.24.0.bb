
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9e1db18dc4686e79ec6aabc29198ac9f",
        "arm-unknown-linux-gnueabi": "4c0633ed46b931820ca09d9ce3e6ec2b",
        "arm-unknown-linux-gnueabihf": "60421020fb09201c28c7ccd77cd4e3d1",
        "armv7-unknown-linux-gnueabihf": "aeed3afd353fb940cffde6d313a8634e",
        "i686-unknown-linux-gnu": "d7e33d9b7226bda2ef68302af86ad503",
        "mips-unknown-linux-gnu": "d1d7ccb9d7f7d3f990977c06b66ca2a1",
        "mipsel-unknown-linux-gnu": "36dd053017168840cbf23332f1edddb4",
        "powerpc-unknown-linux-gnu": "718242f9b691a7509eefc6eb4b736c2d",
        "x86_64-unknown-linux-gnu": "2dd480376768d227cd2925ff3c87d685",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4a2305f934c66b02cf3d903d21147a642a2a9f28872b9e1bbe14e2d54e19ab09",
        "arm-unknown-linux-gnueabi": "ae38ddb14da6e70f937749aefecefc02fdefb87f4a053496cd62ffbae75aae6e",
        "arm-unknown-linux-gnueabihf": "6f89414c6eddb8acd461f78274cff5a9496d7edf01524f733e4f8b766a08887f",
        "armv7-unknown-linux-gnueabihf": "2379cb0cd66fccbfaa4f208e99803086879cdd8b1aad4b875196a6bf9148db63",
        "i686-unknown-linux-gnu": "65197a0d01c5650f00fd5edfc427b7b5b33e2c8ea96ffb40924b819012646033",
        "mips-unknown-linux-gnu": "e92ca43cb62fae00b6ea22d70860d633ba90e68e04efcf550778d064299e7639",
        "mipsel-unknown-linux-gnu": "7bfae424527bc79de1e54c482f74b795724171d6dfc26c82f9f0ab8b53a8b143",
        "powerpc-unknown-linux-gnu": "20e1d43ef0930b5a2b83f302d0d3bb7a1002b391acf66d949524c7db6bfcb5e7",
        "x86_64-unknown-linux-gnu": "11f2a4fb8a7474e22dce61893b721dc54d9090bc7c784d17366a9a27541765ad",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "6b855282796f4601556143f4eba477e6",
        "arm-unknown-linux-gnueabi": "f32f60683990bd3978aa284d69a4f7b9",
        "arm-unknown-linux-gnueabihf": "63bd931cf1f3d9d88bce8daacbdf2426",
        "armv7-unknown-linux-gnueabihf": "893d674099e6fb58a4f92b71825b765b",
        "i686-unknown-linux-gnu": "c0a641b8dd8e96787169b35c9c1c2903",
        "x86_64-unknown-linux-gnu": "2e35e45653015fd85f65e9fc1e2f8270",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "85390530d51822935bc8f09f05b5273642edc82db2cb38ceb8037b43adedbae8",
        "arm-unknown-linux-gnueabi": "597b0e50d48e1784b0a943f7ba7168fa86b290127dd4305b454f23232691db30",
        "arm-unknown-linux-gnueabihf": "b3a4b0cf43a7cdbc604f6553afac871592e6a34559b98f145520011e0e44c463",
        "armv7-unknown-linux-gnueabihf": "e120d1fcc876850ab2b674f0cb3f3e989de9e735d37f6de4a3b5d562a8f8bbea",
        "i686-unknown-linux-gnu": "6b7b6b3608648a8106fee51463c4fc73399dcf8a0657431e66734a7f6a0d4305",
        "x86_64-unknown-linux-gnu": "229fecc14e725d5dc2ce264925b362232649813cc436c51fab8ea376831f8d77",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c709a09d1b062d9a908e3631c1e1cdf5"

require rust-bin-cross.inc
