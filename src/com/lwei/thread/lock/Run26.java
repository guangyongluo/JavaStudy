package com.lwei.thread.lock;

public class Run26 {

	public static void main(String[] args) {

		Service26 service = new Service26();

		ThreadA26 a = new ThreadA26(service);
		a.setName("A");

		ThreadB26 b = new ThreadB26(service);
		b.setName("B");

		a.start();
		b.start();

	}

}
