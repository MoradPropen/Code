package morad;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer>number = new ArrayList<Integer>();
		//System.out.println("size = "+number.size());
  //adding element
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3,40);
		//using Iterator
		Iterator itr = number.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
			//using for each loop  
		
		//System.out.println(number);
		//System.out.println("size = "+number.size());
		//Removing element
		number.remove(2);
		System.out.println("afer removing "+number);
		number.removeAll(number);
		System.out.print("after all removing "+number);
		
		
		
	}
}
