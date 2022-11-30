package es.uclm.esi.iso2.ismael;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.add(a, b);
	 
	    int expected = 6912;
	 
	    assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#subtract(int, int)}.
	 */
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.subtract(b, a);
	 
	    int expected = 4444;
	 
	    assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link es.uclm.esi.iso2.ismael.Calculator#subtract(int, int)}.
	 */
	

	
	
}
