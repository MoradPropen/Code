package code;

public class HarmonicMean {
public static void main(String[] args)
    {
       int sum=0;
        double multi_f1=0;
        int arr[]=new int[]{17,28,37,52,70,48,36,23,11,8};
        
        for(int i=0;i<arr.length;i++)
        {
            multi_f1+=(double)1/arr[i];
            sum++;
        }
        double ans;
        ans=(double)sum/multi_f1;
        
        System.out.println("The Harmonic Mean: "+ans);
        
        
    }    
}
