package Statistics;
public class consistency{
	 public static void main(String[] args) {
		 int sum=0;
	        double multi_f1=0, multi_f2=0;
	        int arr[]=new int[]{17,28,37,52,70,48,36,23,11,8};
	        int arr1[] = {19,2,15,47,68,30,21,52,40,6};
	    
	        for(int i=0;i<arr.length;i++)
	        {
	            multi_f1+=(double)1/arr[i];
	            multi_f2+=(double)1/arr1[i];
	            sum++;
	        }
	        System.out.println(multi_f1);
	        System.out.println(multi_f2);
	        double ans,ans1;
	        ans=(double)sum/multi_f1;
	        ans1=(double)sum/multi_f2;
	        
	        System.out.println("The Harmonic Mean HX = CVX: "+ans);
	        System.out.println("The Harmonic Mean HY = CVY: "+ans1);
	        //Standard Deviation
	        int sum_f1=0,sum_f2=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            sum_f1+=arr[i];
	            sum_f2+=arr1[i];
	        }
	        double avrg_f1=(double)sum_f1/arr.length;
	        double avrg_f2=(double)sum_f2/arr1.length;
	        
	        int total_sum_f1=0,total_sum_f2=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            total_sum_f1+=(arr[i]-avrg_f1)*(arr[i]-avrg_f1);
	            total_sum_f2+=(arr1[i]-avrg_f2)*(arr1[i]-avrg_f2);
	        }
	        double   mean_dev_f1;
	                mean_dev_f1=Math.sqrt((double)total_sum_f1/arr.length);
	        double mean_dev_f2;
	                mean_dev_f2=Math.sqrt((double)total_sum_f2/arr1.length);
	                
	        System.out.println("Standed first: "+mean_dev_f1);
	        System.out.println("Standed Second: "+mean_dev_f2);
	                
	        double CVx=mean_dev_f1/avrg_f1;
	        double CVy=mean_dev_f2/avrg_f2;
	        
	      System.out.println("SMD by CVx: "+CVx);
	      System.out.println("SMD by CVy: "+CVy);
	      
	      System.out.println("HX>Hy and CVx<CVy so it's high Consistency");	 }
}
