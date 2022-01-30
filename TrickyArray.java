package com.tricky;

public class TrickyArray {

	public static void main(String[] args) {
		System.out.println(arrayCheck(new int[] { 3, 6, 2, 1, 9 }, 9));

	}

	private static Boolean arrayCheck(int[] arry, int sum) {
		int length = arry.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i != j) {
					if ((arry[i] + arry[j]) == sum) {
						return true;
					}
				}
			}
		}

		return false;
	}

}
