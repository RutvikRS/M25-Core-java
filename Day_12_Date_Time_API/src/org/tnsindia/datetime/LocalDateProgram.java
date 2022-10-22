package org.tnsindia.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateProgram {

	public static void main(String[] args) {
		
		LocalDate l= LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate tt = LocalDate.of(2001,Month.NOVEMBER, 30);

		System.out.println(l);
		System.out.println(t);
		System.out.println(dt);
		System.out.println(tt);
		
		
		
	}

}
