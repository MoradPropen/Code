package morad;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCurrent {
	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		DateFormat dateformate = new SimpleDateFormat("dd/MM/YYYY");
		String currentdate = dateformate.format(date);
		System.out.println(currentdate);
		}
}
