package org.tnsindia.datetime;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneDateTimeProgram2 {

	public static void main(String[] args) {
		
		LocalTime d=LocalTime.now(ZoneId.of("America/Puerto_Rico"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("America/Puerto_Rico"));
		System.out.println(d);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
	    }

	}

}
