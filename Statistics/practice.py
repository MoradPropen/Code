x = [2,5,9,13]
y = [7,10,17,30]
xbar=sum(x)/len(x)
ybar=sum(y)/len(y)
#print(xbar)
#print(ybar)
r=0
s=0
for i in range(len(x)):
    p=x[i]-xbar
    q=y[i]-ybar
    r+=(x[i]-xbar)*(x[i]-xbar)
    s+=(x[i]-xbar)*(y[i]-ybar)
b=s/r
a=ybar-(b*xbar)
print("Value of a: ",a)
print("Value of b: ",b)