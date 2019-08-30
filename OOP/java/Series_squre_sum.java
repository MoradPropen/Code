package Practice;

import java.util.Scanner;

public class Series_squre_sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,sum=0;
		n = input.nextInt();
		for(int i=1;i<=n;i++) {
			sum += i*i;
		}
		
		System.out.println(+sum);
	}
}
