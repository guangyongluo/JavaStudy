package com.lwei.thread.lock;

public class Run12 {

	public static void main(String[] args) throws InterruptedException {
		final Service12 service = new Service12();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};

		Thread threadA = new Thread(runnable);
		threadA.start();

		Thread.sleep(500);

		Thread threadB = new Thread(runnable);
		threadB.start();

		Thread.sleep(500);
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
