package com.tricky;

public class MethodOverloadTricky {

	static void method1(Object obj) {
		System.out.println("Inside obj");
	}

	static void method1(String str) {
		System.out.println("Inside str");
	}

	public static void main(String[] args) {

		// Same like catch Exception, base class will be given higher preference
		method1("");
		method1(null);
	}

}
