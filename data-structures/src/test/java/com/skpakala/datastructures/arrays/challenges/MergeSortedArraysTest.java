package com.skpakala.datastructures.arrays.challenges;

public class MergeSortedArraysTest {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5, 9 };
		int[] arr2 = { 2, 6, 7, 8, 9 };

		MergeSortedArrays sortedArrays = new MergeSortedArrays();
		int result[] = sortedArrays.mergeArrays(arr1, arr2);
		ArrayUtils.printArrayElements(result);

	}
}
