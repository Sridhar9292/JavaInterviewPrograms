package com.Besant;

import java.util.HashMap;
import java.util.Map;

// String str = "This this is is done by Saket Saket";
// {Saket=2, by=1, this=1, This=1, is=2, done=1}
public class CountWords {

	public static void main(String[] args) {

		String strGiven = "This this is is done by Saket Saket";
		String[] strArr = strGiven.split(" ");
		Map<String, Integer> hm = new HashMap<>();

		for (String str : strArr) {
			if (!hm.containsKey(str)) {
				hm.put(str, 1);
			} else {
				hm.put(str, hm.get(str) + 1);
			}
		}

		System.out.println(hm);
	}

}
