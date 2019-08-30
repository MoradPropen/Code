package Method_Overriding;

public class Teacher extends Person {
	String Qualification;

@Override	
void display() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Qualification: "+Qualification);
	System.out.println("\n");
	}
}
