package com.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddElementsAfterArraysAsList {

	public static void main(String[] args) {

	//	method1();
	//	method2();
		addNullElementsInArrayList();
	}

	private static void addNullElementsInArrayList() {
		List<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(null);
		al.add(5);
		al.add(null);
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
	}

	private static void method2() {
		List<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		for (Integer i : al) {
			//Exception in thread "main" java.util.ConcurrentModificationException
			al.add(23);
			System.out.println(i);
		}
		
	}

	private static void method1() {
		List<Integer> al = Arrays.asList(1, 2, 3, 4);
		al.set(1, 10);
		System.out.println(al.size());
		// Exception in thread "main" java.lang.UnsupportedOperationException
		al.add(11);
	}

}
