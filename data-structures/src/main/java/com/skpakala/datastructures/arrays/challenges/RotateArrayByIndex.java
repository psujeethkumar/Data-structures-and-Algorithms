package com.skpakala.datastructures.arrays.challenges;

/**
 * 
 * Problem statement : Given an array, can you rotate its elements once from right to left?
 * 
 * @author Sujeeth Pakala
 *
 */

public class RotateArrayByIndex {
	
	/**
	 * Time complexity O(n)
	 * @param arr
	 * @param index
	 */

	public void rotateArray(int[] arr, int index) {
		int length = arr.length;
		int[] res = new int[length]; // Swapping in the same loop is impossible. Therefore, stor the result in another array.
		for (int i = 0; i < length; i++) {
		     int newIndex = (i + index) % length;  // % operator rotates the array. To begin the rotation from an start index of rotation must be added to the loop index variable.
		      res[newIndex] = arr[i];
		}
		// Store back the rorated array into the original array 
		for (int i=0; i<length; i++) {
		      arr[i] = res[i];
		   }

	}
}
