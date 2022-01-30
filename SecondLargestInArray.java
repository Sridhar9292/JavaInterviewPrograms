package com.Besant;

import java.util.Arrays;

// int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
// System.out.println("Largest Number is:");
// System.out.println("Second Number is:");
public class SecondLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		Arrays.sort(arr);

		System.out.println("First Largest Number is: " + arr[arr.length - 1]);
		System.out.println("Second Largest Number is: " + arr[arr.length - 2]);
	}

}
