/*
 * Author: Isaiah Mann 
 * Description: Generic superclass for sorting algorithms
 */

package com.imann.sort;

public class Sort<T extends Comparable<T>> {

	public Sort() {

	}
	
	// To be overridden in subclass
	public T[] run (T[] source) {
		return source;
	}
	
	protected void swap (T[] source, int index1, int index2) {
		T temp = source[index1];
		source[index1] = source[index2];
		source[index2] = temp;
	}

}
