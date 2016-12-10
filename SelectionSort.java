/*
 * Author: Isaiah Mann 
 * Description: Generic implementation of selection sort
 */

package com.imann.sort;
public class SelectionSort<T extends Comparable<T>> extends Sort<T> {

	public SelectionSort() {}
	
	@Override
	public T[] run (T[] source) {
		int maxSortedPointer = 0;
		for (int i = 0; i < source.length; i++) {
			int minUnsortedIndex = findMinIndex(source, i);
			swap(source, maxSortedPointer, minUnsortedIndex);
			maxSortedPointer++;
		}
		return source;
	}
	
	protected int findMinIndex (T source[], int start) {
		T currentMin = source[start];
		int currentMinIndex = start;
		for (int i = start + 1; i < source.length; i++) {
			if (currentMin.compareTo(source[i]) > 0) {
				currentMin = source[i];
				currentMinIndex = i;
			}
		}
		return currentMinIndex;
	}
	protected int findMinIndex (T[] source) {
		return findMinIndex(source, 0);
	}
}
