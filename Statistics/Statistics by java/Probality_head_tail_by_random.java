package Statistics;

import java.util.Random;

public class Probality_head_tail_by_random {
	 public static void main(String[] args) {
	int totalHead = 0;
	 int totalTail =0;
	 Random random = new Random();
	 for(int i=0;i<1000;i++) {
		 int toss = random.nextInt();
		 if(toss%2==0) {
			 totalHead++;
			 
		 }
		 else {
			 totalTail++;
		 }
	 }

	 System.out.println("Total Head: "+totalHead);
	 System.out.println("Total Tail: "+totalTail);

}
}
