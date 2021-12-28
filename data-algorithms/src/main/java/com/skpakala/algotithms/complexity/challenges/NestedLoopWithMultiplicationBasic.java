package com.skpakala.algotithms.complexity.challenges;

/**
 * Compute the Big O of an algorithm that involves nested loops, and increments the loop variables through multiplication.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithMultiplicationBasic {

	/**
	 * Aggregate :
	 * => 4 + (log_3(n)) + 1 + (log_3(n)) + log_3(n) (2 + n) + log_3 ((n+2)/2) +1
	 * => 6 + log_3( 1 + 1 + 2 + n + (2 * n + 2)/2 )
	 * => 6 + log_3 ( 8 + 2 * n + 2 * n + 2)/2 
	 * => (12 + 10 * log_3(n) + 4 * n * log_3(3)) / 2
	 * Dropping leading constants => log_3(n) + n * log_3(n)
	 * Dropping lower order terms => n * log_3(n)
	 * => n * (log_2(n) / log_2(3))
	 * => n * (log_2(n) / 1.585)
	 * Dropping constants => n * log_2(n)	 
	 * => BigO = n * log_2 (n) 
	 */
	public void nestedLoop() {
		int n = 10; // 1
		int sum = 0; // 1
		double pie = 3.14; // 1
		int var = 1; // 1
		while (var < n) { // (log_3(n)) + 1 
			System.out.println("Pie : " + pie); // (log_3(n))
			for (int j = 0; j < n; j = j + 2) { // (log_3(n)) + log_3(n) * (n/2 +1) + log_3(n) * n/2
				sum++; // log_3(n) * n/2
			}
			var *= 3; // (log_3(n))
		}
		System.out.println("Sum :" + sum); // 1
	}

}
