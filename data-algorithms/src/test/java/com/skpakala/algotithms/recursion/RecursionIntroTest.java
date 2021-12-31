package com.skpakala.algotithms.recursion;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
public class RecursionIntroTest {

	public static void main(String[] args) {
		RecursionIntro recursion = new RecursionIntro();

		// recursion.printString(5);

		// recursion.printIntegers(1, 5);

		// recursion.printDecreasingIntegers(5, 1);

		// recursion.printIntegersBT(11, 15);

		System.out.println("----");
		recursion.printDecreasingIntegersBT(11, 15);

		System.out.println("----");
		recursion.printSum(5, 0);

		System.out.println("----");
		System.out.println(recursion.printSum(5));
	}

}
