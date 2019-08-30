
package code;

public class GeometricMean {
    public static void main(String[] args)
    {
       int sum=0;
        double multi_f1=0;
        int arr[]=new int[]{17,28,37,52,70,48,36,23,11,8};
        
        for(int i=0;i<arr.length;i++)
        {
            multi_f1+=Math.log10(arr[i]);
            sum++;
        }
        
//        System.out.println("The Arithematic Mean: "+ multi_f1);
//        System.out.println("The Arithematic Mean: "+ sum);
        
        double p;
        p=(double)multi_f1/sum;
        double ans=Math.pow(10,p);
        System.out.println("The Geometric Mean: "+ans);
        
        
    }
}
