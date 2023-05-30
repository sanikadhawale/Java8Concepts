package example;
import java.time.*;

public class DateTimeAPI {
	
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(1989, Month.FEBRUARY, 10);
		System.out.println(d1);
		
		LocalTime t= LocalTime.now();
		System.out.println(t);
		
		LocalTime t1 = LocalTime.of(12, 35, 10, 999);
		System.out.println(t1);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		LocalDateTime dt1 = LocalDateTime.now(ZoneId.of("Europe/Monaco"));
		System.out.println(dt1);
	}

}
