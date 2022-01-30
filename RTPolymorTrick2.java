package com.tricky;

public class RTPolymorTrick2 {

	public static void print(String s) {
		System.out.println("String");
	}

	public static void print(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		print(null);
	}

}
