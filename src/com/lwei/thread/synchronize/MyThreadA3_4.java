package com.lwei.thread.synchronize;

public class MyThreadA3_4 extends Thread {

	private Sub3_4 sub;

	public MyThreadA3_4(Sub3_4 sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}

}
