package cgg.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		 LocalDate now = LocalDate.now();
		 System.out.println(now);
         System.out.println(now.getDayOfWeek());
         LocalDate date = LocalDate.of(1947,Month.AUGUST,15);
         System.out.println(date);
         System.out.println("Tomorrow :"+now.plusDays(1));
         System.out.println("Last Month same day : "+now.minusMonths(1));
         System.out.println("Is it Leap Year :"+now.isLeapYear());
         System.out.println("Last day Of Month :"+now.withDayOfMonth(30));
         System.out.println(now.getDayOfYear()+"th day in the year "+now.getYear());
         System.out.println(now.getDayOfMonth());
         System.out.println(now.withDayOfYear(160));
         
	}

}
