package com.skpakala.algotithms.bigo.practice;

/**
 * 
 * Compute the Big O complexity of an algorithm that involves nested loops where the loop with count limited to modulo between 2 numbers.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithModulo {

	/**
	 * Case 1 : m == n :
	 * Case 2 : m < n  :
	 * Case 3 : m > n  :
	 * 
	 * Answer: O(nˆ2)
	 * 
	 */
	public void nestedLoop() {
		int n = 10;
		int m = 20;
		// Outer loop
		for (int var = 0; var < n; var++) {
			// Inner loop
			for (int j = 0; j < m % n; j = j++) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		new NestedLoopWithModulo().nestedLoop();
	}

}
