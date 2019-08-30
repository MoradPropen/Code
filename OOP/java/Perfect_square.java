package Java;

import java.util.Scanner;

public class Perfect_square {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int num = input.nextInt();
	int sqrt = (int)Math.sqrt(num);
	if(sqrt*sqrt==num) {
		System.out.println("perfect number");	
	}
	else
		System.out.println("NOt perfect number");
		
}
}
