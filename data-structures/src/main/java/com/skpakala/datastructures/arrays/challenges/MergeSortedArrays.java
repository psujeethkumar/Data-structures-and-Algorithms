package com.skpakala.datastructures.arrays.challenges;

/**
 * Problem statement: Given two sorted arrays, merge them into one array, which should also be sorted.
 * 
 * E.g. : Input : {1, 3, 4, 5}, {2, 6, 7, 8} --> Output {1,2,3,4,5,6,7,8}
 * 
 * @author Sujeeth Pakala
 *
 */
public class MergeSortedArrays {

	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	int[] mergeArrays(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];

		int x = 0, y = 0, k = 0;

		// Traverse both array with its respective indexes.
		while (x < arr1.length && y < arr1.length) {
			// Check if the current element of first array
			// is smaller then current element of second array.
			// if yes, store first array element in the
			// result array and increment array index.
			// Otherwise do with second array.
			if (arr1[x] < arr2[y]) {
				result[k] = arr1[x];
				x++;
			} else {
				result[k] = arr2[y];
				y++;
			}
			k++;
		}
		while (y < arr2.length) {
			result[k] = arr2[y];
			y++;
			k++;
		}
		while (x < arr1.length) {
			result[k] = arr1[x];
			x++;
			k++;
		}
		return result;
	}

}
