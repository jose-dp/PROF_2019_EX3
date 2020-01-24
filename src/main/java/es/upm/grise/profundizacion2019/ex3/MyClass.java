package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	public void nextTime(long seconds, MyDate actual, Time time) {
		String next = time.getFutureTime(seconds, actual);
		System.out.println(next);
	}

}
