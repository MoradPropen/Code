package Contructor;

public class Overloading {
   String name,gender;
   int roll;
	
	Overloading(){
		System.out.println("No Information");
		System.out.println("\n");
	}
	
   Overloading(String n,String g,int r){
		name = n;
		gender = g;
		roll = r;
		
	}

  Overloading(String n,int r){
	  name = n;
	 roll = r;
  }
	 
	  void display() {
			 System.out.println("Name:"+name);
				System.out.println("gender:"+gender);
				System.out.println("Roll:"+roll);
				System.out.println("\n\n");
		 
	  
}
}
