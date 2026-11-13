
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4aa16bf38cd7e64e4c3a25886f1bfba9",
        "aarch64-unknown-linux-musl": "b9bbc1b0693a1e94f83427305fb807f6",
        "arm-unknown-linux-gnueabi": "aab6748afd9091b81efc6b9bd46cfd61",
        "arm-unknown-linux-gnueabihf": "1f2e0f004cd87b5cc283065d90dcf48a",
        "armv5te-unknown-linux-gnueabi": "465c9a6409da709b973cbe611e8431c2",
        "armv5te-unknown-linux-musleabi": "6eb9e5f6a1a64099b22923f377ca00f6",
        "armv7-unknown-linux-gnueabihf": "4882edc9b849896ed310a64a23fc3013",
        "armv7-unknown-linux-musleabihf": "997f45c49cbf2c26689d39dca437c75e",
        "i686-unknown-linux-gnu": "e067438fddd6ca101ab03883c25ab5cb",
        "powerpc-unknown-linux-gnu": "a0aa311cdd1e57b391a2d10a0fff989c",
        "x86_64-unknown-linux-gnu": "ae473adb15a96d0c2ea0aab8ed7ab00f",
        "riscv64gc-unknown-linux-gnu": "59de3684be4ed1ca6bdd9d3f0b669daf",
        "thumbv7neon-unknown-linux-gnueabihf": "71170416ccc99115365fe0b783bb3b78",
        "wasm32-unknown-unknown": "705623ad46bc0226fcb9416b2576e5fa",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "89b01323a6611c9382a401282fb66eb80f1f3241df3e139d3df41afbd2da314b",
        "aarch64-unknown-linux-musl": "5235fa80ea00db787e10a9220da69917e906d1c7734a20346b546300368b2b83",
        "arm-unknown-linux-gnueabi": "95180278f5679e1e2c39fb037bc8d9776bd0cd3fb64444282912e23b9a4bb2a4",
        "arm-unknown-linux-gnueabihf": "8703531e2b2983a777726c537a820c1965129ea4ef92264037cc0db691b9b624",
        "armv5te-unknown-linux-gnueabi": "83f12c3ff8bab4e252364707f731d1ebdad5c09bee2aec4e6b7a2cd5409f2d87",
        "armv5te-unknown-linux-musleabi": "85666d6a19135f87fefaa0daa204ed19653618a25ee55357305245d652cbbcf4",
        "armv7-unknown-linux-gnueabihf": "b694fd8fbc39951ae897f6fb1e8d86d7a4e05f8604508f65699cf32b21c4e7d1",
        "armv7-unknown-linux-musleabihf": "a8921870eb46f7d0b0de0177d7d784c8002d8373ef171bb92044b0c6e6ebb33a",
        "i686-unknown-linux-gnu": "c1f4f3f8dc7c650b78cb03f7228be2f70dc45b4175c97e205f7c5c5de21f8c41",
        "powerpc-unknown-linux-gnu": "3c29ac2511491d539ea2ed3b2f14c29d3261e1dedf478715f3e092c8ba90969f",
        "x86_64-unknown-linux-gnu": "61eb09d68b338e230d698716927bd4623049c9910ef4a4972e66d763d66ed9e1",
        "riscv64gc-unknown-linux-gnu": "4e293a523aa6ed50efced2c1015930d2fcb217696e856e18a4df21630d8b8ed0",
        "thumbv7neon-unknown-linux-gnueabihf": "127524b8555ec3f061e7608fd6d0e486564bb3f94d3588ba47496da11121f788",
        "wasm32-unknown-unknown": "895cc1555ca67b3a3bcc73814060a4213656a2007c3a46d7c772b3e8467ea066",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0e1cb51de3ca6d720317ee26594980fa",
        "arm-unknown-linux-gnueabi": "bda17a8f7b49f9ff288e7a73bcd36baf",
        "arm-unknown-linux-gnueabihf": "3f3cd033019dec2601e733d1fb137369",
        "armv7-unknown-linux-gnueabihf": "6747252e2d1be4ddcce30d841104cc32",
        "i686-unknown-linux-gnu": "b17e1ff3c8e84563434d2105192303b9",
        "x86_64-unknown-linux-gnu": "0e8fe4ffe5413908e428785e8a6891fb",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "7ccc960846f81e016086f1931dedadd837a3317da80e0114df68651145c0f43b",
        "arm-unknown-linux-gnueabi": "84b12b8b1614497adb88d5ba60b6d563bbfe2c3e9382f556bd826a6c78d3d113",
        "arm-unknown-linux-gnueabihf": "ef9f0f4721db7f6cea1ce6bba91abe23196039bc92a98d0a8bf731c146c49c1f",
        "armv7-unknown-linux-gnueabihf": "58b1288cde9746d005f3fe84dddfeb21dc60a6c372a6d1b283d2c6c7123d96c8",
        "i686-unknown-linux-gnu": "2fdf57fc69baba6cd02bbc044d56d0254f1e29207316dbefdf1789f3fb061d65",
        "x86_64-unknown-linux-gnu": "67b0e85ff4b3eee83c48b8ae1da10dd0bcd60b43d02cd0e7df78c59d19f6b960",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
