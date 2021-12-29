package com.skpakala.datastructures.arrays.challenges;

import java.util.Arrays;

/**
 * Problem statement: Given an array and a number "n", find two numbers from the array that sums up to "n".
 * 
 * E.g.: Input : {1,4, 21 , 25, 30} , 25 --> Output {4, 21} or {21, 5}
 * 
 * @author Sujeeth Pakala
 *
 */
public class SumOfTwoNumbers {

	/**
	 * Most time-intensive but intuitive solution.
	 * Solution : Brute Force
	 * 1. Traverse the whole array of given size .
	 * 2. For each element in array check if it can add up with any element after it to give number n.
	 * Use nested loop for this purpose and iterate over the entire array for each element.
	 * 
	 * Time complexity : o(nˆ2)
	 * 
	 * Alternate solution : Using QuickSort,
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	int[] findSumType1(int[] arr, int n) {
		int[] result = new int[2];
		for (int x = 0; x < arr.length; x++) {
			for (int y = x; y < arr.length; y++) {
				if (arr[x] + arr[y] == n) {
					result[0] = arr[x];
					result[1] = arr[y];
					break;
				}
			}
		}
		return result;
	}

	/**
	 * Solution :
	 * After sorting the array in ascending order (QuickSort algorithm is efficient),
	 * iterate over the array with 2 pointers one starting from lower index and other from higher index.
	 * Within each iteration, sum up the indexed elements & compare to expected count.
	 * If condition satisfies, store those elements in the result array.
	 * 
	 * Time complexity assuming quick sort is used, BigO = O(n*logn)
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	int[] findSumType2(int[] arr, int n) {
		int[] result = new int[2];

		// Quick sort algorithm to be implemented.
		// For sake of simplicity, java framework is used to sort array.
		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;
		int sum = 0;
		while (i != j) {
			sum = arr[i] + arr[j];
			if (sum < n) {
				i++;
			} else if (sum > n) {
				j--;
			} else {
				result[0] = arr[i];
				result[1] = arr[j];
				break;
			}
		}
		return result;
	}

}
