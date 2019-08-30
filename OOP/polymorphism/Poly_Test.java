package polymorphism;

public class Poly_Test {
public static void main(String [] args) {
	Poly_Person p =new Poly_Person();
	p.display();
	
	p = new Poly_Teacher();
	p.display();
	
	p = new Poly_Student();
	p.display();
	
}
}
