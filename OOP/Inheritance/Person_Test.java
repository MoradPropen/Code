package Inheritance;

public class Person_Test {
public static void main(String [] args) {
	Person_Teacher t1 =new Person_Teacher();
	t1.name = "Morad";
	t1.age = 21;
	t1.Qualificaion= "Bsc in CSE";
	t1.display2();
	
	Person_Teacher t2 =new Person_Teacher();
	t2.name = "PROPEN";
	t2.age = 20;
	t2.Qualificaion= "DIPLOMA IN ENGINNERING";
	t2.display2();
}
}
