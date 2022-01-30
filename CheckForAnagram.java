package com.tricky;

import java.util.Arrays;

public class CheckForAnagram {

	public static void main(String[] args) {
		System.out.println(checkForAnagram("aabccg", "aabcgc"));
	}

	private static boolean checkForAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		if (Arrays.equals(charArr1, charArr2)) {
			return true;
		}

		return false;

	}

}
