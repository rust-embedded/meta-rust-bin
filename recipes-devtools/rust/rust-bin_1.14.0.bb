
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        bb.fatal("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "92d0c14a0437393114c0f316abdf5656",
        "arm-unknown-linux-gnueabi": "cc67391295d0d8e73eb8f3134605a458",
        "arm-unknown-linux-gnueabihf": "470ff0289f4e8d2e5d52d328c91d2696",
        "armv7-unknown-linux-gnueabihf": "c5bc31f702e182f1965bdb86d65050a4",
        "i686-unknown-linux-gnu": "449ba6ba9d1557bf9bb9629de19fc369",
        "mips-unknown-linux-gnu": "3540ffadea0f6733914ebaf80d3e6d23",
        "mipsel-unknown-linux-gnu": "3541b6e9e89a0caac97ecaa19bf10ab5",
        "powerpc-unknown-linux-gnu": "ebb4c13b5010457f91e591ae5dfbf7c4",
        "x86_64-unknown-linux-gnu": "518e492fc3d50d8c678056eb788bd0e7",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "446db79f57fa8455fcc5a4426ead7f338ee6043b0acf6e807738b4fd7a7b6d05",
        "arm-unknown-linux-gnueabi": "58c20703d88e7bf206a5cf9f83624f0af53877d4b2d8f92d962d75aab79f6b40",
        "arm-unknown-linux-gnueabihf": "6f401469c663d31af6b4e0132d88a2f62fcd4a97067ce889cce11743dc9df4ee",
        "armv7-unknown-linux-gnueabihf": "2609634fd9adb1738bd91a9f4a03dac9bbab2944b2ad80bafc06b5c54790e9ed",
        "i686-unknown-linux-gnu": "e00336479dcaa6f2d6ba85b84f1ee42f02bd2c01cbb51850abf2542645f66911",
        "mips-unknown-linux-gnu": "8ded43151117140629fd712cdcf33fc5c7c5e96d1aca03695753e9783f9f7632",
        "mipsel-unknown-linux-gnu": "bd1a3cee2d9fc496075c6597b142771d9088128d587a42c77381528b7147e528",
        "powerpc-unknown-linux-gnu": "c8985bfb8bae69e72c5a6f0538b2990ebf224011d4a2e31cd4513dd16e5263ed",
        "x86_64-unknown-linux-gnu": "3a609bfe9572c742d71199faad578ee76abe9067cd8df698bda6e3ef5caf6ec4",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f389433865ee086d2a4bc2d18d3ab44a",
        "arm-unknown-linux-gnueabi": "1501603e0544a6dbb98e0693c7cdbf87",
        "arm-unknown-linux-gnueabihf": "e4e11d7de02096031aae7aa2fce60e72",
        "armv7-unknown-linux-gnueabihf": "e0bb7bffb7d869cc18d112b24b1eac5c",
        "i686-unknown-linux-gnu": "aa62d4b70cfaf785ff7b1c72cb94b9a2",
        "x86_64-unknown-linux-gnu": "f178d9d6aad0f87c451f4b2f93170633",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "f17031b438ec2fa38c57e4620a8332d7501f359110020ae75ab4adbebed6c118",
        "arm-unknown-linux-gnueabi": "f80a2451aaf1757d463c914b98290a0bf171b762fa03e52efcdd6baccfbb41ae",
        "arm-unknown-linux-gnueabihf": "bfed3fcbc3f038e3bfeb89e105f29b8c0e6d313713f84b8710ee51cf8bbe625b",
        "armv7-unknown-linux-gnueabihf": "df7606d1ed1d18d8b44812aeecda509879390975a2788a577f556fbad6047efe",
        "i686-unknown-linux-gnu": "52b7df5025c302d82f0572fbdc74309334bad36e796c4a2fdf934abe2e5e23ac",
        "x86_64-unknown-linux-gnu": "0eeec4211aa872f24c220200a0c2b095bbfc9c0f737c1c5df2555967c8f36787",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=43e1f1fb9c0ee3af66693d8c4fecafa8"

include rust-bin.inc
