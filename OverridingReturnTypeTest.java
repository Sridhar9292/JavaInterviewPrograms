package com.tricky;

public class OverridingReturnTypeTest extends Don6{

	// The return type is incompatible with Don6.methodReturnsInt()
	/*@Override
	public String methodReturnsInt() {
		return "";
	}*/
	
	// The return type is incompatible with Don6.methodReturnsInt()
	/*@Override
	public int methodReturnsInt() {
		return super.methodReturnsInt();
	}*/
	
}

class Don6 {
	public Integer methodReturnsInt() {
		return 0;
	}
	
	
	
	
}
