package com.lwei.thread.synchronize;

public class ThreadB9_2 extends Thread {
	private MyObject9_2 object;

	public ThreadB9_2(MyObject9_2 object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
