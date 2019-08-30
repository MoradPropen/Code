
package oop;

public class CallbyRefence_test {
public static void main(String [] args) {
	CallbyRefence r1 = new CallbyRefence();
	r1.name = "Propen";
	System.out.println("Before calling: "+r1.name);
	
	r1.change(r1);
	System.out.println("After calling: "+r1.name);
	
}
}
