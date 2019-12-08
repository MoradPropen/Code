org 100h
mov si,0500h
mov dx,0000h
mov cx,014h

m1:mov ax,[si]
   mov bx,ax
   ror bx,1
   jnc m2
   add dx,ax
m2: inc si
dec cx
jnz m1
mov [700],dx
ret