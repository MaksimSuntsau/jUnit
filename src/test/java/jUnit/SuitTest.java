package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ FirstMathTest.class, SecondMathTest.class, ThirdMathTest.class, ParametrizeTest.class })
public class SuitTest {
}