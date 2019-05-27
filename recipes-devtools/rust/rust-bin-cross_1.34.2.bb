
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b4833cbb4d56ca2e21bebafa92f6fe29",
        "arm-unknown-linux-gnueabi": "875f7a721fb2a6440ac390cb4426d07a",
        "arm-unknown-linux-gnueabihf": "e05665df5c50cc554beb8ac90355284d",
        "armv7-unknown-linux-gnueabihf": "9fd59ee9a00e9b8df88033ff68295e79",
        "i686-unknown-linux-gnu": "8ee160a2e1763ab45371dd50d18c50e2",
        "mips-unknown-linux-gnu": "057c35a9685419ba862b593f72e4f38b",
        "mipsel-unknown-linux-gnu": "7282751064a9cda449d2139e94c0723a",
        "powerpc-unknown-linux-gnu": "39e593f8f7a70c026a0e4f84df8228a7",
        "x86_64-unknown-linux-gnu": "77f724de6319193beead06c00f3f5efd",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "921545fc9cfa49f9f1d73764bfd49bf19059356ece3beaa7ae0546215e8d06c4",
        "arm-unknown-linux-gnueabi": "203789cd534196abfe95d64b68d3578fde240edac789fb55c0010e3afd73d6c8",
        "arm-unknown-linux-gnueabihf": "cec42e631bceef33d009606ac4d1f48d0b5a6cff8f087843c5857e05ff65ec4d",
        "armv7-unknown-linux-gnueabihf": "38e398aae478acd8e624f0e26bf8912cb0e323d0516d368f2cd3627f831a5b86",
        "i686-unknown-linux-gnu": "781bbdd39d90d14ec63b8c110e300299254650f50e2fd8c808a3a4125471905c",
        "mips-unknown-linux-gnu": "01959e7f5132e8da640a12c70a346b228496ced293af7d66af30abf5089043c6",
        "mipsel-unknown-linux-gnu": "14e962ce0a19a8d647948b594fa52d6c280113d38ee9f19848d3ad8a977f2095",
        "powerpc-unknown-linux-gnu": "a7a611a787af01f982826fe70f26ae2c119c742c8f3dbbad3f49b72f017ae028",
        "x86_64-unknown-linux-gnu": "904950e877759b32afa57e024298d7ed19c72db3fb94890057a3deb070021896",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "740923cb834baaae614887300275b990",
        "arm-unknown-linux-gnueabi": "382033477af184d35953852206795a0c",
        "arm-unknown-linux-gnueabihf": "8af4d1ffd8cbc5a119c1312bc9faea44",
        "armv7-unknown-linux-gnueabihf": "f6c7f9c0efcf9eea6dda1e1559f47c47",
        "i686-unknown-linux-gnu": "ef5897ccc13fa2e1b5bee2a201d2d1ac",
        "x86_64-unknown-linux-gnu": "f76f83120f1a3912ac39d94bd4cbc130",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "ed00299078a991cb8a2473f5292cad3378df59c4b762b0bdd3089bf2508a53f8",
        "arm-unknown-linux-gnueabi": "9bd24aff99eda252ecdfb401434554e4f7cf3854331d5ed886a1be2a87cc35b8",
        "arm-unknown-linux-gnueabihf": "0d030173edb7fecbcf32d8a18396fe712b6079e4264f34aaba1e2e6a975b04a6",
        "armv7-unknown-linux-gnueabihf": "eaf10f3424700b4dddf6503e296d2789e1e7d73f9b0316a6aa24b39067e2a18d",
        "i686-unknown-linux-gnu": "55947cdbc8f107b940b000c2269342ed49be20bb159692d3565abe174e4b5610",
        "x86_64-unknown-linux-gnu": "6feecd115bd2072a1109a4afbc320dd21d23a2bd1f2d99d5377757fbb9272fc8",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
