package jUnit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizeTest extends Assert {

	private int firstInt;
	private int secondInt;
	private int result;
	private Calculator calculator;

	public ParametrizeTest(int firstInt, int secondInt, int result) {
		super();
		this.firstInt = firstInt;
		this.secondInt = secondInt;
		this.result = result;
	}

	@Before
	public void initialize() {
		calculator = new Calculator();
	}

	@Parameterized.Parameters()
	public static Collection<Integer[]> input() {
		return Arrays.asList(new Integer[][] { { 2, 2, 4 }, { 3, 1, 5 }, { 1, 2, 3 }, });
	}

	@Test
	public void Summ() {
		assertEquals(result, calculator.getSum(firstInt, secondInt));

	}

	@Test
	public void Devide() {
		assertEquals(result, calculator.getDevide(firstInt, secondInt));

	}

	@Test
	public void Multiply() {
		assertEquals(result, calculator.getMultiple(firstInt, secondInt));

	}
}