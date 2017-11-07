package com.lwei.thread.synchronize;

public class MyThread17 extends Thread {
	public static int count;

	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}
