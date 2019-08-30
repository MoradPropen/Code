package oop;

public class static_block {

	static String name;
	static int id;
	static {
		id =170144;
		name="Morad";
	}
	static void display() {
		 System.out.println("Name:"+name);
	     System.out.println("Id:"+id);
	}
	
	public static void main(String[] args) {
		static_block.display();
	}
}
