package Practice;

import java.util.Scanner;

public class Equation1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int ans,x,r;
	x = input.nextInt();
	r =x*x*x;
	ans = r + (3*x) + 29;
	System.out.println(ans);
	
}
}
