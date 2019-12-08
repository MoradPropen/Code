
DATA SEGMENT
    SUM DB 01 DUP(?)
    AVG DB 01 DUP(?)  
    
DATA ENDS
CODE SEGMENT
    ASSUME CS:CODE DS :DATA
    
 START:
     MOV AX,DATA
     MOV DS,AX
     MOV AX,00
     MOV AL,04
     MOV AL,02
     MOV AL,08
     MOV AL,03
     MOV AL,03
     MOV SUM,AL
     MOV BL,05
     DIV BL
     MOV AVG,AL
     
    CODE ENDS
END START
    