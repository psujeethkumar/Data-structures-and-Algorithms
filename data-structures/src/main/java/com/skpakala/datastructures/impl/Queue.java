package com.skpakala.datastructures.impl;

import com.skpakala.datastructures.DataStructure;

/**
 * 
 * @author Sujeeth Pakala
 *
 */

public class Queue implements DataStructure {

	private int queueStartIndex = 0, queueEndIndex = 0, elementCount = 0;
	private int[] queue;

	public Queue(int queueSize) {

		queue = new int[queueSize];
	}

	@Override
	public int push(int element) {
		if (elementCount == queue.length) {
			return -1;
		} else {
			queue[queueEndIndex % queue.length] = element;
			queueEndIndex++;
			elementCount++;
			return element;
		}

	}

	@Override
	public int pop() {
		if (elementCount == 0) {
			return -1;
		} else {
			int element = queue[queueStartIndex % queue.length];
			queue[queueStartIndex % queue.length] = -1;
			queueStartIndex++;
			elementCount--;
			return element;
		}
	}

	@Override
	public int peek() {
		return elementCount == 0 ? -1 : queue[queueStartIndex % elementCount];
	}

	@Override
	public boolean isEmpty() {
		return elementCount > 0 ? false : true;
	}

	@Override
	public int size() {
		return elementCount;
	}

	public void printQueue() {

	}

}
