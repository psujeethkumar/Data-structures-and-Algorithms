package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructure;

/**
 * Implementation of Stack data structure using array.
 * @author Sujeeth Pakala
 *
 */
public class Stack  implements DataStructure {

	private int stackIndex = -1;
	private int[] stack;

	/**
	 * 
	 * @param stackSize
	 */
	public Stack(int stackSize) {
		// this.stackSize = stackSize;
		stack = new int[stackSize];
	}

	@Override
	public int push(int element) {
		stack[++stackIndex] = element;
		return element;
	}

	@Override
	public int pop() {
		return stack[stackIndex--];
	}

	@Override
	public int peek() {
		return stack[stackIndex];
	}

	@Override
	public boolean isEmpty() {
		return stackIndex == -1 ? true : false;
	}

	@Override
	public int size() {
		return stackIndex + 1;

	}
}