package oop;

public class method_Teacher {
String name,gender;
int roll, phone;

void info(String n,String g,int r,int p ) {
	name = n;
	gender =g;
	roll =r;
	phone = p;	
}


void display() {
	System.out.println("Name :"+name);
	System.out.println("Gender :"+gender);
	System.out.println("Roll :"+roll);
	System.out.println("Phone :"+phone);
	System.out.println("\n");
}
}

