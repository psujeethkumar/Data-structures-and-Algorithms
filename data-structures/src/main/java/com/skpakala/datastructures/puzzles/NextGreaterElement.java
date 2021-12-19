package com.skpakala.datastructures.puzzles;

import com.skpakala.datastructures.impl.Stack;

/**
 * Problem statement: Given a circular integer array nums (i.e., the next
 * element of nums[nums.length - 1] is nums[0]), return the next greater number
 * for every element in nums. The next greater number of a number x is the first
 * greater number to its traversing-order next in the array, which means you
 * could search circularly to find its next greater number. If it doesn't exist,
 * return -1 for this number.
 * 
 * Solution for finding next greater element in a array
 * 
 * @author Sujeeth Pakala
 *
 */

public class NextGreaterElement {

	public int[] findNextGreaterElement(int[] inputArray) {
		int length = inputArray.length;
		int[] nge = new int[length];
		final Stack stack = new Stack(length);
		// Iterating 2 times the size of array because 2nd iteration is over the
		// imaginary array.
		for (int i = 2 * length - 1; i >= 0; i--) {
			// Dont panic - this loop is not always executed.
			while (!stack.isEmpty() && stack.peek() <= inputArray[i % length]) {
				stack.pop();
			}
			if (i < length) {
				if (!stack.isEmpty()) {
					nge[i] = stack.peek();
				} else {
					nge[i] = -1;
				}
			}
			stack.push(inputArray[i % length]);
		}
		return nge;
	}
}
