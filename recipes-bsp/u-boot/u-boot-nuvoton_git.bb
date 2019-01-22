DESCRIPTION = "U-boot for Nuvoton NPCM7xx Baseboard Management Controller"

require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

DEPENDS += "dtc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

S = "${WORKDIR}/git"

UBRANCH = "npcm7xx"
SRC_URI = "git://github.com/Nuvoton-Israel/u-boot.git;branch=${UBRANCH}"
SRCREV = "5d036755c2e13b5244f63ce052657e4ef3089bd5"

PV .= "+${UBRANCH}+"

BUILD_CFLAGS_remove = "-isystem${STAGING_INCDIR_NATIVE}"
