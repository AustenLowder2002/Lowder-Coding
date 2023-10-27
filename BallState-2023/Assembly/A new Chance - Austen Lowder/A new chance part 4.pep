;This only takes integers atm but i have the logic for taking letters like A it just seems I am comparing something wrong with the branches.
BR main

loopNum: .BLOCK  2    ; Global variable for loop counter
endNum:  .EQUATE 0    ; Global variable for loop end condition

main:    LDBA    0xFC15,i   
         STBA    loopNum, d  ; Store the character in loopNum

         LDBA    loopNum, d  ; Load the character
         CPWA    0x0030, d   ; Compare it with '0'
         BRGE    isD         ; Branch if it's greater than or equal to '0'

isNotI:  LDBA    loopNum, d ; Load the character
         STWA    loopNum, d ; Store it as an integer in loopNum
         BR      continue   ; Continue to the main logic

isD:     DECI    loopNum, d ; Read a decimal number from the user
         STWA    endNum, d  ; Store it as the endNum

continue:LDWA    loopNum, d ; Load loopNum
         STWA    endNum, d  ; Store it in endNum

add1:    LDWA    loopNum, d ; Load loopNum
         ADDA    1, i       ; Increment loopNum
         STWA    loopNum, d ; Store the updated value in loopNum

while:   HEXO    loopNum, d ; Display loopNum
         LDBA    0x0020, i  
         STBA    0xFC16, d  ; Output a space character

         LDWA    loopNum, d ; Load loopNum
         CPWA    endNum, d  ; Compare with endNum
         BRLT    add1       ; If loopNum < endNum, branch to add1

STOP
.END
