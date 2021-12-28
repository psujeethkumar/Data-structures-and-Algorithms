package com.skpakala.algotithms.bigo.practice;

/**
 * An advanced exercise based on the Big O of an algorithm. Like before, it involves nested loops in which the loop variables increment
 * through multiplication and addition.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithMultiplicationAdvanced {

	/**
	 * Aggregate :
	 * => O(n) * O(log_2(n))
	 * => O(n * log_2(n))
	 * 
	 * Hence BigO complexity : n*log(n)
	 * 
	 */
	public void nestedLoop1() {
		int n = 10;
		int sum = 0;
		double pie = 3.14;
		// Outer loop
		for (int var = 0; var < n; var++) { // O(n)
			int j = 1;
			System.out.println("Pie: " + pie);
			// Inner loop
			while (j < var) { // O(log_2(n)
				sum += 1;
				j *= 2;
			}
		}
		System.out.println("Sum: " + sum);
	}

	public void nestedLoop2() {
		int n = 10; // O(1)
		int sum = 0; // O(1)
		int j = 1; // O(1)
		double pie = 3.14; // O(1)
		// Outer loop
		for (int var = 0; var < n; var++) { // 0(n)
			System.out.println("Pie: " + pie); // 0(n)
			// Inner loop
			while (j < var) { // 0(n)
				sum += 1; // 0(n)
				// j is doubled in each iteration therefore while loop body executes at most once for each iteration.
				j *= 2; // 0(n)
			}
		} // end of for loop
		System.out.println("Sum: " + sum); // O(1)
	}
}
