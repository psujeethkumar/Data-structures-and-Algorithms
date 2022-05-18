package com.skpakala.datastructures.arrays.challenges;

import org.junit.jupiter.api.Test;

import com.skpakala.datastructures.util.ArrayUtils;

class RemoveDuplicatesTest {

	@Test
	void test() {

		int[] nums = { 1, 1, 2 }; // Input array
		int[] expectedNums = { 1, 2 }; // The expected answer with correct length
		ArrayUtils.printArrayElements(nums);
		System.out.println("----- ");

		int k = new RemoveDuplicates().countUniqueElements(nums); // Calls your implementation
		ArrayUtils.printArrayElements(nums);

		System.out.println(k);
		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		}

		int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expectedNums2 = { 0, 1, 2, 3, 4 };
		ArrayUtils.printArrayElements(nums2);
		System.out.println("----- ");
		k = new RemoveDuplicates().countUniqueElements(nums2); // Calls your implementation
		ArrayUtils.printArrayElements(nums2);
		
		System.out.println(k);
		assert k == expectedNums2.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums2[i];
		}
		

	}

}
