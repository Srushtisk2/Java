package com.xworkz.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
		System.out.println("Date");
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getEra());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		//System.out.println(date.getChronology());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfWeek());
		
	
		LocalDate date2 = LocalDate.MAX;
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.MIN;
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("2021-12-26");
		System.out.println(date4);
		
		LocalDate date5 = LocalDate.of(2022, Month.JANUARY, 3);
		System.out.println(date5);
		
		LocalDate date6 = LocalDate.of(1996, 7, 11);
		System.out.println(date6);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM uuuu");
		
		String formattedDate = date4.format(formatter);
		System.out.println(formattedDate);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String formattedDate1 = date6.format(formatter1);
		System.out.println(formattedDate1);
		
		LocalDate date7 = LocalDate.parse("11 Dec 2011", formatter);
		System.out.println(date7);
		
		
		LocalDate date8 = LocalDate.now(ZoneId.of("Australia/Lindeman"));
		System.out.println(date8);
		System.out.println();
		System.out.println("Time");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime time1 = LocalTime.of(15, 59);
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(12, 12, 59);
		System.out.println(time2);
		
		LocalTime time3 = LocalTime.of(12, 12, 59, 896);
		System.out.println(time3);
		
		System.out.println();
		//date&time
		System.out.println("Date&Time");
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDateTime datetime1 = LocalDateTime.of(2012, 5,10, 10, 15);
		System.out.println(datetime1);
	
		System.out.println(datetime1.getMonth());
		System.out.println(datetime1.plusMonths(4));
		System.out.println(datetime1.plusHours(6));
		System.out.println(datetime1.plusDays(56));
		System.out.println(datetime1.plusYears(8));
		
		LocalDate birthday = LocalDate.of(1997,07,11);
		System.out.println(birthday);
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		Period age = Period.between(birthday, today);
		System.out.println(age);
		
		System.out.printf("years : %d, months : %d ,days :%d",age.getYears(),age.getMonths(),age.getDays());
	}

}
