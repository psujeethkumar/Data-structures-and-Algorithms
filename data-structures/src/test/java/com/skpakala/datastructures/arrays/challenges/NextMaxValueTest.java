package com.skpakala.datastructures.arrays.challenges;

import org.junit.jupiter.api.Test;

class NextMaxValueTest {

	@Test
	void test() {

		int[] input = { 9, 2, 3, 6 };
		assert new NextMaxValue().findSecondMaximum(input) == 6;

		int[] input2 = { 4, 2, 1, 5, 0 };
		assert new NextMaxValue().findSecondMaximum(input2) == 4;
	}

}
