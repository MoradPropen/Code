package polymorphism;

public class Shape_area_Test {
	public static void main(String[] args) {
	
	Shape_area a =new Shape_area();
	Shape_area b =new Triangle(10,25);
	Shape_area c =new Ractangle(20,30);
	
	System.out.println(a.area());
	System.out.println(b.area());
	System.out.println(c.area());
	
	/*print by array
	Shape_area[] s = new Shape_area[3];
	for(int i=0;i<3;i++) {
		//System.out.println(s[i].area());
	}*/

}
}
