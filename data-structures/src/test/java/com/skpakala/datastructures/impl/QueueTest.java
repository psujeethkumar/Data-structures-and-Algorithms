package com.skpakala.datastructures.impl;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueTest {


		private Queue queue = new Queue(10);

		@Test
		public void testQueueInitialization() {
			assertTrue(queue.isEmpty());
			assertTrue(queue.size() == 0);

		}
		
		
		@Test
		public void testPushOneElement() {
			queue.push(100);
			assertTrue(queue.peek() == 100);
			queue.pop();
			assertTrue(queue.size() == 0);
			assertTrue(queue.isEmpty());
		}
	
		@Test
		public void testPushMultipleElements() {
			queue.push(100);
			queue.push(200);
			queue.push(300);
			assertTrue(queue.size() == 3);
			assertTrue(queue.pop() == 100);
			assertTrue(queue.pop() == 200);
			assertTrue(queue.pop() == 300);
			assertTrue(queue.size() == 0);
			assertTrue(queue.isEmpty());
		}
		


	}



