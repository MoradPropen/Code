package Statistics;

public class std_deviation_byme {
	public static void main(String [] args) {
		int a[][] ={ {27,3},{32,9},{37,15},{42,12},{47,7},{52,4}};
		double sum_n=0,sum_fx=0;
		for(int i=0;i<a.length;i++) {
			sum_n+=a[i][1];
			sum_fx+=a[i][1]*a[i][0];
		}
		//System.out.println(sum_n);
		//System.out.println(sum_fx);
		double xbar=sum_fx/sum_n;
		
		//System.out.println(+xbar);
		
		double Md=0;
		for(int i=0;i<a.length;i++) {
			Md+=Math.abs(a[i][0]-xbar)*a[i][1];
		}
		double Mdres=Md/sum_n;
		System.out.println("Mean deviation: "+Mdres);
		
		double var=0;
		for(int i=0;i<a.length;i++) {
			var+=(a[i][0]-xbar)*(a[i][0]-xbar)*a[i][1];
		}
		double varres = var/sum_n;
		System.out.println("Varience: "+varres);
		
		double SMd = Math.sqrt(varres);
		System.out.println("Standard Mean deviation: "+SMd);
		
	}
}
