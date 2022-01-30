package com.tricky;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTrick {

	public static void main(String[] args) {
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");

		System.out.println(fruits);
	}

}
