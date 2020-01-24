package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

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
		
		Time time = new Time();
		String result = time.getFutureTime(SECONDS, ACTUAL);
		assertEquals(EXPECTED, result);
	}
	
	@Test
	public void verifyOneCallMyClass() {
		long SECONDS = 120;
		MyDate ACTUAL = new MyDate(2020, 1, 1, 0, 0, 0);
		Time TIME = mock(Time.class);
		my.nextTime(SECONDS, ACTUAL, TIME);
		
		verify(TIME, times(1)).getFutureTime(SECONDS, ACTUAL);
	}
}
