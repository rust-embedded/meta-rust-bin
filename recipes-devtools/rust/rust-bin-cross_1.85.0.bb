
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b0958ae203ea1ba3a5f660c012065992",
        "aarch64-unknown-linux-musl": "f7f0ef3d21f16bf0d8d3b1e5c6d056ba",
        "arm-unknown-linux-gnueabi": "8dd7a06931f3805c535845131da8b912",
        "arm-unknown-linux-gnueabihf": "4bcc61d8e37f9e6d00d78b20e7d1d056",
        "armv5te-unknown-linux-gnueabi": "c0278addd3783c57f790000cd2c56a3a",
        "armv5te-unknown-linux-musleabi": "aed4ab4052507c7b52802961c4097399",
        "armv7-unknown-linux-gnueabihf": "1c9378f168b243502c8bd5eb0d4e7d40",
        "armv7-unknown-linux-musleabihf": "6260d2bef8af29ca47da8403ab37c588",
        "i686-unknown-linux-gnu": "e7ff23590b7fabc13d79a63847459551",
        "powerpc-unknown-linux-gnu": "ad669b90abf45fa742901c05342053b9",
        "x86_64-unknown-linux-gnu": "31acd5f8bcec9e6063139c3bd5dcf752",
        "riscv64gc-unknown-linux-gnu": "fa0814fc1f69ad1f603ea927fdfacdbf",
        "thumbv7neon-unknown-linux-gnueabihf": "b74265dd4e7b849631b3a98b767117d7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "63f8c57c2433e5ac970a9512660b8ca86002699bad4de5a2287fc591a7091e49",
        "aarch64-unknown-linux-musl": "fcc4bbdd9bdc326dc5fd7fc573acbf5e4f9d5915d343c177188abe9098b4db8b",
        "arm-unknown-linux-gnueabi": "aee959e2659720d2a28d5c77e6a0f9048152b56f6469513d6a25d66a9bc9fc04",
        "arm-unknown-linux-gnueabihf": "3b4b3c2c3ae2b4ff81b4b44e7ba716c084875c8acfbcff69fa8a53d2e7b43733",
        "armv5te-unknown-linux-gnueabi": "cc04c55e9c27280d2eb253863bc3902b3b3277ee7a279ba2fd786a8af1c06a3b",
        "armv5te-unknown-linux-musleabi": "018370ccbafdc1496d307e31e6719b5f64fae14d0176fbed471b790333e0d681",
        "armv7-unknown-linux-gnueabihf": "5a6112409087db2a050a7cbc5e15e3c8356b191683061f6ea6dde085375b3c44",
        "armv7-unknown-linux-musleabihf": "4a99373bb8b2d408e7243620cb3e0c753ae7e51a3d8b2187e0369e2ebc54bfdc",
        "i686-unknown-linux-gnu": "b1b8e059ff51201f1b8266522dc79ff82ca45f3b7faed32baea8297a249a918d",
        "powerpc-unknown-linux-gnu": "4f57e4a736d1fe7d83f28f12a640db34c7547857e7c06656a0d2832af62cada1",
        "x86_64-unknown-linux-gnu": "b3ad21966023d24fac039385201dc4109a2f25e6f7a0a5b2a0910eccfdc0c4a9",
        "riscv64gc-unknown-linux-gnu": "663607262f7e4efd0220e672a677c34c25ec5c551d405b254a02ee914a1279f1",
        "thumbv7neon-unknown-linux-gnueabihf": "9f5a01fe547b452bcc722f5b7364ec43b9e24ba40cc568524c5714bea5495897",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3e1ca5a6f560fb1ae1e5dd09cad5e771",
        "arm-unknown-linux-gnueabi": "5ee526048e3e10ba83b8101536a59c95",
        "arm-unknown-linux-gnueabihf": "5e442dcc272d0dab5baed5d13893bea3",
        "armv7-unknown-linux-gnueabihf": "d82940713be04be22e006e2bbeabf1c0",
        "i686-unknown-linux-gnu": "7a7646463e41753c0f6e4b8fedd83369",
        "x86_64-unknown-linux-gnu": "6ee883a190bd533a0aa2bd407d7cdba7",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e54c03bc6c8d00f400e56137086f62a73dac1c531113c7824ceccef3e6fdc198",
        "arm-unknown-linux-gnueabi": "abbf7281fa1ce0731226a1f91638b87de7bda53eb0559881595599e9eb32bed7",
        "arm-unknown-linux-gnueabihf": "462351d8e58b0afb7444749081f4246c666654bf50e3eb8603568a52df56e74f",
        "armv7-unknown-linux-gnueabihf": "2025dc1acc1e9038f075db162a04ab5a70acf1f4d2710c8a7c35e6cbb10e1f35",
        "i686-unknown-linux-gnu": "937866c66863045dfe50424123e2ec8ede18a094bc4d170798f38113092d7ea1",
        "x86_64-unknown-linux-gnu": "bddacba2c4008d27d6beb486dc701f8e39d7ce073053749c4d2c56013b6d2999",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=9c0fae516fe8aaea2fb601db4800daf7"

require rust-bin-cross.inc
