package com.tricky;

import java.util.ArrayList;
import java.util.List;

public class ListIndex {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(5);
		
		//Exception thrown as: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 1
		al.add(10, 20);
		
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
	}

}
