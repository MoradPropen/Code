package morad;

public class Strinbuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Moradul");
	System.out.println(sb);
	
	sb.append(" Siddique");
	sb.append(" propen");
	System.out.println(sb);
	
	
	
	//delete
	sb.delete(16,23);
	System.out.println(sb);
	
	//reverse
		sb.reverse();
		System.out.println(sb);
		
		//trim
		sb.setLength(5);
		System.out.println(sb);
		
		}
}
