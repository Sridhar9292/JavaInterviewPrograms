package com.tricky;

public class Tricky8 {

	int num = 10;

	void change(Tricky8 ref) {
		ref.num = 20;
		ref = new Tricky8();
		ref.num = 30;
		ref = null;

	}

	public static void main(String[] args) {
		Tricky8 t = new Tricky8();
		t.change(t);
		System.out.println(t.num);
	}

}
