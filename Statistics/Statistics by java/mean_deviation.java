package Statistics;

public class mean_deviation {
	public static void main(String [] args)
	{
		
		int [] a= {3,9,15,12,7,4};//fi
		int b[] = {27,32,37,42,47,52};//xi
		int sumN=0,fixi=0,Mddiff=0;
		for(int i=0;i<b.length;i++) {
			sumN=sumN+b[i];
		}
		int  n=b.length;
		double xbar=(double)sumN/n;
		//System.out.print(xbar);
		
		for(int i=0;i<b.length;i++) {
			Mddiff +=(Math.abs(b[i]-xbar))*a[i];	
		}
		//System.out.print(Mddiff);
		double Md = (double)Mddiff/sumN;
		System.out.print(Md);
		
		
	}
}
