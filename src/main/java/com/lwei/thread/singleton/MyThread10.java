package com.lwei.thread.singleton;

public class MyThread10 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject10.getConnection().hashCode());
		}
	}
}
