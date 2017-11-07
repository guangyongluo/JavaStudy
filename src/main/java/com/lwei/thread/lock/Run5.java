package com.lwei.thread.lock;

public class Run5 {

	public static void main(String[] args) throws InterruptedException {

		MyService5 service = new MyService5();

		ThreadA5 a = new ThreadA5(service);
		a.setName("A");
		a.start();

		ThreadB5 b = new ThreadB5(service);
		b.setName("B");
		b.start();

		Thread.sleep(3000);

		service.signalAll();

	}

}
