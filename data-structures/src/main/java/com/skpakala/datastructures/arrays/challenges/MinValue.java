package com.skpakala.datastructures.arrays.challenges;

/**
 * Given an array of size "n", find the minimum value in the array.
 * 
 * @author Sujeeth Pakala
 *
 */
public class MinValue {

	/**
	 * Solution: 
	 * Assume the first element in the array is minimum value. 
	 * Iterate over the array & compare each element with minimum value. If value is less than minimum, 
	 * then override previous value with value from array.
	 * 
	 * @param arr
	 * @return
	 */
	int findMinimum(int[] arr) {
		int min = arr[0];
		for (int x = 0; x < arr.length ; x++) {
			if(arr[x] < min) {
				min = arr[x];
			}
		}
		return min;
	}
}
