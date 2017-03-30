package com.lwei.thread.communication;

public class Test5 {

	public static void main(String[] args) {

		try {
			Object lock = new Object();

			ThreadA5 a = new ThreadA5(lock);
			a.start();

			Thread.sleep(5000);

			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
