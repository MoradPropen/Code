package oop;

public class This_Person {
String name,haircolor;
int age;


This_Person(String name,int age){
	this.name=name;
	this.age=age;
	
}

This_Person(String name,int age,String haircolor){
	this(name,age);
	this. haircolor= haircolor;
	
}
void display() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Haircolor: "+haircolor);
}

}
