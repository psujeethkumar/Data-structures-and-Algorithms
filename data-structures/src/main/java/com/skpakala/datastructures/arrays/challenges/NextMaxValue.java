package com.skpakala.datastructures.arrays.challenges;

/**
 * Given an array of size "n", find the second maximum value in the array.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NextMaxValue {

	/**
	 * Solution:
	 * 
	 * 
	 * @param arr
	 * @return
	 */
	int findSecondMaximum(int[] arr) {
		int max = arr[0];
		
		// Step 1: Find the maximum value from the input array
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		// Option 1 : In second iteration, compare the sum of max value & element in the array.
		int sum = max, nextMax = max;
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] != max && max + arr[x] > sum) {
				sum = max + arr[x];
				nextMax = arr[x];
			}
		}
		nextMax = 0;

		// Option 2: Compare the current element of the array - should be less than max value & greater than next maximum value.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > nextMax && arr[i] < max) {
				nextMax = arr[i];
			}
		}
		return nextMax;
	}
}
