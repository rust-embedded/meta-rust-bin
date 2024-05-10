
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c7aed8c93a2e1f123d4a577f51d39c90",
        "aarch64-unknown-linux-musl": "3356681fd59ad10c8c0ab546d59ccf99",
        "arm-unknown-linux-gnueabi": "2164ee0bc36327baf8c49ef039981d85",
        "arm-unknown-linux-gnueabihf": "ce1e2aea1cfa6df849e5373b75372f2b",
        "armv5te-unknown-linux-gnueabi": "c412959b22a2cb826839354e88464420",
        "armv5te-unknown-linux-musleabi": "2ca9efc9b57581d7f09f4e58fe12c4d8",
        "armv7-unknown-linux-gnueabihf": "5dc306d424327c09a95ffb6d49239514",
        "armv7-unknown-linux-musleabihf": "55b187e789829bff81eea24de6076e10",
        "i686-unknown-linux-gnu": "067e33e7d9f54fc3736c51f98fb42969",
        "mips-unknown-linux-gnu": "bdb2339c981e1122ebb35dd6f6737014",
        "mipsel-unknown-linux-gnu": "43b525a9e26870ac8129ac3a4ea99c27",
        "powerpc-unknown-linux-gnu": "d57ff6baae4cc62ef99e5ed35c5efc1d",
        "x86_64-unknown-linux-gnu": "66cdd65c8cedf15b3782334c304dbc4e",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "88572949b25b9c91e90507276a15a1c805548e444284ef8848a08a2897a806d6",
        "aarch64-unknown-linux-musl": "7ef13898cfb19fb75125c6ca7392cdf1fce1c54f20c205d353f2d3763e5f7257",
        "arm-unknown-linux-gnueabi": "f9f11a2e377be57974b6fd77c1948da2aa906504fd70ea25b41624e79e363326",
        "arm-unknown-linux-gnueabihf": "15ee6917eef20f095ac06d436af0b02f207d455ac13525430daf6854c8b73a7a",
        "armv5te-unknown-linux-gnueabi": "233d7b8375ab73233b0af69e89d5ed6456b0edaf6c4da1f29684c4bf5cb215ae",
        "armv5te-unknown-linux-musleabi": "fb896cec2801c90541488f80963f37eace4a1d0923ab7d7db7990f48dd80b3ad",
        "armv7-unknown-linux-gnueabihf": "6b5df36c1d28f64208de66384547bd3489a1bc1041ea17901530a758e558dd14",
        "armv7-unknown-linux-musleabihf": "545cf1613d8ad4efd0d6c7cde21c2d15d1c8eca3e464d9f14db01323bb0220b5",
        "i686-unknown-linux-gnu": "a5d4dc0317406c587e027f2586b77c5841fab5226716f51a441ac63a0acf3d0e",
        "mips-unknown-linux-gnu": "ca6ec963222492215c3e490ef6d6d719074ed81e6a516b889c13b3fa5e6dceb5",
        "mipsel-unknown-linux-gnu": "880d1cdc6d7360ea0adf45b37a7ca88a31175ebf5d819b7cd26606edd42250c2",
        "powerpc-unknown-linux-gnu": "e5d4668148c6a72bc64daeff089c1c258371b4ea2ee5e3691c84f202f70a7a98",
        "x86_64-unknown-linux-gnu": "2bbcfba62ad2d2cf05c53d91c578e5cce766d5308cd49a1e425139470282865e",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "476829c0b5a2cbe83cf207e36f483ef3",
        "arm-unknown-linux-gnueabi": "efebdcfbb9f14c456d6efb19e5a54cde",
        "arm-unknown-linux-gnueabihf": "a7b75ed71d1ed1147a7e81a11373e13c",
        "armv7-unknown-linux-gnueabihf": "2f3a58ae9d10735e5a20245ccfd74abf",
        "i686-unknown-linux-gnu": "832b291e6152bb9f02649211eeda1731",
        "x86_64-unknown-linux-gnu": "b5a094666e308918c2b9dfaca255b83b",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "c0931d12e28c330490aaa6ba68a3b30b1d69aa004e5d1d203a653910c88e1769",
        "arm-unknown-linux-gnueabi": "ae7181c6d0ea5852b9f38214e15ad78d8f92808e67048b3523130601c94e09ce",
        "arm-unknown-linux-gnueabihf": "ce5c3ae7b6a948aefb83bdecc7f78421b7e7b377e34f490f98df6fa120e97f84",
        "armv7-unknown-linux-gnueabihf": "f458b83bc6a863d43fb481254d7c13abe56c3ff7539ddc890fc041a5097c2c35",
        "i686-unknown-linux-gnu": "3d95bf5890772b883f590c73ce76030df3b5bc90e106cf8597cdfda83c8f229d",
        "x86_64-unknown-linux-gnu": "e3f557972600d26cb885d0ae34e0208722eec5a59cc364bfac68f5ca49536d90",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
