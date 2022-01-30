package com.tricky;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Tricky15_NavigableSet {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(10);
		ns.add(100);
		ns.add(1000);
		ns.add(10000);
		System.out.println(ns);
		ns.pollFirst();
		System.out.println(ns);
		
	}

}
