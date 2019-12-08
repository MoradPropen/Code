.MODEL
.STACK 200H
.DATA
a DW ?
b DW ?
c DB 'Input first dijit $'
d Db 10,13,'Input second dijit $'
e DB 10,13,'Result $'
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX
    
    MOV AH,9
    LEA DX,c
    INT 21H
    
    MOV AH,1
    INT 21H
    SUB AL,48
    MOV a,al
    
    
   MOV AH,9
   LEA DX,d
   INT 21H
   
   MOV AH,1
   INT 21H
   SUB AL,48
   MOB b,AL
   
   MOV AH,9
   LEA DX,e
   INT 21H
   
   MOV AX,A
   MUL B  ;A*B=AX
   
   MOV DL,AX
   ADD DL,48  
   
   MOV AH,2
   INT 21H 
   
   EXIT:
   MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN
    
   
   
