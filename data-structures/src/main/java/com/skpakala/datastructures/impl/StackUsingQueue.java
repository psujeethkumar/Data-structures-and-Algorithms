package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructure;

/**
 * 
 * @author Sujeeth Pakala
 * Complexity - Amortised O(1)
 *
 */

public class StackUsingQueue implements DataStructure {
	
	private Queue queue ;
	
	public StackUsingQueue(int queueSize) {
		queue = new Queue(queueSize);
	}
	

	@Override
	public int push(int element) {
		queue.push(element);
		for(int index  = 0; index < queue.size()-1; index ++) {
			queue.push(queue.pop());
		}
		return queue.peek();
	}

	@Override
	public int pop() {
		return queue.pop();
	}

	@Override
	public int peek() {
		return queue.peek();
	}

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public int size() {
		return queue.size();
	}

}
