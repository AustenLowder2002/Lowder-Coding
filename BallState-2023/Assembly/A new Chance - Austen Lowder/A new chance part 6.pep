;never really quite figured this one out. I feel pretty decent about most of them except this one.
BR main

input:  .BLOCK 1       ; Input buffer for 8 bits
output: .BLOCK 1       ; Output buffer for the character

main:LDBA     8, i    
    STWA    0xFC11, d  

bit_loop:LDBA     0, i       
    DECI    input, d   
    STWA    0xFC12, d  

    LDWA     0x0001, i        
    LDBA     0xFC12, i   

    LDWA     0x001, i        
    SUBA    0xFC12, i   
    LDWA     0xFC11, i   ; Load the loop counter
    SUBA    1, i        ; Decrement the loop counter
    STWA    0xFC11, d   

    BRGE    bit_loop ; If the loop counter >= 0, repeat the loop

    ; Calculate the ASCII character
    LDBA    output,d
    STBA    output, d 

    HEXO    output, d   ; Display the ASCII character
    STOP

.END