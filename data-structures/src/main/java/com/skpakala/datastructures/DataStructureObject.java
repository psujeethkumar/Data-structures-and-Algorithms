package com.skpakala.datastructures;

/**
 * 
 * @author Sujeeth Pakala
 *
 */
public interface DataStructureObject {

	
	/**
	 * 
	 * @param element
	 */
	public Object push(Object element);

	
	/**
	 * 
	 * @return
	 */
	public Object pop();

	/**
	 * 
	 * @return
	 */
	public Object peek();

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
