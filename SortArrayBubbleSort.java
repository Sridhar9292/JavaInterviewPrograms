package com.tricky;

import java.util.Arrays;

public class SortArrayBubbleSort {

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 1, 7, 9 };

		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	private static void bubbleSort(int[] arr) {

		int n = arr.length;
		// Pass should be done for length -1 times
		for (int i = 0; i < n - 1; i++) {
			boolean isThere = Boolean.FALSE;
			// for each pass, the largest element will reach the end of the array. So n - i - 1.
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					isThere = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			//If not even one swap has been done then break the loop
			if(!isThere) break;
		}
	}

}
