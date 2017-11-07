package com.lwei.thread.lock;

public class Run13 {

	public static void main(String[] args) throws InterruptedException {
		final Service13 service = new Service13();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
		Thread.sleep(2000);
		service.notityMethod();
	}
}
