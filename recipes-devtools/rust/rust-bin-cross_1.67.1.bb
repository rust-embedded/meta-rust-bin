
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b27fd774ccd759f131993cae7a50a61e",
        "aarch64-unknown-linux-musl": "9338f6946122cc0b930994170da76981",
        "arm-unknown-linux-gnueabi": "fc95daea4a8e0a0977c313c32eb93daf",
        "arm-unknown-linux-gnueabihf": "1919b010b7fe6555e5bd7c8acdec721e",
        "armv5te-unknown-linux-gnueabi": "3c2075114d4b20d7ed7af1c68ac88edb",
        "armv5te-unknown-linux-musleabi": "d3afec1be337ef7f2b21b9c6fc49d571",
        "armv7-unknown-linux-gnueabihf": "594d5b87a42caab5db2d6c1f083c922f",
        "armv7-unknown-linux-musleabihf": "bb6013f4fabd0696f56d36345c5bf50e",
        "i686-unknown-linux-gnu": "3727ee658a79622ca7b8a30c60f7cd79",
        "mips-unknown-linux-gnu": "aab8a4259925f3cbe3e8adf8cac08678",
        "mipsel-unknown-linux-gnu": "9971cd62223276aacb2ae186b38471ea",
        "powerpc-unknown-linux-gnu": "c1b7f02188225c8b2ad2a15326c1300f",
        "x86_64-unknown-linux-gnu": "453d6a64eaf9b7e2a67a84911949fc03",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "19f3afbe43c7e041b8b5c0143101d3ede92f73f720709ef1578ad5d259ad6181",
        "aarch64-unknown-linux-musl": "b34e7728ea06ffccee03ec2334a57cf2445d479bd46bb846992d5bb9c1d72873",
        "arm-unknown-linux-gnueabi": "26e290910b2936bfc800f9f7e9ffd81c4733fdf52b117ee42ce7def70105b87e",
        "arm-unknown-linux-gnueabihf": "6eb6f4b915caa058f0b1fd6485283215ab628b6bd415abc343ccce054bf66131",
        "armv5te-unknown-linux-gnueabi": "c04a9cf0a41df4b170a1e29700597fb424ebbb33ff357e935bc361cc0fb88d98",
        "armv5te-unknown-linux-musleabi": "010020d3677e40aaacf3c624172e4a1615fada25556a43d3f648af4ad26f4c8c",
        "armv7-unknown-linux-gnueabihf": "711aba76f98f630b6b51ff4e72ad350382e325bf8c06a7f6a949f12c44dbe5ff",
        "armv7-unknown-linux-musleabihf": "420e1fbb2309b3083c892279b74d41f95462067a92b3e059e0cef0829b6edc6b",
        "i686-unknown-linux-gnu": "af9dabb8126b7dfaa00eefc2a04b304685109b33929c54b6f4ec0e523776a8ce",
        "mips-unknown-linux-gnu": "40fb4fca0af8fc3452fcd589e0c1b265f53816bc5e742a8033ca6545a5a69dab",
        "mipsel-unknown-linux-gnu": "940132da5f30f86a4cd87b1c9c37b4f9a6e0cebaaf5d74d187be72383f571a13",
        "powerpc-unknown-linux-gnu": "61d376eca89cf0a1b103824862651f7ad5abd7d4bc0f604f8f2fbb261cea8a85",
        "x86_64-unknown-linux-gnu": "31dfc19ae5821c0542975111574aa8cc7e0b2e1a95204f6cff7572f183524626",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "89e560811396a4cbe49a7af9960455c0",
        "arm-unknown-linux-gnueabi": "b8896ee0a34fa7fc0177062f169fe567",
        "arm-unknown-linux-gnueabihf": "17261caddbdd92c9e00258d63635b7c1",
        "armv7-unknown-linux-gnueabihf": "e0c79f254212a41b68001793b1cece06",
        "i686-unknown-linux-gnu": "4bd893c93a3b9b03917755d331c4b3fb",
        "x86_64-unknown-linux-gnu": "7a357021c1513af5343aeb428939329c",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "accb1afa2674730b69a762f79b4f71bbb5211c4f5b022b115d8e034775dba5ad",
        "arm-unknown-linux-gnueabi": "340e21d21078a91e411c98043d4b618f155ceff77f542e7d7b0b0a9e77d5740e",
        "arm-unknown-linux-gnueabihf": "c764753baf1707a8f82489c0ccaecffbba1d7d0c57f5b21c546c3d08aa66da45",
        "armv7-unknown-linux-gnueabihf": "db39bbfdc665a585c811d6235823b525d5b642803f4c66d7162e9bc22b79f1f1",
        "i686-unknown-linux-gnu": "4dd74d1fa7af449a4296f5308da95a5cce75142d0b79dd956bccba7ea2dc461b",
        "x86_64-unknown-linux-gnu": "11115542833004fff465fdc86994245b6446d988aebd42153203a6f9c3aeccef",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
