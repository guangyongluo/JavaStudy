package com.lwei.thread.communication;

public class ThreadC12 extends Thread {

	private ThreadB12 threadB;

	public ThreadC12(ThreadB12 threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		threadB.bService();
	}

}
