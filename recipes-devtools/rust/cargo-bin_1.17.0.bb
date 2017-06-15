
# Recipe for cargo 20170427
# This corresponds to rust release 1.17.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "29134fbf26d889e0f6fd684ca44d1e0f",
        "arm-unknown-linux-gnueabi": "629882a80e1b85d96ac34660812dd8d4",
        "arm-unknown-linux-gnueabihf": "9a48b1271b29996bd8364157bd5bbf7a",
        "armv7-unknown-linux-gnueabihf": "8c53a36d35e89067ad9fa1526c24c427",
        "i686-unknown-linux-gnu": "1ad24c241a2f5e3c4bf83855766fab35",
        "x86_64-unknown-linux-gnu": "d2cbab6378c1f60b483efa0f076a8f81",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4ed71b6d89359db8fba738039f8ba201542240c7396d9599fc3d51f49727ca36",
        "arm-unknown-linux-gnueabi": "8f5016105e4762401d10525fb0085601eaf36008b4c51570f54ee3205698b3d3",
        "arm-unknown-linux-gnueabihf": "ef9dea311cf963449994100a7608895611f89ab62b421b6cfa7f8ec9c2ad7f66",
        "armv7-unknown-linux-gnueabihf": "91abd44766a5169f5391c607b64fb47aca822ecfa953559a36d041b01ae3aeaa",
        "i686-unknown-linux-gnu": "fbc5a0614345dfb2b41e133bd821257906a839753a9aa4c4590cc9d658164e58",
        "x86_64-unknown-linux-gnu": "3601e95c968850230b137b849ff08a507e50d77ab584c779143a100f1843d8dd",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-04-27/cargo-0.18.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin (= 1.17.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
