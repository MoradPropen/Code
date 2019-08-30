package oop;

public class variable_argument_method {
void add(int ... num) {
	int sum = 0;
	for(int x : num) {
		sum+=x;
	
	}
	System.out.println(sum);
	
}
}
