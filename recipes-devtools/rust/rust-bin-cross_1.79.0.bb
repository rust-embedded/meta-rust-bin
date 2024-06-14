
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "1a2f2c65e479417cdd3701b405a8ba12",
        "aarch64-unknown-linux-musl": "94efb02333dbba1946a92efd37c53e2b",
        "arm-unknown-linux-gnueabi": "228d4cef5702e6a66e942fcd22649c76",
        "arm-unknown-linux-gnueabihf": "6445ea305bdd060973c69a5c5fe3dddb",
        "armv5te-unknown-linux-gnueabi": "4c7d6fa1c6553d8a9e332193760dbe79",
        "armv5te-unknown-linux-musleabi": "29a57843d360c06807a7c6ca457ace9b",
        "armv7-unknown-linux-gnueabihf": "1fa9d5b5098027422417bb40398c88d6",
        "armv7-unknown-linux-musleabihf": "2f22363122f8ef320f1bea8b8714cbb4",
        "i686-unknown-linux-gnu": "c8f5ad57f671439da143895e2203d3ed",
        "powerpc-unknown-linux-gnu": "a180a1e4357e5d9b4dd674204ef377c2",
        "x86_64-unknown-linux-gnu": "489611626b01cf4f882df76e3cfe7306",
        "riscv64gc-unknown-linux-gnu": "9c207fd91907f498ae81c5bf23c48c69",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e4597274ffbad0b3196dbab9f8badbdf33d4407a07e3f577c074cc90f95c0ca5",
        "aarch64-unknown-linux-musl": "8c65e465f3f82ae55fc2f43ac58de7d972497bc839829e0119784be98faa8431",
        "arm-unknown-linux-gnueabi": "c2176c83c3678662ba9df439b4159e031829471a575680fab5f0f0c4530de322",
        "arm-unknown-linux-gnueabihf": "78b12ddf1a08652654069a94ce435c6c933047d6a4dd679a973a85dfb4e53747",
        "armv5te-unknown-linux-gnueabi": "e6c038d813cb13e00e83e84c71b6ac5f456fb375b2ac40eae28539dc71951bac",
        "armv5te-unknown-linux-musleabi": "abcc6889da2ecf5f241683938e204b9b2e9dd972c43e4e6db58a50a19243f188",
        "armv7-unknown-linux-gnueabihf": "2d1d15bae7122bae44a5636512594332851b74c6a9a7ad39ad5d07ffad4f74a8",
        "armv7-unknown-linux-musleabihf": "d810d962137f3392ce3509ba8aedf03023282fbfa890ade2df5f4df1230dbb51",
        "i686-unknown-linux-gnu": "325728d4e7c941467171a51e5d2ad10c18e69c09c5495dc8f3e104ff0ed67de5",
        "powerpc-unknown-linux-gnu": "0ba4060db997a1b6bb2a06364a9e20d6c68b22c16d5e862a3673d2f447f19b80",
        "x86_64-unknown-linux-gnu": "037906a372ec87f8fd7ab45efa645bcc4fbf981f534e31534c6f16ce628fddb6",
        "riscv64gc-unknown-linux-gnu": "8578f69dff411c9afd0b1a993ac35641b9741dd901fcd680eac2789287f6c551",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b81cd7affda20a7fc92de69d53e23f28",
        "arm-unknown-linux-gnueabi": "05e03537ec1bdc5c12d23e68584c06ff",
        "arm-unknown-linux-gnueabihf": "c6bbd549df90142ef97f10fc739886da",
        "armv7-unknown-linux-gnueabihf": "0301b40b375c0680b2c8e04ae48a49ae",
        "i686-unknown-linux-gnu": "e1059f0fbc553a8f3252f72f9123f81d",
        "x86_64-unknown-linux-gnu": "a0cac6f2de82fbf573c7706a766466e6",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "d091d87ccded2221ce0ae4aaf7b3b254674fd29dd72f3d4137033c07faf575bf",
        "arm-unknown-linux-gnueabi": "cc157f6ecd1e32eb20056b230e582ee1fa990fab7cd052350442b153a9b2baea",
        "arm-unknown-linux-gnueabihf": "f40a48b947f7154d22d5eeb46314f22c568d051fb2c6cc1aad655f7ca0aac4a8",
        "armv7-unknown-linux-gnueabihf": "51f90e98ec60ead65dd0ba90433d3f7d8db5c5d30e6ca7d7dae965c0770d1fa2",
        "i686-unknown-linux-gnu": "119e21a248e6a81300dcd9c0c3fd78dbac12348a672855e73189009351d5fd59",
        "x86_64-unknown-linux-gnu": "36e59d225cc4c35f4d63c276c94a5e5cba5c8083275c3990ae7cae6842f9109f",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
