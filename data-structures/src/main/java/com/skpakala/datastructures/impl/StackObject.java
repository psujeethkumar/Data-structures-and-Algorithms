package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructureObject;

public class StackObject implements DataStructureObject{

	private int stackIndex = -1;
	private Object[] stack;

	/**
	 * 
	 * @param stackSize
	 */
	public StackObject(int stackSize) {
		// this.stackSize = stackSize;
		stack = new Object[stackSize];
	}

	@Override
	public Object push(Object element) {
		stack[++stackIndex] = element;
		return element;
	}

	@Override
	public Object pop() {
		return stack[stackIndex--];
	}

	@Override
	public Object peek() {
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
