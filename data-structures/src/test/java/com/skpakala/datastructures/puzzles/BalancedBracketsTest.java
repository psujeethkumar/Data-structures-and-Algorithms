package com.skpakala.datastructures.puzzles;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test case for verifying balanced bracket solution.
 * 
 * @author Sujeeth Pakala
 *
 */
public class BalancedBracketsTest {
	
	private BalancedBrackets balancedBrackets = new BalancedBrackets();

	@Test
	public void testBalancedStrings() {

		assertTrue(balancedBrackets.isBalanced("([{}])"));
		assertTrue(balancedBrackets.isBalanced("(){}[()]"));
		assertTrue(balancedBrackets.isBalanced("((()()())(()))"));
		
		assertFalse(balancedBrackets.isBalanced("(())("));
		assertFalse(balancedBrackets.isBalanced("[(])"));
		assertFalse(balancedBrackets.isBalanced("{}()[()]}"));
		
	}

}
