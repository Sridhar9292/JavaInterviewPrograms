package com.tricky;

public class StaticTestInstanceVraiable {

	Don d1 = new Don();
	static Don d2 = new Don();
	Don d3 = new Don();

	public static void main(String[] args) {
		System.out.println("Inside main method");
	}

}

class Don {

	Don() {
		System.out.println("Static constructor from Don");
	}

	static {
		System.out.println("Inside static block from Don");
	}
}
