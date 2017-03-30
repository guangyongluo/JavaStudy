package com.lwei.thread.singleton;

public class MyThread2_2 extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject2_2.getInstance().hashCode());
	}

}
