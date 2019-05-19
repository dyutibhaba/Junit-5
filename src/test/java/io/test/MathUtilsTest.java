package io.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils = new MathUtils();
		int expectedVal = 4;
		int actualVal = mathUtils.add(2, 2);
		assertEquals(expectedVal, actualVal);
	}

}
