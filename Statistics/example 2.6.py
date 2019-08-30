import matplotlib.pyplot as plt

x=[8916,18455,2660,7048,862,1462,17335]
y=[2000,4000,8000,12000,14000,16000,18000]

plt.bar(x,y,label='egg',color='red')

plt.xlabel("x")
plt.ylabel("y")
plt.title("Finished goods")
plt.legend()
plt.show()
