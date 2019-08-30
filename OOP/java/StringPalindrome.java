package morad;

public class StringPalindrome {
public static void main(String[] args) {
	String s1 = "mam";
	StringBuffer sb = new StringBuffer(s1);
	String s2 = sb.reverse().toString();
	System.out.println(s1);
	if(s1.equals(s2)){
	System.out.println("Palindrome");
	}else{
		System.out.println("Not Palindrome");
	}
	
}
}
