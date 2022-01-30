package com.tricky;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {

	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(2, 4);
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(6);
		list.add(9);
		
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			list.add(3);
		}
		
	}

}
