BR main
main:    LDBA 0xFC15,d ; load user input
         SUBA 0x0030,i ; subtract 0x0030 from the assembler
         STWA 0x0001,d
         LDBA 0xFC15,d
         SUBA 0x0030,i
         STWA 0x0003,d
         LDBA 0xFC15,d ; Load byte into assembler.
         SUBA 0x0030,i
         ADDA 0x0001,d
         ADDA 0x0003,d
         ADDA 0x0030,i
         STBA 0xFC16,d ; Store at the address 0xFC16
STOP
.END