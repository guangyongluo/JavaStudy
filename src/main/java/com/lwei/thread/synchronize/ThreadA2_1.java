package com.lwei.thread.synchronize;

public class ThreadA2_1 extends Thread {

	private HasSelfPrivateNum2_1 numRef;

	public ThreadA2_1(HasSelfPrivateNum2_1 numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}

}
