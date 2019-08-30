package Practice;

import java.util.Scanner;

public class Series_cube_sum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,sum=0;
		n = input.nextInt();
		for(int i=1;i<=n;i++) {
			sum += i*i*i;
		}
		
		System.out.println(+sum);
	}
}
