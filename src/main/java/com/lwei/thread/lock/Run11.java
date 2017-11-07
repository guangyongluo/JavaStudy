package com.lwei.thread.lock;

public class Run11 {

	public static void main(String[] args) throws InterruptedException {
		final Service11 service = new Service11();

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
