
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4d56ee288bfe514d75ac40e828cf512d",
        "aarch64-unknown-linux-musl": "8ae72f5f46b5d975f3f93cc30f29845a",
        "arm-unknown-linux-gnueabi": "d2d105c15e6a3e311bc5ab1f145b5550",
        "arm-unknown-linux-gnueabihf": "4796f8289b73dea5c611e70381bf77d3",
        "armv5te-unknown-linux-gnueabi": "9841bf4512effef717fcf4151566a77d",
        "armv5te-unknown-linux-musleabi": "2bf557031ee2bb108954baa3770e5e32",
        "armv7-unknown-linux-gnueabihf": "7877c494e83d281631421c30c996601a",
        "armv7-unknown-linux-musleabihf": "fa0572ab98679882146b8084cad4b1d0",
        "i686-unknown-linux-gnu": "019980c60ef0471f38028e42b9a3ff22",
        "powerpc-unknown-linux-gnu": "74c55473f6102937f76114db171c4748",
        "x86_64-unknown-linux-gnu": "a0435cb093bebdb2805507b835e8350a",
        "riscv64gc-unknown-linux-gnu": "e4309ef69ce67c0f9a08eae934b1992c",
        "thumbv7neon-unknown-linux-gnueabihf": "e0316b28b4f4689ac98f515e24aace8e",
        "wasm32-unknown-unknown": "372bf4fa457660e93a8aef5509277fd2",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a68e71b09f4e09f7071c650ec38ee1845ddfe66c46917c0ccf0b1636994b01c6",
        "aarch64-unknown-linux-musl": "03fd4be4c4a504cc7d14482b1f1563807b08dfb037f776526d58be7f5dca4b59",
        "arm-unknown-linux-gnueabi": "382d10cc35dcc9a2d45c40f8ab7256767a26316ac389bfeff10bb8a377425348",
        "arm-unknown-linux-gnueabihf": "300587db786165462a27ff9dacd47ff5909b0de4aacb53799c4e3e0821312ef3",
        "armv5te-unknown-linux-gnueabi": "3bd33dcd1a750219d0c66aca965cc903b553e3b0737273ebca03d57ec647fb0e",
        "armv5te-unknown-linux-musleabi": "8a54a68b59cd63dbecbf71364b3f58fe580145985812595bc5bdbe3c50ce02e7",
        "armv7-unknown-linux-gnueabihf": "3f03927f49a6cd086830bedcd8c0f4d755e6225dad27fe24475318a7d8db3421",
        "armv7-unknown-linux-musleabihf": "d0873f1a39cab1ab1c96ce8bfd9accfbddf85e38dfaf321d5705851d2d76a46a",
        "i686-unknown-linux-gnu": "f815d8fad4586cb93a4cd0d186c9fa2fd3af74d8cf6b1383bbb913ccc0086a05",
        "powerpc-unknown-linux-gnu": "691c50c614f35e70d8d470c16a2a67190b5bd20d5013d3ad7d45d65f93a72638",
        "x86_64-unknown-linux-gnu": "edbd20f8fc0a617f85ffb79fa6c22aa6def0e570de3f94be1a6e5ab1f77f763c",
        "riscv64gc-unknown-linux-gnu": "dcd25892fbe4b28857bd2d4753dd3e449ef7bcbf52ccece33646dfad5bd73b05",
        "thumbv7neon-unknown-linux-gnueabihf": "0bb9598190044a502630c53eeed5bfd7b04078d42309a3716cef0e810b0bda8e",
        "wasm32-unknown-unknown": "e9cef38014dddbe22495e5b5729949c032dea8b0a00d4ce8e9e53de311db6ff9",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "aa427317ec88041fbfaf107e9e137832",
        "arm-unknown-linux-gnueabi": "ca16fc71d12a5329d0e4dd14d6eeb213",
        "arm-unknown-linux-gnueabihf": "8d4d99fec4fe3f9fff89b7e3a76675f9",
        "armv7-unknown-linux-gnueabihf": "5a27be2618aa8cbd9b4ea9a855097b18",
        "i686-unknown-linux-gnu": "01df604d7da5e7bf40d0c95acb52d942",
        "x86_64-unknown-linux-gnu": "b81fac92d60347704feab79f2e55a789",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f488f7eced24d2fed2e4745f3dbccf1ffe24bfe02720e5415406195ceaf45f7a",
        "arm-unknown-linux-gnueabi": "c71495b99d0a7a3cb2461c1473f50a7c7af715c47fa496b61902f8915b304bba",
        "arm-unknown-linux-gnueabihf": "0f0952590a56982baa65507259dbbe54d59f7c0a5f37bc4f0e0a2b16e5c66839",
        "armv7-unknown-linux-gnueabihf": "73c361855d1652bf731fb9deffa81e17ef68b0fa960f5909e24749ce809a5e50",
        "i686-unknown-linux-gnu": "e61233f2bcde223b43fe93f1d23db6724bc16bde74f1cd84acff269f151cf654",
        "x86_64-unknown-linux-gnu": "fef749c4abb4b4bde5ebf773bec550003ce5b4410579cecd69a365e5c0c5106a",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
