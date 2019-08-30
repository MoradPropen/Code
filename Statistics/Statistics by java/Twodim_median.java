package Statistics;

public class Twodim_median {
public static void main(String[] args) {
	int[][] a = { {11,17},{12,28},{13,37},{14,52},{15,70},{16,48},{17,36},{18,23},{19,11},{20,8}};
	int i,sumfixi=0,sumfi=0;
	double p;
	for (i = 0; i <10; i++) {
		
	sumfixi+=a[i][0]*a[i][1];
	sumfi+=a[i][1];
	
		}
	p= (double)sumfixi/sumfi;
	System.out.print(p);
}
}
