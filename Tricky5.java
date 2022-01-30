package com.tricky;

class Vehicle {

	private void move() {
		System.out.println("Vehicle is moving");
	}

}

public class Tricky5 extends Vehicle {

	public void move() {
		System.out.println("Vehicle is moving");
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Tricky5();
		// Compilation error
		// vehicle.move();
	}

}
