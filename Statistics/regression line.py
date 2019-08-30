from scipy import stats
import numpy as np
from matplotlib import pyplot as plt
#x = np.array([112,345,198,305,372,660,302,420,578])
#y = np.array([1120,1523,2102,2230,2600,3200,3409,3689,4460])

x = np.array([2,5,9,13])
y = np.array([6,12,20,28])
slope, intercept, r_value,p_value,std_err = stats.linregress(x,y)
plt.plot(x,y,"ro",color="red")

plt.ylabel("Adv. Cost")
plt.xlabel("Sells")

plt.axis([0,15,0,30])

plt.plot(x,x*slope+intercept,"b")

plt.plot()
plt.show()

