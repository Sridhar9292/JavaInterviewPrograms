package com.tricky;

class Test99 {
	protected int x, y;
}

public class ProtectedTrick {

	public static void main(String[] args) {
		Test99 t = new Test99();
		System.out.println(t.x + " " + t.y);
	}

}
