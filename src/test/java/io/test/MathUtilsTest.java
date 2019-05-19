package io.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expectedVal = 4;
		int actualVal = mathUtils.add(2, 2);
		assertEquals(expectedVal, actualVal);
	}
	
	/*
	 * TDD - 
	 * first write the test case, with the method declaration.
	 */
	
	@Test
	void testComputeCircleRadius() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The test failed");
	}

}
