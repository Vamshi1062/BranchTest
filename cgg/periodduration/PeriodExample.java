package cgg.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

	public static void main(String[] args) {
		 LocalDate start = LocalDate.of(2014,Month.JUNE, 2);
		 LocalDate end = LocalDate.now();
		 
		 Period period = start.until(end);
		 System.out.println("Days "+period.get(ChronoUnit.DAYS));
         System.out.println("Months "+period.get(ChronoUnit.MONTHS));
         System.out.println("Years "+period.get(ChronoUnit.YEARS));
         
         System.out.println("-----------------------------------------");
         
         LocalDate  id = LocalDate.now();
         LocalDate fd = id.plus(Period.ofDays(5));
         System.out.println(fd);
         
         int days= Period.between(id, fd).getDays();
         System.out.println(days+" days");
         
         
         System.out.println("-----------------------------------------");
         
         long between = ChronoUnit.DAYS.between(id, fd);
         System.out.println(between+" days");
         
         
         System.out.println("-----------------------------------------");
         LocalDate  today = LocalDate.now();
         
         LocalDate  dob = LocalDate.of(1945,Month.JANUARY,26);
         
         Period p = Period.between(dob,today);
         long  p1 = ChronoUnit.DAYS.between( dob,today);
         
         System.out.println("You are "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
         
         System.out.println(p1+" Total days");
         
         //To Calculate Next Birthday
         LocalDate  nextbday = dob.withYear(today.getYear());
         if(nextbday.isBefore(today)||nextbday.isEqual(today)) {
        	 nextbday=nextbday.plusYears(1);
         }
         Period P = Period.between( today,nextbday);
         long  p2 = ChronoUnit.DAYS.between( today,nextbday);
         System.out.println("There are "+P.getMonths()+" months and "+P.getDays()+" days until your next bday");
         
         System.out.println("Total "+p2);
         System.out.println("------------------------------------------------------");
         
         LocalTime it = LocalTime.of(6,30,0);
         LocalTime  ft = it.plus(Duration.ofSeconds(30));
         long between2 = Duration.between(it, ft).getSeconds();
         System.out.println(between2+" seconds");
         long between3 = ChronoUnit.SECONDS.between(it, ft);
         System.out.println(between3);
         
         System.out.println("-----------------------------------------------------");
         
         //Date and Time Formating
         
         DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
         
         LocalDate now = LocalDate.now();
         System.out.println(now.format(formatter));
         
         System.out.println("----------------------------------------------------");
         
         DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
         LocalTime now2 = LocalTime.now();
         System.out.println(now2.format(formatter2));
         
         System.out.println("--------------------------------------------------");
         
         DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String text="12/12/2012";
         LocalDate parse = LocalDate.parse(text,pattern);
         System.out.println(parse);
         
         System.out.println("--------------------------------------------------");
         
         DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("HH-mm-ss");
         String text1="12-19-10";
         LocalTime parse2 = LocalTime.parse(text1,pattern2);
         System.out.println(parse2);
	}

}
