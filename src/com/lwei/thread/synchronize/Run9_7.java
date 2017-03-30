package com.lwei.thread.synchronize;

public class Run9_7 {

	public static void main(String[] args) {

		Service9_7 service = new Service9_7();

		ThreadA9_7 a = new ThreadA9_7(service);
		a.setName("A");
		a.start();

		ThreadB9_7 b = new ThreadB9_7(service);
		b.setName("B");
		b.start();

	}

}
