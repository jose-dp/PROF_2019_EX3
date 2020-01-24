package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	public String nextTime(long seconds, MyDate actual) {
		String next = Time.getFutureTime(seconds, actual);
		return next;
	}

}
