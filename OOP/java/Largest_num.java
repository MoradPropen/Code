package Java;

import java.util.Scanner;

public class Largest_num {
	public static void main(String[] args) {
		int a,b,c;
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if(a>=b && a>=c) {
			System.out.print(+a);
		}
		if(b>=a && b>=c) {
			System.out.print(+b);
		}
		if(c>=a && c>=b) {
			System.out.print(+c);
		}
	}
}
