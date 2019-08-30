package morad;

public class Stringdemo3 {
public static void main(String[] args) {
	String m= "my name is Moradul Siddique  ";
	System.out.println(m);
	
	//Trim last & first space can be remove
	String T= m.trim();
	System.out.println(T);
	
	//index char print
	char ch=m.charAt(0);
	System.out.println(ch);
	
	//char index asci value
	int value=m.codePointAt(0);
	System.out.println(+value);
	//index position
	int pos=m.indexOf('n');
	System.out.println(+pos);
	int n=m.indexOf("Mo");
	System.out.println(+n);
	//last index positiohn
	pos=m.lastIndexOf('d');
	System.out.println(pos);
	
	//replace char
	String s=m.replace('M', 'o');
	System.out.println(s);
	
	String[] S = m.split(" ");
	for(String x: S){
	System.out.println(x);
	}
	
}
}
