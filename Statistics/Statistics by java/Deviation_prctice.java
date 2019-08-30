package Statistics;

public class Deviation_prctice {
public static void main(String[] args) {
	int f[] = {3,9,15,12,7,4};
	int x[] = {27,32,37,42,47,52};
	double sum_fx=0,avrgx=0,sum_f=0;
	
	for(int i=0;i<x.length;i++) {
		sum_f+=f[i];
	 sum_fx+=x[i]*f[i];
	 
	}
	avrgx = sum_fx/sum_f;//xbar
	//System.out.println(avrgx);
double Md=0;
for(int i=0;i<x.length;i++) {
	Md +=(Math.abs(x[i]-avrgx))*f[i];
}
double result = Md/sum_f;
   System.out.println("Mean Deviation: "+result);
   
   double Var=0;
	for(int i=0;i<x.length;i++) {
		Var +=((x[i]-avrgx)*(x[i]-avrgx))*f[i];
	}
	double result1 = Var/sum_f;
	   System.out.println("Varience: "+result1);
	   
	   double SMd = Math.sqrt(result1);
	   System.out.println("Standard Deviation: "+SMd);
	   
	
}
}
