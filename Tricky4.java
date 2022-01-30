package com.tricky;

class Parent {
	public void method(int i) {
		System.out.println("Value is " + i);
	}
}

public class Tricky4 extends Parent {

	public void method(int j) {
		System.out.println("Value is " + j);
	}

	public void method(String s) {
		System.out.println("I was passed " + s);
	}

	public static void main(String[] args) {
		Parent b1 = new Parent();
		Parent b2 = new Tricky4();
		b1.method(5);
		// Compile time error
		// b2.method("6");
	}

}
