package com.imann.sort;

public class Sort<T> {

	public Sort() {

	}
	
	// To be overridden in subclass
	public T[] Run (T[] source) {
		return source;
	}
	
	protected void Swap (T[] source, int index1, int index2) {
		T temp = source[index1];
		source[index1] = source[index2];
		source[index2] = temp;
	}

}
