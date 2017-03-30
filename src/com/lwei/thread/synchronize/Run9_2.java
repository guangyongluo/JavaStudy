package com.lwei.thread.synchronize;

public class Run9_2 {

	public static void main(String[] args) throws InterruptedException {
		Service9_2 service = new Service9_2();
		MyObject9_2 object = new MyObject9_2();

		ThreadA9_2 a = new ThreadA9_2(service, object);
		a.setName("a");
		a.start();

		Thread.sleep(100);

		ThreadB9_2 b = new ThreadB9_2(object);
		b.setName("b");
		b.start();
	}

}
