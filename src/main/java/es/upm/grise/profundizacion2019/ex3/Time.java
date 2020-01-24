package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	public static String getFutureTime(long seconds, MyDate actual) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime time = LocalDateTime.of(actual.getYear(), actual.getMonth(), actual.getDay(), actual.getHour(), actual.getMinute(), actual.getSecond());
		LocalDateTime newTime = time.plusSeconds(seconds);
		return formatter.format(newTime);	
	}

}
