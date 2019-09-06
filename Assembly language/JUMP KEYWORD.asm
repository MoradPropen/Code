;CMP = compare
;JG  = jump if greater then
;JE = jump if equal
;JGE = jump if greater then or equal
;JNG = junp if not greater then
;JE   = jump if equal
;JNE   =   jump if not equal
;JMP =jump
;INC  =increment
;DEC =decrement



        CMP BL,BH
        JG L2
        
        L1:
        MOV AH,2
        MOV DL,CL
        INT 21H
        
        JMP EXIT
        
        L2:
        MOV AH,2
        MOV DL,CL
        INT 21H
        
        JMP EXIT
