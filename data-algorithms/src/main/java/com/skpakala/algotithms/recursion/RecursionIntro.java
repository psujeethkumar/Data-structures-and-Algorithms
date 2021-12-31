package com.skpakala.algotithms.recursion;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
public class RecursionIntro {

	/**
	 * 
	 * @param numberOfTimes
	 */
	void printString(int numberOfTimes) {
		// Base condition to break the loop
		if (numberOfTimes == 0) {
			return;
		} else {
			System.out.println("Hello World");
			printString(numberOfTimes - 1);
		}
	}

	/**
	 * Printing numbers from given start index to end index in ascending order.
	 * 
	 * @param startNumber
	 * @param endNumber
	 */
	void printIntegers(int startNumber, int endNumber) {
		if (startNumber > endNumber) {
			return;
		} else {
			System.out.println(startNumber);
			printIntegers(++startNumber, endNumber);
		}
	}

	/**
	 * Printing numbers from given start index to end index in descending order.
	 * 
	 * @param startNumber
	 * @param endNumber
	 */
	void printDecreasingIntegers(int endNumber, int startNumber) {
		if (endNumber < startNumber) {
			return;
		} else {
			System.out.println(endNumber);
			printDecreasingIntegers(--endNumber, startNumber);
		}
	}

	void printIntegersBT(int startNumber, int endNumber) {
		if (startNumber > endNumber) {
			return;
		} else {
			printIntegersBT(startNumber, endNumber - 1);
			System.out.println(endNumber);

		}
	}

	/**
	 * Back tracking recursion
	 * 
	 * @param startNumber
	 * @param endNumber
	 */
	void printDecreasingIntegersBT(int startNumber, int endNumber) {
		if (endNumber < startNumber) {
			return;
		} else {
			printDecreasingIntegersBT(startNumber + 1, endNumber);
			System.out.println(startNumber);
		}
	}

	/**
	 * Sum of numbers using parameterised recursion.
	 * 
	 * @param number
	 * @param sum
	 */
	void printSum(int number, int sum) {
		// base condition to break the loop
		if (number == 0) {
			System.out.println(sum);
			return;
		} else {
			sum += number;
			number--;
			printSum(number, sum);
		}
	}

	/**
	 * Sum of numbers without parameterised recursion using back tracking.
	 * 
	 * @param sum
	 */
	int printSum(int number) {
		if (number == 0) {
			return 0;
		} else {
			return number + printSum(number - 1);
		}
	}

}
