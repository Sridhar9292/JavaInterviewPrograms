package com.tricky;

public class CheckIfBinary {

	public static void main(String[] args) {
		System.out.println(checkIfBinaryWithoutConvertingToString(110111));
	}

	private static boolean checkIfBinaryWithoutConvertingToString(int num) {
		int temp = num;
		while (temp > 9) {
			if (temp % 10 > 1) {
				return false;
			}
			temp = temp / 10;

		}
		System.out.println(temp);
		if (temp == 1 || temp == 0) {
			return true;
		}
		return false;

	}

}
