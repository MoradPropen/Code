package Practice;

import java.util.Scanner;

public class NewtonLaw {
public static void main(String[] args) {
	int v,u,a,t;
	Scanner input = new Scanner(System.in); 
	
	u = input.nextInt();
	a = input.nextInt();
	t = input.nextInt();
	v = u + (a*t);
	System.out.println(+v);
}
}
