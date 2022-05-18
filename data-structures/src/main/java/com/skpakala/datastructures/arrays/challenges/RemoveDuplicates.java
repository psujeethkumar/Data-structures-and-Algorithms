package com.skpakala.datastructures.arrays.challenges;

/**
 * Problem statement: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 * 
 * @author Sujeeth Pakala
 *
 */
public class RemoveDuplicates {

	/**
	 * Below method returns the count of unique elements in the array. 
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @return
	 */

	public int countUniqueElements(int[] nums) {
		if (nums.length == 0)
			return 0;
		int unique = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[i-1] = nums[i];
				unique++;
			}
		}
		return unique;
	}
}
