package com.tricky;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tricky23_Set {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(3);
		lhs.add(1);
		lhs.add(2);
		lhs.add(1);
		lhs.add(3);
		lhs.forEach(e->System.out.print(e+"-"));
	}

}
