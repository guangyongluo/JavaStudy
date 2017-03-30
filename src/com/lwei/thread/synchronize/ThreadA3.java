package com.lwei.thread.synchronize;

public class ThreadA3 extends Thread {

	private PublicVar publicVar;

	public ThreadA3(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}

	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
