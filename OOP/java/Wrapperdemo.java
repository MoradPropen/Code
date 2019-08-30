package morad;

public class Wrapperdemo {
public static void main(String[] args) {
	//Primitive -> Object===Autoboxing
	int x = 30;
	Integer y = Integer.valueOf(x);

	System.out.println(y);
	// or
	Integer z = x;
	System.out.println(z);
	
	
	//Outboxing
	//Object->Primitive
	Double d =new Double(12.5);
	System.out.println(d);
	
	double e=d.doubleValue();
	System.out.println(e);
	
	
	
}
}
