package com.skpakala.datastructures.puzzles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skpakala.datastructures.impl.StackObject;

/**
 * Implementation of solution to determine the balanced brackets.
 * 
 * Problem description: When programming, we use parentheses (), brackets [],
 * and curly braces {} a lot. Sometimes, we forget a parenthesis or add an extra
 * one by mistake. Many modern coding environments will automatically check to
 * see if a set of these characters are “balanced” to save time in debugging. A
 * set of parentheses, brackets, and braces is called “balanced” if for every
 * open parenthesis (, there is a matching closing parenthesis ) paired with it
 * and likewise for brackets and braces. Everything between the paired
 * characters must also recursively be a balanced string. E.g. Valid balanced
 * braces : ([{}]) , (){}[]. Invalid balances braces: (([)) , {([]} ()
 * 
 * Solution key : Applicable data structure to solve this problem is Stack.
 *
 * @author Sujeeth Pakala
 *
 */

public class BalancedBrackets {

	private static List<Character> openingBrackets = new ArrayList<Character>();
	private Map<Character, Character> bracketPairs = new HashMap<Character, Character>();

	private StackObject stack;

	public BalancedBrackets() {
		bracketPairs.put('{', '}');
		bracketPairs.put('(', ')');
		bracketPairs.put('[', ']');
	}

	public boolean isBalanced(String inputString) {
		stack = new StackObject(inputString.length());
		for (char character : inputString.toCharArray()) {
			if (bracketPairs.containsKey(character)) {
				stack.push(character);
			} else if (stack.isEmpty() || !bracketPairs.get(stack.pop()).equals(character)) {
				return false;
			}
		}
		return stack.isEmpty() ? true : false;
	}

}
