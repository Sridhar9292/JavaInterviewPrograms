package com.tricky;

public class BytesTest {

	public static void main(String[] args) {
		byteTest1();
		byteLoopTest();
	}

	private static void byteLoopTest() {
		byte b = 120;
		for (int i = 0; i < 500; i++) {
			b++;
			System.out.println(b);
		}
	}

	private static void byteTest1() {
		// No error throws
		Byte b = new Byte("120");
	}

}
