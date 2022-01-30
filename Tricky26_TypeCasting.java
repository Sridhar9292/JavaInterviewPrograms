package com.tricky;

public class Tricky26_TypeCasting {

	public static void main(String[] args) {

		Integer num1 = new Integer(10);
		int num2 = num1;
		System.out.println("----1----" + num2);

		long l1 = 500L;
		// Type mismatch: cannot convert from long to short
		// short s1 = l1;

		short s2 = 20;
		long l2 = s2;
		System.out.println("----2----" + l2);

	}

}
