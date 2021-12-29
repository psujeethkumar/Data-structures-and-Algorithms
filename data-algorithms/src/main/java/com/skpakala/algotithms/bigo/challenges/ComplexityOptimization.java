package com.skpakala.algotithms.bigo.challenges;

/**
 * 
 * We implemented unoptimised code for generating permutations of a string.
 * The solution used extra space and also ran the main loop for the entire length of the array on each invocation.
 * Given the following optimised solution, can you work out the time complexity?
 * 
 * @author Sujeeth Pakala
 *
 */
public class ComplexityOptimization {

	public static void main(String args[]) {
		char[] array = new char[] { 'a', 'b', 'c', 'd' };
		permutate(array, 0);
	}

	private static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	static void permutate(char[] str, int index) {
		if (index == str.length) {
			System.out.println(str);
			return;
		}
		for (int i = index; i < str.length; i++) {
			swap(str, index, i);
			permutate(str, index + 1);
			swap(str, index, i);
		}
	}
}
