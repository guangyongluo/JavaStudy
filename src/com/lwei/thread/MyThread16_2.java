package com.lwei.thread;

public class MyThread16_2 extends Thread {

	private SynchronizedObject object;

	public MyThread16_2(SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
