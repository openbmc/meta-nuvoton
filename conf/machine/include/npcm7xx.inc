#@TYPE: Machine
#@NAME: Nuvoton NPCM7XX
#@DESCRIPTION: Common machine configuration for Nuvoton NPCM7XX Chip

require conf/machine/include/nuvoton.inc

KERNEL_IMAGETYPE ?= "uImage"
KERNEL_EXTRA_ARGS ?= "UIMAGE_LOADADDR=0x00008000"

UBOOT_MACHINE ?= "PolegSVB_config"
UBOOT_ENTRYPOINT ?= "0x00008000"
UBOOT_LOADADDRESS ?= "0x00008000"

# Must match partitions from dts
FLASH_BB_OFFSET = "0"
FLASH_UBOOT_OFFSET = "52"
FLASH_KERNEL_OFFSET = "1024"
FLASH_ROFS_OFFSET = "7168"

DEFAULTTUNE ?= "arm7a-novfp"

SERIAL_CONSOLES = "115200;ttyS3"

SOC_FAMILY = "npcm7xx"
include conf/machine/include/soc-family.inc
MACHINEOVERRIDES .= ":npcm7xx"

require conf/machine/include/tune-arm7a-novfp.inc
