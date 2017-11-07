package com.lwei.thread.lock;

public class Run14 {

	public static void main(String[] args) throws InterruptedException {
		final Service14 service1 = new Service14(true);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		final Service14 service2 = new Service14(false);
		runnable = new Runnable() {
			@Override
			public void run() {
				service2.serviceMethod();
			}
		};
		thread = new Thread(runnable);
		thread.start();

	}
}
