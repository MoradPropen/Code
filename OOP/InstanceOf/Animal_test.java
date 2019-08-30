package InstanceOf;

public class Animal_test {
	public static void main(String[] args) {
		Person p =new Person();
		Teacher t =new Teacher();
		Animal a =new Animal();
		
		System.out.println(a instanceof Animal);
		System.out.println(p instanceof Animal);
		System.out.println(t instanceof Animal);
		System.out.println(t instanceof Person);
		System.out.println(p instanceof Teacher);
		
		
	}
}
