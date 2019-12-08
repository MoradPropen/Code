 .MODEL SMALL
 .STACK 100H

 .DATA
   PROMPT_1  DB  'Enter the character : $'
   PROMPT_2  DB  'The given character is : $'

 .CODE
   MAIN PROC
     MOV AX, @DATA                ; initialize DS  
     MOV DS, AX

     LEA DX, PROMPT_1             ; load and display PROMPT_1  
     MOV AH, 9
     INT 21H

     MOV AH, 1                    ; read a character
     INT 21H

     MOV BL, AL                   ; save AL into BL

     CALL NEXT_LINE               ; call the procedure NEXT_LINE

     LEA DX, PROMPT_2             ; load and display PROMPT_2  
     MOV AH, 9
     INT 21H

     MOV AH, 2                    ; display the character in BL
     MOV DL, BL
     INT 21H

     MOV AH, 4CH                  ; return control to DOS
     INT 21H
   MAIN ENDP 
   
   
   
NEXT_LINE PROC
   ; this procedure will move the cursor to the next line
   ; input : none
   ; output : none
   ; uses : MAIN

   PUSH AX                   ; push AX onto the STACK
   PUSH DX                   ; push DX onto the STACK

   MOV AH, 2                 ; set output function
   MOV DL, 0DH               ; carriage return
   INT 21H                   

   MOV DL, 0AH               ; line feed
   INT 21H

   POP DX                    ; pop a value from STACK to DX
   POP AX                    ; pop a value from STACK to AX

   RET                       ; return control to the calling procedure
 NEXT_LINE ENDP





 END MAIN