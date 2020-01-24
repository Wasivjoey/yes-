package ap.lab2.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ap.lab2.app.CalculatorService;

public class CalculatorServiceTest {
	/**
	 * stores service instance under test 
	 * @throws Exception
	 */
	private CalculatorService services;
	@Before
	public void setUp() throws Exception {
		services = new CalculatorService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int num1 =5, num2 =7;
		int actualResult = services.add(num1, num2);
		int expectedResult =num1+num2;
		assertEquals(expectedResult, actualResult);
		
	}

}
