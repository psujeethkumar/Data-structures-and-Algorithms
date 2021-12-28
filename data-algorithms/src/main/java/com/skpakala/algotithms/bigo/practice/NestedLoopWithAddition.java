package com.skpakala.algotithms.bigo.practice;

/**
 * 
 * Compute the Big O complexity of an algorithm that involves nested loops where the loop variables increase with addition.
 * 
 * @author Sujeeth Pakala
 *
 */
public class NestedLoopWithAddition {

	/**
	 * Initialisations : n, sum, pie
	 * 		- number of executions : 1
	 * Outer loop iteration of :
	 * 		- Initialisation of var : 1
	 * 		- Comparison var < n : n/3 + 1
	 * 		- Increment var+=3 : n/3
	 * 		- Pie print : n/3
	 * Inner loop : 
	 * 		- Initialisation of j : n/3
	 * 		- Comparison j < n : n/3 * (n/2 + 1)
	 * 		- Increment var+=3 : n/3 * n/2
	 * 		- sum print : n/3 * n/2
	 * 
	 * Running time complexity is aggregate of all above iterations : 5 + 5n/3 + 2nˆ2/3
	 *  => (15 + 5n + 2nˆ2) / 3
	 *  => Dropping leading constants => n + nˆ2
	 *  => Dropping lower order terms => nˆ2
	 *  Hence, BigO time complexity is nˆ2 
	 *  
	 */
	public void nestedLoop() {
		int n = 10;
		int sum = 0;
		double pie = 3.14;

		// Outer loop
		for (int var = 0; var < n; var = var + 3) {
			System.out.println("Pie: " + pie);
			// Inner loop
			for (int j = 0; j < n; j = j + 2) {
				sum++;
				System.out.println("Sum = " + sum);
			}
		}
	}

	public static void main(String[] args) {
		new NestedLoopWithAddition().nestedLoop();
	}

}
