package com.lwei.thread.synchronize;

public class ThreadB9_3 extends Thread {
	private MyObject9_3 object;

	public ThreadB9_3(MyObject9_3 object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
