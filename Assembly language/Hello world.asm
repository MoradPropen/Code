.MODEL SMALL
.STACK 100H
.DATA
NUM DB 49
CHAR DB 'A'
MSG DB "HELLO WORLD $"

.CODE
MAIN PROC
   
    MOV AX,@DATA
    MOV DS,AX
              
  
    
    MOV AH,9
    LEA DX,MSG
    INT 21H
          
          
          
          
          
    MOV AH,4CH
    INT 21H
    MAIN ENDP 
END MAIN
    
         
