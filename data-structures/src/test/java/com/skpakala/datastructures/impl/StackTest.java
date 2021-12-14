/**
 * 
 */
package com.skpakala.datastructures.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
class StackTest {
	private Stack stack = new Stack(10);

	@Test
	public void testStackInitialization() {
		assertTrue(stack.isEmpty());
		assertTrue(stack.size() == 0);
	}

	@Test
	public void testPushOneElement() {
		stack.push(100);
		assertTrue(stack.peek() == 100);
		stack.pop();
		assertTrue(stack.size() == 0);
		assertTrue(stack.isEmpty());
	}

	// @Test
	public void testPushMultipleElements() {
		stack.push(100);
		stack.push(200);
		stack.push(300);
		assertTrue(stack.size() == 3);
		assertTrue(stack.pop() == 300);
		assertTrue(stack.pop() == 200);
		assertTrue(stack.pop() == 100);
		assertTrue(stack.size() == 0);
		assertTrue(stack.isEmpty());
	}
}
