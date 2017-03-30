package com.lwei.thread.communication;

public class Run13 {
	public static void main(String[] args) {
		try {
			ThreadB13 b = new ThreadB13();
			ThreadA13 a = new ThreadA13(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("                    main end " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
