package com.tricky;

public class FinallyCatchReturn {

	public static void main(String[] args) throws InterruptedException {
		// Prints 9
		//System.out.println(method1());
		method2();
	}

	private static int method1() {
		try {
			throw new RuntimeException();
		} catch (Exception ex) {
			return 8;
		} finally {
			return 9;
		}
	}

	// Here, if any Exception thrown in Catch block, first finally block will be executed, then only Exception in catch block thrown
	private static void method2() throws InterruptedException {
		try {
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.println("Inside Catch");
			System.out.println(12 / 0);
		} finally {
			Thread.sleep(3000);
			System.out.println("Inside Finally");
		}
	}

}
