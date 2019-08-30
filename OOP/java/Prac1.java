package Practice;

import java.util.Scanner;

public class Prac1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
int i,n,j;
String prime = "";
n=input.nextInt();

int counter=0;
for(i=2;i<=n;i++) {
	for(j=2;j<i;j++) {
		if(i%j==0) {
			counter=1;
		}
	}
	if(counter==0)
      prime = prime + i +" ";
		
}
System.out.println(prime);

	
}
}
