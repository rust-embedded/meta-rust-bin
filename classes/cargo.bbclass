inherit rust-common

DEPENDS += "cargo-bin-cross-${TARGET_ARCH}"

# Move CARGO_HOME from default of ~/.cargo
export CARGO_HOME = "${WORKDIR}/cargo_home"

# If something fails while building, this might give useful information
export RUST_BACKTRACE = "1"

# Do build out-of-tree
B = "${WORKDIR}/target"
export CARGO_TARGET_DIR = "${B}"

RUST_TARGET = "${@rust_target(d, 'TARGET')}"
RUST_BUILD = "${@rust_target(d, 'BUILD')}"

# Additional flags passed directly to the "cargo build" invocation
EXTRA_CARGO_FLAGS ??= ""

# Space-separated list of features to enable
CARGO_FEATURES ??= ""

# Control the Cargo build type (debug or release)
CARGO_BUILD_TYPE ?= "--release"

CARGO_DEBUG_DIR = "${B}/${RUST_TARGET}/debug"
CARGO_RELEASE_DIR = "${B}/${RUST_TARGET}/release"
WRAPPER_DIR = "${WORKDIR}/wrappers"

CARGO_BUILD_FLAGS = "\
    --verbose \
    --manifest-path ${S}/Cargo.toml \
    --target=${RUST_TARGET} \
    ${CARGO_BUILD_TYPE} \
    ${@base_conditional('CARGO_FEATURES', '', '', '--features "${CARGO_FEATURES}"', d)} \
    ${EXTRA_CARGO_FLAGS} \
"

create_cargo_config() {
    cat >${CARGO_HOME}/config << EOF
[target.${RUST_BUILD}]
linker = "${WRAPPER_DIR}/linker-native-wrapper.sh"

[target.${RUST_TARGET}]
linker = "${WRAPPER_DIR}/linker-wrapper.sh"

[build]
rustflags = ["-C", "rpath"]

[profile.release]
debug = true
EOF
}

cargo_do_configure() {
    mkdir -p "${B}"
    mkdir -p "${CARGO_HOME}"
    mkdir -p "${WRAPPER_DIR}"

    # Yocto provides the C compiler in ${CC} but that includes options beyond
    # the compiler binary. cargo/rustc expect a single binary, so we put ${CC}
    # in a wrapper script.
    echo "#!/bin/sh" >"${WRAPPER_DIR}/cc-wrapper.sh"
    echo "${CC} \$@" >>"${WRAPPER_DIR}/cc-wrapper.sh"
    chmod +x "${WRAPPER_DIR}/cc-wrapper.sh"

    echo "#!/bin/sh" >"${WRAPPER_DIR}/cc-native-wrapper.sh"
    echo "${BUILD_CC} \$@" >>"${WRAPPER_DIR}/cc-native-wrapper.sh"
    chmod +x "${WRAPPER_DIR}/cc-native-wrapper.sh"

    echo "#!/bin/sh" >"${WRAPPER_DIR}/linker-wrapper.sh"
    echo "${CC} ${LDFLAGS} \$@" >>"${WRAPPER_DIR}/linker-wrapper.sh"
    chmod +x "${WRAPPER_DIR}/linker-wrapper.sh"

    echo "#!/bin/sh" >"${WRAPPER_DIR}/linker-native-wrapper.sh"
    echo "${BUILD_CC} ${BUILD_LDFLAGS} \$@" >>"${WRAPPER_DIR}/linker-native-wrapper.sh"
    chmod +x "${WRAPPER_DIR}/linker-native-wrapper.sh"

    # Create our global config in CARGO_HOME
    create_cargo_config
}

cargo_do_compile() {
    export TARGET_CC="${WRAPPER_DIR}/cc-wrapper.sh"
    export CC="${WRAPPER_DIR}/cc-native-wrapper.sh"
    export TARGET_LD="${WRAPPER_DIR}/ld-wrapper.sh"
    export LD="${WRAPPER_DIR}/ld-native-wrapper.sh"
    export PKG_CONFIG_ALLOW_CROSS="1"
    export LDFLAGS=""
    bbnote "which rustc:" `which rustc`
    bbnote "rustc --version" `rustc --version`
    bbnote "which cargo:" `which cargo`
    bbnote "cargo --version" `cargo --version`
    bbnote cargo build ${CARGO_BUILD_FLAGS}
    cargo build ${CARGO_BUILD_FLAGS}
}

cargo_do_install() {
    install -d "${D}${bindir}"
    if [ "${CARGO_BUILD_TYPE}" = "--release" ]; then
        local cargo_bindir="${CARGO_RELEASE_DIR}"
    else
        local cargo_bindir="${CARGO_DEBUG_DIR}"
    fi

    local files_installed=""
    for f in "$cargo_bindir"/*; do
        if [ -f "$f" ] && [ -x "$f" ]; then
            install -m 0755 "$f" "${D}${bindir}"
            files_installed="$files_installed $f"
        fi
    done

    if [ -z "$files_installed" ]; then
        bbfatal "Cargo found no files to install"
    else
        bbnote "Installed the following files:"
        for f in $files_installed; do
            bbnote "  " `basename $f`
        done
    fi
}

EXPORT_FUNCTIONS do_configure do_compile do_install
