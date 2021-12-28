package com.skpakala.algotithms.complexity.challenges;

/**
 * Compute the Big O of an algorithm that involves nested loops, and increments the loop variables through multiplication.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithMultiplication {

	/**
	 * Aggregate :
	 * => 4 + (log_2(n)) + 1 + (log_2(n)) + (log_2(n)) + 4*n - 2 + 2*n -1 + (log_2(n)) + 1
	 * => 4 + (4 * (log_2(n))) + 6*n
	 * => BigO = n
	 */
	public void nestedLoop() {
		int n = 10; // 1
		int sum = 0; // 1
		double pie = 3.14; // 1
		int var = 1; // 1
		while (var < n) { // (log_2(n)) + 1 : Within a loop, when elements in problem space gets halved each time, it is most probably in O(log n) runtime.
			System.out.println("Pie : " + pie); // (log_2(n))
			for (int j = 0; j < var; j++) { // (log_2(n)) + (2*n-1) + (2*n-1)
				sum++; // 2*n-1
			}
			var *= 2; // (log_2(n))
		}
		System.out.println("Sum :" + sum); // 1
	}

}
