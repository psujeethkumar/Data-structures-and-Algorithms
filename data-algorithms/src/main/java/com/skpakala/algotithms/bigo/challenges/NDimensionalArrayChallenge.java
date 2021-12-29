package com.skpakala.algotithms.bigo.challenges;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Implement a n-dimensional integer list. The constructor will take in the parameter n and the class will
 * expose two methods get(int n) and put(int n). If n equals 3,
 * then first create a list of 3 element, then initialise each element of first list with another list of 3 elements
 * and finally initialise each element of the second list with a list of 3 elements.
 * The get and put functions act on the elements of the innermost list.
 * 
 * As an example, with n=3, we'll get a total of 27 elements. The get and put methods should be able to specify index from 0 to 26.
 * 
 * a - Can you code the class?
 * 
 * b - What is the time complexity of initialising the list?
 * 
 * c - What is the time complexity of the get and put methods?
 * 
 * d - What is the space complexity?
 * 
 * @author Sujeeth Pakala
 *
 */
public class NDimensionalArrayChallenge {

	int size;
	int maxIndex;
	List<Object> list;

	/**
	 * 
	 * Solution focus areas : LinkedList, ArrayList, Recursion
	 * 
	 * @param size
	 */
	public NDimensionalArrayChallenge(int size) {
		// Exception when size is less than or equal to zero.
		if (size <= 0)
			throw new IllegalArgumentException();

		this.size = size;
		// Depth of list is size ^ size. E.g. When size is 3, then count of elements in the list is 3 * 3 * 3 = 27.
		this.maxIndex = (int) Math.pow(size, size);
		allocateElements(size, list);

	}

	/**
	 * Method that initialises the n-dimensional list.
	 * 
	 * @param n2    :
	 * @param list2
	 */
	private void allocateElements(int size, List<Object> list) {
		if (size == -1)
			return;
		if (this.list == null) {
			this.list = list = new LinkedList<Object>();
			allocateElements(size - 1, list);
		} else {
			for (int i = 0; i < this.size; i++) {
				List<Object> childList = new LinkedList<Object>();
				list.add(i, childList);
				allocateElements(size - 1, childList);
			}
		}
	}

	public int get(int n) {
		return 0;
	}

	public void put(int n) {

	}
}
