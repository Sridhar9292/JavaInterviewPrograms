package com.tricky;

public class ThisSuperInSameConstructor {

	public ThisSuperInSameConstructor() {

		// Constructor call must be the first statement in a constructor
		super();
		// this("");

		// Recursive constructor invocation ThisSuperInSameConstructor()
		// this();
		System.out.println("Hello Cons");
		// Constructor call must be the first statement in a constructor
		// super();

		// Constructor call must be the first statement in a constructor
		// this("");
	}

	public ThisSuperInSameConstructor(String name) {

	}

	public static void main(String[] args) {

	}

}

class Parent2 {

}