/*
 * Author: Isaiah Mann 
 * Description: Generic implementation of merge sort
 */

package com.imann.sort;

public class MergeSort<T extends Comparable<T>> extends Sort<T> {
	@Override
	public T[] run (T[] source) {
		return sortSubArray(source, 0, source.length - 1);
	}
	
	T[] sortSubArray (T[] source, int start, int end) {
		// Base case: 1 element
		if (start - end == 0) {
			return source;
		}
		// Second base case: 2 elements
		else if (end - start == 1) {
			if (source[start].compareTo(source[end]) > 0) {
				swap(source, start, end);
			}
			return source;
		}
		// Recursive Step: Split the array
		else {
			int mid = (start + end) / 2;
			sortSubArray(source, start, mid - 1);
			sortSubArray(source, mid, end);
			// Merge the two sorted halves of the array:
			return mergeSubArrays(source, start, mid - 1, mid, end);
		}
	}
	
	// We expect end1 and start2 to be adjacent based on the params of the algorithm
	T[] mergeSubArrays (T[] source, int start1, int end1, int start2, int end2) {
		//System.out.println(start1 + " " + " " + end1 + " " + start2 + " " + end2);
		// System.out.println(RunSort.arrayToString(source));
		int pointer1 = start1;
		if (start1 == end1) {
			pointer1++;
		}
		int pointer2 = start2;
		if (start2 == end2) {
			pointer2++;
		}
		// Sorting in place:
		int head = Math.min(start1, start2);
		int tail = Math.max(end1, end2);
		while (head <= tail) {
			boolean p1AtEnd = pointer1 > end1;
			boolean p2AtEnd = pointer2 > end2;
			boolean p1LessThanHead = false;
			boolean p2LessThanHead = false;
			if (!p1AtEnd) { 
				p1LessThanHead = source[pointer1].compareTo(source[head]) < 0;
			}
			if (!p2AtEnd) {
				p2LessThanHead = source[pointer2].compareTo(source[head]) < 0;
			}
			if (p1AtEnd && p2LessThanHead) {
				swap(source, head, pointer2);
				pointer2++;
			} else if (p2AtEnd && p1LessThanHead) {
				swap(source, head, pointer1);
				pointer1++;
			} else if (p1LessThanHead || p2LessThanHead){
				if (source[pointer1].compareTo(source[pointer2]) < 0 && p1LessThanHead) {
					swap(source, head, pointer1);
					pointer1++;
				} else if (p2LessThanHead) {
					swap(source, head, pointer2);
					pointer2++;
				}
			}
			// Always step forward 1
			head++;
		}
		// System.out.println(RunSort.arrayToString(source));
		return source;
	}
}
