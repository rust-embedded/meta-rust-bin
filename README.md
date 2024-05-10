meta-rust-bin
=============

An OpenEmebdded/Yocto layer providing pre-built toolchains for the
[Rust programming language](https://www.rust-lang.org).

<!-- toc -->

- [meta-rust-bin](#meta-rust-bin)
  - [Basic Example](#basic-example)
  - [Features](#features)
    - [Use with Yocto Release 4.0 (kirkstone) and Above](#use-with-yocto-release-40-kirkstone-and-above)
    - [Use with Yocto Release 3.4 (honister) and Above](#use-with-yocto-release-34-honister-and-above)
  - [Advanced Features](#advanced-features)
    - [Specifying Cargo Features](#specifying-cargo-features)
    - [Using Components Individually](#using-components-individually)
  - [Pre-built vs. Compiled](#pre-built-vs-compiled)
  - [Adding Support for New Versions](#adding-support-for-new-versions)
  - [Copyright](#copyright)

<!-- tocstop -->


## Basic Example

A basic class for cargo-based executables is provided. The following is a
simple recipe called gpio_utils.bb that builds the [gpio-utils](https://github.com/rust-embedded/gpio-utils)
crate from branch master.

```bitbake
SUMMARY = "GPIO Utilities"
HOMEPAGE = "git://github.com/rust-embedded/gpio-utils"
LICENSE = "MIT"

inherit cargo_bin

# Enable network for the compile task allowing cargo to download dependencies
do_compile[network] = "1"

SRC_URI = "git://github.com/rust-embedded/gpio-utils.git;protocol=https;branch=master"
SRCREV="02b0658cd7e13e46f6b1a5de3fd9655711749759"
S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=935a9b2a57ae70704d8125b9c0e39059"
```

As you can see, there is almost no overhead introduced from the `cargo_bin` class
beyond simply inheriting it. The `cargo_bin` class adds the appropriate Rust
dependencies as well as default compile and install steps.

> **Warning**  
> In previous versions of `meta-rust-bin` the class `cargo` was used instead
> of `cargo_bin`. Follow this [guide](#updating-from-an-old-meta-rust-bin) if you
> are updating your `meta-rust-bin` layer from an old version.

## Features

Currently supported:

  * Current stable rust release (usually shortly after release) and several
    previous releases, see [the versioned recipes](./recipes-devtools/rust/).
  * x86 (32 and 64-bit), ARM (32 and 64-bit) build systems.
  * All Linux architectures that Rust itself supports (Multiple flavors of:
    x86, ARM, PPC, and MIPS)
  * Statically-linked libstd, dynamically-linked system libraries (libc, libm,
    etc)

Future:

  * [ ] Building and installing `dev` and `staticdev` packages (i.e. allow build
    and install of static and dynamic library builds).
  * [ ] Debug builds with separated debug info to allow gdbserver usage.
  * [ ] Running Rust/Cargo on target.
  * [ ] Vendoring of Cargo dependencies (to better play with the Yocto offline
    build model).
  * [ ] Use of a shared libstd across all Rust packages on a target system
    (provides space savings).
  * [ ] Total static linking using MUSL.

### Use with Yocto Release 4.0 (kirkstone) and Above

From Yocto version 4.0 network access from tasks is disabled by default on
kernels which support this feature (on most recent distros such as CentOS 8 and
Debian 11 onwards). The task `do_compile` need to access the network because it
downloads dependencies, so add the following line to the recipe:

```bitbake
do_compile[network] = "1"
```

### Updating from an old `meta-rust-bin`

To avoid conflicts with the offical Rust layer of Yocto, the class `cargo` of
`meta-rust-bin` was renamed to `cargo_bin`.

If you are updating `meta-rust-bin` from an old version please make sure to
update the inherited class of your recipe to `cargo_bin`.

After the update it's safe to remove the previously used `BBMASK`:

```bitbake
BBMASK = "poky/meta/recipes-devtools/rust"
```

## Advanced Features

### Specifying Cargo Features

Because Yocto is primarily used for embedded development, it is likely that
projects will have differing features based on whether the crate is run on the
hardware or in development on a PC. Cargo features can be easily specified by
adding a space-separated list of `CARGO_FEATURES` to the recipe:

```bitbake
CARGO_FEATURES = "feature1 feature2"
```

### Using Components Individually

Although the `cargo` class is the easiest way to use this layer, the components
it provides may also be used directly. To add the Rust compiler plus target and
host standard libraries to the environment, depend on or install `rust-bin`. To
manually install `cargo` depend on or install `cargo-bin`.

Note that while there is nothing explicitly preventing the installation of Rust
on the target, it hasn't been tested and is likely not to work. Pull requests
are welcome!


## Pre-built vs. Compiled

This layer exists as a tradeoff against other options, e.g. the
[meta-rust](https://github.com/meta-rust) project. Both exist to satisfy
different requirements.

Because this layer uses the upstream compiled versions of Rust and Cargo, it
will never be able to support architectures or options not supported by the
Rust team itself.

Also, because this layer uses pre-built Rust standard libraries, it is possible
that the standard libraries provided with this layer will be less efficient
than code produced by a custom-compiled standard library.

However, using pre-built tools has advantages:

  * Updating the layer to a new version of Rust is as easy as updating
    checksums and file names, so new versions of Rust are available quickly.
  * In almost all modern systems, it is faster to download the binaries than it
    is to download source and build the Rust toolchain from scratch.
  * Compatability across multiple versions of Yocto is maximized since only
    basic, stable recipe features are used.
  * Trivial support for all architectures supported by upstream Rust.

## Adding Support for New Versions

When a new version of rust is released, adding support for this new version can
be done by running `build-new-version.sh` as follows:

    ./build-new-version.sh <version>

This will create two new recipes:
 - recipes-devtools/rust/rust-bin-<version>.bb
 - recipes-devtools/rust/cargo-bin-<date>.bb

 Where the cargo version generated is the one packaged with the associated
 release of rust itself (using the published channel data consumed by other
 tools like rustup).

For latest nightly version:

    ./build-new-version.sh nightly
    
For specified nightly version:
    
    ./build-new-version.sh nightly 2019-07-08
    

## Copyright

```
Copyright (c) 2016, the meta-rust-bin authors.

Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
http://www.apache.org/license/LICENSE-2.0> or the MIT license
<LICENSE-MIT or http://opensource.org/licenses/MIT>, at your
option.  This file may not be copied, modified, or distributed
except according to those terms.
```
