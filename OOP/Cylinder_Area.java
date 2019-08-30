package Lab;

public class Cylinder_Area {
double radius;
double height;
//double pi=3.14;


Cylinder_Area(double r,double h){
	radius=r;
	height=h;
}

void display() {
	System.out.println("Cylinder Area is: "+Math.PI*(radius*radius)*height);
}

}
