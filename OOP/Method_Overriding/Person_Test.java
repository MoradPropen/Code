package Method_Overriding;

public class Person_Test {
public static void main(String[] args) {
	Teacher t =new Teacher();
	t.name="Morad";
	t.age=22;
	t.Qualification="Bsc in CSE";
	t.display();
	
	Person p =new Person();
	p.name="Propen";
	p.age=20;
	p.display();
	
}
}
