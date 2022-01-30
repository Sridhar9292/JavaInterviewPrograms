package com.tricky;

@FunctionalInterface
public interface Tricky29_FunctionalInterface {

	void method();

	// Can have static method
	static void staticMethod() {
	}

	// Can have default method
	default void defaultMethod() {
	}

}
