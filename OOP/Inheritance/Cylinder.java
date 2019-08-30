package Inheritance;

public class Cylinder extends Circle {
	 double height;
	 Cylinder(double r,double h){
		 super(r);
		height=h;
	}

	 @Override
	double getarea() {
	return 2*pi*radius*(height+radius);
	
 }
}
