package Contructor;

public class cons_main {
	String name,gender;
	 int phn;
	
	 cons_main(String n,String g,int p) {
		 name = n;
		 gender = g;
		 phn = p;
	 }
	 
	 void display() {
		 System.out.println("Name:"+name);
			System.out.println("gender:"+gender);
			System.out.println("Phone:"+phn);
			System.out.println("\n");
	 }
}
