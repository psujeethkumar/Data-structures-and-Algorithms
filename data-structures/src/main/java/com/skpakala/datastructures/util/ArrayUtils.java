package com.skpakala.datastructures.util;

/**
 * Utility class providing commonly used functions on arrays.
 * 
 * @author Sujeeth Pakala
 *
 */
public class ArrayUtils {

	private ArrayUtils() {

	}

	/**
	 * Print all elements in single dimensional array.
	 * @param inputArray
	 */
	public static void printArrayElements(int[] inputArray) {
		for (int x = 0; x < inputArray.length; x++) {
			System.out.println("[" + x + "] : " + inputArray[x]);
		}
	}

}
