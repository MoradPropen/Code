
package Statistics;


public class MeanDeviation {
public static void main(String[] args)
    {
//        int arr1[]={54,60,59,69,72,62,56,66,52,69};
//        int arr2[]={80,90,88,92,83,79,95,87,86,81};
        
        int arr[][]={{54,80},{60,90},{59,88},{69,92},{72,83},{62,79},{56,95},{66,87},{52,86},{69,81}};
        
       int sum_f1=0,sum_f2=0;
       for(int i=0;i<arr.length;i++)
       {
           sum_f1+=arr[i][0];
           sum_f2+=arr[i][1];
       }
       //System.out.println(+sum_f1);
       //System.out.println(+sum_f2);
       
       double avrg_f1=(double)sum_f1/arr.length;
       double avrg_f2=(double)sum_f2/arr.length;
       

       double total_sum_f1=0,total_sum_f2=0;
       for(int i=0;i<arr.length;i++)
       {
           total_sum_f1+=Math.abs(arr[i][0]-avrg_f1);
           total_sum_f2+=Math.abs(arr[i][1]-avrg_f2);
       }
       double   mean_dev_f1;
               mean_dev_f1=(double)total_sum_f1/arr.length;
       double mean_dev_f2;
               mean_dev_f2=(double)total_sum_f2/arr.length;
       
       System.out.println("Mean Deviation first: "+mean_dev_f1);
       System.out.println("Mean Deviation Second: "+mean_dev_f2);
        
        
    }
}
