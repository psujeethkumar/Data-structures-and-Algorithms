package com.skpakala.datastructures.arrays.challenges;

/**
 * Problem statement : Given an array of size n, remove all even integers from it.
 * Implement this solution in Java and see if it runs without an error.
 * 
 * E.g. Input : {1,2,4,5,6,8,3,7} --> Output: {1,5,3,7}
 * 
 * @author Sujeeth Pakala
 *
 */
public class RemoveEvenIntegers {

	/**
	 * Prototype method to implement deleting even integers from given input array.
	 * Solution steps :
	 * 1. Count number of odd elements in the input array
	 * 2. Create new array with the size equivalent to count of off numbers
	 * 3. Allocate new array with odd elements from the input array.
	 * 
	 * Time complexity : Entire array is iterated over, therefore BigO is O(n).
	 * 
	 * @param inputArray
	 * @return
	 */
	int[] removeEven(int[] inputArray) {

		int oddNumberCounter = 0;
		// 1
		for (int x = 0; x < inputArray.length; x++) {
			if (inputArray[x] % 2 == 1)
				oddNumberCounter++;
		}
		int[] oddNumberArray = new int[oddNumberCounter];

		// 2
		for (int x = 0, y = 0; x < inputArray.length; x++) {
			if (inputArray[x] % 2 == 1) {
				// 3
				oddNumberArray[y] = inputArray[x];
				y++;
			}
		}
		return oddNumberArray;
	}

}
