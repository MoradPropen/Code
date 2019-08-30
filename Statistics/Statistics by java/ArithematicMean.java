
package Statistics;

public class ArithematicMean {
    public static void main(String[] args)
    {
       int sum_f1=0,sum=0;
        
        int arr[]=new int[]{17,28,37,52,70,48,36,23,11,8};
        
        for(int i=0;i<arr.length;i++)
        {
            sum_f1+=arr[i];
            sum++;
        }
        System.out.println(+sum_f1);
        
        
        double ans;
        ans=(double)sum_f1/sum;
        
        System.out.println("The Arithematic Mean: "+ans);
        
        
    }
}
