package com.lwei.thread.lock;

public class Run15 {

	public static void main(String[] args) throws InterruptedException {
		final Service15 service1 = new Service15(true);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
