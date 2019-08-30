package Java;

import java.util.Scanner;

public interface prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int i;
		int n = input.nextInt();
		if(n==1) {
			System.out.print("Smallest prime num is 2");
			
		}
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print("Not prime number");
				break;
			}
		}
			if((n==i)) {
				System.out.print("prime number");
			}
		
	}
}
