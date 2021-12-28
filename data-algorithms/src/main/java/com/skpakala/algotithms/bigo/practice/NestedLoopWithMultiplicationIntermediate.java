package com.skpakala.algotithms.bigo.practice;

/**
 * Compute the Big O of an algorithm that involves nested loops, and increments the loop variables through multiplication.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithMultiplicationIntermediate {

	/**
	 * Aggregate :
	 * => 4 + 2 + 2*n/3 + n/3 + n * log_3(n) / 3 + n/3 + (2 * n * log_3(n)) / 3 + 1
	 * => 7 + (4*n/3) + (5 * n * log_3(n)) / 3
	 * => Dropping constants & lower order terms, result = n * log_2(n)
	 * 
	 * Hence BigO complexity : n*log(n)
	 * 
	 */
	public void nestedLoop() {
		int n = 10; // 1
		int sum = 0; // 1
		int j = 0; // 1
		double pie = 3.14; // 1
		for (int var = 1; var < n; var += 3) { // 1 + (n/3 + 1) + n/3
			System.out.println("Pie: " + pie); // n/3
			j = 1; // 0
			while (j < n) { // n/3 * (log_3(n) + 1)
				sum += 1; // n/3 * log_3(n)
				j *= 3; // n/3 * log_3(n)
			}
		}
		System.out.println("Sum: " + sum); // 1
	}

	/**
	 * Aggregate :
	 * => 2n + 2 + 8n + 6nˆ2 + 6n
	 * => 6nˆ2 + 16n + 2
	 * BigO = nˆ2
	 */
	public void nestedLoopLevel3() {
		int n = 10;
		for (int j = 0; j < n; j++) { // 2(n+1)
			for (int i = 0; i < 3; i++) { // n (8)
				for (int k = 0; k < n; k++) { // 3 * n (2 * (n+1))
					System.out.println("I have 3 loops");
				}
			}
		}

	}
}
