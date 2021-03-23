package jUnit;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThirdMathTest {

	Calculator calculator;

	@Before
	public void beforeTest() {
		System.out.println("Before devide test");
		calculator = new Calculator();
	}

	@After
	public void afterTest() {
		System.out.println("After devide test");
		calculator = null;
	}

	@Test
	public void testMathDevide() {
		System.out.println("@testThirdDevide");
		assertEquals(2, calculator.getDevide(4, 2));
	}

}