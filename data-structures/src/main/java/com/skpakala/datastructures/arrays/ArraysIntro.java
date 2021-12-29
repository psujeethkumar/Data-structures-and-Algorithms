package com.skpakala.datastructures.arrays;

/**
 * Quick introduction to simple arrays
 * 
 * @author Sujeeth Pakala
 *
 */
public class ArraysIntro {

	public static void main(String[] args) {

		// Array declaration types
		int type1[];
		int[] type2;

		// Array initialisations
		type1 = new int[10];
		type2 = new int[5];
		System.out.println("Type 1 array : " + type1);
		System.out.println("Type 2 array : " + type2);

		// Array declaration & initialisation in one step
		int[] type3 = new int[5];

		/* Adding, updating & accessing elements in array */

		// Adding elements in array
		type3[0] = 10;
		type3[1] = 20;
		type3[2] = 30;
		type3[3] = 40;
		type3[4] = 50;

		// Accessing elements in array
		System.out.println("Type 3 array");
		for (int i = 0; i < type3.length; i++) {
			System.out.println(type3[i]);
		}

		// Updating value of element in array at index 2
		type3[2] = 100;

		// Adding elements in array using array literal
		int[] type4 = { 1, 2, 3, 4, 5 };
		// Accessing elements in array
		System.out.println("Type 4 array");
		for (int i = 0; i < type4.length; i++) {
			System.out.println(type4[i]);
		}

	}

}
