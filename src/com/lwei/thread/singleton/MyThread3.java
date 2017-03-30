package com.lwei.thread.singleton;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject3.getInstance().hashCode());
	}

}
