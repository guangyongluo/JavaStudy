package com.lwei.thread.synchronize;

public class Run9_3 {

	public static void main(String[] args) throws InterruptedException {
		Service9_3 service = new Service9_3();
		MyObject9_3 object = new MyObject9_3();

		ThreadA9_3 a = new ThreadA9_3(service, object);
		a.setName("a");
		a.start();

		Thread.sleep(100);

		ThreadB9_3 b = new ThreadB9_3(object);
		b.setName("b");
		b.start();
	}

}
