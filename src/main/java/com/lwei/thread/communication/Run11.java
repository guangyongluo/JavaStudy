package com.lwei.thread.communication;

public class Run11 {

	public static void main(String[] args) {

		try {
			ThreadB11 b = new ThreadB11();

			ThreadA11 a = new ThreadA11(b);
			a.start();

			Thread.sleep(1000);

			ThreadC11 c = new ThreadC11(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
