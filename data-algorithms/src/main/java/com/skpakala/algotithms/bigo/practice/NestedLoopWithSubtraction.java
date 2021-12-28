package com.skpakala.algotithms.bigo.practice;

/**
 * Compute Big(O) of an algorithm that involves nested loops and the loop variables decrement.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithSubtraction {

	/**
	 * Initialisations : n, sum, pie
	 * 		- number of iterations : 1
	 * Outer loop : 
	 * 
	 * Inner loop :
	 * 
	 * 
	 * Answer : BigO = nˆ2
	 */
	public void nestedLoop() {
		int n = 10;
		int sum = 0;
		double pie = 3.14;
		// Outer loop
		for (int var = n; var >= 1; var = var - 3) {
			System.out.println("Pie : " + pie);
			// Inner loop
			for (int j = n; j >= 0; j--) {
				sum++;
			}
		}
		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		new NestedLoopWithSubtraction().nestedLoop();
	}

}
