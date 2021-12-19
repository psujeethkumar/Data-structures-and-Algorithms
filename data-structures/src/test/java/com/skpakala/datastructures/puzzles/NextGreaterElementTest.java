package com.skpakala.datastructures.puzzles;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

class NextGreaterElementTest {

	private NextGreaterElement greaterElement = new NextGreaterElement();

	@Test
	void testNGE() {
		int[] input = { 1, 2, 3, 4, 3 };
		int nge[] = greaterElement.findNextGreaterElement(input);
		assertNotNull(nge);
		for (int i = 0; i < nge.length; i++) {
			System.out.println(i + " : "+nge[i]);
			
		}

	}

}
