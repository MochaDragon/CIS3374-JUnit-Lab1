package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Test
	public void testAdd() {
		assertEquals(4, calculator.add(2, 2));
	}

	@Test
	public void testSubtract() {
		assertEquals(4, calculator.subtract(8, 4));
	}

	@Test
	public void testMultiply() {
		assertEquals(4, calculator.multiply(2, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(4, calculator.divide(8, 2));
	}
	
	@Test
	public void isEqualPositiveTest() {
		assertTrue(calculator.isEqual(2, 2));
	}
	
	@Test
	public void isEqualNegativeTest() {
		assertFalse(calculator.isEqual(4, 2));
	}

}
