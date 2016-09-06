def rust_target(d, spec_type):
    '''
    Convert BitBake system specs into Rust target.
    `spec_type` is one of BUILD, TARGET, or HOST
    '''
    spec_type = spec_type.upper()

    arch = d.getVar('%s_ARCH' % spec_type, True)
    os = d.getVar('%s_OS' % spec_type, True)

    # Sometimes bitbake mixes the calling convention into the OS, sometimes it
    # doesn't... let's just take the first part
    os = os.split('-')[0]

    # The bitbake vendor won't ever match the Rust specs
    vendor = "unknown"

    # Only GNU calling convention supported for now, but MUSL is a distinct
    # future possibility.
    callconvention = "gnu"

    # TUNE_FEATURES are always only for the TARGET
    if spec_type == "TARGET":
        tune = d.getVar("TUNE_FEATURES", True).split()
    else:
        tune = []

    if not os == 'linux':
        bb.fatal("Unsupported OS: %s. Only Linux is supported." % os)

    if arch in ["i386", "i486", "i686", "i786", "x86"]:
        arch = "i686"
    elif arch in ["x86_64", "x86-64", "x64", "amd64"]:
        arch = "x86_64"
    elif arch in ["xscale", "arm", "armv6l", "armv7l"]:
        # Rust requires NEON/VFP in order to build for armv7, else fall back to v6
        if all(x in tune for x in ["armv7a", "neon", "callconvention-hard"]):
            arch = "armv7"
            callconvention = "gnueabihf"
        else:
            arch = "arm"
            if "callconvention-hard" in tune:
                callconvention = "gnueabihf"
            else:
                callconvention = "gnueabi"
    elif arch in ["aarch64"]:
        arch = "aarch64"
    elif arch in ["ppc"]:
        arch = "powerpc"
    elif arch in ["ppc64"]:
        arch = "powerpc64"
    elif arch in ["ppc64le"]:
        arch = "powerpc64le"
    else:
        bb.fatal("Unknown architecture: %s" % arch)

    target = "%s-%s-%s-%s" % (arch, vendor, os, callconvention)

    return target

RUST_BASE_URI := "https://static.rust-lang.org"
