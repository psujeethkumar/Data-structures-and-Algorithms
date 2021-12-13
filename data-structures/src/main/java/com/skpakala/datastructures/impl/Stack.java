package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructure;

/**
 * Implementation of Stack data structure using array.
 * @author Sujeeth Pakala
 *
 */
public class Stack  implements DataStructure {

	private int top = -1;
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
	public void push(int element) {
		stack[++top] = element;
	}

	@Override
	public int pop() {
		return stack[top--];
	}

	@Override
	public int peek() {
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	@Override
	public int size() {
		return top + 1;

	}
}