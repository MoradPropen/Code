package Super;

public class instance_variable_B extends instance_variable_A{
int x= 5;
void display() {
	System.out.println(+x);
	System.out.println(+super.x);
}
}
