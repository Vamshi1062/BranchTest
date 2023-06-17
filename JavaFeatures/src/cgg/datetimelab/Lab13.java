package cgg.datetimelab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Purchased year");
		 int year=scan.nextInt();
		 System.out.println("Enter Purchased month");
		 int month=scan.nextInt();
		 System.out.println("Enter Purchased  day");
		 int day=scan.nextInt();
		LocalDate date= LocalDate.of(year, month, day);
		System.out.println("Enter No of Warranty years");
		int wyear=scan.nextInt();
		System.out.println("Enter No Of Warranty Months");
		int wmonth=scan.nextInt();
		
		LocalDate expirationDate=calculatewarranty(date,wyear,wmonth);
		System.out.println("Expired date is :"+expirationDate);

	}

	private static LocalDate calculatewarranty(LocalDate date, int wyear, int wmonth) {
		LocalDate expirationDate=date.plus(Period.ofYears(wyear)).plus(Period.ofMonths(wmonth));
		return expirationDate;
	}

}
