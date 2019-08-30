package Statistics;

public class varience_byme {
	public static void main(String [] args) {
		int a[] = {5,6,7,8,2,3,5,7,3,1};//fi
		int arr[][]= {{1,20},{2,13},{3,17},{4,17},{5,13},{6,18},{7,14},{8,17},{9,16},{10,15}};
		
		 int sum_xi=0,sum_xi2=0;
	       for(int i=0;i<arr.length;i++)
	       {
	           sum_xi+=arr[i][0];
	           sum_xi2+=arr[i][1];
	       }
	       //System.out.println(sum_xi);
	      // System.out.println(sum_fi);
	       
	       double avrg_xi=(double)sum_xi/arr.length;
	       double avrg_xi2=(double)sum_xi2/arr.length;
	      
	       
	       int total_sum_xi=0,total_sum_xi2=0;
	       for(int i=0;i<arr.length;i++)
	       {
	           total_sum_xi+=(arr[i][0]-avrg_xi)*(arr[i][0]-avrg_xi)*a[i];
	           total_sum_xi2+=(arr[i][1]-avrg_xi2)*(arr[i][1]-avrg_xi2)*a[i];
	           
	       }
	       double mean_dev=(double)total_sum_xi/arr.length;
	       double mean_dev2=(double)total_sum_xi/arr.length;
          
   
          System.out.println("Variance1: "+mean_dev);
          System.out.println("Variance:2 "+mean_dev);
          
          double std_dev =Math.sqrt(total_sum_xi/arr.length);
          double std_dev1 =Math.sqrt(total_sum_xi/arr.length);
          
          System.out.println("Standard Variance: "+std_dev);
          System.out.println("Standard Variance: "+std_dev1);
          
      
	}
}
