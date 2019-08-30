import math
x = [2,5,9,13]
y = [7,10,17,30]
n=len(x)

Ybar=sum(y)/n
sum_dif=0
Y=0
for i in range(n):
    Y+=.92+2.08*x[i]
    sum_dif+=abs(y[i]-Ybar)

R=(Y-Ybar)*(Y-Ybar)/sum_dif*sum_dif

print(R)
    
    