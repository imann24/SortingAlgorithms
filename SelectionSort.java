package com.imann.sort;
public class SelectionSort<T extends Comparable<T>> extends Sort<T> {

	public SelectionSort() {}
	
	@Override
	public T[] Run (T[] source) {
		return null;
	}
	
	protected T findMin (T[] source) {
		T currentMin = source[0];
		for (int i = 1; i < source.length; i++) {
			if (currentMin.compareTo(source[i]) > 0) {
				currentMin = source[i];
			}
		}
		return currentMin;
	}

}
