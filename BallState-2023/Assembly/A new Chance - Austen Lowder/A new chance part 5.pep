BR main
loopNum:     .BLOCK  2           ;global variable #2d
endNum:      .BLOCK  2           ;global variable #2d
nextLoop:    .BLOCk  2
;
main:    DECI    loopNum,d         
         STBA    loopNum,d
         LDWA    20,i
         STWA    endNum,d
         LDWA    30,i
         STWA    nextLoop,d

plus_10: LDWA    loopNum,d       
         ADDA    10,i        
         STWA    loopNum,d       
            
while:   DECO    loopNum,d
         LDBA    0x0020,i ;
         STBA    0xFC16,d
         LDWA    loopNum,d       ;while (loopNum < endNum)
         CPWA    endNum,d    
         BRLT    plus_10
         LDWA    loopNum,d       ;while (loopNum < endNum)
         CPWA    nextLoop,d    
         BRLT    plus_10               
         STOP                
         .END