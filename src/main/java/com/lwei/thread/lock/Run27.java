package com.lwei.thread.lock;

public class Run27 {

	public static void main(String[] args) throws InterruptedException {

		Service27 service = new Service27();

		ThreadA27 a = new ThreadA27(service);
		a.setName("A");
		a.start();

		Thread.sleep(1000);

		ThreadB27 b = new ThreadB27(service);
		b.setName("B");
		b.start();

	}

}
