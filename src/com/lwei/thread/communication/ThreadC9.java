package com.lwei.thread.communication;

public class ThreadC9 extends Thread {

	private ThreadB9 threadB;

	public ThreadC9(ThreadB9 threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		threadB.interrupt();
	}

}
