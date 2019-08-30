package morad;

public class Stringdemo1 {
	public static void main(String[] args) {
		String s1 = "Moradul siddique";
		System.out.println(s1);
		String s2=new String("Moradul siddique");
		System.out.println(s2);
		
		int len = s1.length();
		System.out.println(len);
		//type 1
		if(s1.equalsIgnoreCase(s2))
		System.out.println("Equals");
		else 
			System.out.println("not Equals");
		
		boolean con =s1.contains("Morad");
		System.out.println(con);
		
		boolean b =s1.isEmpty();
		System.out.println(b);
		//type 2
		/*if(s1.equals(s2))
			System.out.println("Equals");
			else 
		System.out.println("not Equals");
		//type 3
		
		if(s1.contains(s2))
		System.out.println("Equals");
		else 
			System.out.println("not Equals");*/
		
		
	}

}
