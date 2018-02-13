DESCRIPTION = "Rust compiler and standard libraries (pre-compiled binary version)"
HOMEPAGE = "https://rust-lang.org"
LICENSE = "Apache-2.0 | MIT"
SECTION = "devel"

inherit cross
inherit rust-common

# Required to link binaries
DEPENDS += "gcc-cross-${TARGET_ARCH}"

PN = "rust-bin-cross-${TARGET_ARCH}"

# Extra architectures to install standard library for. Must match one of the
# standard rust targets. The standard library for the default host and target
# will be installed automatically.
EXTRA_RUST_TARGETS ?= ""

RUST_BUILD_TARGET = "${@rust_target(d, 'BUILD')}"
RUST_TARGET_TARGET = "${@rust_target(d, 'TARGET')}"
RUST_ALL_TARGETS = "${RUST_BUILD_TARGET} ${RUST_TARGET_TARGET} ${EXTRA_RUST_TARGETS}"

S = "${WORKDIR}/rustc-${PV}-${RUST_BUILD_TARGET}"

SYSROOT_PREPROCESS_FUNCS = "rust_process_sysroot"
rust_process_sysroot() {
    sysroot_stage_dir ${D}${prefix}/bin ${SYSROOT_DESTDIR}${prefix}/bin
    sysroot_stage_dir ${D}${prefix}/lib ${SYSROOT_DESTDIR}${prefix}/lib
    rm -rf ${SYSROOT_DESTDIR}${prefix}/share
    rm -rf ${SYSROOT_DESTDIR}${prefix}/etc
}

# Stripping fails because of mixed arch types (host and target)
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

fakeroot do_install() {
    # Install rustc
    ${S}/install.sh --destdir="${D}" --prefix="${prefix}"

    # Install rust standard libraries
    cd ${WORKDIR}/rust-std
    for subdir in *; do
        $subdir/install.sh --destdir="${D}" --prefix="${prefix}"
    done

    # Remove components that will conflict with other installables
    rm -f ${D}${prefix}/lib/rustlib/uninstall.sh
    rm -f ${D}${prefix}/lib/rustlib/install.log
    rm -f ${D}${prefix}/lib/rustlib/components
    rm -f ${D}${prefix}/lib/rustlib/rust-installer-version
}

python () {
    pv = d.getVar("PV", True)
    base_uri = d.getVar("RUST_BASE_URI", True)
    targets = d.getVar("RUST_ALL_TARGETS", True).split()
    build_target = d.getVar("RUST_BUILD_TARGET", True)
    rustc_src_uri = ("%s/dist/rustc-%s-%s.tar.gz;md5sum=%s;sha256sum=%s" %
                     (base_uri, pv, build_target, rustc_md5(build_target), rustc_sha256(build_target)))
    std_src_uris = ["%s/dist/rust-std-${PV}-%s.tar.gz;md5sum=%s;sha256sum=%s;subdir=rust-std" %
                    (base_uri, target, rust_std_md5(target), rust_std_sha256(target)) for target in targets]
    src_uri = d.getVar("SRC_URI", True).split()
    d.setVar("SRC_URI", ' '.join(src_uri + [rustc_src_uri] + std_src_uris))
}
