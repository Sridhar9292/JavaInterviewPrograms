package com.tricky;

interface Inter1 {
	abstract void method1();

	public static void method2() {
	}
}

public abstract class Tricky22_AbstractExtendsInterface implements Inter1 {
	// Cannot reduce the visibility of the inherited method from Inter1
	// abstract void method1();
}

abstract class Abs1 extends Tricky22_AbstractExtendsInterface implements Inter1 {

}
