LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

PV = "10.09.00"
FILENAME = "Poleg_bootblock.bin"

SRC_URI = "https://github.com/Nuvoton-Israel/npcm7xx-bootblock/releases/download/${PV}/${FILENAME}"
SRC_URI[md5sum] = "cbf605c41e5ce849f240f51a58ff3124"
SRC_URI[sha256sum] = "fd954e554e9b10d849d8b3f92ba17d5f2442316e4a62c10e661101e0d98b3d10"

inherit deploy

BOOTBLOCK ?= "bootblock.bin"

do_deploy () {
	install -d ${DEPLOYDIR}
	install -m 644 ${WORKDIR}/${FILENAME} ${DEPLOYDIR}/${BOOTBLOCK}
}

addtask deploy before do_build after do_compile
