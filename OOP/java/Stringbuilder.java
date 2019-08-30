package morad;

public class Stringbuilder {
public static void main(String[] args) {
	StringBuilder str = new StringBuilder("Moradul");
	System.out.println(str);
	
	str.append(" Siddique");
	str.append(" Propen 44");
	System.out.println(str);
	
	//delete
	str.delete(8,17);
	System.out.println(str);
	
	//Reverse
	str.reverse();
	System.out.println(str);
	
}

}
