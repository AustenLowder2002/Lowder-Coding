Br:
main:	LDBA 0x0000,i ;Load 0 into A reg
	STBA 0x5000,d ; Save it into memory
	LDBA 0x0004,i 
	STWA 0x5002,d ;Store it into memory
	read_I: LDBA 0xFC15,d ; Read user input
	CPBA 0x0030,i ; Compare if i is zero
	BREQ zero
	one: LDBA 0x5000,d 
	ADDA 0x5002,d ; Add 4 to the result
	STBA 0x5000,d
	zero: LDWA 0x5002,d ;Load result into A. reg
	ASRA ;Shift to the right
	STWA 0x5002,d
	CPBA 0x0000,i
	BRNE read_i
	LDBA 0x5000,d
	ADDA 0x0030,i
	STBA 0xFC16,d
STOP
.END