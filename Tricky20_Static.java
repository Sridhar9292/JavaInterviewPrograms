package com.tricky;

public class Tricky20_Static extends Parent6 {

	public static void main(String[] args) {
		System.out.println(getCount());
	}

}

class Parent6 {
	static int getCount() {
		return 10;
	}
}
