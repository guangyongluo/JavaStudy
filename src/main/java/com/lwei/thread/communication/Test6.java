package com.lwei.thread.communication;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA6 a = new ThreadA6(lock);
		a.start();

		ThreadB6 b = new ThreadB6(lock);
		b.start();

		ThreadC6 c = new ThreadC6(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread6 notifyThread = new NotifyThread6(lock);
		notifyThread.start();

	}

}
