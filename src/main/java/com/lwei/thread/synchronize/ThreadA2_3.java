package com.lwei.thread.synchronize;

public class ThreadA2_3 extends Thread {

	private MyObject2 object;

	public ThreadA2_3(MyObject2 object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}

}
