package com.tricky;

class Person {
	public void show() {
		System.out.println("Person");
	}
}

class Employee4 extends Person {
	public void show() {
		System.out.println("Employee4");
	}
}

public class RTPoymorphism {

	public static void print(Person o) {
		o.show();
	}

	public static void main(String[] args) {
		Person x = new Person();
		Person y = new Employee4();
		Employee4 z = new Employee4();
		print(x);
		print(y);
		print(z);

	}

}
