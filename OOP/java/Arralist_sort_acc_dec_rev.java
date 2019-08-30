package morad;

import java.util.ArrayList;
import java.util.Collections;

public class Arralist_sort_acc_dec_rev {
 public static void main(String[] args) {
	 ArrayList<Integer>number = new ArrayList<Integer>();
	 number.add(10);
	 number.add(-5);
	 number.add(12);
	 number.add(3);
	 number.add(20);
	 number.add(1);
	 
	 
		 System.out.println(number);
		 //accending
		 Collections.sort(number);
		System.out.println(number);
		
		///deccending+reverse
		
		Collections.sort(number,Collections.reverseOrder());
		System.out.println(number);
		
		 
	
	 
 }
}
