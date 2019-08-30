package morad;

public class Stringdemo2 {
public static void main(String[] args) {
	
	 String s1 = "Moradul";
	 String s2 = " siddique";
	 System.out.println(s1+s2);
	 //concat
	 String s3=s1.concat(s2);
	 System.out.println(s3);
	 //Uppercase
	 String s4 = s3.toUpperCase();
	 System.out.println(s4);
	 String s5= s3.toLowerCase();
	 System.out.println(s5);
	 
	 boolean firstname = s1.startsWith("M");
	 System.out.println( firstname);
	 
	  boolean lastname= s1.endsWith("l");
	  System.out.println(lastname);
 }
}
