BR main
loopNum:     .BLOCK  2           ;global variable #2d
endNum:  .BLOCK  2           ;global variable #2d
;
main:    LDWA    0,i         
         STWA    loopNum,d
         DECO    loopNum,d       
         LDWA    9,i        
         STWA    endNum,d
   
do:      LDWA    loopNum,d       
         ADDA    1,i        
         STWA    loopNum,d       
            
while:   DECO    loopNum,d  
         LDWA    loopNum,d       ;while (loopNum < endNum)
         CPWA    endNum,d    
         BRLT    do               
         STOP                
         .END