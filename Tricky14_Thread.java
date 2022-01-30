package com.tricky;

public class Tricky14_Thread {

	public static void main(String[] args) {
		MyThreads t1 = new MyThreads();
		t1.start();
		System.out.println("Inside main");
		t1.run();
		
	}

}

class MyThreads extends Thread{
	
	public void run() {
		System.out.println("Inside run");
	}
}
