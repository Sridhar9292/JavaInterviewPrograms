package com.tricky;

public class ThreadIQ {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

	// No compilation error throws
	public static void main(int[] args) {

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread started");
		this.stop();
		System.out.println("Thread stopped");
	}
}
