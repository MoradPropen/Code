package Statistics;

import java.util.Scanner;

public class minimize_Md_var_Smd_by_divide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = {27,32,37,42,47,52};
		int b[] = new int [1000];
		double sumx=0,sumb=0,Md=0,Md1=0,Mdres=0,Mdres1=0,Var=0,Var1=0;
		int c;
		System.out.print("Enter a constant: ");
		c=input.nextInt();
		int n=a.length;
		for(int i=0;i<n;i++) {
			sumx+=a[i];
			b[i]=a[i]/c;
			sumb+=b[i];
		}
		double xbar = sumx/n;
		double ybar = sumb/n;
		System.out.println("Before Arithmetic Mean: "+xbar);
		System.out.println("After Arithmetic Mean: "+ybar);
		
		
		for(int i=0;i<n;i++) {
			Md+=Math.abs(a[i]-xbar);
			Md1+=Math.abs(b[i]-ybar);
		}
		 Mdres=Md/n;
		System.out.println("Before Mean Deviation: "+Mdres);
		Mdres1=Md1/n;
		System.out.println("After Mean Deviation: "+Mdres1);
		
		for(int i=0;i<n;i++) {
			Var+=(a[i]-xbar)*(a[i]-xbar);
			Var1+=(b[i]-ybar)*(b[i]-ybar);
		}
		double varres = Var/n;
		double varres1 = Var1/n;
		System.out.println("Before Varience: "+varres);
		System.out.println("After Varience: "+varres1);
		
		double SMd = Math.sqrt(varres);
		double SMd1 = Math.sqrt(varres1);
		System.out.println("Before Standard Mean Deviation: "+SMd);
		System.out.println("After Standard Mean Deviation: "+SMd1);
		
		
		
		
	}
}
