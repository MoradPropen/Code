package Practice;

import java.util.Scanner;

public class Arraysum1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[]=new int [101];
		int n, sum=0;
		n=input.nextInt();
		
		sum=(n*(n+1))/2;
		System.out.println("Sum is : "+sum);
	}
}
