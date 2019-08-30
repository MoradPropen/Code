package polymorphism;

public class Ractangle extends Shape_area{
	double length,width;
	
	Ractangle(double length,double width){
		this.length = length;
		this.width=width;
	}
	double area() {
		System.out.print("Area of Ractangle: ");
		return length*width;
	}
}
