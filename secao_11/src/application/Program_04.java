package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program_04 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2001-10-21");
		LocalDateTime d05 = LocalDateTime.parse("2024-01-01T02:30:45");
		Instant d06 = Instant.parse("2024-01-01T01:30:45Z");
		
		LocalDate pastWeekLocalDate = d04.minusWeeks(1);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		
		System.out.println("t1 dias = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
		
		System.out.println("t2 dias = " + t2.toDays());
		
		
	}

}
