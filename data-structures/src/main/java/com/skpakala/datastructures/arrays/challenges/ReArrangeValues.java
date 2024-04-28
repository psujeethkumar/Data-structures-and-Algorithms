package com.skpakala.datastructures.arrays.challenges;

/**
 * 
 * Problem statement: Given an array,
 * re-arrange its elements in such a way that the negative elements appear at one side and positive elements appear at the other
 * 
 * @author Sujeeth Pakala
 *
 */

public class ReArrangeValues {

	/**
	 * 
	 * Solution uses 2 arrays : each storing positive & negative values.
	 * 
	 * @param arr
	 */
	public static void reArrange(int[] arr) {

		if (arr.length == 0)
			return;

		int[] neg = new int[arr.length];
		int[] pos = new int[arr.length];

		int negCounter = 0, posCounter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				neg[negCounter] = arr[i];
				negCounter++;
			} else {
				pos[posCounter] = arr[i];
				posCounter++;
			}
		}
		for (int i = 0; i <= arr.length; i++) {
			if (neg[i] != 0) {
				arr[i] = neg[i];
			}
			if (pos[i] != 0) {
				arr[negCounter] = pos[i];
				negCounter++;
			} else {
				break;
			}
		}
	}

	/**
	 * 
	 * Solution using one array to store both positive & negative arrays &
	 * then move the new array to the original array.
	 * 
	 * @param arr
	 */
	public static void reArrangeOption2(int[] arr) {
		int[] newArray = new int[arr.length];
		int newArrayIndex = 0;

		// Fill newArray with Negative Values first.
		// Then fill it with positive values.
		// In the end, insert every element of newArray back into original arr.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				newArray[newArrayIndex++] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 0)
				newArray[newArrayIndex++] = arr[i];
		}
		for (int j = 0; j < newArrayIndex; j++) {
			arr[j] = newArray[j];
		}
	}

	
	/**
	 * Solution using the swap method within the same array.
	 * @param arr
	 */
	public static void reArrangeOption3(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) { // if negative number found
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j]; // swapping with leftmost positive
					arr[j] = temp;
				}
				j++;
			}
		}

	}
}
