package com.skpakala.datastructures.arrays.challenges;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
public class NonReatingLinearElementTest {

	public static void main(String[] args) {
		NonRepeatingLinearElement element = new NonRepeatingLinearElement();
		int[] arr1 = { 4, 4, 4, 3 , 5 , 5 };
		System.out.println(element.findFirstUnique(arr1));

		int[] arr2 = { 4, 1, 5, 2, 0, 4 };
		System.out.println(element.findFirstUnique(arr2));
	}

}
