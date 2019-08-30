package morad;

import java.util.ArrayList;

public class ArraListdemo2 {
	public static void main(String[] args) {
		ArrayList<Integer>number = new ArrayList<Integer>();
		//System.out.println("size = "+number.size());
  //adding element
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3,40);
		for(int x:number) {
		System.out.println(" "+x);
	}
		boolean  check =number.isEmpty();
		System.out.println("Arralist empty: "+check);
		boolean contain = number.contains(30);
		System.out.println("30 is the list: "+contain);
		int pos = number.indexOf(40);
		System.out.println("the index 40 is: "+pos);
		
		//REPLACE VALUE
		number.set(3,50);
		System.out.println(number);
		
		int x=number.get(0);
		System.out.println("index 0= "+x);
}
}
