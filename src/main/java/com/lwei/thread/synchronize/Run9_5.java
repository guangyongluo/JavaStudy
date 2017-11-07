package com.lwei.thread.synchronize;

public class Run9_5 {

	public static void main(String[] args) {

		Service9_5 service = new Service9_5();

		ThreadA9_5 a = new ThreadA9_5(service);
		a.setName("A");
		a.start();

		ThreadB9_5 b = new ThreadB9_5(service);
		b.setName("B");
		b.start();

		ThreadC9_5 c = new ThreadC9_5(service);
		c.setName("C");
		c.start();

	}

}
