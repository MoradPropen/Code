.MODEL
.STACK 100H
.DATA   
;THE VARIABLE WHUCH ARE DECLARE

    NUM DB 5
    NUM1 DB ?  
    
.CODE  
;CODE SEGMENT

MAIN PROC ;INT MAIN  
    ;CODE STATEMENT
                   
    MOV AX , @DATA
    MOV DS , AX 
    
    MOV AH,1
    INT 21H
    MOV NUM1,AL
      
    MOV AH , 2 
    ADD NUM,48
    MOV DL , NUM
    INT 21H   
    
    MOV DL , NUM1
    INT 21H
    
    MOV AH, 4CH
    INT 21H
    MAIN ENDP
END MAIN ;REUTRN 0