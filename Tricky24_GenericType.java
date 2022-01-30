package com.tricky;

import java.util.Set;

public class Tricky24_GenericType {

	private Set<?> elements;

	public void setElements(Set<?> set) {
		this.elements = set;
	}

	public static void main(String[] args) {
		Tricky24_GenericType t24 = new Tricky24_GenericType();
	}

}
