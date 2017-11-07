package com.lwei.thread.synchronize;

public class Run29_10 {

	public static void main(String[] args) throws InterruptedException {

		MyService9_10 service = new MyService9_10();

		ThreadA9_10 a = new ThreadA9_10(service);
		a.setName("A");

		ThreadB9_10 b = new ThreadB9_10(service);
		b.setName("B");

		a.start();
		b.start();
	}
}
