package Practice;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[]=new int [1000];
		int sum=0;
		for(int i=0;i<1000;i++) {
			arr[i] = i+1;
			sum = sum + arr[i];
		}	
		
		System.out.println("Sum is : "+sum);
	}
}
