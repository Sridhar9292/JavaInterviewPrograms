package com.Besant;

import java.util.HashMap;
import java.util.Map;

// String string = "Cat has small rat and cat hold on his cat small mouth";    
// Duplicate words in a given string
// Cat - 3
// small - 2
public class DuplicateWordsCount {

	public static void main(String[] args) {

		String strGiven = "Cat has small rat and cat hold on his cat small mouth".toUpperCase();
		String[] strArr = strGiven.split(" ");
		Map<String, Integer> hm = new HashMap<>();

		for (String str : strArr) {
			if (!hm.containsKey(str)) {
				hm.put(str, 1);
			} else {
				hm.put(str, hm.get(str) + 1);
			}
		}
		hm.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + " - " + v);
			}
		});
	}

}
