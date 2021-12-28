package com.skpakala.algotithms.complexity;

/**
 * 
 * BigO notation is a way to describe the rate at which 
 * computations will increase for a set of code. 
 * 
 * BigO notation types :
 * 	- O(n)
 *  - O(1)
 *  - O(log n)
 *  - O(nˆ2)
 *  - O(nˆ3)
 *  - O(nˆn)
 * 
 * @author Sujeeth Pakala
 *
 */
public class BigOComplexities {
	

	/**
	 * Running time complexity, assuming 'n' is the number of iterations : \n
	 * For loop : T(n) = (n) + ( n + 1 ) + 1 ==> 2n + 2
	 * For print statement in loop : cn ,
	 * assuming 'c' is constant time.
	 * Aggregate of time complexity is (2n+2) + cn
	 * By dropping the constants, resulting complexity is O(n).
	 */
	public void forLoppIncrementBy1() {
		int numberOfIterations = 100;
		for (int i = 0; i < numberOfIterations; i++) {
			// statement takes constant time 'c'
			System.out.println("Index : " + i);
		}
	}

	/**
	 * Initialisation : n( i = 0 ) = 1
	 * Increment : [ 0, k, 2k, 3k, 4k...xk < n ] = floor(n/k)
	 * Comparison : n ( i < n ) = 1 + (n/k)
	 * Statement in loop : c * (n/k) (Assuming the c is constant time for login in
	 * lopp)
	 * Aggregate of time complexity : 1 + (n/k) + ( 1 + (n/k)) + cn/k => n(2+c/k).
	 * By dropping constants, resulting complexity is O(n).
	 */
	public void forLoopIncrementByConstant() {
		int numberOfIterations = 100;
		int incrementSize = 10;
		for (int i = 0; i < numberOfIterations; i += incrementSize) {
			// statement takes constant time 'c'
			System.out.println("Index : " + i);
		}
	}

	/**
	 * Inner loop : (2m+2) + cm [ assuming it runs for m times] 
	 * Outer loop : (2n + 2) + pn [ where p is complexity of inner loop]
	 * => 2n + 2 + 2mn + 2n + cmn => 4n +2 + mn (c+2)
	 * Resulting time complexity : O(mn)	 * 
	 */
	public void simpleNestedForLoop() {
		int numberOfIterations = 100;
		for (int outerIndex = 0; outerIndex < numberOfIterations; outerIndex++) {
			// statement takes constant time 'c'
			for (int innerIndex = 0; innerIndex < outerIndex; innerIndex++) {

			}
		}
	}

}
