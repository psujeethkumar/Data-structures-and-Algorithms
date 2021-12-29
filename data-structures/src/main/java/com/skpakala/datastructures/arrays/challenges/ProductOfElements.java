package com.skpakala.datastructures.arrays.challenges;

/**
 * Problem statement: Given an array, return an array where each index stores the product of all numbers except the number on the index itself.
 * 
 * @author Sujeeth Pakala
 *
 */
public class ProductOfElements {

	/**
	 * 
	 * Time complexity : BigO = O(n)
	 * 
	 * @param arr
	 * @return
	 * 
	 */
	int[] findProduct(int[] arr) {
		int[] result = new int[arr.length];
		for (int x = 0; x < arr.length; x++) {
			int product = 1;
			for (int y = 0; y < arr.length; y++) {
				if (x != y)
					product *= arr[y];
			}
			result[x] = product;
		}
		return result;
	}

}
