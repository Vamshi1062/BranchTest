package cgg.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current DateTime : "+dateTime);
		LocalDateTime of = LocalDateTime.of(2023, 5, 16, 11, 33, 32);
		System.out.println("may 16th dateTime : "+of);
		
		System.out.println(dateTime.getDayOfYear());
		System.out.println("155 th day of the year "+dateTime.withDayOfYear(155));
		System.out.println("Plus 12 days "+dateTime.plusDays(12));
		
		System.out.println(dateTime.isAfter(of));

	}

}
