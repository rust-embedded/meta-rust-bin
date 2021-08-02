
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4461b2f3ba9dbd2173c112b0afadb6ce",
        "aarch64-unknown-linux-musl": "c87e1020d84c5f919d95022145b8acdb",
        "arm-unknown-linux-gnueabi": "6f0a0b0274b82e5655954213c6d59817",
        "arm-unknown-linux-gnueabihf": "0d2e6a462575dfe4e7af625676601e9f",
        "armv5te-unknown-linux-gnueabi": "12c27eacb678fe70692e5424001b890f",
        "armv5te-unknown-linux-musleabi": "778ab6900fd3fd9e96de8e8696e1890a",
        "armv7-unknown-linux-gnueabihf": "24dd96e278fcb28f012e1be501db16e3",
        "armv7-unknown-linux-musleabihf": "779bc06bbbe907a68eed39cf6bf91363",
        "i686-unknown-linux-gnu": "35291926a33c3ae24edefde2cb1fc2be",
        "mips-unknown-linux-gnu": "92b5d2aaffa656683dd724a50368eecc",
        "mipsel-unknown-linux-gnu": "7c2a6669d16e4a15398bdcd86980aaad",
        "powerpc-unknown-linux-gnu": "d35337be941de8dc440fa7fd1202f209",
        "x86_64-unknown-linux-gnu": "c190b23f6521886297f594948498cb69",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2d90cd90734a2d057b2a4eeee36a72d96569fb5fff0ac1e22eeb5fab93e66848",
        "aarch64-unknown-linux-musl": "4c689f32444afa8faef2f7eb896b59f76827e9950f795988d626c9e4552e3d4b",
        "arm-unknown-linux-gnueabi": "39ea90c1646448a8f695d9a60c581f4aec6883fa4de60e594c7b50047d5c3007",
        "arm-unknown-linux-gnueabihf": "4e60c89d6397b4b3488107987896a414afd2737ba4c71002c0c41f9cdc189287",
        "armv5te-unknown-linux-gnueabi": "ac989bbd0518832008a5fe501a5262d2e833c899995b77159f03cd8e4ee79aff",
        "armv5te-unknown-linux-musleabi": "840a5c1250455aecb0d5967ef073fbfa3319bddc50557e350a4879b5e48f026c",
        "armv7-unknown-linux-gnueabihf": "d0b6021f4235d2b1c5f48a61c56a4ffe9c49e85ce141e2f26a11e4cb5f1b9671",
        "armv7-unknown-linux-musleabihf": "8c072f8ff1db0c249d88fda254418488ead4aa9b870047d1673a4a8e981aed6e",
        "i686-unknown-linux-gnu": "f3ac7342c7231b2c5f2f8ec8980e338db1af07b779ca01b12f43df88d10bf79b",
        "mips-unknown-linux-gnu": "22a01d615bae64219fd6abd7724a3b2e0eaa0161be8a175019c2df28a2992d8b",
        "mipsel-unknown-linux-gnu": "b11cf8465c97cf178fcac48611180e14b53a88ff2da3602ab02889cc4df745f7",
        "powerpc-unknown-linux-gnu": "8804b51911cd78689f72e8e26298931dad1c087a83ba4c10e955d7cc67f3543f",
        "x86_64-unknown-linux-gnu": "487c51ac97e7f7deceae904b70e9bb031574dbeefe07b39b24e3fb00740962eb",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e5f9faa374ec5e4602fa279b3dc4292d",
        "arm-unknown-linux-gnueabi": "c33ce123dbed88e65d247156667b2b3c",
        "arm-unknown-linux-gnueabihf": "a29ab77ed0aa5c293d57537d391940b9",
        "armv7-unknown-linux-gnueabihf": "499fa7b8ae46c5cb32517f44c0eb8419",
        "i686-unknown-linux-gnu": "59dbbd0b7d8c660051a77f21504a546e",
        "x86_64-unknown-linux-gnu": "60d6233a33e5b11659dfa5ac91f6cdf0",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "595e8db56e68247ee3caf29f6a3d3c72d7955ed45f1291e7e596d63923427a86",
        "arm-unknown-linux-gnueabi": "8717bb046e9d017efbd0dbd89482d8779dd334f78ae2fd3e3d7164f951bcb019",
        "arm-unknown-linux-gnueabihf": "df05932eb41f5f706ad04a4f7283ac87b3914860863fdbdfca45c3cb2f1e03f2",
        "armv7-unknown-linux-gnueabihf": "445ed0a100887ad7e3299a0dc21c1f0a45d9e3048089f0ef0c645da92ed70e45",
        "i686-unknown-linux-gnu": "b0b102cd5a3b7218a3a0fc24517ad274597afee3aa86a6b62e9315366d9c2745",
        "x86_64-unknown-linux-gnu": "cd4c1c5db3b8ca3f76fac42d209e83640794eb8c2bbfb71b71e5f93b584d159c",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
