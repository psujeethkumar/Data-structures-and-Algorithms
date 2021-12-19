package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructure;

/**
 * 
 * @author Sujeeth Pakala
 * Complexity - Amortised O(1)
 *
 */
public class QueueUsingStack implements DataStructure {

	private Stack mainStack;
	private Stack helperStack;

	public QueueUsingStack(int queueSize) {
		mainStack = new Stack(queueSize);
		helperStack = new Stack(queueSize);
	}

	@Override
	public int push(int element) {
		return mainStack.push(element);
	}

	@Override
	public int pop() {
		if (!helperStack.isEmpty()) {
			return helperStack.pop();
		} else {
			while (!mainStack.isEmpty()) {
				helperStack.push(mainStack.pop());
			}
			return helperStack.pop();
		}
	}

	@Override
	public int peek() {
		if (!helperStack.isEmpty()) {
			return helperStack.peek();
		} else {
			while (!mainStack.isEmpty()) {
				helperStack.push(mainStack.pop());
			}
			return helperStack.peek();
		}
	}

	@Override
	public boolean isEmpty() {
		 return (!helperStack.isEmpty()) ? helperStack.isEmpty() : mainStack.isEmpty();
	}

	@Override
	public int size() {
		return (!helperStack.isEmpty()) ? helperStack.size() : mainStack.size();
	}

}
