package Statistics;

public class Median {
public static void main(String [] args) {
	int sum=0,sum1=0,j,p,q,i,sum4;
	int avg,asp1,asp2;
	int[] a = {11,12,13,14,15,16,17,18,19,20};
	int b[]={17,28,37,52,70,48,36,23,11,8};
	
	for(i=0;i<10;i++){
        sum+=b[i];
	}
	
	System.out.println(sum);
	int ans1=sum/2;
	int ans = (sum/2+1);
	
	//System.out.println(ans1);
	
	for(i=0;i<10;i++)
	{
        sum1+=b[i];
        if(ans<=sum1) 
        {
        	System.out.println("the median1: "+a[i]);
        	p=a[i];
        	System.out.println(p);
        }
         if(ans1<=sum1) 
            {
        	 System.out.println("the median2: "+a[i]);
        	 q=a[i];
        	 System.out.println(q);
                break;
            }
	}
	
	
	
	//System.out.println(p);
	
	//System.out.println(q);
		
        
        
	}
}
	


