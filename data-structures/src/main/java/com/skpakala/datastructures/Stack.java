package com.skpakala.datastructures;

/**
 * Implementation of Stack data structure using array.
 * @author Sujeeth Pakala
 *
 */
public class Stack {

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

	/**
	 * 
	 * @param element
	 */
	public void push(int element) {
		stack[++top] = element;
	}

	/**
	 * 
	 * @return
	 */
	public int pop() {
		return stack[top--];
	}

	/**
	 * 
	 * @return
	 */
	public int peek() {
		return stack[top];
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	public int size() {
		return top + 1;

	}
}