DESCRIPTION = "Cargo build tool for Rust (pre-compiled binary version)"
HOMEPAGE = "https://rust-lang.org"
LICENSE = "Apache-2.0 | MIT"
SECTION = "devel"

inherit rust-common

CARGO_HOST_TARGET = "${@rust_target(d, 'HOST')}"

S = "${WORKDIR}/cargo-nightly-${CARGO_HOST_TARGET}"

do_install() {
    ${S}/install.sh --destdir="${D}" --prefix="${prefix}"
    rm -f ${D}${prefix}/lib/rustlib/uninstall.sh
    rm -f ${D}${prefix}/lib/rustlib/install.log
    rm -f ${D}${prefix}/lib/rustlib/components
    rm -f ${D}${prefix}/lib/rustlib/rust-installer-version
}

python () {
    base_uri = d.getVar("RUST_BASE_URI", True)
    pv = d.getVar("PV", True)
    pv_uri = pv[0:4] + '-' + pv[4:6] + '-' + pv[6:8]
    target = d.getVar("CARGO_HOST_TARGET", True)
    cargo_uri = ("%s/cargo-dist/%s/cargo-nightly-%s.tar.gz;md5sum=%s;sha256sum=%s;downloadname=%s" %
                 (base_uri, pv_uri, target, cargo_md5(target), cargo_sha256(target),
                  d.getVar("PN", True) + "-" + pv + "-" + target + ".tar.gz"))
    src_uri = d.getVar("SRC_URI", True).split()
    d.setVar("SRC_URI", ' '.join(src_uri + [cargo_uri]))
}

BBCLASSEXTEND += "native nativesdk"

FILES_${PN} += "/usr/lib/rustlib/manifest-cargo /usr/etc/bash_completion.d /usr/share/zsh/site-functions/_cargo"

INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"
