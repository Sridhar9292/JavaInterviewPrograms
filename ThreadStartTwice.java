package com.Besant;

public class ThreadStartTwice {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.start();
	}

}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread started...");
	}
}
