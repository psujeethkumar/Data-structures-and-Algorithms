package com.skpakala.datastructures;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
public interface DataStructure {

	
	/**
	 * 
	 * @param element
	 */
	public void push(int element);

	
	/**
	 * 
	 * @return
	 */
	public int pop();

	/**
	 * 
	 * @return
	 */
	public int peek();

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * 
	 * @return
	 */
	public int size() ;

}
