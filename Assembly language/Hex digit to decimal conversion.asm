.MODEL SMALL
.STACK 100H
.CODE

MAIN PROC
    MOV AH,1
    INT 21H
    MOV BL,AL
    
    SUB BL,17
    
    MOV AH,2
    MOV DL,10
    INT 21H
    MOV DL,13
    INT 21H
    
    MOV AH,2
    MOV DL,49
    INT 21H  
    
    MOV AH,2
    MOV DL,BL
    INT 21H 
    
    EXIT:
    MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN