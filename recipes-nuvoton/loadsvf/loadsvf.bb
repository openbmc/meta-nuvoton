DESCRIPTION = "CPLD/FPGA Programmer"
PR = "r1"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/Nuvoton-Israel/loadsvf.git"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git/"

inherit autotools pkgconfig

DEPENDS += "autoconf-archive-native"

