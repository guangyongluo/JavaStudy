package com.lwei.thread.synchronize;

public class Run91_1 {

	public static void main(String[] args) {
		Service9_1 service = new Service9_1();
		MyObject9_1 object = new MyObject9_1();

		ThreadA9_1 a = new ThreadA9_1(service, object);
		a.setName("a");
		a.start();

		ThreadB9_1 b = new ThreadB9_1(service, object);
		b.setName("b");
		b.start();
	}

}
