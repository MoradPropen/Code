package Statistics;

public class Mean_median {
public static void main(String [] args) {
	int mul=0,sum=0;
	int[] a = {11,12,13,14,15,16,17,18,19,20};
	int b[]={17,28,37,52,70,48,36,23,11,8};
	for(int j=0;j<10;j++){
	    mul+=a[j]*b[j];
	}
	for(int i=0;i<10;i++){
        sum+=b[i];
    }
	double res = (double)mul/sum;
	System.out.println(+res);
	    
}
}
