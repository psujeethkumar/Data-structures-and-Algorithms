package com.skpakala.algotithms.bigo.challenges;

/**
 * Class has method depicting the implementation of insertion sort.
 * When an sorted array is passed to the method, determine weather the algorithm execute a linear number of instructions or not.
 * 
 * @author Sujeeth Pakala
 */
public class Linearity {

	int sort(int[] input) {
		int counter = 0;
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			for (int j = i - 1; j >= 0; j--) {
				if (input[j] > key) {
					int tmp = input[j];
					input[j] = key;
					input[j] = tmp;
					// Keep track of iteration count.
					counter++;
				}
			}
		}
		System.out.println(counter);
		return counter;
	}

	public static void main(String[] args) {
		Linearity linearity = new Linearity();
		boolean isLinear = false;
		int[] unsortedArray = { 5, 4, 3, 2, 1 };
		isLinear = linearity.sort(unsortedArray) > 0 ? true : false;
		System.out.println("Is sort method linear for unsorted array ? : " + isLinear);
		int[] sortedArray = { 1, 2, 3, 4, 5 };
		isLinear = linearity.sort(sortedArray) > 0 ? true : false;
		System.out.println("Is sort method linear for sorted array ? : " + isLinear);
	}
}
