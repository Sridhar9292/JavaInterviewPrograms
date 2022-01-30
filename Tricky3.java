package com.tricky;

class A {
	static {
		System.out.println("in A static block");
	}
}

public class Tricky3 {

	A ob = new A();

	public static void main(String[] args) {
		System.out.println("in main");
	}

	static {
		System.out.println("in Tricky3 static block");
	}

}
