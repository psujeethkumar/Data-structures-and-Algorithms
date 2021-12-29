package com.skpakala.datastructures.arrays;

/**
 * Introduction to 2 dimensional arrays.
 * 
 * A Two Dimensional Array is an array of references that holds references to other arrays.
 * 
 * @author Sujeeth Pakala
 *
 */
public class TwoDimensionalArrayIntro {

	// 2-D array declaration
	private int[][] twoDArray;

	private int rows, columns;

	/**
	 * Array initialisation
	 * 
	 * @param rows
	 * @param columns
	 */
	public void initialize(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		twoDArray = new int[rows][columns];
	}

	public void addOneNumber(int number) {
		twoDArray[0][0] = number;
	}

	/**
	 * Print elements in array
	 */
	public void printElements() {
		for (int x = 0; x < this.rows; x++) {
			for (int y = 0; y < this.columns; y++) {
				System.out.println("Array element at : [" + x + "][" + y + "] : " + twoDArray[x][y]);
			}
		}
	}

	/**
	 * Allocate elements in array in sequence from 0 till end.
	 */
	public void allocateElements() {
		int element = 0;
		for (int x = 0; x < this.rows; x++) {
			for (int y = 0; y < this.columns; y++) {
				twoDArray[x][y] = element;
				element++;
			}
		}
	}

	public static void main(String[] args) {
		TwoDimensionalArrayIntro intro = new TwoDimensionalArrayIntro();
		System.out.println("Array initialising");
		intro.initialize(5, 5);
		intro.addOneNumber(10);
		System.out.println("Array after adding one number");
		intro.printElements();
		intro.allocateElements();
		System.out.println("Array after allocating seqencial numbers");
		intro.printElements();
	}

}
