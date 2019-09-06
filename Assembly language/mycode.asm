.MODEL
.STACK 100H
.DATA   
;THE VARIABLE WHUCH ARE DECLARE

    NUM DB 48
    CHAR DB 'A'
    MSG DB "MY NAME IS MORAD $"   
    
.CODE  
;CODE SEGMENT

MAIN PROC ;INT MAIN  
    ;CODE STATEMENT
                   
    MOV AX , @DATA
    MOV DX , AX
      
    MOV AH , 2
    MOV DL , NUM
    INT 21H   
    
    MOV AH, 4CH
    INT 21H
    MAIN ENDP
END MAIN ;REUTRN 0