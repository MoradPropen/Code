package morad;

import java.util.Scanner;

public class Decimal_to_bin_oct_oct {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int decimal;
	System.out.println("Enter Decimal Number: ");
	decimal=input.nextInt();

	String binary = Integer.toBinaryString(decimal);
	System.out.println(binary); 
	
	int oc;
	System.out.println("Enter Octal Number: ");
	oc=input.nextInt();
	String octal = Integer.toOctalString(oc);
	System.out.println(octal);
	
	int hex;
	System.out.println("Enter Hexadecimal Number: ");
	hex=input.nextInt();
	String Hexa = Integer.toHexString(hex);
	System.out.println(Hexa);
}
}
