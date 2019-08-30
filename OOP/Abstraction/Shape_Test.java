package Abstraction;

public class Shape_Test {
	public static void main(String[] args) {
		Shape p;
		p = new Triangle(10,20);
		p.area();
		
		p = new Ractangle(10,20);
		p.area();
		
		p = new Circle(10);
		p.area();
		
	}

}
