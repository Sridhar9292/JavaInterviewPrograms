package com.tricky;

import java.util.HashSet;
import java.util.Set;

public class Tricky1 {

	public static void main(String[] args) {
		Set s = new HashSet<>();
		boolean[] b = new boolean[5];
		b[0] = s.add("a");
		b[1] = s.add(new Integer(42));
		b[2] = s.add("b");
		b[3] = s.add("a");
		b[4] = s.add(new Object());

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " ");
		}

	}

}
