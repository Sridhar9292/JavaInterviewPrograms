package com.tricky;

public class Tricky17_StringEqualsHash {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = new String("abcde");

		System.out.println("----1-----" + (str1 == "abcde"));
		System.out.println("----2-----" + (str1.equals("abcde")));
		System.out.println("----3-----" + (str1 != "abcde"));
		System.out.println("----4-----" + (str1 == str2));
		System.out.println("----5-----" + (str1.hashCode() == "abcde".hashCode()));
		System.out.println("----6-----" + (str1.hashCode() == str2.hashCode()));
		System.out.println("----7-----" + (str2.hashCode() == "abcde".hashCode()));
		System.out.println("----8-----" + (str1.matches("abcde")));
		System.out.println("----9-----" + (str1.matches(str2)));
	}

}
