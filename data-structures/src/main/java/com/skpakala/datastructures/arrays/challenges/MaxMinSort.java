package com.skpakala.datastructures.arrays.challenges;

/**
 * 
 * Problem statement: Given an array, re-arrange the elements such that the first position will have the largest number,
 * the second will have the smallest, the third will have the second-largest, and so on.
 * 
 * @author Sujeeth Pakala
 *
 */
public class MaxMinSort {

	public void maxMin(int[] arr) {

		if (arr.length == 0)
			return;
		int[] res = new int[arr.length];
		for (int i = 0, j = arr.length - 1, k = 0; i < res.length; i++) {
			if (i % 2 == 0) {
				res[i] = arr[j--];
			} else {
				res[i] = arr[k++];
			}
		}
		for (int i = 0; i < res.length; i++) {
			arr[i] = res[i];
		}
	}
}
