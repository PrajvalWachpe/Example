package jdk8910Features;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;


/*
 * local date is predefined class introduced in JDK8 this class is used 
 * to manipulate in much simpler way
 */
public class LocadateEx1 {

	public static void main(String[] args) {
	
		LocalDate today=LocalDate.now();
		LocalTime currentTime=LocalTime.now();
		
		System.out.println(" Today's Date is: "+today);
		System.out.println("Day of week: "+today.getDayOfWeek());
		System.out.println("Day of month: "+today.getDayOfMonth());
		System.out.println("Day of year: "+today.getDayOfYear());
		
		LocalDate todayUs=LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println(" "+todayUs);	
		
		LocalTime timeUs=LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println(" "+timeUs);	
		
		LocalDate birthdate=LocalDate.of(2000, 9, 9);
		Period age=Period.between( birthdate,todayUs);
		System.out.println("Prajval's age"+age);
		

		Duration timeDiff=Duration.between(timeUs, currentTime);
		System.out.println(" "+timeDiff);
		
	}
	
}
