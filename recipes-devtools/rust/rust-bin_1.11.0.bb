
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9e86de3b4138eecd37e378e6ad45b9c9",
        "arm-unknown-linux-gnueabi": "1b46b6d0aa606b61536b15f71345e10e",
        "arm-unknown-linux-gnueabihf": "00bd0d4347808e5ddaeec235a2c16f42",
        "armv7-unknown-linux-gnueabihf": "919a3ffcf08937325171a049992ec2c4",
        "i686-unknown-linux-gnu": "9ba1f6934d5f09937c9ebaf68261ff10",
        "mips-unknown-linux-gnu": "b90ae32b2681b07301d011ce17067376",
        "mipsel-unknown-linux-gnu": "d68a0b100c1d7e84397b92fcdd5a0c08",
        "powerpc-unknown-linux-gnu": "fabcfe72cba56da32696f08fea3cde4b",
        "x86_64-unknown-linux-gnu": "04497872d0ed1eb7efa8fefcfce71ab4",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5bc07fe375913dee02dc4dba1d2388e6f35166f24ba69b0568d560f335689f31",
        "arm-unknown-linux-gnueabi": "07ba1d4b75beba6f388441adddb12eba6480eba6c723d8703ba5dd8fa68443b5",
        "arm-unknown-linux-gnueabihf": "7e9b5bf8488676c454b92a3af7853555792dda4e474988adbd1fab89cc981e5d",
        "armv7-unknown-linux-gnueabihf": "eb1ebee507f8e2e63728558de8a8c8ec830dfd76359704a93eb2785ab4500c55",
        "i686-unknown-linux-gnu": "eb131603b5cbb10841b408eb2075b727d0f913facad41f1f5f1c39287c2b2c75",
        "mips-unknown-linux-gnu": "830667f2dfbbc6c5ed1c7ca9adfb6687e00e49ae085b22d63a9d1a55329cae8d",
        "mipsel-unknown-linux-gnu": "57be30f7bb793ec82de5f1b6a823d04e61dcdf18a4e7bd045c1333196448f987",
        "powerpc-unknown-linux-gnu": "c044c8b1483e774f2fc13c98e961143ec3bc0a7ade0ae0fd25827b3eeba97979",
        "x86_64-unknown-linux-gnu": "893a53b5f78ec9eb7ac4ad3b3bd375d2ddad8ca1687ed5867621ec157eddbea5",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2beae9a9bd441553e979e10464829a97",
        "arm-unknown-linux-gnueabi": "8249b5fe2291e47e8458acb989b38688",
        "arm-unknown-linux-gnueabihf": "7d76432d54649ff6efcaae44cfd0552b",
        "armv7-unknown-linux-gnueabihf": "7386f1fae4b9e9ef95e281ea27f1446a",
        "i686-unknown-linux-gnu": "932c698c242238a68530c2c15fd0b810",
        "x86_64-unknown-linux-gnu": "b83d7a1a90c2d80bef97a518022948c8",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "49d3977bc4d3d868ae0632b860308a43975255a81a92d26c3a40569b4186bdc1",
        "arm-unknown-linux-gnueabi": "b6224b50293d31a88315c905fed9e50012831bf14d92db654b8137b023eadc37",
        "arm-unknown-linux-gnueabihf": "896a7529b452dcc8ef7f3cbf0afb6d3e92868a762e2fbb234fe1b788cc8386cd",
        "armv7-unknown-linux-gnueabihf": "c7d68a45536883c3cb0cb6e01ae47e403b0de0165050f0a6cf7a454a9f62440b",
        "i686-unknown-linux-gnu": "16273afc0540b4353e54faab6b73e16310ae724f3dc941938bf09129b08bed03",
        "x86_64-unknown-linux-gnu": "e9d27a72900da33c1bbd0e59dd42fd6414c6bcdfa33593fb7c7360068406394a",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
