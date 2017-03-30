package com.lwei.thread.lock;

public class Run25 {

	public static void main(String[] args) {

		Service25 service = new Service25();

		ThreadA25 a = new ThreadA25(service);
		a.setName("A");

		ThreadB25 b = new ThreadB25(service);
		b.setName("B");

		a.start();
		b.start();

	}

}
