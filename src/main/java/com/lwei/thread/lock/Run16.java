package com.lwei.thread.lock;

public class Run16 {

	public static void main(String[] args) throws InterruptedException {
		final Service16 service1 = new Service16(true);
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
