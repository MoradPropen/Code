package morad;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
	String formattime = time.format(formatter);
	System.out.print(formattime);
}
}
