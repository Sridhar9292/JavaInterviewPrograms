package com.tricky;

public class FinalVariableNotOverride extends Parent3 {

	// static final variable must be initialized or in static block but not in
	// constructor
	final static String NAME;

	int AGE = 80;

	static {
		// This is possible
		NAME = "XXX";
	}

	FinalVariableNotOverride() {
		// Not able to initialize static final variable in constructor
		// NAME = "BBB";
	}

	void method1() {
		System.out.println(this.AGE + super.AGE);
	}

}

class Parent3 {
	final int AGE = 89;
}
