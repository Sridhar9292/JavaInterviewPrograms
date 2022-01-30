package com.Testing;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		List<String> al1 = new ArrayList<>();

		al1.add("Sridhar");
		al1.add("Ragu");

		List<String> al2 = al1;
		al2.add("Siva");

		System.out.println(al1.size());
		System.out.println(al2.size());

	}

}
