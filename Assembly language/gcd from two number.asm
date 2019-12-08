data SEGMENT
    ; add data to memory here!
    n1    DB    10
    n2    DB    15
rez   DB    ?
ENDS

stack SEGMENT
    ; add data to your stack here!
    DB    128    dup(0)
ENDS

code SEGMENT
    nzd PROC
        POP CX ; store IP in temp register
        POP BX
        ciklus: 
            ; Euclid's algorithm: n2, n1 mod n2
            CMP BL, 0d
            JE done
            
            MOV AL, BH
            MOV AH, 0d ; clear AX value
            DIV BL ; AX(n1) / BL(n2); AH = n1 % n2, AL = n1 / n2
            MOV BH, BL ; n1 = n2
            MOV BL, AH ; n2 = n1 % n2
            
            JMP ciklus
        done:
            PUSH BX
            PUSH CX ; put IP back on top of the stack
        RET
    nzd ENDP
    
    start:
        MOV AX, data
        MOV DS, AX
        MOV ES, AX
        
        MOV AX, stack
        MOV SS, AX
        
        ; add your code here        
        MOV BH, [n1]
        MOV BL, [n2]
        PUSH BX
        
        CALL nzd
        POP BX
        MOV [rez], BH
        
    exit:
        MOV AH, 4ch ; exit to operating system.
        INT 21h
    
ENDS
END start ; 