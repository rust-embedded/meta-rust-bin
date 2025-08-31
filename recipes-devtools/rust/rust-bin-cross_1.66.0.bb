
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "38657b331891c4a976a8842c9617051e",
        "aarch64-unknown-linux-musl": "a35494801e84f3981a55d482c8ea7e15",
        "arm-unknown-linux-gnueabi": "d308038faf6702f91425490652414971",
        "arm-unknown-linux-gnueabihf": "f6687013cb7515471e9636e26951d1a8",
        "armv5te-unknown-linux-gnueabi": "7a06fce089fee201a195baca880c42b7",
        "armv5te-unknown-linux-musleabi": "129bb6388829f368aee14094f87aa906",
        "armv7-unknown-linux-gnueabihf": "683a4d5967e382cdc07d27d56228c9ed",
        "armv7-unknown-linux-musleabihf": "4b5e67936bdaa7ed0fd159b693ed1007",
        "i686-unknown-linux-gnu": "0d2d21d2bfb222a4722aae6ef5147db6",
        "powerpc-unknown-linux-gnu": "baf39f7a39b65bca835445f81ccc3db2",
        "x86_64-unknown-linux-gnu": "e1df18014d62b5281fee762c8a3afce1",
        "riscv64gc-unknown-linux-gnu": "0404e5c555e609b76162d97c1b729b4c",
        "thumbv7neon-unknown-linux-gnueabihf": "adb6807b6248045ed39e8c28affe4fa2",
        "wasm32-unknown-unknown": "e48d071c18d1caea99574d6e9f8b6da9",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2518ec4539b3de01a47d26b737aa243eb515d2e512f1a2b3361699daa4acc7d6",
        "aarch64-unknown-linux-musl": "c60dfac48548a03ca9b923b543044d6843e571f6939aed45969d1c22bbf2c53c",
        "arm-unknown-linux-gnueabi": "5a60074176e10a7c194dca3a96e26222a8e66707b3f7c58dbad5a78187b1010a",
        "arm-unknown-linux-gnueabihf": "8e89264e1cc891f069b1b9afd8e3aaf66883b295c57d60c8dece6d61f15e8cce",
        "armv5te-unknown-linux-gnueabi": "e5b23bfbdf168e918f1cc13ebf149fcc011c5e6bf470677c2d66d04d5bf074da",
        "armv5te-unknown-linux-musleabi": "26ba1c104ee67cc5d864d5cceb31bee5592d55005bb3945c20beb9fe6b7be185",
        "armv7-unknown-linux-gnueabihf": "c88d163b38317d2e3d92925cbd5986a89a1f67b764435d805df84052705e0aad",
        "armv7-unknown-linux-musleabihf": "06518d7fe1439352785147f0553e6e99f83b3366aab566cb9112381008157798",
        "i686-unknown-linux-gnu": "4276bbe18b7570ba3069485faeee4930d52a795965443f073707ea8cc40c99c3",
        "powerpc-unknown-linux-gnu": "033305c6a9f543ee702060114577ecd5a7ba7316f2a7f48797f1296baace36b2",
        "x86_64-unknown-linux-gnu": "0449a5219eaf05c53a141ee664afcb46c75c78b6500d0b082b544baa72a78cbb",
        "riscv64gc-unknown-linux-gnu": "3b945928f8bd7542048ba3c8509a50c428e256779766e8dcbe4382426dd54a0d",
        "thumbv7neon-unknown-linux-gnueabihf": "458e8b12c7ccfeeebe978c8009a910b1117dffec434f2f37daab9ca25cc2222f",
        "wasm32-unknown-unknown": "df2c1a042ca4246181af9182d51d6c2921c2e5cbc536a160352ed019079c5474",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5a46dbc72fd0ada9836fb82bf0a35077",
        "arm-unknown-linux-gnueabi": "19d1254dcd6bb0da48eaee1546b4c74d",
        "arm-unknown-linux-gnueabihf": "4c7d61cc1676f9cb62eaaf706dffe376",
        "armv7-unknown-linux-gnueabihf": "e071ddcb3a2643675643019fdb3f0b7f",
        "i686-unknown-linux-gnu": "b7103a21a2b1e49aa2e9be42ce7c0d1f",
        "x86_64-unknown-linux-gnu": "f3f13b4f7a886648da9cd21c57513bf8",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e70475d2770a20bc290e233d0dbe871d802fa36ec2fbbc4a80d247febbc92048",
        "arm-unknown-linux-gnueabi": "aa9686bd1c5b6326ee22645b881782e04ef87f7aa60708764020f25ddae4799e",
        "arm-unknown-linux-gnueabihf": "7f2835075e5d820b61e6d13be01290b8f60492650b8a04d961765d0a61c8c978",
        "armv7-unknown-linux-gnueabihf": "9a8d86099be6e27dafe1ca7c8d2e1163745ee136a3f300021d40bc6ddbf31ce0",
        "i686-unknown-linux-gnu": "505865fe26c7fb750cc5627854ffaeb02fdcea9aa8c6719ecd1f233d7fcf3f43",
        "x86_64-unknown-linux-gnu": "1c749e7f5b5315977611a158da876589ec062bd07b6c96b73b756163e8a3d2ef",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=92289ed52a60b63ab715612ad2915603"

require rust-bin-cross.inc
