package com.lwei.thread.communication;

public class RunFirst {

	public static void main(String[] args) {
		ThreadB13 b = new ThreadB13();
		ThreadA13 a = new ThreadA13(b);
		a.start();
		b.start();
		System.out.println("   main end=" + System.currentTimeMillis());
	}

}
