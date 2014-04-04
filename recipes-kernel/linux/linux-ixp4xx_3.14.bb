require recipes-kernel/linux/linux.inc

PV = "3.14.0"

# 3.14.0 tag
SRCREV_pn-${PN} = "455c6fdbd219161bd09b1165f11699d6d73de11c"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;branch=linux-3.14.y \
           file://0001-ARM-Fix-regression-in-IXP4xx-network-drivers-DMA-mas.patch \
           file://defconfig"

S = "${WORKDIR}/git"

