package com.lwei.thread.communication;

public class ThreadC11 extends Thread {

	private ThreadB11 threadB;

	public ThreadC11(ThreadB11 threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		threadB.bService();
	}

}
