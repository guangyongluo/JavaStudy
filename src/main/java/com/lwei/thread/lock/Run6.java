package com.lwei.thread.lock;

public class Run6 {

	public static void main(String[] args) throws InterruptedException {

		MyService6 service = new MyService6();

		ThreadA6 a = new ThreadA6(service);
		a.setName("A");
		a.start();

		ThreadB6 b = new ThreadB6(service);
		b.setName("B");
		b.start();

		Thread.sleep(3000);

		service.signalAll_A();

	}

}
