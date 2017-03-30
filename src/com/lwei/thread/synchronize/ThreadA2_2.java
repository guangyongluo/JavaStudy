package com.lwei.thread.synchronize;

public class ThreadA2_2 extends Thread {

	private MyObject object;

	public ThreadA2_2(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}

}
