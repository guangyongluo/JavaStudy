package com.lwei.thread.communication;

public class Run9 {

	public static void main(String[] args) {

		try {
			ThreadB9 b = new ThreadB9();
			b.start();

			Thread.sleep(500);

			ThreadC9 c = new ThreadC9(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
