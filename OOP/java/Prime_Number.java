package Practice;

import java.util.Scanner;

public class Prime_Number {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String primenumber = "";
	int i,n,num=0;
	n=input.nextInt();
	for(i=1;i<=n;i++) {
		int counter =0;
		for(num=i;num>=1;num--) {
			if(i%num==0) {
				counter++;
			}
		}
		
	
	if(counter==2) {
		primenumber = primenumber + i + " ";
	}
	}
	System.out.println(primenumber);
	
}
}
