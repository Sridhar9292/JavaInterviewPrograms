package com.tricky;

public class Tricky18 extends Parent5{

	// This way of overriden is correct
	/*@Override
	protected Number islocale(String name, String country) {
		return null;
	}*/
	
	// This way of overriden is correct
	@Override
	protected Integer islocale(String name, String country) {
		return null;
	}
	
	// This way of overriden is correct
	/*@Override
	public Integer islocale(String name, String country) {
		return null;
	}*/
	
	// This way of overriden is not correct
	/*@Override
	private Integer islocale(String name, String country) {
		return null;
	}*/
	
}

class Parent5 {

	protected Number islocale(String name, String country) {
		return null;
	}
}
