package Java;

import java.util.Scanner;

public class reverse_number {
public static void main(String[] args) {
	int n,reverse=0;
	Scanner input = new Scanner(System.in);
	n= input.nextInt();
	while(n!=0) {
		reverse =reverse* 10;
		reverse =reverse+n%10;
		n=n/10;	 
	}
	System.out.print(+reverse);
}
}
