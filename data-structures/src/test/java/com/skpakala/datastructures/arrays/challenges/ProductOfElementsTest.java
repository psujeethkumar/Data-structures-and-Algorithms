package com.skpakala.datastructures.arrays.challenges;

import com.skpakala.datastructures.util.ArrayUtils;

/**
 * Test case for ProductOfElements.
 * 
 * @author Sujeeth Pakala
 *
 */
public class ProductOfElementsTest {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4 };
		ProductOfElements elements = new ProductOfElements();
		int[] result = elements.findProduct(arr);
		System.out.println("Array product result");
		ArrayUtils.printArrayElements(result);

		int[] arr2 = { 4, 2, 1, 5, 0 };
		result = elements.findProduct(arr2);
		System.out.println("Array product result");
		ArrayUtils.printArrayElements(result);
	}

}
