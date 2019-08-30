package Abstraction;

public class Triangle extends Shape{
	Triangle(double base,double height){
 super(base,height);
	}
 
 void area() {
	 double result =.5* base*height;
	 System.out.println("Area of Triangle: "+result);
 }
}
