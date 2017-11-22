
# Recipe for cargo 20170608
# This corresponds to rust release 1.18.0

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "3bc16cff0652bf2f8f8b3537353e63c3",
        "arm-unknown-linux-gnueabi": "5f38703bbc5ba27fa766214814afb236",
        "arm-unknown-linux-gnueabihf": "561e0f58edc0fe55a667e0a520ebc8a6",
        "armv7-unknown-linux-gnueabihf": "26ed4344d4141800ea0363ab85defdf0",
        "i686-unknown-linux-gnu": "44572d0a4e941cd10aa9b7bcec190696",
        "x86_64-unknown-linux-gnu": "e3cbae9515cb770454e661d8847f685d",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "cc84e1a0ceb3d6a6a0a29d1f2414f017f47dbbb56e1e7b08e237d89ce746ff51",
        "arm-unknown-linux-gnueabi": "fb45c16f807e546a1f997c1d3f9da5335bd1c04a96d85bcc4941fd78ddce0c5f",
        "arm-unknown-linux-gnueabihf": "ff3ef7adf2686a5174300660f851473d3db4c3d8c610cf7ce4cf2fa9c0455054",
        "armv7-unknown-linux-gnueabihf": "2cc893f86ef9109dcef3f679229a615fa8e81aaece558e437eb503240bb3688f",
        "i686-unknown-linux-gnu": "30ffc32615626b746cbdd2c34d79b3de8ae9889ae56ab33feed9c3a1b9c170fc",
        "x86_64-unknown-linux-gnu": "24d5e01b09ba0fb15c4b7ef4f527aca874ce2e0cebc3850fdc2535ac7e25b205",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2017-06-08/cargo-0.19.0-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin (= 1.18.0)"
LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
    file://LICENSE-MIT;md5=362255802eb5aa87810d12ddf3cfedb4 \
"

include cargo-bin.inc
