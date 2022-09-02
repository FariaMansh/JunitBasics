package com.cogent;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NumberCalculationTest {
	
	//create reference of NumberCalculation
	NumberCalculation nc = new NumberCalculation();
	
//	@BeforeEach
//	public void init() {
//		nc = new NumberCalculation();
//	}
	
	@Test
	public void testAddition() {
		assertEquals(nc.add(10, 20), 30);
	}
	
	//Inner Class
	@Nested
	class AddTest {
		
		@Test
		public void addPositive() {
			assertEquals(nc.add(2, 4), 6);
			
		}
		
		@Test
		public void addPos_Neg() {
			assertEquals(nc.add(9, -5), 4);
			
		}
		
		@Test
		public void addNeg() {
			assertEquals(-2, nc.add(-1, -1));
		}
	}
	
	
	@Test
	public void testMultiply() {
		assertAll(
				() -> assertEquals(0, nc.multiply(0, 1)),
				() -> assertEquals(5, nc.multiply(5, 1)),
				() -> assertEquals(nc.multiply(4, 5), 20)
				);
	}
	
	@Test
	public void testDivide() {
		//testcase pass if it throws Exceptions.
		assertThrows(ArithmeticException.class, () -> nc.divide(1, 0), "Denominator should not be zero");
	}
	

}
