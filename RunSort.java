/*
 * Author: Isaiah Mann 
 * Description: Used for testing sorting algorithm implementations
 */


package com.imann.sort;

public class RunSort {

	public static void main(String[] args) {
		Integer[] nums = new Integer[]{10, 1, 3, 10, 10, 21, 1};
		Sort<Integer> selectionSort = new SelectionSort<Integer>();
		Sort<Integer> insertionSort = new InsertionSort<Integer>();
		Sort<Integer> mergeSort = new MergeSort<Integer>();
		nums = mergeSort.run(nums);
		System.out.println(arrayToString(nums));
	}
	
	public static String arrayToString (Object[] array) {
		if (array.length > 0) {
			String firstElem = array[0].toString();
			// Assume that the length of the first string is indicative of a standard length of each string:
			StringBuilder arrayAsString = new StringBuilder(array.length * firstElem.length());
			arrayAsString.append(firstElem + ", ");
			for (int i = 1; i < array.length; i++) {
				arrayAsString.append(array[i].toString() + ", ");
			}
			return arrayAsString.toString();
		} else {
			return new String();
		}
	}

}
