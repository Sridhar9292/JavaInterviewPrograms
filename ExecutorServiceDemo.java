package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

	static Runnable runnable = new Runnable() {

		@Override
		public void run() {
			try {
				Thread.sleep(5000);
				System.out.println("Inside Runnable.." + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static Runnable runnableSchedule = new Runnable() {
		public void run() {

			System.out.println("From runnableSchedule..");
		};
	};

	static Callable callable = new Callable<String>() {

		@Override
		public String call() throws Exception {
			Thread.sleep(5000);
			System.out.println("Inside Callable.." + Thread.currentThread().getName());
			return "Hello";
		}
	};

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// runnableService();
		// callableService();
		scheduledThreadPoolExecutorExample();
	}

	private static void runnableService() {
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(runnable);
		System.out.println("Completed");
		es.execute(runnable);
		es.shutdown();
	}

	private static void callableService() throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> furure = es.submit(callable);
		System.out.println("Returned value is: " + furure.get());
		System.out.println("Completed");
		es.shutdown();

	}

	private static void scheduledThreadPoolExecutorExample() {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		System.out.println("Schedule Starts..");
		executor.schedule(runnableSchedule, 5, TimeUnit.SECONDS);
		executor.schedule(runnableSchedule, 10, TimeUnit.SECONDS);
		System.out.println("Schedule Ends..");
		executor.shutdown();

	}

}
