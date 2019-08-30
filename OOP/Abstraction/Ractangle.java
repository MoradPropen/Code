package Abstraction;

public class Ractangle extends Shape {
	Ractangle(double base,double height){
 super(base,height);
	}
 
 void area() {
	 double result = base*height;
	 System.out.println("Area of Ractangle: "+result);
 }

}
