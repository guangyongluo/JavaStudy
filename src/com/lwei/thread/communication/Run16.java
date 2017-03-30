package com.lwei.thread.communication;

public class Run16 {

	public static void main(String[] args) {
		try {
			ThreadA16 a = new ThreadA16();
			a.start();

			Thread.sleep(1000);

			ThreadB16 b = new ThreadB16();
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
