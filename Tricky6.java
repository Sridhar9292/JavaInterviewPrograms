package com.tricky;

import java.util.HashMap;

public class Tricky6 {

	private String name;

	public Tricky6(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

	public static void main(String[] args) {

		HashMap<Tricky6, String> hm = new HashMap<>();
		hm.put(new Tricky6("a"), "emp1");
		hm.put(new Tricky6("a"), "emp1 OVERRIDEN");
		hm.put(new Tricky6("b"), "emp2");
		System.out.println(hm.size());
		System.out.println(hm.get(new Tricky6("a")));

	}

}
