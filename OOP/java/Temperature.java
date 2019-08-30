package Java;

import java.util.Scanner;

class Temp{
	double F,C;
}
public class Temperature {
public static void main(String[] args) {
	Scanner input = new  Scanner(System.in);
	Temp cir = new Temp();
	double feren,circ;
	System.out.print("Enter celcius and ferenhite: ");
	cir.C = input.nextDouble();
	cir.F = input.nextDouble();
	feren = 1.8 * cir.C +32;
	circ = (5/9.0)*(cir.F - 32);
	System.out.println(feren);
	System.out.println(circ);
}
}
