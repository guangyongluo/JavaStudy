package com.lwei.thread.synchronize;

public class MyThreadB3_4 extends Thread {

	private Sub3_4 sub;

	public MyThreadB3_4(Sub3_4 sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}
}
