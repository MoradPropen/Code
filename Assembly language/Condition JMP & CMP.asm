INCLUDE 'EMU8086.INC'
.MODEL SMALL
.STACK 100H
.DATA
.CODE
MAIN PROC  
    
    MOV CX,5
    MOV BX,0
    
    START:
    CMP BX,CX
    JE LAST
    PRINTN "HELLO"
    INC BX
    JNE START
    
    LAST:
    PRINTN "THE PROGRAM IS ENDED"


   
 
    
    
    MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN