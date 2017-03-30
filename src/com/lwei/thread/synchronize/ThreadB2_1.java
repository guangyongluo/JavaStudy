package com.lwei.thread.synchronize;

public class ThreadB2_1 extends Thread {

	private HasSelfPrivateNum2_1 numRef;

	public ThreadB2_1(HasSelfPrivateNum2_1 numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
