package lab;

import java.util.Scanner;

public class Z_score {
public static void main(String[] args) {
	double x,std,avrg,Z;
   Scanner input =new Scanner(System.in);
   x=input.nextDouble();
   std=input.nextDouble();
   avrg=input.nextDouble();
   Z=(x-avrg)/std;
   System.out.println("Z score: "+Z);
   
   
}
}
