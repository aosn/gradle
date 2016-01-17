package com.example.util;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class WhenPerformingTheFourBasicArithmeticOperations {
	public static class InAddition {
		@Test
		public void shouldReturnTheSumOfNumbersWhichAreNumericString() {
			assertEquals(new BigDecimal(2), BasicArithmeticOperations.plus("1", "1"));
		}
		@Test
		public void shouldReturnTheSumOfNumbersWhichAreBigDecimal() {
			assertEquals(new BigDecimal(2), BasicArithmeticOperations.plus(new BigDecimal(1), new BigDecimal(1)));
		}
	}
}
