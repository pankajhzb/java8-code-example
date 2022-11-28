package com.java8.demo.datetime;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * 
 * @author pankaj.kumar
 *
 */
/*
 * java.util.Date has been a part of Java since version 1.0, and has caused
 * inconveniences as we have already discussed, and more.
 * 
 * The offset of 1900 has been a source of bugs, and the time component has
 * often interfered with the programming. Moreover, the Date class is mutable
 * (as observed in Exercise 12), hence not thread safe and will produce
 * ambiguous results when used in a multi-threaded environment.
 * 
 * To fix these issues java.util.Calendar was introduced in Java 1.1.
 * 
 * 
 * 
 * Unfortunately, Calendar could not overcome all the shortcomings of the Date
 * class:
 * 
 * It also contains both the date and time components
 * 
 * Although the year offset problem has been resolved in Calendar, January is
 * still represented by 0 instead of 1
 * 
 * Calendar cannot be directly formatted
 * 
 * It is mutable and not thread safe just like the Date class
 * 
 * 
 * 
 * To address these issues, third-party libraries like Joda Time were being
 * used.
 * 
 * But, now with the Date/Time API, these problems can be well addressed.
 * 
 * java.time.LocalDate is an immutable, thread-safe class whose instances
 * represent date without the time and time-zone components. Some of its methods
 * are listed below:
 * 
 */
public class DateTimeApp {

	public static void main(String[] args) {

//Method	Description
		LocalDate ld = LocalDate.now();// Gets the current system specific date
		System.out.println("LocalDate - >" + ld);
//LocalDate.of(int year, int month, int day) ;  
		LocalDate localDateObj = LocalDate.of(2020, 8, 11);

		System.out.println("Get day of the week - >" + localDateObj.getDayOfWeek().name());
//Returns LocalDate of given year, month and day

//LocalDate.plusDays(long days); 
//LocalDate.plusMonths(long months);
//LocalDate.plusYears(long years);

//Gets copy of the LocalDate after adding number of days/months/years that is passed

//LocalDate.parse(CharSequence date);	
//Returns LocalDate from the character sequence (2018-11-11) passed

//LocalDate.compareTo(ChronoLocalDate date);

//Compares the LocalDate instance on which this method is invoked with the LocalDate instance supplied as argument

	}

}
