.MODEL SMALL
.DATA
.CODE
START: MOV AX,@DATA
MOV DS,AX

;Day Part
DAY:
MOV AH,2AH    ; To get System Date
INT 21H
MOV AL,DL     ; Day is in DL
AAM
MOV BX,AX
CALL DISP

MOV DL,'/'
MOV AH,02H    ; To Print / in DOS
INT 21H

;Month Part
MONTH:
MOV AH,2AH    ; To get System Date
INT 21H
MOV AL,DH     ; Month is in DH
AAM
MOV BX,AX
CALL DISP

MOV DL,'/'    ; To Print / in DOS
MOV AH,02H
INT 21H

;Year Part
YEAR:
MOV AH,2AH    ; To get System Date
INT 21H
ADD CX,0F830H ; To negate the effects of 16bit value,
MOV AX,CX     ; since AAM is applicable only for AL (YYYY -> YY)
AAM
MOV BX,AX
CALL DISP


;To terminate the Program

MOV AH,4CH     ; To Terminate the Program
INT 21H

;Display Part
DISP PROC
MOV DL,BH      ; Since the values are in BX, BH Part
ADD DL,30H     ; ASCII Adjustment
MOV AH,02H     ; To Print in DOS
INT 21H
MOV DL,BL      ; BL Part 
ADD DL,30H     ; ASCII Adjustment
MOV AH,02H     ; To Print in DOS
INT 21H
RET
DISP ENDP      ; End Disp Procedure


END START      ; End of MAIN