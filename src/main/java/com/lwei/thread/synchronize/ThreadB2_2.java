package com.lwei.thread.synchronize;

public class ThreadB2_2 extends Thread {

	private MyObject object;

	public ThreadB2_2(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
