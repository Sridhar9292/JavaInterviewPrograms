package com.tricky;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Tricky10 {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");
		Enumeration<String> listEnum = Collections.enumeration(vector);
		while (listEnum.hasMoreElements()) {
			vector.add("3");
			System.out.println(listEnum.nextElement());
		}
	}

}
