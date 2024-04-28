package com.skpakala.datastructures.arrays.challenges;

import org.junit.jupiter.api.Test;

import com.skpakala.datastructures.util.ArrayUtils;

class MaxMinSortTest {

	@Test
	void test() {
		int[] input = {1, 2, 3, 4, 5};
		new MaxMinSort().maxMin(input);
		ArrayUtils.printArrayElements(input);
		
		int[] input2 = {1, 2, 3, 4, 5, 6, 7};
		new MaxMinSort().maxMin(input2);
		ArrayUtils.printArrayElements(input2);
		
	}

}
