package com.lwei.thread.singleton;

public class MyThread2_1 extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject2_1.getInstance().hashCode());
	}

}
