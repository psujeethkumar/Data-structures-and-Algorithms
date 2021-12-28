package com.skpakala.algotithms.bigo.challenges;

/**
 * Determine the number of instructions executed for the best case when the array size is 5.
 * Best case happens when the array is already sorted in ascending order.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NumberOfIterations {

	/**
	 * Each operation amongst the variables is an instruction;
	 * 
	 * Aggregate of indicated instruction is 1 + 6 + 5 + 5 + 5 + 5 + 5 = 32.
	 * 
	 * @param input
	 */
	public void insertionSort(int input[]) {
		for (int i = 0; i < input.length; i++) { // n(i = 0) = 1 ; n(i < input.length) = (5 + 1); n(i++) = 5
			int key = input[i]; // 5
			int j = i - 1; // 5
			while (j >= 0 && input[j] > key) { // n(j>=0) = 5 ; n(input[j] > key)= 5
				if (input[j] > key) {
					int tmp = input[j];
					input[j] = key;
					input[j + 1] = tmp;
					j--;
				}
			}
		}
	}

}
