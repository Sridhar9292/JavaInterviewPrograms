package com.tricky;

public class StringComparison {

	public static void main(String[] args) {
		stringComparison1();
		stringMethodsExists();
	}

	private static void stringMethodsExists() {
		String str = "abc";
		// No copy method in String
		// str.copy();

		// Method present in String
		str.charAt('a');

	}

	private static void stringComparison1() {
		boolean a = false;
		boolean b = true;
		int c = 1;
		// Type mismatch: cannot convert from boolean to int
		// if(c=a==b){}
	}

}
