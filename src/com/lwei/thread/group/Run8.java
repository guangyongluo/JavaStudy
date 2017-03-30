package com.lwei.thread.group;

public class Run8 {

	public static void main(String[] args) {

		Object lock = new Object();

		MyThread8 a = new MyThread8(lock, "A", 1);
		MyThread8 b = new MyThread8(lock, "B", 2);
		MyThread8 c = new MyThread8(lock, "C", 0);

		a.start();
		b.start();
		c.start();

	}

}
