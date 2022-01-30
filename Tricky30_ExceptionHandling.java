package com.tricky;

class Test extends Exception{}
public class Tricky30_ExceptionHandling {

	public static void main(String[] args) {
		try {
			throw new Test();
		} catch (Exception t1) {
			System.out.println("Got the Test exception");
		} 
		// Unreachable code
		/*catch(Test t){
			System.out.println("Got the Test exception");
		}*/finally{
			System.out.println("Inside finally block");
		}

	}

}
