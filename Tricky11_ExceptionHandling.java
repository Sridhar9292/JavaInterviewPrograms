package com.tricky;

public class Tricky11_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		try{
			System.out.println(12/0);
		}catch(Exception ex){
			throw new ArithmeticException();
		}finally{
			System.out.println("Inside Finally");
			Thread.sleep(2000);
		}
	}

}
