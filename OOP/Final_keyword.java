package oop;

public class Final_keyword {
final String UNIVERSITY_NAME ="JUST";
final int fees;//static blank final variable
static final String Location;

Final_keyword(){
	fees = 3300;//for static blank variabler
}

static{
	Location ="Ambottola";//for static final blank variable
	}


void display() {
	System.out.println("Uinversity name: "+UNIVERSITY_NAME);
	System.out.println("Fees: "+fees);
	System.out.println("Location: "+Location);
}
}
