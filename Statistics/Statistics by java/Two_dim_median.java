package Statistics;

public class Two_dim_median {
	public static void main(String[] args) {
		int[][] a = { {11,17},{12,28},{13,37},{14,52},{15,70},{16,48},{17,36},{18,23},{19,11},{20,8}};
		int i,sumc=0,sumb=0,ans,ans1;
	     int r=0,s=0,avr;
		for (i = 0; i <10; i++) {
		sumb+=a[i][1];
		
			}
		
		//System.out.print(sumb);
		ans1=sumb/2;
		ans = (sumb/2+1);
		
		for (i = 0; i <10; i++) {
			sumc+=a[i][1];
			if(ans<=sumc) 
	        {
				r=a[i][0];
	        	System.out.println("the median1: "+a[i][0]);
	        	
	        }
			if(ans1<=sumc) 
	        {
				s=a[i][0];
	        	System.out.println("the median2: "+a[i][0]);
	        	break;
	        	
	        }
			
				}
		avr=(r+s)/2;
		System.out.println("Total average: "+avr);
		
		
		
	}
}
