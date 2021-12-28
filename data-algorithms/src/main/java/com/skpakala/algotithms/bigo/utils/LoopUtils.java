package com.skpakala.algotithms.bigo.utils;

/**
 * Scraap class to illustrate some loops
 * 
 * @author Sujeeth Pakala
 *
 */
public class LoopUtils {

	public static void main(String[] args) {
		LoopUtils loopUtils = new LoopUtils();
//		loopUtils.negateLoop();
		loopUtils.logWhileLoop();
	}

	public void negateLoop() {
		int loopCounter = 0;
		for (int j = 10; j >= 0; j = j - 1) {
			loopCounter++;
		}
		System.out.println(loopCounter);
	}

	public void logWhileLoop() {
		int n = 11;
		int var = 1;
		int innerCount = 1;
		while (var < n) {
			System.out.println("Outer : " + var);
			for (int j = 0; j < var; j++) { // (log_2(n)) + 2*n + (2*n-1)

				// System.out.println("Inner : "+j);
				System.out.println("innerCount : " + innerCount);
				innerCount++;
			}
			var *= 2;
		}
	}
}
