package com.skpakala.datastructures.arrays.challenges;

/**
 * Problem statement: Given an array, find the first integer, which is unique in the array.
 * Unique means the number does not repeat and appears only once in the whole array.
 * 
 * @author Sujeeth Pakala
 *
 */

public class NonRepeatingLinearElement {

	/**
	 * Create 2 level nested loop.
	 * Inside inner loop check each index of outer loop if element is repeated in array or not.
	 * It its not repeated, return this as first unique integer.
	 * 
	 * 
	 * Optimal solution : Hashing algorithm is more efficient approach.
	 * 
	 * @param arr
	 * @return
	 */
	int findFirstUnique(int[] arr) {
		boolean isRepeated = false;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				if (arr[x] == arr[y] && x != y) {
					isRepeated = true;
					break;
				}
			}
			if (isRepeated == false) {
				return arr[x];
			} else {
				isRepeated = false;
			}
		}
		return -1;
	}
}
