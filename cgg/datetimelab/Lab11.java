package cgg.datetimelab;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter year");
		 int year=scan.nextInt();
		 System.out.println("Enter month");
		 int month=scan.nextInt();
		 System.out.println("Enter day");
		 int day=scan.nextInt();
		 LocalDate start = LocalDate.of(year,month,day);
		 LocalDate end = LocalDate.now();
		 
		 Period period = start.until(end);
		 System.out.println("Days "+period.get(ChronoUnit.DAYS));
         System.out.println("Months "+period.get(ChronoUnit.MONTHS));
         System.out.println("Years "+period.get(ChronoUnit.YEARS));
	}

}