package cgg.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		 ZonedDateTime now = ZonedDateTime.now();
		 System.out.println("India Local : "+now);
		 ZonedDateTime  paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		 System.out.println("Paris time : "+paris);
		 ZonedDateTime  england = ZonedDateTime.now(ZoneId.of("Europe/London"));
		 System.out.println("England time : "+england);
		 
		 ZonedDateTime  australia = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
		 System.out.println("Australia time :"+australia);
		 
		 System.out.println(now.getDayOfMonth());
		 
		 

	}

}