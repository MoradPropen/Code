package oop;

public class CallByValue_test {
	public static void main(String [] args) {
		CallByValue ob = new CallByValue();
		int x =10;
		System.out.println("Before calling: "+x);
		
		ob.change(x);//actual parameter
		System.out.println("After calling: "+x);
		
	}
}
