package com.tricky;

public class Tricky13_CircularDependency extends Parent4 {

	public static void main(String[] args) {
		Tricky13_CircularDependency tC = new Tricky13_CircularDependency();
	}

}

// Cycle detected: a cycle exists in the type hierarchy between Parent4 and Tricky13_CircularDependency
class Parent4 /* extends Tricky13_CircularDependency */ {

}
