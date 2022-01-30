package com.tricky;

public class Tricky7 {

	public static void throwit() {
		throw new RuntimeException();
	}

	// Whenever an exception occurs in try block, first the finally would be
	// executed, then only the exception is thrown
	public static void main(String[] args) {

		try {
			System.out.println("Hello World");
			throwit();
			System.out.println("Done with try block ");
		} finally {
			System.out.println("Finally Executing");
			System.out.println("Finally Executing");
			System.out.println("Finally Executing");
			System.out.println("Finally Executing");
			System.out.println("Finally Executing");
		}
	}

}
