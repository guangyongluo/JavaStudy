package com.lwei.thread.singleton;

public class MyThread0 extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject0.getInstance().hashCode());
	}

}
