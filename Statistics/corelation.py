import math
x = [2,5,9,13]
y = [6,12,20,28]
n=len(x)
xy=0
p=sum(x)
q=sum(y)
sq_x=0
sq_y=0
for i in range(n):
    xy+=x[i]*y[i]
    sq_x+=x[i]*x[i]
    sq_y+=y[i]*y[i]
    
corr=(float)(n*xy-p*q)/(float)(math.sqrt((n*sq_x-p*p)*(n*sq_y-q*q)))
print(corr)