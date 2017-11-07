package com.lwei.thread.lock;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		MyService1 service = new MyService1();

		ThreadA1 a = new ThreadA1(service);
		a.setName("A");
		a.start();
		ThreadAA1 aa = new ThreadAA1(service);
		aa.setName("AA");
		aa.start();

		Thread.sleep(100);

		ThreadB1 b = new ThreadB1(service);
		b.setName("B");
		b.start();

		ThreadBB1 bb = new ThreadBB1(service);
		bb.setName("BB");
		bb.start();

	}

}
