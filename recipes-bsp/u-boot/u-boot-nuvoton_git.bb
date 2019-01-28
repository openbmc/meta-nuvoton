DESCRIPTION = "U-boot for Nuvoton NPCM7xx Baseboard Management Controller"

require u-boot-common-nuvoton.inc
require recipes-bsp/u-boot/u-boot.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PROVIDES += "u-boot"

DEPENDS += "dtc-native"

SRC_URI += "file://0001-libfdt-fix-libfdt-header-conflicts-between-UBoot-and.patch"
