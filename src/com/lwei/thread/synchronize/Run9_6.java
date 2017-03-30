package com.lwei.thread.synchronize;

public class Run9_6 {

	public static void main(String[] args) {

		Service9_6 service1 = new Service9_6();
		Service9_6 service2 = new Service9_6();

		ThreadA9_6 a = new ThreadA9_6(service1);
		a.setName("A");
		a.start();

		ThreadB9_6 b = new ThreadB9_6(service2);
		b.setName("B");
		b.start();

	}

}
