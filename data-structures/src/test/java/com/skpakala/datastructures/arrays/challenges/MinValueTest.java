package com.skpakala.datastructures.arrays.challenges;

public class MinValueTest {

	public static void main(String[] args) {
		MinValue minValue = new MinValue();

		int[] arr = { 9, 2, 3, 6 };
		System.out.println(minValue.findMinimum(arr));

		int[] arr2 = { 9, 2, 3, 6, 0 };
		System.out.println(minValue.findMinimum(arr2));

		int[] arr3 = { 4, 5, 0, 3, 6 };
		System.out.println(minValue.findMinimum(arr3));
	}

}
