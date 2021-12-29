package com.skpakala.datastructures.arrays.challendges;

/**
 * Test case for RemoveEvenIntegers.
 * 
 * @author Sujeeth Pakala
 *
 */
public class RemoveEvenIntegersTest {

	public static void main(String[] args) {
		RemoveEvenIntegers integers = new RemoveEvenIntegers();

		System.out.println("*** TEST CASE 1 ***");
		int[] input1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Array before removing event integers :");
		ArrayUtils.printArrayElements(input1);
		int[] result = integers.removeEven(input1);
		System.out.println("Array after removing event integers :");
		ArrayUtils.printArrayElements(result);
		System.out.println("Number of odd numbers : " + result.length);

		System.out.println("*** TEST CASE 2 ***");
		int[] input2 = { 1, 2, 4, 5, 6, 8, 3, 7 };
		System.out.println("Array before removing event integers :");
		ArrayUtils.printArrayElements(input2);
		result = integers.removeEven(input2);
		System.out.println("Array after removing event integers :");
		ArrayUtils.printArrayElements(result);
		System.out.println("Number of odd numbers : " + result.length);

	}
}
