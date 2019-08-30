package Statistics;

public class Stemleaf {
public static void main(String[] args) {
	int p,q,r,leaf,equal,i;
	int arr[] = {15,20,25,21,11,12,30,31,50,51,41,43,36,32,37,37,10};
	int n=arr.length;
	
	int min = arr[0];
	int max = arr[0];
	for(i=0;i<n;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
		if(max<arr[i]) {
		max=arr[i];
		}
		
	}
	//System.out.println(+max);
	//System.out.println(+min);
	max=max/10;
	min=min/10;
	
	for(int k=min;k<=max;k++) {
		System.out.print(+k);
	System.out.print(" ");
		
		 for(i=0;i<n;i++) {
			equal =arr[i]/10;
			//System.out.print(+equal);
			if(equal==k) {
				 System.out.print(arr[i]%10);
			}
		 	
	}
		 System.out.println();
		
	}

	
	}
}
	


