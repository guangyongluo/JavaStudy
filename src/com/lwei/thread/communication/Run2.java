package com.lwei.thread.communication;

public class Run2 {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA2 a = new ThreadA2(lock);
			a.start();

			Thread.sleep(50);

			ThreadB2 b = new ThreadB2(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
