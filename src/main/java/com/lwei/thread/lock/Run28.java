package com.lwei.thread.lock;

public class Run28 {

	public static void main(String[] args) throws InterruptedException {

		Service28 service = new Service28();

		ThreadB28 b = new ThreadB28(service);
		b.setName("B");
		b.start();

		Thread.sleep(1000);

		ThreadA28 a = new ThreadA28(service);
		a.setName("A");
		a.start();

	}

}
