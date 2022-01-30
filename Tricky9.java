package com.tricky;

public class Tricky9 {

	public static void main(String[] args) {
		try {

		} catch (Exception e) {
			System.out.println("Exception");
		}
		// Compilation fails
		/*
		 * catch (ArithmeticException ae) {
		 * System.out.println("Arithmetic Exception"); }
		 */
		System.out.println("finished");
	}

}
