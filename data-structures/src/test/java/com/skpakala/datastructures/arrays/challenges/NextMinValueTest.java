package com.skpakala.datastructures.arrays.challenges;

public class NextMinValueTest {

	public static void main(String[] args) {
		NextMinValue minValue = new NextMinValue();

		int[] arr = { 9, 2, 3, 6 };
		System.out.println(minValue.findMinimum(arr));

		int[] arr2 = { 9, 2, 3, 6, 0 };
		System.out.println(minValue.findMinimum(arr2));

		int[] arr3 = { 4, 5, 1, 3, 6 };
		System.out.println(minValue.findMinimum(arr3));
	}

}
