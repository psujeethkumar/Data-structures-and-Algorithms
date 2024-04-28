package com.skpakala.datastructures.arrays.challenges;

import org.junit.jupiter.api.Test;

import com.skpakala.datastructures.util.ArrayUtils;

public class ReArrangeValuesTest {

	@Test
	void test() {
		int[] input = { 10, -1, 20, 4, 5, -9, -6 };
		new ReArrangeValues().reArrange(input);
		ArrayUtils.printArrayElements(input);
	}

}
