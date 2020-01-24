package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void correctDate() {
		long SECONDS = 120;
		MyDate ACTUAL = new MyDate(2020, 1, 1, 0, 0, 0);
		String EXPECTED = "2020/01/01 00:02:00";
		
		String result = my.nextTime(SECONDS, ACTUAL);
		assertEquals(EXPECTED, result);
	}
}
