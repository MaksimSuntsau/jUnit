package jUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstMathTest extends Assert {

	Calculator calculator;

	@Before
	public void beforeTest() {
		System.out.println("Before test");
		calculator = new Calculator();
	}

	@After
	public void afterTest() {
		System.out.println("After test");
		calculator = null;
	}

	@Test
	public void testMathPlus() {
		System.out.println("@testMathPlus");
		assertEquals(4, calculator.getSum(2, 2));
	}

}