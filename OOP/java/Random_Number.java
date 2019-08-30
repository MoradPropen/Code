package morad;

import java.util.Random;

public class Random_Number {
public static void main(String[] args) {
	Random rand = new Random();
	int random = rand.nextInt(10)+1;//1 to 10
	int random1 = (int) (Math.random()*100)+1;//1 to 100
	System.out.println(+random);
	System.out.println(+random1);
}
}
