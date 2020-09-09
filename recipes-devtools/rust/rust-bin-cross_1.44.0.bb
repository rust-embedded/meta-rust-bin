
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "af4efc98c16042cf380a61110478a611",
        "aarch64-unknown-linux-musl": "d17cf02b69e9bdd282c2437d3d35bb4a",
        "arm-unknown-linux-gnueabi": "2836d01361adc9861539944b14dcfa97",
        "arm-unknown-linux-gnueabihf": "cfc2aaa19c12f4e07e73b92efdf14650",
        "armv5te-unknown-linux-gnueabi": "eda6a1f7d28df5f7bec13ffd314fb3a9",
        "armv5te-unknown-linux-musleabi": "ea96a06c9544f90c821bce6657f28896",
        "armv7-unknown-linux-gnueabihf": "e9989a37ee9efc75ae39f081de467ed6",
        "armv7-unknown-linux-musleabihf": "bee747613c41cf5af2c2f720bf6f6294",
        "i686-unknown-linux-gnu": "50d5de81cdf99395613253373b0cedbd",
        "mips-unknown-linux-gnu": "236b16e118858668a564d986b1c257e7",
        "mipsel-unknown-linux-gnu": "25c7b48bf262654fbe094885529b3b0b",
        "powerpc-unknown-linux-gnu": "de3dd66cddbf0c9a58d71c9e0519b43e",
        "x86_64-unknown-linux-gnu": "3800cf281b8bb9bb083614c2da7f5bfe",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "fafb49cc7264a8621c17e8954ec2e0a78e097395b285edb5c1639c61ffb8142c",
        "aarch64-unknown-linux-musl": "b32ccb5a8bf7c3ba9e7295e2986acad87c0eab9eff98a98f4dd3eaa4c8b74405",
        "arm-unknown-linux-gnueabi": "2f39439cae7401f2485497587344d3677871a34753acb62fc1dd0ffef27ee8b7",
        "arm-unknown-linux-gnueabihf": "fe4624c747be38da181890a69e1f93d899a354e9fb720a165c807051e4269745",
        "armv5te-unknown-linux-gnueabi": "60e20427afe83615dd968380b9155e629aa457821fd05d18ea70aaa8ad1fc4ad",
        "armv5te-unknown-linux-musleabi": "f8a023be4168f8f932f809af10ba53c76c71984174286689ce35076f861fab68",
        "armv7-unknown-linux-gnueabihf": "c092bee7f055c2b99ecb89de9a2ae03a1c9db896f9772ca731c5da0769a5db7c",
        "armv7-unknown-linux-musleabihf": "999b4b9688584353b37e5024a0fa4515d00addf1c37c6efa2910d0f3d42a856d",
        "i686-unknown-linux-gnu": "43c9cfe32d1b7afba08fa6af10d317874c91ef1407dea0ec03bbe2c776c77841",
        "mips-unknown-linux-gnu": "a9f86466bbcc49ebf67cbdbd8b9a827a153f18b0f192ba12d008dfd30b7ea2a6",
        "mipsel-unknown-linux-gnu": "a2be5a8f353db2232e5091755478406f949e630e3fb2111b70763d39acec9020",
        "powerpc-unknown-linux-gnu": "a0aeecbe6e4726f3ddb89eb9e68ff5e13f235ac54b0f6eee777497a5baa7a50e",
        "x86_64-unknown-linux-gnu": "3b7a4eede0ca550c256ca6721877de0154c27e71196d8b9a980a480682ead0aa",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5e3d01da6b4ad23c874e200a65bac720",
        "arm-unknown-linux-gnueabi": "c9a339077085129e3507a9f5de06ac30",
        "arm-unknown-linux-gnueabihf": "18794fa0324b188a3fbdad7e1c0557d7",
        "armv7-unknown-linux-gnueabihf": "86e4f2b4ad5a4c38741624f8d8a4ca01",
        "i686-unknown-linux-gnu": "3a1a42b4f151bd751d7c041b40da36f2",
        "x86_64-unknown-linux-gnu": "1419e59d31d5adf98c0c86610e723110",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b0fc4cee7119c10f79fe2701ca0d19ab738bd20954352ae5b1dcc4c6f432779a",
        "arm-unknown-linux-gnueabi": "f14a3105b62e4103b7ef695d564126b71afc5b0b49bb359681a78f3145d38050",
        "arm-unknown-linux-gnueabihf": "cf55cc2764ee077eaf685b31433cf609addb63704ce4473234b9996418fb523a",
        "armv7-unknown-linux-gnueabihf": "74f0367f392fcd1cc4363c894b315fa2b5f882f8b688e9f0a101cc9605c1d6a0",
        "i686-unknown-linux-gnu": "c1711a6f0651cf51ae0dcdba8c28e489ddbf522b8a23a425659291022bced2f6",
        "x86_64-unknown-linux-gnu": "52671652e7045df0702d8f2e8af60bf6f20da3e3a5db1aa6022bf9545e914449",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
