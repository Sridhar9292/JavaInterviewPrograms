package com.tricky;

public class Tricky21_ParentChildMain extends Parent7 {

	public Tricky21_ParentChildMain() {
		count++;
	}

	public static void main(String[] args) {
		System.out.println("Count = " + count);
		Tricky21_ParentChildMain t21 = new Tricky21_ParentChildMain();
		System.out.println("Count = " + count);
	}
}

class Parent7 {

	protected static int count = 0;

	public Parent7() {
		count++;
	}

}
