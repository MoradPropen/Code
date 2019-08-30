package morad;

public class Number_conversion {
	public static void main(String[] args) {
		/*/Binaary to Decimal
		String binary = "1010100";
		Integer decimal  = Integer.parseInt(binary, 2);
		System.out.println(decimal);
		/*///Octal to decimal
		/*
		String octal = "675";
		Integer decimal  = Integer.parseInt(octal, 8);
		System.out.println(decimal);
		*/
		String hexadecimal = "675";
		Integer decimal  = Integer.parseInt(hexadecimal, 16);
		System.out.println(decimal);
	}
}
