package morad;

public class StringtoPrimitive {
public static void main(String[] args) {
	//Primitive to String
	int i=10;
	double d = 10.4;
	String x = Integer.toString(i);
	String y = Double.toString(d);

	System.out.println(x);
	System.out.println(d);
	
	//String to Primitive
	
	String s = "20";
	int j = Integer.parseInt(s);
	System.out.println(+j);
	
	//Or
	 String k = "50";
	 int l = Integer.valueOf(k);
	 System.out.println(+l);
}
}
