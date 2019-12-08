MOV AX,3000H  

MOV DS,AX  

MOV SI,200H

MOV CL,01H

MOV AL,[SI]

INC SI      

MOV BL,[SI]

CMP AL,BL  

JAE XX    
           
           
XCHG AL,BL   

XX:MOV AH,00H 

DIV BL    

CMP AH,00    

JE ZZ       

MOV AL,BL  

MOV BL,AH   

JMP XX     

ZZ: INC SI  

MOV [SI],BL   

HLT          
