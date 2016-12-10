/*
 * Author: Isaiah Mann 
 * Description: Generic implementation of insertion sort
 */

package com.imann.sort;

public class InsertionSort<T extends Comparable<T>> extends Sort<T> {
	@Override
	public T[] run (T[] source) {
		for (int i = 1; i < source.length; i++) {
			for (int j = i; j > 0; j--) {
				if (source[j].compareTo(source[j-1]) < 0) {
					swap(source, j, j-1);
				} else {
					break;
				}
			}
		}
		return source;
	}
}
