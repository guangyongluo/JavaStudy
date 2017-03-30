package com.lwei.thread.synchronize;

public class Run91_2 {

	public static void main(String[] args) {
		Service9_1 service = new Service9_1();
		MyObject9_1 object1 = new MyObject9_1();
		MyObject9_1 object2 = new MyObject9_1();

		ThreadA9_1 a = new ThreadA9_1(service, object1);
		a.setName("a");
		a.start();

		ThreadB9_1 b = new ThreadB9_1(service, object2);
		b.setName("b");
		b.start();
	}

}
