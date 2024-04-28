package com.skpakala.datastructures.arrays.challenges;

import org.junit.jupiter.api.Test;

import com.skpakala.datastructures.util.ArrayUtils;

class RotateArrayByIndexTest {

	@Test
	void test() {
		int[] input = { 1, 2, 3, 4, 5 };
		new RotateArrayByIndex().rotateArray(input, 4);
		ArrayUtils.printArrayElements(input);

		int[] input2 = { 10, 100, 1000, 20, 200, 2000 };
		new RotateArrayByIndex().rotateArray(input2, 4);
		ArrayUtils.printArrayElements(input2);
	}

}
