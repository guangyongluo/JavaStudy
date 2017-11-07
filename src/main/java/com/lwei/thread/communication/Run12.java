package com.lwei.thread.communication;

public class Run12 {

	public static void main(String[] args) {

		try {
			ThreadB12 b = new ThreadB12();

			ThreadA12 a = new ThreadA12(b);
			a.start();

			Thread.sleep(1000);

			ThreadC12 c = new ThreadC12(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
