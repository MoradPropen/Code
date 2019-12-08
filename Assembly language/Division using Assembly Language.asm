.MODEL SMALL
.STACK 100H
.DATA
a DW ?
B DW ?
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,1
    INT 21H
    SUB al,48
    MOV a,al
    
    MOV AH,1
    INT 21H
    SUB AL,48
    MOV B,AL
    
    MOV AX,A
    DIV B
    
    
    MOV AH,2
    MOV DL,AX
    ADD DL,48
    INT 21H
    
    
    MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN