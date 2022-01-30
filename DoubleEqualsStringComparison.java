package com.tricky;

public class DoubleEqualsStringComparison {

	public static void main(String[] args) {
		doubleEqualsComparison();
	}

	private static void doubleEqualsComparison() {
		// Prints "Equal"
		if ("Welcome".trim() == "Welcome".trim())
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
