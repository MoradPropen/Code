package oop;

public class static_variable {
	String name,gender;
	 int phn;
	 static String university ="JUST"; 
	
	 static_variable(String n,String g,int p) {
		 name = n;
		 gender = g;
		 phn = p;
	 }
	 
	 void display() {
		 System.out.println("Name:"+name);
			System.out.println("gender:"+gender);
			System.out.println("Phone:"+phn);
			System.out.println("University Name:"+university);
			System.out.println("\n");
	 }
}
