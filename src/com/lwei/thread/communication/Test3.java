package com.lwei.thread.communication;

public class Test3 {

	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA3 a = new ThreadA3(lock);
		a.start();

		ThreadB3 b = new ThreadB3(lock);
		b.start();

	}

}
